
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_79464_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttributeInformation_122050_C_CUS_PNRDataFeed_132" name="attributeDetails" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute79464SCUSPNRDataFeed132
{
    private List<CodedAttributeInformation122050CCUSPNRDataFeed132> attributeDetailList = new ArrayList<CodedAttributeInformation122050CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'attributeDetails' element items. provides details for the Attribute
     * 
     * @return list
     */
    public List<CodedAttributeInformation122050CCUSPNRDataFeed132> getAttributeDetailList() {
        return attributeDetailList;
    }

    /** 
     * Set the list of 'attributeDetails' element items. provides details for the Attribute
     * 
     * @param list
     */
    public void setAttributeDetailList(
            List<CodedAttributeInformation122050CCUSPNRDataFeed132> list) {
        attributeDetailList = list;
    }
}
