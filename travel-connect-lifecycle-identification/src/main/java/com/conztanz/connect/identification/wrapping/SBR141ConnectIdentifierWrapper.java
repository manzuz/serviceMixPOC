package com.conztanz.connect.identification.wrapping;

import java.io.IOException;

import javax.inject.Singleton;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.conztanz.connect.identification.IAbstractConnectIdentifier;
import com.conztanz.connect.identification.SBR141ConnectIdentifier;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

/**
 * 
 * @author User
 *
 */
@Singleton

public class SBR141ConnectIdentifierWrapper implements IAbstractConnectIdentifier {

	/**
	 * 
	 */
	@Override
	public void identify(IncomingMessage incomingMessage)
			throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		ConztanzSpringApplicationContext.getBean(SBR141ConnectIdentifier.class).identify(incomingMessage);

	}

}
