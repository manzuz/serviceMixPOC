
package com.conztanz.transform.sbr.v14_1;

/** 
 * will convey the approval data of the transaction
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GenericAuthorisationResult_94515_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AuthorizationApprovalData_142128_C_CUS_PNRDataFeed_132" name="approvalCodeData"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GenericAuthorisationResult94515SCUSPNRDataFeed132
{
    private AuthorizationApprovalData142128CCUSPNRDataFeed132 approvalCodeData;

    /** 
     * Get the 'approvalCodeData' element value. transaction authorization approval data
     * 
     * @return value
     */
    public AuthorizationApprovalData142128CCUSPNRDataFeed132 getApprovalCodeData() {
        return approvalCodeData;
    }

    /** 
     * Set the 'approvalCodeData' element value. transaction authorization approval data
     * 
     * @param approvalCodeData
     */
    public void setApprovalCodeData(
            AuthorizationApprovalData142128CCUSPNRDataFeed132 approvalCodeData) {
        this.approvalCodeData = approvalCodeData;
    }
}
