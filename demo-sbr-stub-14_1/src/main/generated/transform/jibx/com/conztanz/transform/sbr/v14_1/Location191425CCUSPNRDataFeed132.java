
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a location by code or name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Location_191425_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="trueLocationId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="trueLocation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Location191425CCUSPNRDataFeed132
{
    private String trueLocationId;
    private String trueLocation;

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

    /** 
     * Get the 'trueLocation' element value.
     * 
     * @return value
     */
    public String getTrueLocation() {
        return trueLocation;
    }

    /** 
     * Set the 'trueLocation' element value.
     * 
     * @param trueLocation
     */
    public void setTrueLocation(String trueLocation) {
        this.trueLocation = trueLocation;
    }
}
