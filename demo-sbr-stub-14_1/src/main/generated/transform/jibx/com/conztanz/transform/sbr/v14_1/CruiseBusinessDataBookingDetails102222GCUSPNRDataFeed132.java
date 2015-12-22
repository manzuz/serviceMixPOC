
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CruiseBusinessData_bookingDetails_102222_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_83071_S_CUS_PNRDataFeed_132" name="cruiseBookingReferenceInfo"/>
 *     &lt;xs:element type="NonAirCompanyInformation_83070_S_CUS_PNRDataFeed_132" name="bookingCompany" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CruiseBusinessDataBookingDetails102222GCUSPNRDataFeed132
{
    private ReservationControlInformation83071SCUSPNRDataFeed132 cruiseBookingReferenceInfo;
    private NonAirCompanyInformation83070SCUSPNRDataFeed132 bookingCompany;

    /** 
     * Get the 'cruiseBookingReferenceInfo' element value. Details of the booking references for the sailing trip.  These references are returned by the cruise provider at booking creation time or at booking cancellation time.  Note that as re-instate of a cruise booking is possible even several days after cancellation. Therefore, when a cruise booking is cancelled, the segment is kept in the PNR and the status updated to HX.
     * 
     * @return value
     */
    public ReservationControlInformation83071SCUSPNRDataFeed132 getCruiseBookingReferenceInfo() {
        return cruiseBookingReferenceInfo;
    }

    /** 
     * Set the 'cruiseBookingReferenceInfo' element value. Details of the booking references for the sailing trip.  These references are returned by the cruise provider at booking creation time or at booking cancellation time.  Note that as re-instate of a cruise booking is possible even several days after cancellation. Therefore, when a cruise booking is cancelled, the segment is kept in the PNR and the status updated to HX.
     * 
     * @param cruiseBookingReferenceInfo
     */
    public void setCruiseBookingReferenceInfo(
            ReservationControlInformation83071SCUSPNRDataFeed132 cruiseBookingReferenceInfo) {
        this.cruiseBookingReferenceInfo = cruiseBookingReferenceInfo;
    }

    /** 
     * Get the 'bookingCompany' element value. Company in which the booking is created: Amadeus or external.
     * 
     * @return value
     */
    public NonAirCompanyInformation83070SCUSPNRDataFeed132 getBookingCompany() {
        return bookingCompany;
    }

    /** 
     * Set the 'bookingCompany' element value. Company in which the booking is created: Amadeus or external.
     * 
     * @param bookingCompany
     */
    public void setBookingCompany(
            NonAirCompanyInformation83070SCUSPNRDataFeed132 bookingCompany) {
        this.bookingCompany = bookingCompany;
    }
}
