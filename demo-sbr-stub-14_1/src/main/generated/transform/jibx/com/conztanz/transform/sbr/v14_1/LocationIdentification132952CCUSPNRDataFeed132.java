
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_132952_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification132952CCUSPNRDataFeed132
{
    private String code;
    private String name;

    /** 
     * Get the 'code' element value. Location Code "1A" to indicate Amadeus location type "CPY" to indicate a Provider location type
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Location Code "1A" to indicate Amadeus location type "CPY" to indicate a Provider location type
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'name' element value. Location extended name for  Amadeus location type and  Provider location type (followed by an *)
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Location extended name for  Amadeus location type and  Provider location type (followed by an *)
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
