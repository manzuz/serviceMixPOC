
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey the Ferry passenger type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_129131_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeFunction"/>
 *     &lt;xs:element type="AttributeInformation_188164_C_CUS_PNRDataFeed_132" name="attributeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute129131SCUSPNRDataFeed132
{
    private String attributeFunction;
    private AttributeInformation188164CCUSPNRDataFeed132 attributeDetails;

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
     * Get the 'attributeDetails' element value. provides details for the Attribute
     * 
     * @return value
     */
    public AttributeInformation188164CCUSPNRDataFeed132 getAttributeDetails() {
        return attributeDetails;
    }

    /** 
     * Set the 'attributeDetails' element value. provides details for the Attribute
     * 
     * @param attributeDetails
     */
    public void setAttributeDetails(
            AttributeInformation188164CCUSPNRDataFeed132 attributeDetails) {
        this.attributeDetails = attributeDetails;
    }
}
