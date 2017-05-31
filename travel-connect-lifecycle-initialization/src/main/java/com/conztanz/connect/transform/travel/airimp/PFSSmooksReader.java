package com.conztanz.connect.transform.travel.airimp;

import java.io.BufferedReader;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.SAXException;

import com.conztanz.enums.event.Action;
import com.conztanz.enums.event.TagTravel;

/**
 * 
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
public class PFSSmooksReader extends AbstractAIRIMPSmooksReader
{
  /** TODO TO BE REVIEWED */
  private ThreadLocal<String> boardingReportGroup = new ThreadLocal<>();
  
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
    if(super.isIgnoredDestinationData(data) || 
       data.matches("[A-Z]{3}[0-9]{1,3}/[0-9]{1,3}/[0-9]{1,3}.*"))//FCO13/047/032
    {
      return true;
    }
    return false;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reader {@inheritDoc}
   * @return {@inheritDoc}
   * @throws IOException {@inheritDoc}
   * @throws SAXException {@inheritDoc}
   * @see com.conztanz.mediator.travel.airimp.AbstractAIRIMPSmooksReader#parseTravelers(java.io.BufferedReader)
   */
  @Override
  protected String parseTravelers(BufferedReader reader) throws IOException, SAXException
  {
    try
    {
      String line = reader.readLine();
      while(line != null)
      {
        String boardingReportGroup = StringUtils.trimToNull(this.substring(line, 0, 5));
        if(boardingReportGroup == null)
        {
          break;
        }
        this.boardingReportGroup.set(boardingReportGroup);
        line = super.parseTravelers(reader);
      }
      return line;
    }
    finally
    {
      this.boardingReportGroup.remove();
    }
  }

  /**
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
    String boardingReport = StringUtils.trimToEmpty(this.boardingReportGroup.get());
    switch(boardingReport)
    {
      case "CFMWL" : // Passenger without OK ticket, shown on PNL/ADL as a revenue passenger on the waiting list (.WL/); boarded.
        this.setBooked(true);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "FQTVN" : // Frequent traveler number (if not shown on, or modified from, the passenger data the PNL/ADL).
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "NOSHO" : // Shown on PNL/ADL but not checked-in (exclude .ID2/ passengers)
        this.setBooked(true);
        this.setBoarded(false);
        this.setBoardingReport(TagTravel.NOSHOW.getCode());
        break;
      case "OFFLK" : // Passenger with OK ticket shown in PNL/ADL, checked-in but not departed. For example, not boarded because of capacity.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(false);
        this.setBoardingReport(boardingReport);
        break;
      case "OFFLN" : // Passenger with OK ticket, not shown on PNL/ADL, checked-in but not departed. For example, not boarded because of capacity.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(false);
        this.setBoardingReport(boardingReport);
        break;
      case "NOREC" : // Passenger with OK ticket, not shown on PNL/ADL; departed
        this.setBooked(false);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "GOSHN" : // Passenger without OK ticket, not shown on PNL/ADL; not departed; indicates to reservations that a higher passenger demand than the offered aircraft capacity has existed (exclude .ID2/ passengers).
        this.setBooked(false);
        this.setBoarded(false);
        this.setBoardingReport(TagTravel.GOSHOWN.getCode());
        break;
      case "GOSHO" : // Passenger without OK ticket, not shown on PNL/ADL; departed.
        this.setBooked(false);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(TagTravel.GOSHOW.getCode());
        break;
      case "CHGCL" : // Voluntary Compartment Change; upgraded/downgraded, passenger-to be listed under compartment traveled.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "INVOL" : // Involuntary Compartment Change; upgraded/downgraded, passenger-to be listed under compartment traveled.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "CHGSG" : // Change of Segment; passenger traveling to another destination then booked to.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
      case "CHGFL" : // Passenger, not covered under any other category transferred to other flight due to flight irregularity.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "IDPAD" : // ID passenger boarded on a space available basis.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      case "APIPX" : // Changed or added API information for this passenger.
        this.setBooked(true);
        this.setCheckinStatus(Action.ACCEPTED);
        this.setBoarded(true);
        this.setBoardingReport(boardingReport);
        break;
      default:
        break;
    }
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
    return "PFS";
  }
  
}
