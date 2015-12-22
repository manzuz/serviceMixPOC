
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_planTypeDetails_137777_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProviderAndProducts_10190_S_CUS_PNRDataFeed_132" name="planType"/>
 *     &lt;xs:element type="MonetaryInformation_10816_S_CUS_PNRDataFeed_132" name="travelValue" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails137777GCUSPNRDataFeed1322
{
    private InsuranceProviderAndProducts10190SCUSPNRDataFeed132 planType;
    private MonetaryInformation10816SCUSPNRDataFeed132 travelValue;

    /** 
     * Get the 'planType' element value. Provides information about the type of plan being quoted/booked
     * 
     * @return value
     */
    public InsuranceProviderAndProducts10190SCUSPNRDataFeed132 getPlanType() {
        return planType;
    }

    /** 
     * Set the 'planType' element value. Provides information about the type of plan being quoted/booked
     * 
     * @param planType
     */
    public void setPlanType(
            InsuranceProviderAndProducts10190SCUSPNRDataFeed132 planType) {
        this.planType = planType;
    }

    /** 
     * Get the 'travelValue' element value. to specify the value of the trip.
     * 
     * @return value
     */
    public MonetaryInformation10816SCUSPNRDataFeed132 getTravelValue() {
        return travelValue;
    }

    /** 
     * Set the 'travelValue' element value. to specify the value of the trip.
     * 
     * @param travelValue
     */
    public void setTravelValue(
            MonetaryInformation10816SCUSPNRDataFeed132 travelValue) {
        this.travelValue = travelValue;
    }
}
