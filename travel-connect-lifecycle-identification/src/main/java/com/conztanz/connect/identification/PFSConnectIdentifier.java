package com.conztanz.connect.identification;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.conztanz.connect.identification.xpath.XpathClient;
import com.conztanz.connect.model.IncomingMessage;

public class PFSConnectIdentifier extends AbstractConnectIdentifier {
	
	@Autowired
	private  XpathClient  xpathClient ;
	
	private final String XPATH_COMPANY ="//delivery/segment/designator/company";
	private final String XPATH_FLIGHTNUM = "//delivery/segment/designator/number";
	private final String XPATH_DEPDATE = "//delivery/segment/departure/date";
	private final String XPATH_STATION = "//delivery/segment/departure/station";


	
	
	

	

	@Override
	public void  identify(IncomingMessage incomingMessage) throws ConnectIdentificationException
  {
      Document doc = null;
      try
      {
          doc = super.getDocument(incomingMessage);
          String company = this.getXpathClient().request(XPATH_COMPANY, doc);
          String flightNum = this.getXpathClient().request(XPATH_FLIGHTNUM, doc);
          String depDate = this.getXpathClient().request(XPATH_DEPDATE, doc);
          String station = this.getXpathClient().request(XPATH_STATION, doc);
          String objectID = company + flightNum + "//" + depDate + station;
          incomingMessage.setObjectId(objectID);
      }
      catch (SAXException | ParserConfigurationException | IOException | XPathExpressionException e)
      {
        throw  new ConnectIdentificationException(e);
      }


  }



	public XpathClient  getXpathClient() {
		return xpathClient;
	}

	public void setXpathClient(XpathClient  xpathClient) {
		this.xpathClient = xpathClient;
	}
	
	

	
	
	
}
