
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information about a commission.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionInformation_128657_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommissionDetails_187454_C_CUS_PNRDataFeed_132" name="commissionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionInformation128657SCUSPNRDataFeed132
{
    private CommissionDetails187454CCUSPNRDataFeed132 commissionDetails;

    /** 
     * Get the 'commissionDetails' element value. Commission details
     * 
     * @return value
     */
    public CommissionDetails187454CCUSPNRDataFeed132 getCommissionDetails() {
        return commissionDetails;
    }

    /** 
     * Set the 'commissionDetails' element value. Commission details
     * 
     * @param commissionDetails
     */
    public void setCommissionDetails(
            CommissionDetails187454CCUSPNRDataFeed132 commissionDetails) {
        this.commissionDetails = commissionDetails;
    }
}
