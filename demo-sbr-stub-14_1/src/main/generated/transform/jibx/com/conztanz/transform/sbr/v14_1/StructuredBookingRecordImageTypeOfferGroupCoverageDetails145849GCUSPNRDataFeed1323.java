
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_coverageDetails_145849_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsurancePolicy_128673_S_CUS_PNRDataFeed_132" name="policyDetails"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_coverageInfo_145850_G_CUS_PNRDataFeed_1323" name="coverageInfo" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="TravellerInformation_128676_S_CUS_PNRDataFeed_132" name="coveredPassenger" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="StructuredPeriodInformation_128675_S_CUS_PNRDataFeed_132" name="coverageDates" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128674_S_CUS_PNRDataFeed_132" name="subscriptionDetails" minOccurs="0"/>
 *     &lt;xs:element type="UserIdentification_128677_S_CUS_PNRDataFeed_132" name="agentReferenceDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupCoverageDetails145849GCUSPNRDataFeed1323
{
    private InsurancePolicy128673SCUSPNRDataFeed132 policyDetails;
    private List<StructuredBookingRecordImageTypeOfferGroupCoverageInfo145850GCUSPNRDataFeed1323> coverageInfoList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupCoverageInfo145850GCUSPNRDataFeed1323>();
    private List<TravellerInformation128676SCUSPNRDataFeed132> coveredPassengerList = new ArrayList<TravellerInformation128676SCUSPNRDataFeed132>();
    private StructuredPeriodInformation128675SCUSPNRDataFeed132 coverageDates;
    private StructuredDateTimeInformation128674SCUSPNRDataFeed132 subscriptionDetails;
    private UserIdentification128677SCUSPNRDataFeed132 agentReferenceDetails;

    /** 
     * Get the 'policyDetails' element value. To specify the details of the insurance policy.
     * 
     * @return value
     */
    public InsurancePolicy128673SCUSPNRDataFeed132 getPolicyDetails() {
        return policyDetails;
    }

    /** 
     * Set the 'policyDetails' element value. To specify the details of the insurance policy.
     * 
     * @param policyDetails
     */
    public void setPolicyDetails(
            InsurancePolicy128673SCUSPNRDataFeed132 policyDetails) {
        this.policyDetails = policyDetails;
    }

    /** 
     * Get the list of 'coverageInfo' element items. This group is used to describe the coverage conditions details.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupCoverageInfo145850GCUSPNRDataFeed1323> getCoverageInfoList() {
        return coverageInfoList;
    }

    /** 
     * Set the list of 'coverageInfo' element items. This group is used to describe the coverage conditions details.
     * 
     * @param list
     */
    public void setCoverageInfoList(
            List<StructuredBookingRecordImageTypeOfferGroupCoverageInfo145850GCUSPNRDataFeed1323> list) {
        coverageInfoList = list;
    }

    /** 
     * Get the list of 'coveredPassenger' element items. To specifie the covered persons: here it conveys the NB/NM and ON options
     * 
     * @return list
     */
    public List<TravellerInformation128676SCUSPNRDataFeed132> getCoveredPassengerList() {
        return coveredPassengerList;
    }

    /** 
     * Set the list of 'coveredPassenger' element items. To specifie the covered persons: here it conveys the NB/NM and ON options
     * 
     * @param list
     */
    public void setCoveredPassengerList(
            List<TravellerInformation128676SCUSPNRDataFeed132> list) {
        coveredPassengerList = list;
    }

    /** 
     * Get the 'coverageDates' element value. starting date and end date
     * 
     * @return value
     */
    public StructuredPeriodInformation128675SCUSPNRDataFeed132 getCoverageDates() {
        return coverageDates;
    }

    /** 
     * Set the 'coverageDates' element value. starting date and end date
     * 
     * @param coverageDates
     */
    public void setCoverageDates(
            StructuredPeriodInformation128675SCUSPNRDataFeed132 coverageDates) {
        this.coverageDates = coverageDates;
    }

    /** 
     * Get the 'subscriptionDetails' element value. Details of the subscription: date and time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation128674SCUSPNRDataFeed132 getSubscriptionDetails() {
        return subscriptionDetails;
    }

    /** 
     * Set the 'subscriptionDetails' element value. Details of the subscription: date and time.
     * 
     * @param subscriptionDetails
     */
    public void setSubscriptionDetails(
            StructuredDateTimeInformation128674SCUSPNRDataFeed132 subscriptionDetails) {
        this.subscriptionDetails = subscriptionDetails;
    }

    /** 
     * Get the 'agentReferenceDetails' element value. To convey the details of the insurance seller.
     * 
     * @return value
     */
    public UserIdentification128677SCUSPNRDataFeed132 getAgentReferenceDetails() {
        return agentReferenceDetails;
    }

    /** 
     * Set the 'agentReferenceDetails' element value. To convey the details of the insurance seller.
     * 
     * @param agentReferenceDetails
     */
    public void setAgentReferenceDetails(
            UserIdentification128677SCUSPNRDataFeed132 agentReferenceDetails) {
        this.agentReferenceDetails = agentReferenceDetails;
    }
}
