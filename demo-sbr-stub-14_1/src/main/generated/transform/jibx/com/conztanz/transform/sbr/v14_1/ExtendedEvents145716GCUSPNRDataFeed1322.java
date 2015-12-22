
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedEvents_145716_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Address_129098_S_CUS_PNRDataFeed_132" name="eventAddress"/>
 *     &lt;xs:element type="TicketNumberDetails_128727_S_CUS_PNRDataFeed_132" name="ticketNumber" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_128778_S_CUS_PNRDataFeed_132" name="eventName" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128779_S_CUS_PNRDataFeed_132" name="eventDate" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="SeatSelectionDetails_129096_S_CUS_PNRDataFeed_132" name="seatDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedEvents145716GCUSPNRDataFeed1322
{
    private Address129098SCUSPNRDataFeed132 eventAddress;
    private TicketNumberDetails128727SCUSPNRDataFeed132 ticketNumber;
    private FreeTextInformation128778SCUSPNRDataFeed132 eventName;
    private List<StructuredDateTimeInformation128779SCUSPNRDataFeed132> eventDateList = new ArrayList<StructuredDateTimeInformation128779SCUSPNRDataFeed132>();
    private SeatSelectionDetails129096SCUSPNRDataFeed132 seatDetails;

    /** 
     * Get the 'eventAddress' element value. Address of the event location
     * 
     * @return value
     */
    public Address129098SCUSPNRDataFeed132 getEventAddress() {
        return eventAddress;
    }

    /** 
     * Set the 'eventAddress' element value. Address of the event location
     * 
     * @param eventAddress
     */
    public void setEventAddress(Address129098SCUSPNRDataFeed132 eventAddress) {
        this.eventAddress = eventAddress;
    }

    /** 
     * Get the 'ticketNumber' element value. Specify the ticket number
     * 
     * @return value
     */
    public TicketNumberDetails128727SCUSPNRDataFeed132 getTicketNumber() {
        return ticketNumber;
    }

    /** 
     * Set the 'ticketNumber' element value. Specify the ticket number
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(
            TicketNumberDetails128727SCUSPNRDataFeed132 ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /** 
     * Get the 'eventName' element value.
     * 
     * @return value
     */
    public FreeTextInformation128778SCUSPNRDataFeed132 getEventName() {
        return eventName;
    }

    /** 
     * Set the 'eventName' element value.
     * 
     * @param eventName
     */
    public void setEventName(
            FreeTextInformation128778SCUSPNRDataFeed132 eventName) {
        this.eventName = eventName;
    }

    /** 
     * Get the list of 'eventDate' element items. Specify the event date and the ticket validity date
     * 
     * @return list
     */
    public List<StructuredDateTimeInformation128779SCUSPNRDataFeed132> getEventDateList() {
        return eventDateList;
    }

    /** 
     * Set the list of 'eventDate' element items. Specify the event date and the ticket validity date
     * 
     * @param list
     */
    public void setEventDateList(
            List<StructuredDateTimeInformation128779SCUSPNRDataFeed132> list) {
        eventDateList = list;
    }

    /** 
     * Get the 'seatDetails' element value. Event seat info
     * 
     * @return value
     */
    public SeatSelectionDetails129096SCUSPNRDataFeed132 getSeatDetails() {
        return seatDetails;
    }

    /** 
     * Set the 'seatDetails' element value. Event seat info
     * 
     * @param seatDetails
     */
    public void setSeatDetails(
            SeatSelectionDetails129096SCUSPNRDataFeed132 seatDetails) {
        this.seatDetails = seatDetails;
    }
}
