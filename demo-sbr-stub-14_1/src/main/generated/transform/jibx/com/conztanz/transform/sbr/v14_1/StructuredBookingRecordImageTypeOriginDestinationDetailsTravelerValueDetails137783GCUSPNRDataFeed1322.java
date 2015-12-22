
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_travelerValueDetails_137783_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceCoverage_15875_S_CUS_PNRDataFeed_132" name="travelCost"/>
 *     &lt;xs:element type="MonetaryInformation_10816_S_CUS_PNRDataFeed_132" name="travelAmount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsTravelerValueDetails137783GCUSPNRDataFeed1322
{
    private InsuranceCoverage15875SCUSPNRDataFeed132 travelCost;
    private MonetaryInformation10816SCUSPNRDataFeed132 travelAmount;

    /** 
     * Get the 'travelCost' element value. For codelist 415Z, only TV value may apply here
     * 
     * @return value
     */
    public InsuranceCoverage15875SCUSPNRDataFeed132 getTravelCost() {
        return travelCost;
    }

    /** 
     * Set the 'travelCost' element value. For codelist 415Z, only TV value may apply here
     * 
     * @param travelCost
     */
    public void setTravelCost(
            InsuranceCoverage15875SCUSPNRDataFeed132 travelCost) {
        this.travelCost = travelCost;
    }

    /** 
     * Get the 'travelAmount' element value. to specify the amount/currency  per insuree
     * 
     * @return value
     */
    public MonetaryInformation10816SCUSPNRDataFeed132 getTravelAmount() {
        return travelAmount;
    }

    /** 
     * Set the 'travelAmount' element value. to specify the amount/currency  per insuree
     * 
     * @param travelAmount
     */
    public void setTravelAmount(
            MonetaryInformation10816SCUSPNRDataFeed132 travelAmount) {
        this.travelAmount = travelAmount;
    }
}
