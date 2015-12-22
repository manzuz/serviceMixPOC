
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_otherRulesGroup_106549_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RuleInformation_87624_S_CUS_PNRDataFeed_132" name="otherRules"/>
 *     &lt;xs:element type="StructuredPeriodInformation_87609_S_CUS_PNRDataFeed_132" name="dateTimeInfo" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupOtherRulesGroup106549GCUSPNRDataFeed1323
{
    private RuleInformation87624SCUSPNRDataFeed132 otherRules;
    private List<StructuredPeriodInformation87609SCUSPNRDataFeed132> dateTimeInfoList = new ArrayList<StructuredPeriodInformation87609SCUSPNRDataFeed132>();

    /** 
     * Get the 'otherRules' element value. Used to convey the following type of information: - Pickup Information - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One Way Information
     * 
     * @return value
     */
    public RuleInformation87624SCUSPNRDataFeed132 getOtherRules() {
        return otherRules;
    }

    /** 
     * Set the 'otherRules' element value. Used to convey the following type of information: - Pickup Information - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One Way Information
     * 
     * @param otherRules
     */
    public void setOtherRules(RuleInformation87624SCUSPNRDataFeed132 otherRules) {
        this.otherRules = otherRules;
    }

    /** 
     * Get the list of 'dateTimeInfo' element items. Used to convey date/time Information (only used for Pickup and Guarantee rules)
     * 
     * @return list
     */
    public List<StructuredPeriodInformation87609SCUSPNRDataFeed132> getDateTimeInfoList() {
        return dateTimeInfoList;
    }

    /** 
     * Set the list of 'dateTimeInfo' element items. Used to convey date/time Information (only used for Pickup and Guarantee rules)
     * 
     * @param list
     */
    public void setDateTimeInfoList(
            List<StructuredPeriodInformation87609SCUSPNRDataFeed132> list) {
        dateTimeInfoList = list;
    }
}
