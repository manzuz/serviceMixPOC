
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of specific agreement type by code or name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AgreementTypeIdentification_132901_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code"/>
 *     &lt;xs:element type="xs:string" name="description"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AgreementTypeIdentification132901CCUSPNRDataFeed132
{
    private String code;
    private String description;

    /** 
     * Get the 'code' element value. - TK for Tracking option
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. - TK for Tracking option
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'description' element value. Agreement description
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Agreement description
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
