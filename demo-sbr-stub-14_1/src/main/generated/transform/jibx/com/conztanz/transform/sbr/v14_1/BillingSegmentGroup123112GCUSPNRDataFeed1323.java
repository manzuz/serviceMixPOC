
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BillingSegmentGroup_123112_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AdditionalBusinessSourceInformation_79780_S_CUS_PNRDataFeed_132" name="bookingCreatorDetails"/>
 *     &lt;xs:element type="SegmentCabinIdentification_79782_S_CUS_PNRDataFeed_132" name="cabinInformation" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttribute_104778_S_CUS_PNRDataFeed_132" name="airSegmentAttributes" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_104963_S_CUS_PNRDataFeed_132" name="monetaryInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BillingSegmentGroup123112GCUSPNRDataFeed1323
{
    private AdditionalBusinessSourceInformation79780SCUSPNRDataFeed132 bookingCreatorDetails;
    private SegmentCabinIdentification79782SCUSPNRDataFeed132 cabinInformation;
    private CodedAttribute104778SCUSPNRDataFeed132 airSegmentAttributes;
    private TariffInformation104963SCUSPNRDataFeed132 monetaryInfo;

    /** 
     * Get the 'bookingCreatorDetails' element value. Booking creation agent details: - creation office ID - creation sine...
     * 
     * @return value
     */
    public AdditionalBusinessSourceInformation79780SCUSPNRDataFeed132 getBookingCreatorDetails() {
        return bookingCreatorDetails;
    }

    /** 
     * Set the 'bookingCreatorDetails' element value. Booking creation agent details: - creation office ID - creation sine...
     * 
     * @param bookingCreatorDetails
     */
    public void setBookingCreatorDetails(
            AdditionalBusinessSourceInformation79780SCUSPNRDataFeed132 bookingCreatorDetails) {
        this.bookingCreatorDetails = bookingCreatorDetails;
    }

    /** 
     * Get the 'cabinInformation' element value. The cabin related information.
     * 
     * @return value
     */
    public SegmentCabinIdentification79782SCUSPNRDataFeed132 getCabinInformation() {
        return cabinInformation;
    }

    /** 
     * Set the 'cabinInformation' element value. The cabin related information.
     * 
     * @param cabinInformation
     */
    public void setCabinInformation(
            SegmentCabinIdentification79782SCUSPNRDataFeed132 cabinInformation) {
        this.cabinInformation = cabinInformation;
    }

    /** 
     * Get the 'airSegmentAttributes' element value. Attributes related to the air segment
     * 
     * @return value
     */
    public CodedAttribute104778SCUSPNRDataFeed132 getAirSegmentAttributes() {
        return airSegmentAttributes;
    }

    /** 
     * Set the 'airSegmentAttributes' element value. Attributes related to the air segment
     * 
     * @param airSegmentAttributes
     */
    public void setAirSegmentAttributes(
            CodedAttribute104778SCUSPNRDataFeed132 airSegmentAttributes) {
        this.airSegmentAttributes = airSegmentAttributes;
    }

    /** 
     * Get the 'monetaryInfo' element value. Monetary Information for Hotel Billing
     * 
     * @return value
     */
    public TariffInformation104963SCUSPNRDataFeed132 getMonetaryInfo() {
        return monetaryInfo;
    }

    /** 
     * Set the 'monetaryInfo' element value. Monetary Information for Hotel Billing
     * 
     * @param monetaryInfo
     */
    public void setMonetaryInfo(
            TariffInformation104963SCUSPNRDataFeed132 monetaryInfo) {
        this.monetaryInfo = monetaryInfo;
    }
}
