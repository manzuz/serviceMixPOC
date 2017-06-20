package com.conztanz.connect.identification;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.conztanz.connect.model.IncomingMessage;

/**
 * 
 * @author User
 *
 */
public abstract class AbstractConnectIdentifier<INCOMING_MESSAGE extends IncomingMessage<?>>
        implements IAbstractConnectIdentifier<INCOMING_MESSAGE> {

	public abstract void identify(INCOMING_MESSAGE incomingMessage)
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException;

	/**
	 * @param incomingMessage
	 * @return
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	protected Document getDocument(INCOMING_MESSAGE incomingMessage)throws SAXException, IOException, ParserConfigurationException
    {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(incomingMessage.getTransformedPayload())));
		return doc;
	}

}
