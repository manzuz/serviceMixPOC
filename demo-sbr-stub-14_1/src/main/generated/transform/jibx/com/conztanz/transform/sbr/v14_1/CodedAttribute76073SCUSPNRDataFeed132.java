
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_76073_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttributeInformation_117830_C_CUS_PNRDataFeed_132" name="attributeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute76073SCUSPNRDataFeed132
{
    private CodedAttributeInformation117830CCUSPNRDataFeed132 attributeDetails;

    /** 
     * Get the 'attributeDetails' element value. provides details for the Attribute
     * 
     * @return value
     */
    public CodedAttributeInformation117830CCUSPNRDataFeed132 getAttributeDetails() {
        return attributeDetails;
    }

    /** 
     * Set the 'attributeDetails' element value. provides details for the Attribute
     * 
     * @param attributeDetails
     */
    public void setAttributeDetails(
            CodedAttributeInformation117830CCUSPNRDataFeed132 attributeDetails) {
        this.attributeDetails = attributeDetails;
    }
}
