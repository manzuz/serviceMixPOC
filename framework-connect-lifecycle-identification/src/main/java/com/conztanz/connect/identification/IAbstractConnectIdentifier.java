package com.conztanz.connect.identification;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.conztanz.connect.model.IncomingMessage;

/**
 * 
 * @author User
 *
 */
public interface IAbstractConnectIdentifier {
	
	/**
	 * 
	 * @param incomingMessage
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 * @throws XPathExpressionException
	 */
	void identify(IncomingMessage incomingMessage) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException;

}
