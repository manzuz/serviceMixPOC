
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_132930_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification132930CCUSPNRDataFeed132
{
    private String code;
    private String name;

    /** 
     * Get the 'code' element value. Identification of the site
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Identification of the site
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'name' element value. Site name
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Site name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
