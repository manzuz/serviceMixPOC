package com.conztanz.connect.identification;



import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.conztanz.connect.identification.xpath.XpathClient;
import com.conztanz.connect.model.IncomingMessage;

public class SBR141ConnectIdentifier extends AbstractConnectIdentifier
{
	
	private final String CONTROL_NUMBER = "//ForPnrHandling/activePNRimage/amadeusId/reservation/controlNumber";
	private final String  CREATION_DATE = "//ForPnrHandling/activePNRimage/pnrHeader/securityInformation/secondRpInformation/creationDate";
	
	@Autowired
	private  XpathClient xpathClient ;
	

	@Override
	public void identify(IncomingMessage incomingMessage) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException  {
		Document doc = super.getDocument(incomingMessage);
		String controlNumber = this.getXpathClient().request(CONTROL_NUMBER, doc);
		String creationDate = this.getXpathClient().request(CREATION_DATE, doc);
		String objectID = controlNumber + "//" + creationDate;
		incomingMessage.setObjectId(objectID);
	}


	public XpathClient getXpathClient() {
		return xpathClient;
	}


	public void setXpathClient(XpathClient xpathClient) {
		this.xpathClient = xpathClient;
	}

	
	
	
	
}
