
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_94497_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeFunction"/>
 *     &lt;xs:element type="CodedAttributeInformation_142109_C_CUS_PNRDataFeed_132" name="attributeDetails" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute94497SCUSPNRDataFeed132
{
    private String attributeFunction;
    private List<CodedAttributeInformation142109CCUSPNRDataFeed132> attributeDetailList = new ArrayList<CodedAttributeInformation142109CCUSPNRDataFeed132>();

    /** 
     * Get the 'attributeFunction' element value. Usage of this element will be the transport of the DescriptiveBilingInformation first value will be QF
     * 
     * @return value
     */
    public String getAttributeFunction() {
        return attributeFunction;
    }

    /** 
     * Set the 'attributeFunction' element value. Usage of this element will be the transport of the DescriptiveBilingInformation first value will be QF
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
    public List<CodedAttributeInformation142109CCUSPNRDataFeed132> getAttributeDetailList() {
        return attributeDetailList;
    }

    /** 
     * Set the list of 'attributeDetails' element items. provides details for the Attribute
     * 
     * @param list
     */
    public void setAttributeDetailList(
            List<CodedAttributeInformation142109CCUSPNRDataFeed132> list) {
        attributeDetailList = list;
    }
}
