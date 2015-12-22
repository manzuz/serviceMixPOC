
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerSurnameInformation_109519_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerSurnameInformation109519CCUSPNRDataFeed132
{
    private String type;

    /** 
     * Get the 'type' element value. Customer type: A=adult IN = infant
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Customer type: A=adult IN = infant
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
