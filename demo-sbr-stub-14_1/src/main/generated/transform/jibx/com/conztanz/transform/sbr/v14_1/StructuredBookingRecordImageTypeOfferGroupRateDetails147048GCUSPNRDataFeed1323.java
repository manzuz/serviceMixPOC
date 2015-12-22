
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_rateDetails_147048_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_128883_S_CUS_PNRDataFeed_132" name="taxSurchargeCoverageInfo"/>
 *     &lt;xs:element type="RuleInformation_128789_S_CUS_PNRDataFeed_132" name="otherRules" minOccurs="0" maxOccurs="13"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupRateDetails147048GCUSPNRDataFeed1323
{
    private TariffInformation128883SCUSPNRDataFeed132 taxSurchargeCoverageInfo;
    private List<RuleInformation128789SCUSPNRDataFeed132> otherRuleList = new ArrayList<RuleInformation128789SCUSPNRDataFeed132>();

    /** 
     * Get the 'taxSurchargeCoverageInfo' element value. This segment is used to convey Tax, Coverage, Coupon, Surcharge or Delivery and collection information  (If period associated to the surcharge, tariff and period definition conveyed in group 6)
     * 
     * @return value
     */
    public TariffInformation128883SCUSPNRDataFeed132 getTaxSurchargeCoverageInfo() {
        return taxSurchargeCoverageInfo;
    }

    /** 
     * Set the 'taxSurchargeCoverageInfo' element value. This segment is used to convey Tax, Coverage, Coupon, Surcharge or Delivery and collection information  (If period associated to the surcharge, tariff and period definition conveyed in group 6)
     * 
     * @param taxSurchargeCoverageInfo
     */
    public void setTaxSurchargeCoverageInfo(
            TariffInformation128883SCUSPNRDataFeed132 taxSurchargeCoverageInfo) {
        this.taxSurchargeCoverageInfo = taxSurchargeCoverageInfo;
    }

    /** 
     * Get the list of 'otherRules' element items. Used to convey the following type of information: - Pickup Information - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One Way Information
     * 
     * @return list
     */
    public List<RuleInformation128789SCUSPNRDataFeed132> getOtherRuleList() {
        return otherRuleList;
    }

    /** 
     * Set the list of 'otherRules' element items. Used to convey the following type of information: - Pickup Information - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One Way Information
     * 
     * @param list
     */
    public void setOtherRuleList(
            List<RuleInformation128789SCUSPNRDataFeed132> list) {
        otherRuleList = list;
    }
}
