
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_188107_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="iataLocCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification188107CCUSPNRDataFeed132
{
    private String iataLocCode;
    private String name;

    /** 
     * Get the 'iataLocCode' element value.
     * 
     * @return value
     */
    public String getIataLocCode() {
        return iataLocCode;
    }

    /** 
     * Set the 'iataLocCode' element value.
     * 
     * @param iataLocCode
     */
    public void setIataLocCode(String iataLocCode) {
        this.iataLocCode = iataLocCode;
    }

    /** 
     * Get the 'name' element value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
