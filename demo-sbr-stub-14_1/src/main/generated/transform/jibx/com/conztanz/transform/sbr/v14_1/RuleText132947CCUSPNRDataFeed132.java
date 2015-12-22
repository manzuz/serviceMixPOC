
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the text rule
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleText_132947_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textType"/>
 *     &lt;xs:element type="xs:string" name="freeText" maxOccurs="20"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleText132947CCUSPNRDataFeed132
{
    private String textType;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'textType' element value. Coded rule type
     * 
     * @return value
     */
    public String getTextType() {
        return textType;
    }

    /** 
     * Set the 'textType' element value. Coded rule type
     * 
     * @param textType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /** 
     * Get the list of 'freeText' element items. Rule Information
     * 
     * @return list
     */
    public List<String> getFreeTextList() {
        return freeTextList;
    }

    /** 
     * Set the list of 'freeText' element items. Rule Information
     * 
     * @param list
     */
    public void setFreeTextList(List<String> list) {
        freeTextList = list;
    }
}
