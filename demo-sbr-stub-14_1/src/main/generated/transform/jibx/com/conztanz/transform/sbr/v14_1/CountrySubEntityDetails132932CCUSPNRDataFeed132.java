
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a part of a country (eg county or part of              a city).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CountrySubEntityDetails_132932_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CountrySubEntityDetails132932CCUSPNRDataFeed132
{
    private String code;

    /** 
     * Get the 'code' element value. State Code. Mandatory if CountryCode is US, CA, AU.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. State Code. Mandatory if CountryCode is US, CA, AU.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
