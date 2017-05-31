package com.conztanz.connect.transform;

import javax.xml.XMLConstants;

import org.apache.commons.lang3.StringUtils;
import org.milyn.container.ExecutionContext;
import org.milyn.xml.SmooksXMLReader;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.helpers.AttributesImpl;

/**
 * Default implementation with utility methods for implementing a {@link SmooksXMLReader}
 * 
 * @author sbrouet
 *
 */
public abstract class AbstractSmooksXMLReader implements SmooksXMLReader
{
  private ContentHandler contentHandler;

  @Override
  public ContentHandler getContentHandler()
  {
    return this.contentHandler;
  }

  @Override
  public void setContentHandler(ContentHandler handler)
  {
    this.contentHandler = handler;
  }

  /** @see org.milyn.xml.SmooksXMLReader#setExecutionContext(org.milyn.container.ExecutionContext) */
  @Override
  public void setExecutionContext(ExecutionContext executionContext)
  {
    // Ignored, do nothing
  }

  /** @see org.xml.sax.XMLReader#getDTDHandler() */
  @Override
  public DTDHandler getDTDHandler()
  {
    // Ignored, do nothing
    return null;
  }

  /** @see org.xml.sax.XMLReader#setDTDHandler(org.xml.sax.DTDHandler) */
  @Override
  public void setDTDHandler(DTDHandler handler)
  {
    // Ignored, do nothing
  }

  /**
   * @see org.xml.sax.XMLReader#getEntityResolver()
   */
  @Override
  public EntityResolver getEntityResolver()
  {
    // Ignored, do nothing
    return null;
  }

  /**
   * @see org.xml.sax.XMLReader#setEntityResolver(org.xml.sax.EntityResolver)
   */
  @Override
  public void setEntityResolver(EntityResolver resolver)
  {
    // Ignored, do nothing
  }

  /** @see org.xml.sax.XMLReader#getErrorHandler() */
  @Override
  public ErrorHandler getErrorHandler()
  {
    // Ignored, do nothing
    return null;
  }

  /** @see org.xml.sax.XMLReader#setContentHandler(org.xml.sax.ContentHandler) */
  @Override
  public void setErrorHandler(ErrorHandler handler)
  {
    // Ignored, do nothing
  }

  /** @see org.xml.sax.XMLReader#getFeature(java.lang.String) */
  @Override
  public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException
  {
    // Ignored, do nothing
    return false;
  }

  /** @see org.xml.sax.XMLReader#setFeature(java.lang.String, boolean) */
  @Override
  public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException
  {
    // Ignored, do nothing
  }

  /** @see org.xml.sax.XMLReader#getProperty(java.lang.String) */
  @Override
  public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException
  {
    // Ignored, do nothing
    return null;
  }

  /**
   * @see org.xml.sax.XMLReader#setProperty(java.lang.String, java.lang.Object)
   */
  @Override
  public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException
  {
    // Ignored, do nothing
  }

  /**
   * Utility method for starting an XML element on the {@link #getContentHandler()} with default values
   * 
   * @param name element name
   * @throws SAXException
   */
  protected void startElement(String name) throws SAXException
  {
    this.getContentHandler().startElement(XMLConstants.NULL_NS_URI, name, "", new AttributesImpl());
  }

  /**
   * Utility method for ending an XML element on the {@link #getContentHandler()} with default values
   * 
   * @param name element name
   * @throws SAXException
   */

  protected void endElement(String name) throws SAXException
  {
    this.getContentHandler().endElement(XMLConstants.NULL_NS_URI, name, "");
  }

  /**
   * Utility method for creating a simple XML element on the {@link #getContentHandler()} with default values
   * 
   * @param name element name
   * @throws SAXException
   */
  protected void simpleElement(String name, String data) throws SAXException
  {
    data = StringUtils.trimToEmpty(data);
    this.startElement(name);
    this.fillElement(data);
    this.endElement(name);
  }
  /**
   * Utility method for creating a simple XML element on the {@link #getContentHandler()} with default values
   * 
   * @param name element name
   * @throws SAXException
   */
  protected void simpleElement(String name, Boolean data) throws SAXException
  {
    if(data == null)
    {
      return;
    }
    this.simpleElement(name, data.toString());
  }

  /**
   * Utility method for filling an XML element's value on the {@link #getContentHandler()} with default values
   * 
   * @param name element name
   * @throws SAXException
   */
  protected void fillElement(String data) throws SAXException
  {
    data = data.trim();
    this.getContentHandler().characters(data.toCharArray(), 0, data.length());
  }

}
