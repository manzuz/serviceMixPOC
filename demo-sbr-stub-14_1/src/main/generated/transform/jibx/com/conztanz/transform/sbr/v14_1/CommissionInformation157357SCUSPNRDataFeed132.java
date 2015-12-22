
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify information about a commission.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionInformation_157357_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommissionDetails_224026_C_CUS_PNRDataFeed_132" name="commissionDetails"/>
 *     &lt;xs:element type="CommissionDetails_224026_C_CUS_PNRDataFeed_132" name="otherComDetails" minOccurs="0" maxOccurs="8"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionInformation157357SCUSPNRDataFeed132
{
    private CommissionDetails224026CCUSPNRDataFeed132 commissionDetails;
    private List<CommissionDetails224026CCUSPNRDataFeed132> otherComDetailList = new ArrayList<CommissionDetails224026CCUSPNRDataFeed132>();

    /** 
     * Get the 'commissionDetails' element value. Commission details
     * 
     * @return value
     */
    public CommissionDetails224026CCUSPNRDataFeed132 getCommissionDetails() {
        return commissionDetails;
    }

    /** 
     * Set the 'commissionDetails' element value. Commission details
     * 
     * @param commissionDetails
     */
    public void setCommissionDetails(
            CommissionDetails224026CCUSPNRDataFeed132 commissionDetails) {
        this.commissionDetails = commissionDetails;
    }

    /** 
     * Get the list of 'otherComDetails' element items. Commission details
     * 
     * @return list
     */
    public List<CommissionDetails224026CCUSPNRDataFeed132> getOtherComDetailList() {
        return otherComDetailList;
    }

    /** 
     * Set the list of 'otherComDetails' element items. Commission details
     * 
     * @param list
     */
    public void setOtherComDetailList(
            List<CommissionDetails224026CCUSPNRDataFeed132> list) {
        otherComDetailList = list;
    }
}
