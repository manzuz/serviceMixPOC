
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a nationality.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NationalityDetails_118728_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="nationalityCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NationalityDetails118728CCUSPNRDataFeed132
{
    private String nationalityCode;

    /** 
     * Get the 'nationalityCode' element value. To convey the nationality country code
     * 
     * @return value
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /** 
     * Set the 'nationalityCode' element value. To convey the nationality country code
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }
}
