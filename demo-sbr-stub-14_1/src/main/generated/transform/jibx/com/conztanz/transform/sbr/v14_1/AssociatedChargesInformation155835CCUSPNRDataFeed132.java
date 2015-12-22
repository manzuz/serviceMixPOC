
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of the additional charges that are associated to a product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AssociatedChargesInformation_155835_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AssociatedChargesInformation155835CCUSPNRDataFeed132
{
    private String type;

    /** 
     * Get the 'type' element value. Type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
