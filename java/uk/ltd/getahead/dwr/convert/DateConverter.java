package uk.ltd.getahead.dwr.convert;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.StringTokenizer;

import uk.ltd.getahead.dwr.ConversionData;
import uk.ltd.getahead.dwr.ConversionException;
import uk.ltd.getahead.dwr.Converter;
import uk.ltd.getahead.dwr.ConverterManager;
import uk.ltd.getahead.dwr.util.Log;

/**
 * An implementation of Converter for Dates.
 * @author Joe Walker [joe at eireneh dot com]
 * @version $Id: StringConverter.java,v 1.2 2004/11/04 15:54:07 joe_walker Exp $
 */
public class DateConverter implements Converter
{
    /* (non-Javadoc)
     * @see uk.ltd.getahead.dwr.Converter#init(uk.ltd.getahead.dwr.Configuration)
     */
    public void init(ConverterManager config)
    {
    }

    /* (non-Javadoc)
     * @see uk.ltd.getahead.dwr.Converter#convertTo(java.lang.Class, uk.ltd.getahead.dwr.ConversionData, java.util.Map)
     */
    public Object convertTo(Class paramType, ConversionData data, Map working) throws ConversionException
    {
        String value = data.getValue();

        /*
        if (!(data instanceof Date))
        {
            throw new ConversionException("Class: " + data.getClass() + " is not a java.util.Date");
        }
        */

        if (value.startsWith("["))
        {
            value = value.substring(1);
        }
        if (value.endsWith("]"))
        {
            value = value.substring(0, value.length() - 1);
        }

        Calendar calendar = new GregorianCalendar();

        try
        {
            StringTokenizer st = new StringTokenizer(value, ",");
            int size = st.countTokens();

            if (size != 7)
            {
                Log.warn("Date does not have 7 components: " + value);
            }

            for (int i = 0; i < size && i < 7; i++)
            {
                try
                {
                    String token = st.nextToken();
                    int intval = Integer.parseInt(token.trim());
                    calendar.set(FIELDS[i], intval);
                }
                catch (NumberFormatException ex)
                {
                    throw new ConversionException(ex);
                }
            }

            Date date = calendar.getTime();
            if (paramType == Date.class)
            {
                return date;
            }
            else if (paramType == java.sql.Date.class)
            {
                return new java.sql.Date(date.getTime());
            }
            else if (paramType == Time.class)
            {
                return new Time(date.getTime());
            }
            else if (paramType == Timestamp.class)
            {
                return new Timestamp(date.getTime());
            }
            else
            {
                throw new ConversionException("DateConverter can only create instances of java.util.Date, java.sql.Date, java.sql.Time, java.sql.Timestamp. Given: " + paramType.getName());
            }
        }
        catch (ConversionException ex)
        {
            throw ex;
        }
        catch (Exception ex)
        {
            throw new ConversionException("Format error converting " + value + " to " + paramType.getName(), ex);
        }
    }

    /* (non-Javadoc)
     * @see uk.ltd.getahead.dwr.Converter#convertFrom(java.lang.Object, java.lang.String, java.util.Map)
     */
    public String convertFrom(Object data, String varname, Map converted) throws ConversionException
    {
        if (!(data instanceof Date))
        {
            throw new ConversionException("Class: " + data.getClass() + " is not a java.util.Date");
        }

        Date date = (Date) data;
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        StringBuffer buffer = new StringBuffer();
        buffer.append("var " + varname + " = new Date(");
        buffer.append(calendar.get(Calendar.YEAR));
        buffer.append(", ");
        buffer.append(calendar.get(Calendar.MONTH));
        buffer.append(", ");
        buffer.append(calendar.get(Calendar.DAY_OF_MONTH));
        buffer.append(", ");
        buffer.append(calendar.get(Calendar.HOUR_OF_DAY));
        buffer.append(", ");
        buffer.append(calendar.get(Calendar.MINUTE));
        buffer.append(", ");
        buffer.append(calendar.get(Calendar.SECOND));
        buffer.append(", ");
        buffer.append(calendar.get(Calendar.MILLISECOND));
        buffer.append(");");

        return buffer.toString();
    }

    /**
     * The input field ordering
     */
    private static final int[] FIELDS =
    {
        Calendar.YEAR,
        Calendar.MONTH,
        Calendar.DAY_OF_MONTH,
        Calendar.HOUR_OF_DAY,
        Calendar.MINUTE,
        Calendar.SECOND,
        Calendar.MILLISECOND,
    };
}
