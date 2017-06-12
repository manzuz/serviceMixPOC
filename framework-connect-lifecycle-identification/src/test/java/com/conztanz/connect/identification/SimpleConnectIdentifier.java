package com.conztanz.connect.identification;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.SAXException;

import com.conztanz.connect.identification.xpath.XpathClient;
import com.conztanz.connect.model.IncomingMessage;

public class SimpleConnectIdentifier extends AbstractConnectIdentifier 
{
	@Autowired 
	private XpathClient xpathClient;
	@Override
	public void identify(IncomingMessage incomingMessage) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		incomingMessage.setObjectId(xpathClient.request("//root//objectID", getDocument(incomingMessage)));
	}

}
