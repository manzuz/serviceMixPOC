
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_188218_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="agency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification188218CCUSPNRDataFeed132
{
    private String code;
    private String qualifier;
    private String agency;
    private String name;

    /** 
     * Get the 'code' element value.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'qualifier' element value.
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value.
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'agency' element value.
     * 
     * @return value
     */
    public String getAgency() {
        return agency;
    }

    /** 
     * Set the 'agency' element value.
     * 
     * @param agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
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
