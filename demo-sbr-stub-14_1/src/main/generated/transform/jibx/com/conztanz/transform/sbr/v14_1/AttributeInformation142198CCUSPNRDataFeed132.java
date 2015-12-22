
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of attribute and the attribute
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AttributeInformation_142198_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *     &lt;xs:element type="xs:string" name="attributeDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AttributeInformation142198CCUSPNRDataFeed132
{
    private String attributeType;
    private String attributeDescription;

    /** 
     * Get the 'attributeType' element value. This is the data type. may contain:  - the name of the switch (eg nonRefundableFop, foCheck ...)  - the name of the data (eg bacchusDealNumber, ...)
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. This is the data type. may contain:  - the name of the switch (eg nonRefundableFop, foCheck ...)  - the name of the data (eg bacchusDealNumber, ...)
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /** 
     * Get the 'attributeDescription' element value. This is the data value.  This may contain:  - a potential attribute of the switch  - the value of the structured data of the FOP
     * 
     * @return value
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /** 
     * Set the 'attributeDescription' element value. This is the data value.  This may contain:  - a potential attribute of the switch  - the value of the structured data of the FOP
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
}
