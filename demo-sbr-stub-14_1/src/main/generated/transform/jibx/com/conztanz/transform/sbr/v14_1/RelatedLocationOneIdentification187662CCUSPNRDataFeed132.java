
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification the first related location by code or name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelatedLocationOneIdentification_187662_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="agency" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelatedLocationOneIdentification187662CCUSPNRDataFeed132
{
    private String code;
    private String qualifier;
    private String agency;

    /** 
     * Get the 'code' element value. Associated airport code.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Associated airport code.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'qualifier' element value. Associated airport code qualifier.
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Associated airport code qualifier.
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'agency' element value. Set to IA to indicate that the associated location code is a IATA airport or city code.
     * 
     * @return value
     */
    public String getAgency() {
        return agency;
    }

    /** 
     * Set the 'agency' element value. Set to IA to indicate that the associated location code is a IATA airport or city code.
     * 
     * @param agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }
}
