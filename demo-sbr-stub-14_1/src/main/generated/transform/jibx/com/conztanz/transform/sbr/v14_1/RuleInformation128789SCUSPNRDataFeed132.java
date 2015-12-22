
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify rule information and rule status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleInformation_128789_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RuleDetails_187647_C_CUS_PNRDataFeed_132" name="ruleDetails" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="RuleText_187648_C_CUS_PNRDataFeed_132" name="ruleText" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleInformation128789SCUSPNRDataFeed132
{
    private List<RuleDetails187647CCUSPNRDataFeed132> ruleDetailList = new ArrayList<RuleDetails187647CCUSPNRDataFeed132>();
    private List<RuleText187648CCUSPNRDataFeed132> ruleTextList = new ArrayList<RuleText187648CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'ruleDetails' element items. Detailed information on the rule.
     * 
     * @return list
     */
    public List<RuleDetails187647CCUSPNRDataFeed132> getRuleDetailList() {
        return ruleDetailList;
    }

    /** 
     * Set the list of 'ruleDetails' element items. Detailed information on the rule.
     * 
     * @param list
     */
    public void setRuleDetailList(List<RuleDetails187647CCUSPNRDataFeed132> list) {
        ruleDetailList = list;
    }

    /** 
     * Get the list of 'ruleText' element items. Associated rule text.
     * 
     * @return list
     */
    public List<RuleText187648CCUSPNRDataFeed132> getRuleTextList() {
        return ruleTextList;
    }

    /** 
     * Set the list of 'ruleText' element items. Associated rule text.
     * 
     * @param list
     */
    public void setRuleTextList(List<RuleText187648CCUSPNRDataFeed132> list) {
        ruleTextList = list;
    }
}
