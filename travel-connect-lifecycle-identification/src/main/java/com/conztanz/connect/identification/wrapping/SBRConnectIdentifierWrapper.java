package com.conztanz.connect.identification.wrapping;

import java.io.IOException;

import javax.inject.Singleton;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.conztanz.connect.identification.IAbstractConnectIdentifier;
import com.conztanz.connect.identification.SBRConnectIdentifier;
import com.conztanz.connect.travel.model.SBRIncomingMessage;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

/**
 * 
 * @author User
 *
 */
@Singleton

public class SBRConnectIdentifierWrapper implements IAbstractConnectIdentifier<SBRIncomingMessage> {

	/**
	 * 
	 */
	@Override
	public void identify(SBRIncomingMessage incomingMessage) {
		ConztanzSpringApplicationContext.getBean(SBRConnectIdentifier.class).identify(incomingMessage);

	}

}
