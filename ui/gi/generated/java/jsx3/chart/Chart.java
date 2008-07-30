/*
 * Copyright 2005 Joe Walker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsx3.chart;

import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.io.Context;
import org.directwebremoting.ui.ScriptProxy;

/**
 * The base class for all charts in this package. Encapsulates common functionality shared by all charts.

In general, a chart is responsible for managing its children components and handling any coordination
between them. A chart always manages the layout of its children.

All charts can have the following children:

  {0,1} jsx3.chart.ChartLabel, will render as the chart's title
  {0,1} Legend, will render as the chart's legend
  {0,n} Series, will render the chart's data series; in general a subclass of Chart will only allow a certain subclass of Series
 * @author Joe Walker [joe at getahead dot org]
 * @author DRAPGEN - Dwr Reverse Ajax Proxy GENerator
 */
public class Chart extends jsx3.vector.Block
{
    /**
     * All reverse ajax proxies need context to work from
     * @param context The script that got us to where we are now
     */
    public Chart(Context context, String extension)
    {
        super(context, extension);
    }

    /**
     * The instance initializer.
     * @param name the GI name of the instance
     * @param left left position (in pixels) of the chart relative to its parent container
     * @param top top position (in pixels) of the chart relative to its parent container
     * @param width width (in pixels) of the chart
     * @param height height (in pixels) of the chart
     */
    public Chart(String name, int left, int top, int width, int height)
    {
        super((Context) null, (String) null);
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall("new Chart", name, left, top, width, height);
        setInitScript(script);
    }



    /**
     * Returns the titlePlacement field, the quadrant in which to place the title.
     * @param callback titlePlacement, one of {'top','right','bottom','left'}
     */

    public void getTitlePlacement(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getTitlePlacement");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the titlePlacement field.
     * @param titlePlacement the new value for titlePlacement, one of {'top','right','bottom','left'}
     */
    public void setTitlePlacement(String titlePlacement)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setTitlePlacement", titlePlacement);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the legendPlacement field, the quadrant in which to place the legend.
     * @param callback legendPlacement, one of {'top','right','bottom','left'}
     */

    public void getLegendPlacement(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getLegendPlacement");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the legendPlacement field.
     * @param legendPlacement the new value for legendPlacement, one of {'top','right','bottom','left'}
     */
    public void setLegendPlacement(String legendPlacement)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setLegendPlacement", legendPlacement);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the dataPadding field, the CSS padding value that determines the padding around the data area, ie "10" or "5 0 5 0".
     * @param callback dataPadding
     */

    public void getDataPadding(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getDataPadding");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the dataPadding field.
     * @param dataPadding the new value for dataPadding
     */
    public void setDataPadding(String dataPadding)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setDataPadding", dataPadding);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the borderColor field, the RGB color to render the chart's border.
     * @param callback borderColor
     */

    public void getBorderColor(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getBorderColor");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the borderColor field.
     * @param borderColor the new value for borderColor
     */
    public void setBorderColor(Integer borderColor)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setBorderColor", borderColor);
        ScriptProxy.addScript(script);
    }

    /**
     * Sets the borderColor field.
     * @param borderColor the new value for borderColor
     */
    public void setBorderColor(String borderColor)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setBorderColor", borderColor);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the borderWidth field, the pixel width of the chart's border.
     * @param callback borderWidth
     */

    public void getBorderWidth(org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getBorderWidth");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the borderWidth field.
     * @param borderWidth the new value for borderWidth
     */
    public void setBorderWidth(int borderWidth)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setBorderWidth", borderWidth);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the borderAlpha field, the opacity to render the chart's border.
     * @param callback borderAlpha
     */

    public void getBorderAlpha(org.directwebremoting.ui.Callback<Float> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getBorderAlpha");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Float.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the borderAlpha field.
     * @param borderAlpha the new value for borderAlpha
     */
    public void setBorderAlpha(float borderAlpha)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setBorderAlpha", borderAlpha);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the alpha field, the opacity to render the chart's background.
     * @param callback alpha
     */

    public void getAlpha(org.directwebremoting.ui.Callback<Float> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getAlpha");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Float.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Sets the alpha field.
     * @param alpha the new value for alpha
     */
    public void setAlpha(float alpha)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setAlpha", alpha);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns the list of Series children.
     */

    public void getSeries(org.directwebremoting.ui.Callback<Object[]> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getSeries");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Object[].class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns the index of a series in the list of series children.
     * @param s 
     * @param callback the index or -1 if not found
     */

    public void getSeriesIndex(jsx3.chart.Series s, org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getSeriesIndex", s);

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Find the first jsx3.chart.ChartLabel child
     */

    public jsx3.chart.ChartLabel getChartTitle()
    {
        String extension = "getChartTitle().";
        try
        {
            java.lang.reflect.Constructor<jsx3.chart.ChartLabel> ctor = jsx3.chart.ChartLabel.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.chart.ChartLabel.class.getName());
        }
    }


    /**
     * Find the first Legend child
     */

    public jsx3.chart.Legend getLegend()
    {
        String extension = "getLegend().";
        try
        {
            java.lang.reflect.Constructor<jsx3.chart.Legend> ctor = jsx3.chart.Legend.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.chart.Legend.class.getName());
        }
    }


    /**
     * in general the chart legend renders one entry for every series in the chart, override this method to show categories in the legend
     * @param callback <code>jsx3.chart.Legend.SHOW_SERIES</code>
     */

    public void getLegendEntryType(org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getLegendEntryType");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Note that this method is very expensive because it causes the entire chart to be redrawn. It is recommended that
the methods in the CDF interface which cause this method to be called, be passed bRedraw=false to prevent this
method from being called.
     */
    public void redrawRecord()
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "redrawRecord");
        ScriptProxy.addScript(script);
    }

    /**
     * Resets the XML source document stored in the server cache under the XML ID of this object to an empty CDF
document.
     */
    public void clearXmlData()
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "clearXmlData");
        ScriptProxy.addScript(script);
    }

    /**
     * Returns whether this object removes its XML and XSL source documents from the cache of its server when it
is destroyed.
     * @param callback <code>CLEANUPRESOURCES</code> or <code>SHARERESOURCES</code>.
     */

    public void getShareResources(org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getShareResources");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns the XML source document of this object. The XML document is determined by the following steps:

  If an XML document exists in the server cache under an ID equal to the XML ID of this object, that
    document is returned.
  If the XML string of this object is not empty, a new document is created by parsing this string.
  If the XML URL of this object is not empty, a new document is created by parsing the file at the location
    specified by the URL resolved against the server owning this object.
  Otherwise, an empty CDF document is returned.

If a new document is created for this object (any of the steps listed above except for the first one), the
following actions are also taken:

  If creating the document resulted in an error (XML parsing error, file not found error, etc) the offending
    document is returned immediately.
  Otherwise, setSourceXML is called on this object, passing in the created document.
     */

    public jsx3.xml.CdfDocument getXML()
    {
        String extension = "getXML().";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.CdfDocument> ctor = jsx3.xml.CdfDocument.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.CdfDocument.class.getName());
        }
    }

    /**
     * Returns the XML source document of this object. The XML document is determined by the following steps:

  If an XML document exists in the server cache under an ID equal to the XML ID of this object, that
    document is returned.
  If the XML string of this object is not empty, a new document is created by parsing this string.
  If the XML URL of this object is not empty, a new document is created by parsing the file at the location
    specified by the URL resolved against the server owning this object.
  Otherwise, an empty CDF document is returned.

If a new document is created for this object (any of the steps listed above except for the first one), the
following actions are also taken:

  If creating the document resulted in an error (XML parsing error, file not found error, etc) the offending
    document is returned immediately.
  Otherwise, setSourceXML is called on this object, passing in the created document.
     * @param returnType The expected return type
     */

    public <T> T getXML(Class<T> returnType)
    {
        String extension = "getXML().";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Returns the XML ID of this object.
     * @param callback the XML ID.
     */

    public void getXMLId(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXMLId");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns the XML string of this object.
     */

    public void getXMLString(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXMLString");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns the list of XML transformers of this object.
     */

    public void getXMLTransformers(org.directwebremoting.ui.Callback<Object[]> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXMLTransformers");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Object[].class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns the XML URL of this object.
     */

    public void getXMLURL(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXMLURL");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns the XSL source document of this object. The XSL document is determined by the following steps:

  If an XSL document exists in the server cache under an ID equal to the XSL ID of this object, that
    document is returned.
  (Deprecated) If the XSL string of this object is not null, a new document is created by parsing this string.
  (Deprecated) If the XSL URL of this object is not null, a new document is created by parsing the file at the location
    specified by the URL resolved against the server owning this object.
  Otherwise, the default stylesheet (Cacheable.DEFAULTSTYLESHEET) is returned.
     * @return the XSL source document.
     */

    public jsx3.xml.CdfDocument getXSL()
    {
        String extension = "getXSL().";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.CdfDocument> ctor = jsx3.xml.CdfDocument.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.CdfDocument.class.getName());
        }
    }

    /**
     * Returns the XSL source document of this object. The XSL document is determined by the following steps:

  If an XSL document exists in the server cache under an ID equal to the XSL ID of this object, that
    document is returned.
  (Deprecated) If the XSL string of this object is not null, a new document is created by parsing this string.
  (Deprecated) If the XSL URL of this object is not null, a new document is created by parsing the file at the location
    specified by the URL resolved against the server owning this object.
  Otherwise, the default stylesheet (Cacheable.DEFAULTSTYLESHEET) is returned.
     * @param returnType The expected return type
     * @return the XSL source document.
     */

    public <T> T getXSL(Class<T> returnType)
    {
        String extension = "getXSL().";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Returns the XSL ID of this object.
     */

    public void getXSLId(org.directwebremoting.ui.Callback<String> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXSLId");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, String.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns a map containing all the parameters to pass to the XSL stylesheet during transformation.
     */

    public jsx3.lang.Object getXSLParams()
    {
        String extension = "getXSLParams().";
        try
        {
            java.lang.reflect.Constructor<jsx3.lang.Object> ctor = jsx3.lang.Object.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.lang.Object.class.getName());
        }
    }

    /**
     * Returns a map containing all the parameters to pass to the XSL stylesheet during transformation.
     * @param returnType The expected return type
     */

    public <T> T getXSLParams(Class<T> returnType)
    {
        String extension = "getXSLParams().";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Returns whether the XML data source of this object is loaded asynchronously.
     * @param callback <code>0</code> or <code>1</code>.
     */

    public void getXmlAsync(org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXmlAsync");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Returns whether this object is bound to the XML document stored in the data cache.
     * @param callback <code>0</code> or <code>1</code>.
     */

    public void getXmlBind(org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "getXmlBind");

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * This method is called in two situations:

  When the datasource of this object finishes loading (success, error, or timeout), if the
      xmlAsync property of this object is true, its datasource is specified as an
       XML URL, and the first time doTransform() was called the datasource was still loading.
  Any time the value stored in the server XML cache under the key equal to the XML Id of this object
      changes, if the xmlBind property of this object is true.

Any methods overriding this method should begin with a call to jsxsupermix().
     * @param objEvent the event published by the cache.
     */
    public void onXmlBinding(jsx3.lang.Object objEvent)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "onXmlBinding", objEvent);
        ScriptProxy.addScript(script);
    }

    /**
     * Removes a parameter from the list of parameters to pass to the XSL stylesheet during transformation.
     * @param strName the name of the XSL parameter to remove.
     * @return this object.
     */

    public jsx3.xml.Cacheable removeXSLParam(String strName)
    {
        String extension = "removeXSLParam(\"" + strName + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Removes a parameter from the list of parameters to pass to the XSL stylesheet during transformation.
     * @param strName the name of the XSL parameter to remove.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T removeXSLParam(String strName, Class<T> returnType)
    {
        String extension = "removeXSLParam(\"" + strName + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Removes all parameters from the list of parameters to pass to the XSL stylesheet during transformation.
     * @return this object.
     */

    public jsx3.xml.Cacheable removeXSLParams()
    {
        String extension = "removeXSLParams().";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Removes all parameters from the list of parameters to pass to the XSL stylesheet during transformation.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T removeXSLParams(Class<T> returnType)
    {
        String extension = "removeXSLParams().";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Removes the XML and XSL source documents from the server cache.
     * @param objServer the server owning the cache to modify. This is a required argument only if
   <code>this.getServer()</code> does not returns a server instance.
     */
    public void resetCacheData(jsx3.app.Server objServer)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "resetCacheData", objServer);
        ScriptProxy.addScript(script);
    }

    /**
     * Removes the XML source document stored under the XML ID of this object from the server cache.
     * @param objServer the server owning the cache to modify. This is a required argument only if
   <code>this.getServer()</code> does not returns a server instance.
     */
    public void resetXmlCacheData(jsx3.app.Server objServer)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "resetXmlCacheData", objServer);
        ScriptProxy.addScript(script);
    }

    /**
     * Sets whether this object removes its XML and XSL source documents from the cache of its server when it
is destroyed.
     * @param intShare <code>CLEANUPRESOURCES</code> or <code>SHARERESOURCES</code>. <code>CLEANUPRESOURCES</code>
  is the default value if the property is <code>null</code>.
     * @return this object.
     */

    public jsx3.xml.Cacheable setShareResources(int intShare)
    {
        String extension = "setShareResources(\"" + intShare + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Sets whether this object removes its XML and XSL source documents from the cache of its server when it
is destroyed.
     * @param intShare <code>CLEANUPRESOURCES</code> or <code>SHARERESOURCES</code>. <code>CLEANUPRESOURCES</code>
  is the default value if the property is <code>null</code>.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T setShareResources(int intShare, Class<T> returnType)
    {
        String extension = "setShareResources(\"" + intShare + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Sets the source document of this object as though objDoc were retrieved from the XML URL or XML
string of this object. This method executes the following steps:

  The document is transformed serially by each XML transformers of this object.
  The XML document is saved in the server cache under the XML ID of this object.
  If this object is an instance of jsx3.xml.CDF and the root node is a <data> element
    and its jsxassignids attribute is equal to 1, all <record> elements without a
    jsxid attribute are assigned a unique jsxid.
  If this object is an instance of jsx3.xml.CDF, convertProperties() is called
    on this object.
     * @param objDoc 
     * @param objCache 
     * @return the document stored in the server cache as the data source of this object. If
  transformers were run, this value will not be equal to the <code>objDoc</code> parameter.
     */

    public jsx3.xml.CdfDocument setSourceXML(jsx3.xml.CdfDocument objDoc, jsx3.app.Cache objCache)
    {
        String extension = "setSourceXML(\"" + objDoc + "\", \"" + objCache + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.CdfDocument> ctor = jsx3.xml.CdfDocument.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.CdfDocument.class.getName());
        }
    }

    /**
     * Sets the source document of this object as though objDoc were retrieved from the XML URL or XML
string of this object. This method executes the following steps:

  The document is transformed serially by each XML transformers of this object.
  The XML document is saved in the server cache under the XML ID of this object.
  If this object is an instance of jsx3.xml.CDF and the root node is a <data> element
    and its jsxassignids attribute is equal to 1, all <record> elements without a
    jsxid attribute are assigned a unique jsxid.
  If this object is an instance of jsx3.xml.CDF, convertProperties() is called
    on this object.
     * @param objDoc 
     * @param objCache 
     * @param returnType The expected return type
     * @return the document stored in the server cache as the data source of this object. If
  transformers were run, this value will not be equal to the <code>objDoc</code> parameter.
     */

    public <T> T setSourceXML(jsx3.xml.CdfDocument objDoc, jsx3.app.Cache objCache, Class<T> returnType)
    {
        String extension = "setSourceXML(\"" + objDoc + "\", \"" + objCache + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Sets the XML ID of this object. This value is the key under which the XML source document of this object is
saved in the cache of the server owning this object. The developer may specify either a unique or shared value.
If no value is specified, a unique id is generated.
     * @param strXMLId 
     * @return this object.
     */

    public jsx3.xml.Cacheable setXMLId(String strXMLId)
    {
        String extension = "setXMLId(\"" + strXMLId + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Sets the XML ID of this object. This value is the key under which the XML source document of this object is
saved in the cache of the server owning this object. The developer may specify either a unique or shared value.
If no value is specified, a unique id is generated.
     * @param strXMLId 
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T setXMLId(String strXMLId, Class<T> returnType)
    {
        String extension = "setXMLId(\"" + strXMLId + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Sets the XML string of this object. Setting this value to the string serialization of an XML document is one
way of specifying the source XML document of this object.
     * @param strXML <code>null</code> or a well-formed serialized XML element.
     * @return this object.
     */

    public jsx3.xml.Cacheable setXMLString(String strXML)
    {
        String extension = "setXMLString(\"" + strXML + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Sets the XML string of this object. Setting this value to the string serialization of an XML document is one
way of specifying the source XML document of this object.
     * @param strXML <code>null</code> or a well-formed serialized XML element.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T setXMLString(String strXML, Class<T> returnType)
    {
        String extension = "setXMLString(\"" + strXML + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Sets the list of XML transformers of this object. The XML source document of this object is transformed
serially by each of these transformers before it is placed in the XML cache.

Each transformer is either the URI of an XSLT document (which will be resolved against the
the server of this object) or the cache id of a XSLT document in the XML cache of the server
of this object. When any transformer is loaded from a URI it is placed in the server cache under the id
equal to its resolved URI. Any transformer that does not correspond to a valid XSLT document will be skipped
without throwing an error.
     * @param arrTrans 
     */
    public void setXMLTransformers(Object[] arrTrans)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "setXMLTransformers", arrTrans);
        ScriptProxy.addScript(script);
    }

    /**
     * Sets the XML URL of this object. Settings this value to the URI of an XML document is one way of specifying the
source XML document of this object.
     * @param strXMLURL <code>null</code> or a URI that when resolved against the server owning this object
  specifies a valid XML document.
     * @return this object.
     */

    public jsx3.xml.Cacheable setXMLURL(String strXMLURL)
    {
        String extension = "setXMLURL(\"" + strXMLURL + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Sets the XML URL of this object. Settings this value to the URI of an XML document is one way of specifying the
source XML document of this object.
     * @param strXMLURL <code>null</code> or a URI that when resolved against the server owning this object
  specifies a valid XML document.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T setXMLURL(String strXMLURL, Class<T> returnType)
    {
        String extension = "setXMLURL(\"" + strXMLURL + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Adds a name/value pair to the list of parameters to pass to the XSL stylesheet during transformation. If
strValue is null the parameter is removed.
     * @param strName the name of the XSL parameter to add.
     * @param strValue the value of the XSL parameter to add.
     * @return this object.
     */

    public jsx3.xml.Cacheable setXSLParam(String strName, String strValue)
    {
        String extension = "setXSLParam(\"" + strName + "\", \"" + strValue + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Adds a name/value pair to the list of parameters to pass to the XSL stylesheet during transformation. If
strValue is null the parameter is removed.
     * @param strName the name of the XSL parameter to add.
     * @param strValue the value of the XSL parameter to add.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T setXSLParam(String strName, String strValue, Class<T> returnType)
    {
        String extension = "setXSLParam(\"" + strName + "\", \"" + strValue + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Sets whether the XML data source of this object is loaded asynchronously. This setting only applies to
data sources loaded from an XML URL.
     * @param bAsync 
     * @return this object.
     */

    public jsx3.xml.Cacheable setXmlAsync(boolean bAsync)
    {
        String extension = "setXmlAsync(\"" + bAsync + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Cacheable> ctor = jsx3.xml.Cacheable.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Cacheable.class.getName());
        }
    }

    /**
     * Sets whether the XML data source of this object is loaded asynchronously. This setting only applies to
data sources loaded from an XML URL.
     * @param bAsync 
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T setXmlAsync(boolean bAsync, Class<T> returnType)
    {
        String extension = "setXmlAsync(\"" + bAsync + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Sets whether this object is bound to the XML document stored in the data cache. If this object is bound to the
cache, then the onXmlBinding() method of this object is called any time the document stored in
the cache under the XML Id of this object changes.
     * @param bBind 
     * @param callback <code>0</code> or <code>1</code>.
     */

    public void setXmlBind(boolean bBind, org.directwebremoting.ui.Callback<Integer> callback)
    {
        ScriptBuffer script = new ScriptBuffer();
        String callbackPrefix = "";

        if (callback != null)
        {
            callbackPrefix = "var reply = ";
        }

        script.appendCall(callbackPrefix + getContextPath() + "setXmlBind", bBind);

        if (callback != null)
        {
            String key = org.directwebremoting.extend.CallbackHelperFactory.saveCallback(callback, Integer.class);
            script.appendCall("__System.activateCallback", key, "reply");
        }

        ScriptProxy.addScript(script);
    }

    /**
     * Transfers a CDF record from another object to this object. If no XML data source exists
yet for this object, an empty one is created before adding the new record. This method always updates the
on-screen view of both the source and destination objects.

This method fails quietly if any of the following conditions apply:

there is no object with id equal to strSourceId
        
there is no record in the source object with jsxid equal to strRecordId
        

          strParentRecordId is specified and there is no record in this object with
   jsxid equal to strParentRecordId
        
the this object already has a record with jsxid equal to the record to adopt
     * @param strSourceId <span style="text-decoration: line-through;">either the id of the source object or the</span> source object itself.
     * @param strRecordId the <code>jsxid</code> attribute of the data record in the source object to transfer.
     * @param strParentRecordId the unique <code>jsxid</code> of an existing record. If this optional parameter
   is provided, the adopted record will be added as a child of this record. Otherwise, the adopted record will
   be added to the root <code>data</code> element.
     * @param bRedraw forces suppression of the insert event
     * @return the adopted record.
     */

    public jsx3.xml.Node adoptRecord(jsx3.xml.CdfDocument strSourceId, String strRecordId, String strParentRecordId, boolean bRedraw)
    {
        String extension = "adoptRecord(\"" + strSourceId + "\", \"" + strRecordId + "\", \"" + strParentRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Transfers a CDF record from another object to this object. If no XML data source exists
yet for this object, an empty one is created before adding the new record. This method always updates the
on-screen view of both the source and destination objects.

This method fails quietly if any of the following conditions apply:

there is no object with id equal to strSourceId
        
there is no record in the source object with jsxid equal to strRecordId
        

          strParentRecordId is specified and there is no record in this object with
   jsxid equal to strParentRecordId
        
the this object already has a record with jsxid equal to the record to adopt
     * @param strSourceId <span style="text-decoration: line-through;">either the id of the source object or the</span> source object itself.
     * @param strRecordId the <code>jsxid</code> attribute of the data record in the source object to transfer.
     * @param strParentRecordId the unique <code>jsxid</code> of an existing record. If this optional parameter
   is provided, the adopted record will be added as a child of this record. Otherwise, the adopted record will
   be added to the root <code>data</code> element.
     * @param bRedraw forces suppression of the insert event
     * @return the adopted record.
     */

    public jsx3.xml.Node adoptRecord(String strSourceId, String strRecordId, String strParentRecordId, boolean bRedraw)
    {
        String extension = "adoptRecord(\"" + strSourceId + "\", \"" + strRecordId + "\", \"" + strParentRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Equivalent to adoptRecord, except that the to-be relationship is as a previousSibling to the CDF record identified by the parameter, strSiblingRecordId

This method fails quietly if any of the following conditions apply:

there is no record with a jsxid equal to strSourceId
        
there is no record in the source object with a jsxid equal to strRecordId
        

          strSiblingRecordId is specified and there is no record in this object with a
   jsxid equal to strParentRecordId
        
this object already has a record with jsxid equal to the record to adopt
     * @param strSourceId <span style="text-decoration: line-through;">either the id of the source object or the</span> source object itself.
     * @param strRecordId the <code>jsxid</code> attribute of the data record in the source object to transfer.
     * @param strSiblingRecordId the unique <code>jsxid</code> of an existing record in front of
which the record identified by strSourceId will be placed
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the deleted record.
     * @return the adopted record.
     */

    public jsx3.xml.Node adoptRecordBefore(jsx3.xml.CdfDocument strSourceId, String strRecordId, String strSiblingRecordId, boolean bRedraw)
    {
        String extension = "adoptRecordBefore(\"" + strSourceId + "\", \"" + strRecordId + "\", \"" + strSiblingRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Equivalent to adoptRecord, except that the to-be relationship is as a previousSibling to the CDF record identified by the parameter, strSiblingRecordId

This method fails quietly if any of the following conditions apply:

there is no record with a jsxid equal to strSourceId
        
there is no record in the source object with a jsxid equal to strRecordId
        

          strSiblingRecordId is specified and there is no record in this object with a
   jsxid equal to strParentRecordId
        
this object already has a record with jsxid equal to the record to adopt
     * @param strSourceId <span style="text-decoration: line-through;">either the id of the source object or the</span> source object itself.
     * @param strRecordId the <code>jsxid</code> attribute of the data record in the source object to transfer.
     * @param strSiblingRecordId the unique <code>jsxid</code> of an existing record in front of
which the record identified by strSourceId will be placed
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the deleted record.
     * @return the adopted record.
     */

    public jsx3.xml.Node adoptRecordBefore(String strSourceId, String strRecordId, String strSiblingRecordId, boolean bRedraw)
    {
        String extension = "adoptRecordBefore(\"" + strSourceId + "\", \"" + strRecordId + "\", \"" + strSiblingRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Converts all attributes in this CDF document that are property keys of the form {key} to
the value of the property.
     * @param objProps the properties repository to query.
     * @param arrProps if provided, these attributes are converted rather than the default set of
   attributes.
     * @param bUnion if <code>true</code>, <code>arrProps</code> is combined with the default set of
   attributes and those attributes are converted.
     */
    public void convertProperties(java.util.Properties objProps, Object[] arrProps, boolean bUnion)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "convertProperties", objProps, arrProps, bUnion);
        ScriptProxy.addScript(script);
    }

    /**
     * Removes a record from the XML data source of this object.
     * @param strRecordId the <code>jsxid</code> attribute of the data record to remove.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the deleted record.
     * @return the record removed from the data source or <code>null</code> if no such record found.
     */

    public jsx3.xml.Node deleteRecord(String strRecordId, boolean bRedraw)
    {
        String extension = "deleteRecord(\"" + strRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Removes a specific property from a record. If no such record exists in the XML document, this method fails quietly.
     * @param strRecordId the <code>jsxid</code> attribute of the data record to modify.
     * @param strPropName the name of the property to remove from the record.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the deleted property.
     */
    public void deleteRecordProperty(String strRecordId, String strPropName, boolean bRedraw)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "deleteRecordProperty", strRecordId, strPropName, bRedraw);
        ScriptProxy.addScript(script);
    }

    /**
     * Returns an object containing the attributes of a particular CDF record as property/value pairs. The object returned by this
method is a copy of the underlying data. Therefore, updates to this object will not affect the underlying data.

The following two lines of code evaluate to the same value:

objCDF.getRecord(strId).propName;
objCDF.getRecordNode(strId).getAttribute("propName");
     * @param strRecordId the <code>jsxid</code> attribute of the data record to return.
     * @return the object representation of a CDF node or <code>null</code> if no such record found.
     */

    public jsx3.lang.Object getRecord(String strRecordId)
    {
        String extension = "getRecord(\"" + strRecordId + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.lang.Object> ctor = jsx3.lang.Object.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.lang.Object.class.getName());
        }
    }

    /**
     * Returns an object containing the attributes of a particular CDF record as property/value pairs. The object returned by this
method is a copy of the underlying data. Therefore, updates to this object will not affect the underlying data.

The following two lines of code evaluate to the same value:

objCDF.getRecord(strId).propName;
objCDF.getRecordNode(strId).getAttribute("propName");
     * @param strRecordId the <code>jsxid</code> attribute of the data record to return.
     * @param returnType The expected return type
     * @return the object representation of a CDF node or <code>null</code> if no such record found.
     */

    public <T> T getRecord(String strRecordId, Class<T> returnType)
    {
        String extension = "getRecord(\"" + strRecordId + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

    /**
     * Returns a record from the XML data source of this object. This returned value is a handle to the record and
not a clone. Therefore, any updates made to the returned value with update the XML document of this object.
To reflect such changes in the on-screen view of this object, call
redrawRecord(strRecordId, jsx3.xml.CDF.UPDATE); on this object.
     * @param strRecordId the <code>jsxid</code> attribute of the data record to return.
     * @return the record node or <code>null</code> if none exists with a <code>jsxid</code>
   attribute equal to <code>strRecordId</code>.
     */

    public jsx3.xml.Node getRecordNode(String strRecordId)
    {
        String extension = "getRecordNode(\"" + strRecordId + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Inserts a new record into the XML data source of this object. If no XML data source exists
yet for this object, an empty one is created before adding the new record.
If a record already exists with an id equal to the jsxid property of objRecord,
the operation is treated as an update, meaning the existing record is completely removed and a new record with
the given jsxid is inserted.
     * @param objRecord a JavaScript object containing property/value pairs that define the
   attributes of the XML entity to create. Note that most classes that implement this interface require that all
   records have an attribute named <code>jsxid</code> that is unique across all records in the XML document.
   All property values will be treated as strings. Additionally, the following 3 characters are escaped:
   <code>" &gt; &lt;</code>.
     * @param strParentRecordId the unique <code>jsxid</code> of an existing record. If this optional parameter
   is provided and a record exists with a matching <code>jsxid</code> attribute, the new record will be added as a child of
   this record. Otherwise, the new record will be added to the root <code>data</code> element. However, if a
   record already exists with a <code>jsxid</code> attribute equal to the <code>jsxid</code> property of
   <code>objRecord</code>, this parameter will be ignored. In this case <code>adoptRecord()</code> must be called
   to change the parent of the record.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the additional record.
     * @return the newly created or updated entity.
     */

    public jsx3.xml.Node insertRecord(jsx3.lang.Object objRecord, String strParentRecordId, boolean bRedraw)
    {
        String extension = "insertRecord(\"" + objRecord + "\", \"" + strParentRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Creates a new CDF record and inserts it into the CDF data source of this object, before the record identified by strSiblingRecordId.

This method fails quietly if any of the following conditions apply:

there is no existing record with a jsxid equal to strSiblingRecordId
        
there is an existing record with jsxid equal to objRecord.jsxid
     * @param objRecord a JavaScript object containing property/value pairs that define the
   attributes of the XML entity to create. Note that most classes that implement this interface require that all
   records have an attribute named <code>jsxid</code> that is unique across all records in the XML document.
   All property values will be treated as strings. Additionally, the following 3 characters are escaped:
   <code>" &gt; &lt;</code>.
     * @param strSiblingRecordId the unique <code>jsxid</code> of an existing record before which the new record will be inserted.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the additional record.
     * @return the newly created entity.
     */

    public jsx3.xml.Node insertRecordBefore(jsx3.lang.Object objRecord, String strSiblingRecordId, boolean bRedraw)
    {
        String extension = "insertRecordBefore(\"" + objRecord + "\", \"" + strSiblingRecordId + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.Node> ctor = jsx3.xml.Node.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.Node.class.getName());
        }
    }


    /**
     * Inserts a new record into the XML data source of this object. This method is the same as
insertRecord() except that its first parameter is of type jsx3.xml.Entity rather than
Object.
     * @param objRecordNode an XML element of name <code>record</code>. Note that most classes that
   implement this interface require that all records have an attribute named <code>jsxid</code> that is unique
   across all records in the XML document.
     * @param strParentRecordId the unique <code>jsxid</code> of an existing record. If this optional parameter
   is provided and a record exists with a matching <code>jsxid</code> attribute, the new record will be added as a child of
   this record. Otherwise, the new record will be added to the root <code>data</code> element.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the additional record.
     */
    public void insertRecordNode(jsx3.xml.Node objRecordNode, String strParentRecordId, boolean bRedraw)
    {
        ScriptBuffer script = new ScriptBuffer();
        script.appendCall(getContextPath() + "insertRecordNode", objRecordNode, strParentRecordId, bRedraw);
        ScriptProxy.addScript(script);
    }

    /**
     * Inserts a new property into an existing record with jsxid equal to strRecordId.
If the property already exists, the existing property value will be updated. If no such record exists
in the XML document, this method fails quietly.
     * @param strRecordId the <code>jsxid</code> attribute of the data record to modify.
     * @param strPropName the name of the property to insert into the record.
     * @param strPropValue the value of the property to insert.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the inserted property.
     * @return this object.
     */

    public jsx3.xml.CdfDocument insertRecordProperty(String strRecordId, String strPropName, String strPropValue, boolean bRedraw)
    {
        String extension = "insertRecordProperty(\"" + strRecordId + "\", \"" + strPropName + "\", \"" + strPropValue + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<jsx3.xml.CdfDocument> ctor = jsx3.xml.CdfDocument.class.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported type: " + jsx3.xml.CdfDocument.class.getName());
        }
    }

    /**
     * Inserts a new property into an existing record with jsxid equal to strRecordId.
If the property already exists, the existing property value will be updated. If no such record exists
in the XML document, this method fails quietly.
     * @param strRecordId the <code>jsxid</code> attribute of the data record to modify.
     * @param strPropName the name of the property to insert into the record.
     * @param strPropValue the value of the property to insert.
     * @param bRedraw if <code>true</code> or <code>null</code>, the on-screen view of this object is
   immediately updated to reflect the inserted property.
     * @param returnType The expected return type
     * @return this object.
     */

    public <T> T insertRecordProperty(String strRecordId, String strPropName, String strPropValue, boolean bRedraw, Class<T> returnType)
    {
        String extension = "insertRecordProperty(\"" + strRecordId + "\", \"" + strPropName + "\", \"" + strPropValue + "\", \"" + bRedraw + "\").";
        try
        {
            java.lang.reflect.Constructor<T> ctor = returnType.getConstructor(Context.class, String.class);
            return ctor.newInstance(this, extension);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

}

