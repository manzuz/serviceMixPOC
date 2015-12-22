
package com.conztanz.transform.sbr.v14_1;

/** 
 * cruise Extended Content
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CruiseExtendedContent_145859_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ShipIdentification_128715_S_CUS_PNRDataFeed_132" name="sailingShipInformation"/>
 *     &lt;xs:element type="CruiseExtendedContent_sailingdetails_145861_G_CUS_PNRDataFeed_132" name="sailingdetails"/>
 *     &lt;xs:element type="PlaceLocationIdentification_128824_S_CUS_PNRDataFeed_132" name="sailingPortsInformation"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_128712_S_CUS_PNRDataFeed_132" name="cruiseNumber" minOccurs="0"/>
 *     &lt;xs:element type="CabinDescription_128722_S_CUS_PNRDataFeed_132" name="cabinDescription" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128714_S_CUS_PNRDataFeed_132" name="bookingDate" minOccurs="0"/>
 *     &lt;xs:element type="CruiseExtendedContent_ticketdetailsgroup_145860_G_CUS_PNRDataFeed_132" name="ticketdetailsgroup" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CruiseExtendedContent145859GCUSPNRDataFeed132
{
    private ShipIdentification128715SCUSPNRDataFeed132 sailingShipInformation;
    private CruiseExtendedContentSailingdetails145861GCUSPNRDataFeed132 sailingdetails;
    private PlaceLocationIdentification128824SCUSPNRDataFeed132 sailingPortsInformation;
    private ItemReferencesAndVersions128712SCUSPNRDataFeed132 cruiseNumber;
    private CabinDescription128722SCUSPNRDataFeed132 cabinDescription;
    private StructuredDateTimeInformation128714SCUSPNRDataFeed132 bookingDate;
    private CruiseExtendedContentTicketdetailsgroup145860GCUSPNRDataFeed132 ticketdetailsgroup;

    /** 
     * Get the 'sailingShipInformation' element value. Details of sailing ship for the sailing trip.
     * 
     * @return value
     */
    public ShipIdentification128715SCUSPNRDataFeed132 getSailingShipInformation() {
        return sailingShipInformation;
    }

    /** 
     * Set the 'sailingShipInformation' element value. Details of sailing ship for the sailing trip.
     * 
     * @param sailingShipInformation
     */
    public void setSailingShipInformation(
            ShipIdentification128715SCUSPNRDataFeed132 sailingShipInformation) {
        this.sailingShipInformation = sailingShipInformation;
    }

    /** 
     * Get the 'sailingdetails' element value. sailing informations: date and check in time
     * 
     * @return value
     */
    public CruiseExtendedContentSailingdetails145861GCUSPNRDataFeed132 getSailingdetails() {
        return sailingdetails;
    }

    /** 
     * Set the 'sailingdetails' element value. sailing informations: date and check in time
     * 
     * @param sailingdetails
     */
    public void setSailingdetails(
            CruiseExtendedContentSailingdetails145861GCUSPNRDataFeed132 sailingdetails) {
        this.sailingdetails = sailingdetails;
    }

    /** 
     * Get the 'sailingPortsInformation' element value. Details of embarkation and disembarkation ports for the sailing trip.  The codes sent by the cruise providers can be non-Iata codes.
     * 
     * @return value
     */
    public PlaceLocationIdentification128824SCUSPNRDataFeed132 getSailingPortsInformation() {
        return sailingPortsInformation;
    }

    /** 
     * Set the 'sailingPortsInformation' element value. Details of embarkation and disembarkation ports for the sailing trip.  The codes sent by the cruise providers can be non-Iata codes.
     * 
     * @param sailingPortsInformation
     */
    public void setSailingPortsInformation(
            PlaceLocationIdentification128824SCUSPNRDataFeed132 sailingPortsInformation) {
        this.sailingPortsInformation = sailingPortsInformation;
    }

    /** 
     * Get the 'cruiseNumber' element value. Details of the identifier of the sailing trip such as the cruisevoyage number
     * 
     * @return value
     */
    public ItemReferencesAndVersions128712SCUSPNRDataFeed132 getCruiseNumber() {
        return cruiseNumber;
    }

    /** 
     * Set the 'cruiseNumber' element value. Details of the identifier of the sailing trip such as the cruisevoyage number
     * 
     * @param cruiseNumber
     */
    public void setCruiseNumber(
            ItemReferencesAndVersions128712SCUSPNRDataFeed132 cruiseNumber) {
        this.cruiseNumber = cruiseNumber;
    }

    /** 
     * Get the 'cabinDescription' element value. conveys the details about the cabin
     * 
     * @return value
     */
    public CabinDescription128722SCUSPNRDataFeed132 getCabinDescription() {
        return cabinDescription;
    }

    /** 
     * Set the 'cabinDescription' element value. conveys the details about the cabin
     * 
     * @param cabinDescription
     */
    public void setCabinDescription(
            CabinDescription128722SCUSPNRDataFeed132 cabinDescription) {
        this.cabinDescription = cabinDescription;
    }

    /** 
     * Get the 'bookingDate' element value. Booking Date.
     * 
     * @return value
     */
    public StructuredDateTimeInformation128714SCUSPNRDataFeed132 getBookingDate() {
        return bookingDate;
    }

    /** 
     * Set the 'bookingDate' element value. Booking Date.
     * 
     * @param bookingDate
     */
    public void setBookingDate(
            StructuredDateTimeInformation128714SCUSPNRDataFeed132 bookingDate) {
        this.bookingDate = bookingDate;
    }

    /** 
     * Get the 'ticketdetailsgroup' element value. Group related to the ticket
     * 
     * @return value
     */
    public CruiseExtendedContentTicketdetailsgroup145860GCUSPNRDataFeed132 getTicketdetailsgroup() {
        return ticketdetailsgroup;
    }

    /** 
     * Set the 'ticketdetailsgroup' element value. Group related to the ticket
     * 
     * @param ticketdetailsgroup
     */
    public void setTicketdetailsgroup(
            CruiseExtendedContentTicketdetailsgroup145860GCUSPNRDataFeed132 ticketdetailsgroup) {
        this.ticketdetailsgroup = ticketdetailsgroup;
    }
}
