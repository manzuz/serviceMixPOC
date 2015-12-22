
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information about a commission.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionInformation_31104_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommissionDetails_54449_C_CUS_PNRDataFeed_132" name="commissionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionInformation31104SCUSPNRDataFeed132
{
    private CommissionDetails54449CCUSPNRDataFeed132 commissionDetails;

    /** 
     * Get the 'commissionDetails' element value. Commission details
     * 
     * @return value
     */
    public CommissionDetails54449CCUSPNRDataFeed132 getCommissionDetails() {
        return commissionDetails;
    }

    /** 
     * Set the 'commissionDetails' element value. Commission details
     * 
     * @param commissionDetails
     */
    public void setCommissionDetails(
            CommissionDetails54449CCUSPNRDataFeed132 commissionDetails) {
        this.commissionDetails = commissionDetails;
    }
}
