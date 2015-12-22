
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information about a commission.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionInformation_79030_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommissionDetails_121383_C_CUS_PNRDataFeed_132" name="commissionDetails"/>
 *     &lt;xs:element type="CommissionDetails_121383_C_CUS_PNRDataFeed_132" name="otherComDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionInformation79030SCUSPNRDataFeed132
{
    private CommissionDetails121383CCUSPNRDataFeed132 commissionDetails;
    private CommissionDetails121383CCUSPNRDataFeed132 otherComDetails;

    /** 
     * Get the 'commissionDetails' element value. Commission Details: - Commission indicator - Commission Value
     * 
     * @return value
     */
    public CommissionDetails121383CCUSPNRDataFeed132 getCommissionDetails() {
        return commissionDetails;
    }

    /** 
     * Set the 'commissionDetails' element value. Commission Details: - Commission indicator - Commission Value
     * 
     * @param commissionDetails
     */
    public void setCommissionDetails(
            CommissionDetails121383CCUSPNRDataFeed132 commissionDetails) {
        this.commissionDetails = commissionDetails;
    }

    /** 
     * Get the 'otherComDetails' element value. Supplementary Commission Details: - Supplementary Commission indicator - Supplementary Commission Value
     * 
     * @return value
     */
    public CommissionDetails121383CCUSPNRDataFeed132 getOtherComDetails() {
        return otherComDetails;
    }

    /** 
     * Set the 'otherComDetails' element value. Supplementary Commission Details: - Supplementary Commission indicator - Supplementary Commission Value
     * 
     * @param otherComDetails
     */
    public void setOtherComDetails(
            CommissionDetails121383CCUSPNRDataFeed132 otherComDetails) {
        this.otherComDetails = otherComDetails;
    }
}
