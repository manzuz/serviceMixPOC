package com.conztanz.connect.identification;

import java.io.IOException;

import javax.inject.Singleton;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.conztanz.connect.identification.xpath.XpathClient;
import com.conztanz.connect.model.IncomingMessage;

//TODO : naming 
@Singleton
public class PFSConnectIdentifier extends AbstractConnectIdentifier {
	
	@Autowired
	private  XpathClient xpathClient ;

	
	private final String XPATH_COMPANY ="//delivery/segment/designator/company";
	private final String XPATH_FLIGHTNUM = "//delivery/segment/designator/number";
	private final String XPATH_DEPDATE = "//delivery/segment/departure/date";
	private final String XPATH_STATION = "//delivery/segment/departure/station";


	
	
	

	

	@Override
	public void  identify(IncomingMessage incomingMessage) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException  {
		Document doc = super.getDocument(incomingMessage);
		System.out.println(this.getXpathClient());
		String company = this.getXpathClient().request(XPATH_COMPANY, doc);
		String flightNum = this.getXpathClient().request(XPATH_FLIGHTNUM, doc);
		String depDate = this.getXpathClient().request(XPATH_DEPDATE, doc);
		String station = this.getXpathClient().request(XPATH_STATION, doc);
		
		String objectID = company + flightNum + "//" + depDate + station;
		System.out.println(objectID);
		incomingMessage.setObjectId(objectID);


	
	}




	public XpathClient getXpathClient() {
		return xpathClient;
	}

	public void setXpathClient(XpathClient xpathClient) {
		this.xpathClient = xpathClient;
	}
	
	
	

	
	
	
}
