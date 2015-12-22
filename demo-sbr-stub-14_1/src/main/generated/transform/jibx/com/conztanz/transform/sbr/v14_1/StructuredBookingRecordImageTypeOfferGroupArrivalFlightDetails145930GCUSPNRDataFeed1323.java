
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_arrivalFlightDetails_145930_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelProductInformation_36746_S_CUS_PNRDataFeed_132" name="travelProductInformation"/>
 *     &lt;xs:element type="AdditionalTransportDetails_36745_S_CUS_PNRDataFeed_132" name="additionalTransportDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupArrivalFlightDetails145930GCUSPNRDataFeed1323
{
    private TravelProductInformation36746SCUSPNRDataFeed132 travelProductInformation;
    private AdditionalTransportDetails36745SCUSPNRDataFeed132 additionalTransportDetails;

    /** 
     * Get the 'travelProductInformation' element value. This segment conveys the arrival flight information.
     * 
     * @return value
     */
    public TravelProductInformation36746SCUSPNRDataFeed132 getTravelProductInformation() {
        return travelProductInformation;
    }

    /** 
     * Set the 'travelProductInformation' element value. This segment conveys the arrival flight information.
     * 
     * @param travelProductInformation
     */
    public void setTravelProductInformation(
            TravelProductInformation36746SCUSPNRDataFeed132 travelProductInformation) {
        this.travelProductInformation = travelProductInformation;
    }

    /** 
     * Get the 'additionalTransportDetails' element value. This segment conveys the terminal information.
     * 
     * @return value
     */
    public AdditionalTransportDetails36745SCUSPNRDataFeed132 getAdditionalTransportDetails() {
        return additionalTransportDetails;
    }

    /** 
     * Set the 'additionalTransportDetails' element value. This segment conveys the terminal information.
     * 
     * @param additionalTransportDetails
     */
    public void setAdditionalTransportDetails(
            AdditionalTransportDetails36745SCUSPNRDataFeed132 additionalTransportDetails) {
        this.additionalTransportDetails = additionalTransportDetails;
    }
}
