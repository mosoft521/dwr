package uk.ltd.getahead.dwr.convert;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import uk.ltd.getahead.dwr.ConversionData;
import uk.ltd.getahead.dwr.ConversionException;
import uk.ltd.getahead.dwr.Converter;
import uk.ltd.getahead.dwr.ConverterManager;
import uk.ltd.getahead.dwr.ScriptSetup;
import uk.ltd.getahead.dwr.util.Log;

/**
 * Convert a Javascript associative array into a JavaBean
 * @author Joe Walker [joe at getahead dot ltd dot uk]
 */
public class BeanConverter implements Converter
{
    /* (non-Javadoc)
     * @see uk.ltd.getahead.dwr.Converter#init(uk.ltd.getahead.dwr.Configuration)
     */
    public void init(ConverterManager newConfig)
    {
        this.config = newConfig;
    }

    /* (non-Javadoc)
     * @see uk.ltd.getahead.dwr.Converter#convertTo(java.lang.Class, uk.ltd.getahead.dwr.ConversionData, java.util.Map)
     */
    public Object convertTo(Class paramType, ConversionData data, Map working) throws ConversionException
    {
        String value = data.getValue();
        if (value.trim().equals("null"))
        {
            return null;
        }

        if (value.startsWith("{"))
        {
            value = value.substring(1);
        }
        if (value.endsWith("}"))
        {
            value = value.substring(0, value.length() - 1);
        }

        try
        {
            // We know what we are converting to so we create a map of property
            // names against PropertyDescriptors to speed lookup later
            Object bean = paramType.newInstance();
            BeanInfo info = Introspector.getBeanInfo(paramType);
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
            Map props = new HashMap();
            for (int i = 0; i < descriptors.length; i++)
            {
                String key = descriptors[i].getName();
                props.put(key, descriptors[i]);
            }

            // We should put the new object into the working map in case it
            // is referenced later nested down in the conversion process.
            working.put(data, bean);

            // Loop through the property declarations
            StringTokenizer st = new StringTokenizer(value, ",");
            int size = st.countTokens();
            for (int i = 0; i < size; i++)
            {
                String token = st.nextToken();
                if (token.trim().length() == 0)
                {
                    continue;
                }

                int colonpos = token.indexOf(":");
                if (colonpos == -1)
                {
                    throw new ConversionException("Missing ':' in object description: " + token);
                }

                String key = token.substring(0, colonpos).trim();
                String val = token.substring(colonpos + 1).trim();

                PropertyDescriptor descriptor = (PropertyDescriptor) props.get(key);
                if (descriptor == null)
                {
                    Log.warn("No setter for " + key);
                    StringBuffer all = new StringBuffer();
                    for (Iterator it = props.keySet().iterator(); it.hasNext();)
                    {
                        all.append(it.next());
                        all.append(" ");
                    }
                    Log.warn("Setters exist for "  + all);
                }
                else
                {
                    Class propType = descriptor.getPropertyType();

                    ConversionData nested = new ConversionData(data.getLookup(), val);
                    Object output = config.convertTo(propType, nested, working);
                    descriptor.getWriteMethod().invoke(bean, new Object[] { output });
                }
            }

            return bean;
        }
        catch (ConversionException ex)
        {
            throw ex;
        }
        catch (Exception ex)
        {
            throw new ConversionException(ex);
        }
    }

    /* (non-Javadoc)
     * @see uk.ltd.getahead.dwr.Converter#convertFrom(java.lang.Object, java.lang.String, java.util.Map)
     */
    public String convertFrom(Object data, String varname, Map converted) throws ConversionException
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("var " + varname + " = new Object();");

        try
        {
            BeanInfo info = Introspector.getBeanInfo(data.getClass());
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
            for (int i = 0; i < descriptors.length; i++)
            {
                PropertyDescriptor descriptor = descriptors[i];
                String name = descriptor.getName();

                // We don't marshall getClass()
                if (!name.equals("class"))
                {
                    try
                    {
                        Method getter = descriptor.getReadMethod();
                        Object value = getter.invoke(data, new Object[0]);

                        ScriptSetup nested = config.convertFrom(value, converted);

                        buffer.append(nested.initCode);
                        buffer.append(varname);
                        buffer.append(".");
                        buffer.append(name);
                        buffer.append(" = ");
                        buffer.append(nested.assignCode);
                        buffer.append(";");
                    }
                    catch (Exception ex)
                    {
                        buffer.append("alert('Failed to marshall: " + name + ". " + ex + "');");
                    }
                }
            }
        }
        catch (IntrospectionException ex)
        {
            throw new ConversionException(ex);
        }

        return buffer.toString();
    }

    /**
     * To forward marshalling requests
     */
    private ConverterManager config;
}
