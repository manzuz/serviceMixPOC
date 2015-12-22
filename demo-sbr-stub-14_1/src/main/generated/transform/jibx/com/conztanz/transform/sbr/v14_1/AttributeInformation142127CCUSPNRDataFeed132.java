
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of attribute and the attribute
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AttributeInformation_142127_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *     &lt;xs:element type="xs:string" name="attributeDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AttributeInformation142127CCUSPNRDataFeed132
{
    private String attributeType;
    private String attributeDescription;

    /** 
     * Get the 'attributeType' element value. Type of the authorization data.  Some of the possible types are:  25: (AUT) Context (Credit Mutuel) 26: (ATN) Customer instruction (Barclays) 27: (ATN) Cryptogram computation method (Credit Mutuel) 28: (AUT) Modified securisation mode (Credit Mutuel) 29: (ATN) Electronic commerce transaction type (Credit Mutuel) E: (ATN) Result of the secured payment VADS (Credit Mutuel)  MID: (AUT) Merchant ID
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. Type of the authorization data.  Some of the possible types are:  25: (AUT) Context (Credit Mutuel) 26: (ATN) Customer instruction (Barclays) 27: (ATN) Cryptogram computation method (Credit Mutuel) 28: (AUT) Modified securisation mode (Credit Mutuel) 29: (ATN) Electronic commerce transaction type (Credit Mutuel) E: (ATN) Result of the secured payment VADS (Credit Mutuel)  MID: (AUT) Merchant ID
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /** 
     * Get the 'attributeDescription' element value. value of the data
     * 
     * @return value
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /** 
     * Set the 'attributeDescription' element value. value of the data
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
}
