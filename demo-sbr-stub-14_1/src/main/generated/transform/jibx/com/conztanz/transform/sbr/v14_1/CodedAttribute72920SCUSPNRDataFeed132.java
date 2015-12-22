
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_72920_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeFunction" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttributeInformation_113036_C_CUS_PNRDataFeed_132" name="attributeDetails" maxOccurs="11"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute72920SCUSPNRDataFeed132
{
    private String attributeFunction;
    private List<CodedAttributeInformation113036CCUSPNRDataFeed132> attributeDetailList = new ArrayList<CodedAttributeInformation113036CCUSPNRDataFeed132>();

    /** 
     * Get the 'attributeFunction' element value. provides the function of the attribute
     * 
     * @return value
     */
    public String getAttributeFunction() {
        return attributeFunction;
    }

    /** 
     * Set the 'attributeFunction' element value. provides the function of the attribute
     * 
     * @param attributeFunction
     */
    public void setAttributeFunction(String attributeFunction) {
        this.attributeFunction = attributeFunction;
    }

    /** 
     * Get the list of 'attributeDetails' element items. provides details for the Attribute
     * 
     * @return list
     */
    public List<CodedAttributeInformation113036CCUSPNRDataFeed132> getAttributeDetailList() {
        return attributeDetailList;
    }

    /** 
     * Set the list of 'attributeDetails' element items. provides details for the Attribute
     * 
     * @param list
     */
    public void setAttributeDetailList(
            List<CodedAttributeInformation113036CCUSPNRDataFeed132> list) {
        attributeDetailList = list;
    }
}
