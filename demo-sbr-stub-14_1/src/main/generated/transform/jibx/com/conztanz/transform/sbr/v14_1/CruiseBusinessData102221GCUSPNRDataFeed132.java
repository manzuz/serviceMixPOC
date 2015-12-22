
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * cruise business data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CruiseBusinessData_102221_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ShipIdentification_83067_S_CUS_PNRDataFeed_132" name="sailingShipInformation"/>
 *     &lt;xs:element type="NonAirCompanyInformation_83063_S_CUS_PNRDataFeed_132" name="sailingProviderInformation"/>
 *     &lt;xs:element type="PlaceLocationIdentification_83065_S_CUS_PNRDataFeed_132" name="sailingPortsInformation"/>
 *     &lt;xs:element type="StructuredPeriodInformation_83068_S_CUS_PNRDataFeed_132" name="sailingDateInformation"/>
 *     &lt;xs:element type="TravellerInformation_83069_S_CUS_PNRDataFeed_132" name="passengerInfo" maxOccurs="9"/>
 *     &lt;xs:element type="CruiseBusinessData_bookingDetails_102222_G_CUS_PNRDataFeed_132" name="bookingDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_83066_S_CUS_PNRDataFeed_132" name="bookingDate"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_83064_S_CUS_PNRDataFeed_132" name="sailingGroupInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CruiseBusinessData102221GCUSPNRDataFeed132
{
    private ShipIdentification83067SCUSPNRDataFeed132 sailingShipInformation;
    private NonAirCompanyInformation83063SCUSPNRDataFeed132 sailingProviderInformation;
    private PlaceLocationIdentification83065SCUSPNRDataFeed132 sailingPortsInformation;
    private StructuredPeriodInformation83068SCUSPNRDataFeed132 sailingDateInformation;
    private List<TravellerInformation83069SCUSPNRDataFeed132> passengerInfoList = new ArrayList<TravellerInformation83069SCUSPNRDataFeed132>();
    private CruiseBusinessDataBookingDetails102222GCUSPNRDataFeed132 bookingDetails;
    private StructuredDateTimeInformation83066SCUSPNRDataFeed132 bookingDate;
    private ItemReferencesAndVersions83064SCUSPNRDataFeed132 sailingGroupInformation;

    /** 
     * Get the 'sailingShipInformation' element value. Details of sailing ship for the sailing trip.  Each cruise provider has a ship name table in the Amadeus system. This table is used for converting ship codes in ship names and vice-versa. Since both information are stored in the Cruise segment of the PNR, no DB access is  necessary for the PNRACC processing.
     * 
     * @return value
     */
    public ShipIdentification83067SCUSPNRDataFeed132 getSailingShipInformation() {
        return sailingShipInformation;
    }

    /** 
     * Set the 'sailingShipInformation' element value. Details of sailing ship for the sailing trip.  Each cruise provider has a ship name table in the Amadeus system. This table is used for converting ship codes in ship names and vice-versa. Since both information are stored in the Cruise segment of the PNR, no DB access is  necessary for the PNRACC processing.
     * 
     * @param sailingShipInformation
     */
    public void setSailingShipInformation(
            ShipIdentification83067SCUSPNRDataFeed132 sailingShipInformation) {
        this.sailingShipInformation = sailingShipInformation;
    }

    /** 
     * Get the 'sailingProviderInformation' element value. Details of the cruise line provider for the sailing trip.
     * 
     * @return value
     */
    public NonAirCompanyInformation83063SCUSPNRDataFeed132 getSailingProviderInformation() {
        return sailingProviderInformation;
    }

    /** 
     * Set the 'sailingProviderInformation' element value. Details of the cruise line provider for the sailing trip.
     * 
     * @param sailingProviderInformation
     */
    public void setSailingProviderInformation(
            NonAirCompanyInformation83063SCUSPNRDataFeed132 sailingProviderInformation) {
        this.sailingProviderInformation = sailingProviderInformation;
    }

    /** 
     * Get the 'sailingPortsInformation' element value. Details of embarkation and disembarkation ports for the sailing trip.  The codes sent by the cruise providers can be non-Iata codes.
     * 
     * @return value
     */
    public PlaceLocationIdentification83065SCUSPNRDataFeed132 getSailingPortsInformation() {
        return sailingPortsInformation;
    }

    /** 
     * Set the 'sailingPortsInformation' element value. Details of embarkation and disembarkation ports for the sailing trip.  The codes sent by the cruise providers can be non-Iata codes.
     * 
     * @param sailingPortsInformation
     */
    public void setSailingPortsInformation(
            PlaceLocationIdentification83065SCUSPNRDataFeed132 sailingPortsInformation) {
        this.sailingPortsInformation = sailingPortsInformation;
    }

    /** 
     * Get the 'sailingDateInformation' element value. Details of the departure and arrival dates of the sailing trip.  The cruise segment in the PNR actually stores the departure date and the duration length in days. For the PNRACC 4.1 process, the arrival date is re-calculated.
     * 
     * @return value
     */
    public StructuredPeriodInformation83068SCUSPNRDataFeed132 getSailingDateInformation() {
        return sailingDateInformation;
    }

    /** 
     * Set the 'sailingDateInformation' element value. Details of the departure and arrival dates of the sailing trip.  The cruise segment in the PNR actually stores the departure date and the duration length in days. For the PNRACC 4.1 process, the arrival date is re-calculated.
     * 
     * @param sailingDateInformation
     */
    public void setSailingDateInformation(
            StructuredPeriodInformation83068SCUSPNRDataFeed132 sailingDateInformation) {
        this.sailingDateInformation = sailingDateInformation;
    }

    /** 
     * Get the list of 'passengerInfo' element items. Details of passengers for the sailing trip.  For a cruise booking, the passenger names elements from the PNR can be different from the passengers in the cruise segment. They are identical at booking creation time. But the cruise providers allow adding passenger name(s) to an existing booking. That is not possible in an Amadeus PNR. Therefore, the name information had to be stored in the cruise segment itself.
     * 
     * @return list
     */
    public List<TravellerInformation83069SCUSPNRDataFeed132> getPassengerInfoList() {
        return passengerInfoList;
    }

    /** 
     * Set the list of 'passengerInfo' element items. Details of passengers for the sailing trip.  For a cruise booking, the passenger names elements from the PNR can be different from the passengers in the cruise segment. They are identical at booking creation time. But the cruise providers allow adding passenger name(s) to an existing booking. That is not possible in an Amadeus PNR. Therefore, the name information had to be stored in the cruise segment itself.
     * 
     * @param list
     */
    public void setPassengerInfoList(
            List<TravellerInformation83069SCUSPNRDataFeed132> list) {
        passengerInfoList = list;
    }

    /** 
     * Get the 'bookingDetails' element value. Booking information, including confirmation and cancellation number, and a flag telling where the booking has been originally created.
     * 
     * @return value
     */
    public CruiseBusinessDataBookingDetails102222GCUSPNRDataFeed132 getBookingDetails() {
        return bookingDetails;
    }

    /** 
     * Set the 'bookingDetails' element value. Booking information, including confirmation and cancellation number, and a flag telling where the booking has been originally created.
     * 
     * @param bookingDetails
     */
    public void setBookingDetails(
            CruiseBusinessDataBookingDetails102222GCUSPNRDataFeed132 bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    /** 
     * Get the 'bookingDate' element value. Booking Date.
     * 
     * @return value
     */
    public StructuredDateTimeInformation83066SCUSPNRDataFeed132 getBookingDate() {
        return bookingDate;
    }

    /** 
     * Set the 'bookingDate' element value. Booking Date.
     * 
     * @param bookingDate
     */
    public void setBookingDate(
            StructuredDateTimeInformation83066SCUSPNRDataFeed132 bookingDate) {
        this.bookingDate = bookingDate;
    }

    /** 
     * Get the 'sailingGroupInformation' element value. Details of the sailing group code for the sailing trip.
     * 
     * @return value
     */
    public ItemReferencesAndVersions83064SCUSPNRDataFeed132 getSailingGroupInformation() {
        return sailingGroupInformation;
    }

    /** 
     * Set the 'sailingGroupInformation' element value. Details of the sailing group code for the sailing trip.
     * 
     * @param sailingGroupInformation
     */
    public void setSailingGroupInformation(
            ItemReferencesAndVersions83064SCUSPNRDataFeed132 sailingGroupInformation) {
        this.sailingGroupInformation = sailingGroupInformation;
    }
}
