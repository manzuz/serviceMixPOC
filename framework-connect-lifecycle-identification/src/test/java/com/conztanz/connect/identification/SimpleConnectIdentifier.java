package com.conztanz.connect.identification;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.conztanz.connect.model.IncomingMessage;

public class SimpleConnectIdentifier extends AbstractConnectIdentifier 
{

	@Override
	public void identify(IncomingMessage incomingMessage) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		incomingMessage.setObjectId("1234456789");
	}

}
