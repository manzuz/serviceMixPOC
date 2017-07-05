package com.conztanz.connect.identification;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.conztanz.connect.identification.xpath.XpathClient;
import com.conztanz.connect.travel.model.SBRIncomingMessage;
import com.conztanz.connect.travel.model.SBRObjectID;

public class SBRConnectIdentifier extends AbstractConnectIdentifier<SBRIncomingMessage>
{
	
	private final String CONTROL_NUMBER = "//ForPnrHandling/activePNRimage/amadeusId/reservation/controlNumber";
	private final String  CREATION_DATE = "//ForPnrHandling/activePNRimage/pnrHeader/securityInformation/secondRpInformation/creationDate";
	
	@Autowired
	private  XpathClient xpathClient ;
	

	@Override
	public void identify(SBRIncomingMessage incomingMessage)
	{
//		TODO : this is shit
		try
		{

			Document doc = super.getDocument(incomingMessage);
			String controlNumber = this.getXpathClient().request(CONTROL_NUMBER, doc);
			String creationDate = this.getXpathClient().request(CREATION_DATE, doc);
//		String objectID = controlNumber + "//" + creationDate;
			SBRObjectID sbrObjectID = new SBRObjectID(controlNumber, creationDate);
			incomingMessage.setObjectId(sbrObjectID);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	public XpathClient getXpathClient() {
		return xpathClient;
	}


	public void setXpathClient(XpathClient xpathClient) {
		this.xpathClient = xpathClient;
	}

}
