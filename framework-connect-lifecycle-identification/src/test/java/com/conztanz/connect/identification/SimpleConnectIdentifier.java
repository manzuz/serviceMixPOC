package com.conztanz.connect.identification;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.identification.exception.ObjectIdNotFoundException;
import com.conztanz.connect.identification.exception.SequenceNumberNotFoundException;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.SAXException;

import com.conztanz.connect.identification.xpath.XpathClient;
import com.conztanz.connect.model.IncomingMessage;

public class SimpleConnectIdentifier extends AbstractConnectIdentifier<SimpleSequencedIncomingMessage> implements IAbstractConnectIdentifier<SimpleSequencedIncomingMessage>
{
  @Autowired
  private XpathClient xpathClient;

  @Override
  public void identify(SimpleSequencedIncomingMessage incomingMessage) throws ConnectIdentificationException
  {
    try
    {
      String objectID = xpathClient.request("//message//objectID", getDocument(incomingMessage));
      String sequenceNum = xpathClient.request("//message//sequenceNum", getDocument(incomingMessage));

      if ("".equals(objectID))
        throw new ObjectIdNotFoundException(null);
      if ("".equals(sequenceNum))
        throw new SequenceNumberNotFoundException(null);
      incomingMessage.setObjectId(objectID);
      incomingMessage.setSequenceNumber(Integer.valueOf(sequenceNum));
    }
    catch (SAXException | XPathExpressionException | IOException | ParserConfigurationException e)
    {
      throw new ConnectIdentificationException(e);
    }
  }

}
