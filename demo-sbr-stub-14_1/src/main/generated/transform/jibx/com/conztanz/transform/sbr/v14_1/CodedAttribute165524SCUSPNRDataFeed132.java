
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_165524_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttributeInformation_234146_C_CUS_PNRDataFeed_132" name="attributeDetails" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute165524SCUSPNRDataFeed132
{
    private List<CodedAttributeInformation234146CCUSPNRDataFeed132> attributeDetailList = new ArrayList<CodedAttributeInformation234146CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'attributeDetails' element items. attributeDetails
     * 
     * @return list
     */
    public List<CodedAttributeInformation234146CCUSPNRDataFeed132> getAttributeDetailList() {
        return attributeDetailList;
    }

    /** 
     * Set the list of 'attributeDetails' element items. attributeDetails
     * 
     * @param list
     */
    public void setAttributeDetailList(
            List<CodedAttributeInformation234146CCUSPNRDataFeed132> list) {
        attributeDetailList = list;
    }
}
