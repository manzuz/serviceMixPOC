package com.conztanz.marshalling;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;

/**
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @param <BINDING> TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
//@Scope("singleton")
public class AbstractConztanzUnmarshaller<BINDING>
{
  /** Charset encoding UTF-8 */
  public static final String CHARSET_ENCODING_UTF8 = "UTF-8";
  
  /** TODO TO BE REVIEWED */
  private Class<BINDING> bindingClass;
  
  /**
   * 
   * TODO TO BE REVIEWED
   * @param bindingClass TODO TO BE REVIEWED
   */
  public AbstractConztanzUnmarshaller(Class<BINDING> bindingClass)
  {
    this.bindingClass = bindingClass;
  }

  /**
   * 
   * TODO TO BE REVIEWED
   * @param xml TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws JiBXException TODO TO BE REVIEWED
   */
  public BINDING unmarshall(String xml) throws JiBXException
  {
    return this.unmarshall(new ByteArrayInputStream(xml.getBytes()));
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param xmlStream TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws JiBXException TODO TO BE REVIEWED
   */
  @SuppressWarnings("unchecked")
  public BINDING unmarshall(InputStream xmlStream) throws JiBXException
  {
    // Get JIBX binding factory (treated as singleton inside)
    IBindingFactory bindingFactory = BindingDirectory.getFactory(this.getBindingClass());
    // Create a new marshalling context on every beans because of multi-threading handling
    IUnmarshallingContext unmarshallingContext = bindingFactory.createUnmarshallingContext();
    return (BINDING) unmarshallingContext.unmarshalDocument(xmlStream, CHARSET_ENCODING_UTF8);
  }
  
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  public Class<BINDING> getBindingClass()
  {
    return this.bindingClass;
  }
}
