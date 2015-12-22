
package com.conztanz.transform.sbr.v14_1;

/** 
 * will convey the approval data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AuthorizationApprovalData_142128_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="approvalCode"/>
 *     &lt;xs:element type="xs:string" name="sourceOfApproval" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AuthorizationApprovalData142128CCUSPNRDataFeed132
{
    private String approvalCode;
    private String sourceOfApproval;

    /** 
     * Get the 'approvalCode' element value. will convey the value of the approval code of the payment authorisation
     * 
     * @return value
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /** 
     * Set the 'approvalCode' element value. will convey the value of the approval code of the payment authorisation
     * 
     * @param approvalCode
     */
    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    /** 
     * Get the 'sourceOfApproval' element value. Source of approval for the payment authorisation. A Automatically obtained by the system. M Manually entered by an agent.  F: Credit card automatic approval code of a settlement authorization transaction B: Credit card manual approval code of a settlement transaction.
     * 
     * @return value
     */
    public String getSourceOfApproval() {
        return sourceOfApproval;
    }

    /** 
     * Set the 'sourceOfApproval' element value. Source of approval for the payment authorisation. A Automatically obtained by the system. M Manually entered by an agent.  F: Credit card automatic approval code of a settlement authorization transaction B: Credit card manual approval code of a settlement transaction.
     * 
     * @param sourceOfApproval
     */
    public void setSourceOfApproval(String sourceOfApproval) {
        this.sourceOfApproval = sourceOfApproval;
    }
}
