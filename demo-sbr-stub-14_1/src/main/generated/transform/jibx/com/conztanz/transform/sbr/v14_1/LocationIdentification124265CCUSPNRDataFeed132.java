
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_124265_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code"/>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification124265CCUSPNRDataFeed132
{
    private String code;
    private String qualifier;

    /** 
     * Get the 'code' element value. Country code
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Country code
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'qualifier' element value. Type of country (residence or birth)
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Type of country (residence or birth)
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
}
