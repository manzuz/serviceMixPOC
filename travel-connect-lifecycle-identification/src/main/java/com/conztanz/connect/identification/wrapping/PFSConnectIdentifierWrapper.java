package com.conztanz.connect.identification.wrapping;

import java.io.IOException;

import javax.inject.Singleton;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.conztanz.connect.identification.IAbstractConnectIdentifier;
import com.conztanz.connect.identification.PFSConnectIdentifier;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

/**
 * 
 * @author User
 *
 */

@Singleton
public class PFSConnectIdentifierWrapper implements IAbstractConnectIdentifier {
	/**
	 * 
	 */
	@Override
	public void identify(IncomingMessage incomingMessage) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		ConztanzSpringApplicationContext.getBean(PFSConnectIdentifier.class).identify(incomingMessage);

	}

}
