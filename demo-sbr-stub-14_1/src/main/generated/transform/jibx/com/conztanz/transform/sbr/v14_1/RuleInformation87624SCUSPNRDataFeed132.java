
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify rule information and rule status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleInformation_87624_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RuleDetails_132946_C_CUS_PNRDataFeed_132" name="ruleDetails" maxOccurs="5"/>
 *     &lt;xs:element type="RuleText_132947_C_CUS_PNRDataFeed_132" name="ruleText" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleInformation87624SCUSPNRDataFeed132
{
    private List<RuleDetails132946CCUSPNRDataFeed132> ruleDetailList = new ArrayList<RuleDetails132946CCUSPNRDataFeed132>();
    private RuleText132947CCUSPNRDataFeed132 ruleText;

    /** 
     * Get the list of 'ruleDetails' element items. Rule details
     * 
     * @return list
     */
    public List<RuleDetails132946CCUSPNRDataFeed132> getRuleDetailList() {
        return ruleDetailList;
    }

    /** 
     * Set the list of 'ruleDetails' element items. Rule details
     * 
     * @param list
     */
    public void setRuleDetailList(List<RuleDetails132946CCUSPNRDataFeed132> list) {
        ruleDetailList = list;
    }

    /** 
     * Get the 'ruleText' element value. Associated Rule Text
     * 
     * @return value
     */
    public RuleText132947CCUSPNRDataFeed132 getRuleText() {
        return ruleText;
    }

    /** 
     * Set the 'ruleText' element value. Associated Rule Text
     * 
     * @param ruleText
     */
    public void setRuleText(RuleText132947CCUSPNRDataFeed132 ruleText) {
        this.ruleText = ruleText;
    }
}
