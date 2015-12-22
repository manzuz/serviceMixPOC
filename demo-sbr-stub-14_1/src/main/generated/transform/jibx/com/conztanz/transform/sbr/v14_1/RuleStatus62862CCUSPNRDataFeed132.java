
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the status of the rule
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleStatus_62862_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="statusType"/>
 *     &lt;xs:element type="xs:string" name="processIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleStatus62862CCUSPNRDataFeed132
{
    private String statusType;
    private String processIndicator;

    /** 
     * Get the 'statusType' element value. This data element specifies the rule concerned by this information.
     * 
     * @return value
     */
    public String getStatusType() {
        return statusType;
    }

    /** 
     * Set the 'statusType' element value. This data element specifies the rule concerned by this information.
     * 
     * @param statusType
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /** 
     * Get the 'processIndicator' element value. This data element is used to indicate that the condition have been entered manually by the travel agent and is not coming from the supplier data.
     * 
     * @return value
     */
    public String getProcessIndicator() {
        return processIndicator;
    }

    /** 
     * Set the 'processIndicator' element value. This data element is used to indicate that the condition have been entered manually by the travel agent and is not coming from the supplier data.
     * 
     * @param processIndicator
     */
    public void setProcessIndicator(String processIndicator) {
        this.processIndicator = processIndicator;
    }
}
