
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_14913_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttributeInformation_26109_C_CUS_PNRDataFeed_132" name="attributeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute14913SCUSPNRDataFeed132
{
    private CodedAttributeInformation26109CCUSPNRDataFeed132 attributeDetails;

    /** 
     * Get the 'attributeDetails' element value. provides details for the Attribute
     * 
     * @return value
     */
    public CodedAttributeInformation26109CCUSPNRDataFeed132 getAttributeDetails() {
        return attributeDetails;
    }

    /** 
     * Set the 'attributeDetails' element value. provides details for the Attribute
     * 
     * @param attributeDetails
     */
    public void setAttributeDetails(
            CodedAttributeInformation26109CCUSPNRDataFeed132 attributeDetails) {
        this.attributeDetails = attributeDetails;
    }
}
