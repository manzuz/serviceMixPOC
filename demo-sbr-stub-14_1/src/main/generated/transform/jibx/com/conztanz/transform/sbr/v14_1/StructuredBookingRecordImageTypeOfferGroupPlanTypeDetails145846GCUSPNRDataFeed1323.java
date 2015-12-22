
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_planTypeDetails_145846_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProviderAndProducts_128668_S_CUS_PNRDataFeed_132" name="planType"/>
 *     &lt;xs:element type="MonetaryInformation_128661_S_CUS_PNRDataFeed_132" name="travelValue" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupPlanTypeDetails145846GCUSPNRDataFeed1323
{
    private InsuranceProviderAndProducts128668SCUSPNRDataFeed132 planType;
    private MonetaryInformation128661SCUSPNRDataFeed132 travelValue;

    /** 
     * Get the 'planType' element value. Provides information about the type of plan being quoted/booked
     * 
     * @return value
     */
    public InsuranceProviderAndProducts128668SCUSPNRDataFeed132 getPlanType() {
        return planType;
    }

    /** 
     * Set the 'planType' element value. Provides information about the type of plan being quoted/booked
     * 
     * @param planType
     */
    public void setPlanType(
            InsuranceProviderAndProducts128668SCUSPNRDataFeed132 planType) {
        this.planType = planType;
    }

    /** 
     * Get the 'travelValue' element value. to specify the value of the trip.
     * 
     * @return value
     */
    public MonetaryInformation128661SCUSPNRDataFeed132 getTravelValue() {
        return travelValue;
    }

    /** 
     * Set the 'travelValue' element value. to specify the value of the trip.
     * 
     * @param travelValue
     */
    public void setTravelValue(
            MonetaryInformation128661SCUSPNRDataFeed132 travelValue) {
        this.travelValue = travelValue;
    }
}
