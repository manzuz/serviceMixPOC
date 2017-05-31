package com.conztanz.connect.transform.travel.airimp;

import java.io.BufferedReader;
import java.io.IOException;

import org.xml.sax.SAXException;

import com.conztanz.enums.event.Action;

/**
 * 
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
public class PRLSmooksReader extends AbstractAIRIMPSmooksReader
{
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reader {@inheritDoc}
   * @return {@inheritDoc}
   * @throws IOException {@inheritDoc}
   * @throws SAXException {@inheritDoc}
   * @see com.conztanz.mediator.travel.airimp.AbstractAIRIMPSmooksReader#parseTravelerData(java.io.BufferedReader)
   */
  @Override
  protected String parseTravelerData(BufferedReader reader) throws IOException, SAXException
  {
    this.setBooked(true);
    this.setBoarded(true);
    this.setCheckinStatus(Action.ACCEPTED);
    return super.parseTravelerData(reader);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return {@inheritDoc}
   * @see com.conztanz.mediator.travel.airimp.AbstractAIRIMPSmooksReader#getDeliveryType()
   */
  @Override
  protected String getDeliveryType()
  {
    return "PRL";
  }
}
