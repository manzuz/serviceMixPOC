
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the text rule
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleText_187648_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textType"/>
 *     &lt;xs:element type="xs:string" name="freeText" minOccurs="0" maxOccurs="20"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleText187648CCUSPNRDataFeed132
{
    private String textType;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'textType' element value. Code to define the kind of rule. - ADB Advance Booking Information - ADP Advance Payment Information - DEP Deposit Information - GUA Guarantee Information - OWI One Way Information - PCK Pick-up Rules - POL Policy Information
     * 
     * @return value
     */
    public String getTextType() {
        return textType;
    }

    /** 
     * Set the 'textType' element value. Code to define the kind of rule. - ADB Advance Booking Information - ADP Advance Payment Information - DEP Deposit Information - GUA Guarantee Information - OWI One Way Information - PCK Pick-up Rules - POL Policy Information
     * 
     * @param textType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /** 
     * Get the list of 'freeText' element items. Rule text.
     * 
     * @return list
     */
    public List<String> getFreeTextList() {
        return freeTextList;
    }

    /** 
     * Set the list of 'freeText' element items. Rule text.
     * 
     * @param list
     */
    public void setFreeTextList(List<String> list) {
        freeTextList = list;
    }
}
