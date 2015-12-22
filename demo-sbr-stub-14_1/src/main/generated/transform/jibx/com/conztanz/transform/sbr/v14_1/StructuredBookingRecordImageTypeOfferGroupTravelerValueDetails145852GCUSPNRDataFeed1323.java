
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_travelerValueDetails_145852_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceCoverage_128678_S_CUS_PNRDataFeed_132" name="travelCost"/>
 *     &lt;xs:element type="MonetaryInformation_128661_S_CUS_PNRDataFeed_132" name="travelAmount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupTravelerValueDetails145852GCUSPNRDataFeed1323
{
    private InsuranceCoverage128678SCUSPNRDataFeed132 travelCost;
    private MonetaryInformation128661SCUSPNRDataFeed132 travelAmount;

    /** 
     * Get the 'travelCost' element value. For codelist 415Z, only TV value may apply here
     * 
     * @return value
     */
    public InsuranceCoverage128678SCUSPNRDataFeed132 getTravelCost() {
        return travelCost;
    }

    /** 
     * Set the 'travelCost' element value. For codelist 415Z, only TV value may apply here
     * 
     * @param travelCost
     */
    public void setTravelCost(
            InsuranceCoverage128678SCUSPNRDataFeed132 travelCost) {
        this.travelCost = travelCost;
    }

    /** 
     * Get the 'travelAmount' element value. to specify the amount/currency  per insuree
     * 
     * @return value
     */
    public MonetaryInformation128661SCUSPNRDataFeed132 getTravelAmount() {
        return travelAmount;
    }

    /** 
     * Set the 'travelAmount' element value. to specify the amount/currency  per insuree
     * 
     * @param travelAmount
     */
    public void setTravelAmount(
            MonetaryInformation128661SCUSPNRDataFeed132 travelAmount) {
        this.travelAmount = travelAmount;
    }
}
