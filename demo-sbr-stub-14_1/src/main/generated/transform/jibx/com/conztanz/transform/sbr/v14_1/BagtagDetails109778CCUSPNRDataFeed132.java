
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify baggage by company identification, serial numbers, and destination.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BagtagDetails_109778_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="identifier"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BagtagDetails109778CCUSPNRDataFeed132
{
    private String identifier;
    private String unitQualifier;

    /** 
     * Get the 'identifier' element value. Value of excess baggage.
     * 
     * @return value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** 
     * Set the 'identifier' element value. Value of excess baggage.
     * 
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /** 
     * Get the 'unitQualifier' element value. KG or PC.
     * 
     * @return value
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /** 
     * Set the 'unitQualifier' element value. KG or PC.
     * 
     * @param unitQualifier
     */
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }
}
