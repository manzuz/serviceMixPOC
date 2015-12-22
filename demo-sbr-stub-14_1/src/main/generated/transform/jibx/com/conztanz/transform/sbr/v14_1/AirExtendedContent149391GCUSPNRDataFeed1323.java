
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirExtendedContent_149391_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelProductInformation_131826_S_CUS_PNRDataFeed_132" name="segmentDetails"/>
 *     &lt;xs:element type="AdditionalProductDetails_128495_S_CUS_PNRDataFeed_132" name="additionalProductDetails" minOccurs="0"/>
 *     &lt;xs:element type="TravellerBaggageDetails_129119_S_CUS_PNRDataFeed_132" name="baggage" minOccurs="0"/>
 *     &lt;xs:element type="TicketNumberDetails_128727_S_CUS_PNRDataFeed_132" name="ticketingNumber" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128728_S_CUS_PNRDataFeed_132" name="issuanceDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirExtendedContent149391GCUSPNRDataFeed1323
{
    private TravelProductInformation131826SCUSPNRDataFeed132 segmentDetails;
    private AdditionalProductDetails128495SCUSPNRDataFeed132 additionalProductDetails;
    private TravellerBaggageDetails129119SCUSPNRDataFeed132 baggage;
    private TicketNumberDetails128727SCUSPNRDataFeed132 ticketingNumber;
    private StructuredDateTimeInformation128728SCUSPNRDataFeed132 issuanceDate;

    /** 
     * Get the 'segmentDetails' element value. Segment Details
     * 
     * @return value
     */
    public TravelProductInformation131826SCUSPNRDataFeed132 getSegmentDetails() {
        return segmentDetails;
    }

    /** 
     * Set the 'segmentDetails' element value. Segment Details
     * 
     * @param segmentDetails
     */
    public void setSegmentDetails(
            TravelProductInformation131826SCUSPNRDataFeed132 segmentDetails) {
        this.segmentDetails = segmentDetails;
    }

    /** 
     * Get the 'additionalProductDetails' element value. Provide additional information on the flight.
     * 
     * @return value
     */
    public AdditionalProductDetails128495SCUSPNRDataFeed132 getAdditionalProductDetails() {
        return additionalProductDetails;
    }

    /** 
     * Set the 'additionalProductDetails' element value. Provide additional information on the flight.
     * 
     * @param additionalProductDetails
     */
    public void setAdditionalProductDetails(
            AdditionalProductDetails128495SCUSPNRDataFeed132 additionalProductDetails) {
        this.additionalProductDetails = additionalProductDetails;
    }

    /** 
     * Get the 'baggage' element value. Baggage info
     * 
     * @return value
     */
    public TravellerBaggageDetails129119SCUSPNRDataFeed132 getBaggage() {
        return baggage;
    }

    /** 
     * Set the 'baggage' element value. Baggage info
     * 
     * @param baggage
     */
    public void setBaggage(
            TravellerBaggageDetails129119SCUSPNRDataFeed132 baggage) {
        this.baggage = baggage;
    }

    /** 
     * Get the 'ticketingNumber' element value. Specify the ticketing number
     * 
     * @return value
     */
    public TicketNumberDetails128727SCUSPNRDataFeed132 getTicketingNumber() {
        return ticketingNumber;
    }

    /** 
     * Set the 'ticketingNumber' element value. Specify the ticketing number
     * 
     * @param ticketingNumber
     */
    public void setTicketingNumber(
            TicketNumberDetails128727SCUSPNRDataFeed132 ticketingNumber) {
        this.ticketingNumber = ticketingNumber;
    }

    /** 
     * Get the 'issuanceDate' element value. Specify ticket issuance date
     * 
     * @return value
     */
    public StructuredDateTimeInformation128728SCUSPNRDataFeed132 getIssuanceDate() {
        return issuanceDate;
    }

    /** 
     * Set the 'issuanceDate' element value. Specify ticket issuance date
     * 
     * @param issuanceDate
     */
    public void setIssuanceDate(
            StructuredDateTimeInformation128728SCUSPNRDataFeed132 issuanceDate) {
        this.issuanceDate = issuanceDate;
    }
}
