
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a location by code or name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Location_47019_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="trueLocationId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Location47019CCUSPNRDataFeed132
{
    private String trueLocationId;

    /** 
     * Get the 'trueLocationId' element value.
     * 
     * @return value
     */
    public String getTrueLocationId() {
        return trueLocationId;
    }

    /** 
     * Set the 'trueLocationId' element value.
     * 
     * @param trueLocationId
     */
    public void setTrueLocationId(String trueLocationId) {
        this.trueLocationId = trueLocationId;
    }
}
