package com.conztanz.connect.transform.travel.airimp;

/**
 * 
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
public class PNLSmooksReader extends AbstractAIRIMPSmooksReader
{
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data {@inheritDoc}
   * @return {@inheritDoc}
   * @see com.conztanz.mediator.travel.airimp.AbstractAIRIMPSmooksReader#isIgnoredDestinationData(java.lang.String)
   */
  @Override
  protected boolean isIgnoredDestinationData(String data)
  {
    if(super.isIgnoredDestinationData(data) ||  data.startsWith("AVAIL") || data.startsWith("TRANSIT") ||
       data.matches("([A-Z]{3}){1,}") ||    //ZRH FCO NBO JNB
       data.matches("[A-Z]([0-9]{3}){1,}")) //F000 002 010
    {
      return true;
    }
    return false;
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
    return "PNL";
  }
}
