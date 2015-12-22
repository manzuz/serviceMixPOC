
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of attribute and the attribute
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AttributeInformation_245010_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *     &lt;xs:element type="xs:string" name="attributeDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AttributeInformation245010CCUSPNRDataFeed132
{
    private String attributeType;
    private String attributeDescription;

    /** 
     * Get the 'attributeType' element value. Type of the attribute
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. Type of the attribute
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /** 
     * Get the 'attributeDescription' element value. Value of the attribute (if applicable)
     * 
     * @return value
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /** 
     * Set the 'attributeDescription' element value. Value of the attribute (if applicable)
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
}
