
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify rule information and rule status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleInformation_36743_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RuleDetails_62860_C_CUS_PNRDataFeed_132" name="ruleDetails"/>
 *     &lt;xs:element type="RuleStatus_62862_C_CUS_PNRDataFeed_132" name="ruleStatusDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleInformation36743SCUSPNRDataFeed132
{
    private RuleDetails62860CCUSPNRDataFeed132 ruleDetails;
    private RuleStatus62862CCUSPNRDataFeed132 ruleStatusDetails;

    /** 
     * Get the 'ruleDetails' element value. This composite is used to convey the rules details.
     * 
     * @return value
     */
    public RuleDetails62860CCUSPNRDataFeed132 getRuleDetails() {
        return ruleDetails;
    }

    /** 
     * Set the 'ruleDetails' element value. This composite is used to convey the rules details.
     * 
     * @param ruleDetails
     */
    public void setRuleDetails(RuleDetails62860CCUSPNRDataFeed132 ruleDetails) {
        this.ruleDetails = ruleDetails;
    }

    /** 
     * Get the 'ruleStatusDetails' element value. This composite is used to indicate that the rule have been entered manually by the agent.
     * 
     * @return value
     */
    public RuleStatus62862CCUSPNRDataFeed132 getRuleStatusDetails() {
        return ruleStatusDetails;
    }

    /** 
     * Set the 'ruleStatusDetails' element value. This composite is used to indicate that the rule have been entered manually by the agent.
     * 
     * @param ruleStatusDetails
     */
    public void setRuleStatusDetails(
            RuleStatus62862CCUSPNRDataFeed132 ruleStatusDetails) {
        this.ruleStatusDetails = ruleStatusDetails;
    }
}
