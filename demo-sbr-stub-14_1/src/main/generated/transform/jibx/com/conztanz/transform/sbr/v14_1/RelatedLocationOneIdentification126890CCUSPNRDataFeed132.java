
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification the first related location by code or name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelatedLocationOneIdentification_126890_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelatedLocationOneIdentification126890CCUSPNRDataFeed132
{
    private String code;

    /** 
     * Get the 'code' element value. Conveys the embarkation port code.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Conveys the embarkation port code.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
