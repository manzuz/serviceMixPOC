
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_132911_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification132911CCUSPNRDataFeed132
{
    private String code;
    private String name;

    /** 
     * Get the 'code' element value. Set to: IATA to indicate IATA location code 1A to indicate a 1A location CPY to indicate a Car provider location
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Set to: IATA to indicate IATA location code 1A to indicate a 1A location CPY to indicate a Car provider location
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'name' element value. Location extended name for  - Amadeus location type  - Provider location type (followed by an *) - Free text for collection option.  - Free text for delivery option.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Location extended name for  - Amadeus location type  - Provider location type (followed by an *) - Free text for collection option.  - Free text for delivery option.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
