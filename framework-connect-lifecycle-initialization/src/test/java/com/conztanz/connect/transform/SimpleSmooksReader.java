package com.conztanz.connect.transform;

import java.io.IOException;

import javax.xml.XMLConstants;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/**
 * 
 * @author User
 *
 */

public class SimpleSmooksReader extends AbstractSmooksXMLReader
{
	/**
	 * 
	 */
	public void parse(InputSource prlInputSource) throws IOException, SAXException
    {

		// Send the start of message events to the handler...
		this.getContentHandler().startDocument();
		this.getContentHandler().startElement(XMLConstants.NULL_NS_URI, this.getDocumentStart(), "",new AttributesImpl());

		// Send the end of message events to the handler...
		this.getContentHandler().endElement(XMLConstants.NULL_NS_URI, this.getDocumentStart(), "");
		this.getContentHandler().endDocument();
	}

	@Override
	public void parse(String systemId) throws IOException, SAXException
    {
	}

	protected String getDocumentStart()
    {
		return "test";
	}

}