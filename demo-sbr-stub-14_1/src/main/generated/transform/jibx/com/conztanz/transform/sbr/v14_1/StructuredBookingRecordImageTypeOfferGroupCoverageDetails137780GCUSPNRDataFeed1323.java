
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_coverageDetails_137780_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsurancePolicy_10048_S_CUS_PNRDataFeed_132" name="policyDetails"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_coverageInfo_137781_G_CUS_PNRDataFeed_1323" name="coverageInfo" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="TravellerInformation_15923_S_CUS_PNRDataFeed_132" name="coveredPassenger" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="StructuredPeriodInformation_10057_S_CUS_PNRDataFeed_132" name="coverageDates" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_20644_S_CUS_PNRDataFeed_132" name="subscriptionDetails" minOccurs="0"/>
 *     &lt;xs:element type="UserIdentification_9456_S_CUS_PNRDataFeed_132" name="agentReferenceDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupCoverageDetails137780GCUSPNRDataFeed1323
{
    private InsurancePolicy10048SCUSPNRDataFeed132 policyDetails;
    private List<StructuredBookingRecordImageTypeOfferGroupCoverageInfo137781GCUSPNRDataFeed1323> coverageInfoList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupCoverageInfo137781GCUSPNRDataFeed1323>();
    private List<TravellerInformation15923SCUSPNRDataFeed132> coveredPassengerList = new ArrayList<TravellerInformation15923SCUSPNRDataFeed132>();
    private StructuredPeriodInformation10057SCUSPNRDataFeed132 coverageDates;
    private StructuredDateTimeInformation20644SCUSPNRDataFeed132 subscriptionDetails;
    private UserIdentification9456SCUSPNRDataFeed132 agentReferenceDetails;

    /** 
     * Get the 'policyDetails' element value. To specify the details of the insurance policy.
     * 
     * @return value
     */
    public InsurancePolicy10048SCUSPNRDataFeed132 getPolicyDetails() {
        return policyDetails;
    }

    /** 
     * Set the 'policyDetails' element value. To specify the details of the insurance policy.
     * 
     * @param policyDetails
     */
    public void setPolicyDetails(
            InsurancePolicy10048SCUSPNRDataFeed132 policyDetails) {
        this.policyDetails = policyDetails;
    }

    /** 
     * Get the list of 'coverageInfo' element items. This group is used to describe the coverage conditions details.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupCoverageInfo137781GCUSPNRDataFeed1323> getCoverageInfoList() {
        return coverageInfoList;
    }

    /** 
     * Set the list of 'coverageInfo' element items. This group is used to describe the coverage conditions details.
     * 
     * @param list
     */
    public void setCoverageInfoList(
            List<StructuredBookingRecordImageTypeOfferGroupCoverageInfo137781GCUSPNRDataFeed1323> list) {
        coverageInfoList = list;
    }

    /** 
     * Get the list of 'coveredPassenger' element items. To specifie the covered persons: here it conveys the NB/NM and ON options
     * 
     * @return list
     */
    public List<TravellerInformation15923SCUSPNRDataFeed132> getCoveredPassengerList() {
        return coveredPassengerList;
    }

    /** 
     * Set the list of 'coveredPassenger' element items. To specifie the covered persons: here it conveys the NB/NM and ON options
     * 
     * @param list
     */
    public void setCoveredPassengerList(
            List<TravellerInformation15923SCUSPNRDataFeed132> list) {
        coveredPassengerList = list;
    }

    /** 
     * Get the 'coverageDates' element value. starting date and end date
     * 
     * @return value
     */
    public StructuredPeriodInformation10057SCUSPNRDataFeed132 getCoverageDates() {
        return coverageDates;
    }

    /** 
     * Set the 'coverageDates' element value. starting date and end date
     * 
     * @param coverageDates
     */
    public void setCoverageDates(
            StructuredPeriodInformation10057SCUSPNRDataFeed132 coverageDates) {
        this.coverageDates = coverageDates;
    }

    /** 
     * Get the 'subscriptionDetails' element value. Details of the subscription: date and time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation20644SCUSPNRDataFeed132 getSubscriptionDetails() {
        return subscriptionDetails;
    }

    /** 
     * Set the 'subscriptionDetails' element value. Details of the subscription: date and time.
     * 
     * @param subscriptionDetails
     */
    public void setSubscriptionDetails(
            StructuredDateTimeInformation20644SCUSPNRDataFeed132 subscriptionDetails) {
        this.subscriptionDetails = subscriptionDetails;
    }

    /** 
     * Get the 'agentReferenceDetails' element value. To convey the details of the insurance seller.
     * 
     * @return value
     */
    public UserIdentification9456SCUSPNRDataFeed132 getAgentReferenceDetails() {
        return agentReferenceDetails;
    }

    /** 
     * Set the 'agentReferenceDetails' element value. To convey the details of the insurance seller.
     * 
     * @param agentReferenceDetails
     */
    public void setAgentReferenceDetails(
            UserIdentification9456SCUSPNRDataFeed132 agentReferenceDetails) {
        this.agentReferenceDetails = agentReferenceDetails;
    }
}
