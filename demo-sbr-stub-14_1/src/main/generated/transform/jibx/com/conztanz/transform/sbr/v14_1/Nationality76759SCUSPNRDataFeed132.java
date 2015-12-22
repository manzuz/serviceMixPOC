
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a nationality.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Nationality_76759_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="codeQualifier"/>
 *     &lt;xs:element type="NationalityDetails_118728_C_CUS_PNRDataFeed_132" name="nationalityDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Nationality76759SCUSPNRDataFeed132
{
    private String codeQualifier;
    private NationalityDetails118728CCUSPNRDataFeed132 nationalityDetails;

    /** 
     * Get the 'codeQualifier' element value. To convey the type of nationality.
     * 
     * @return value
     */
    public String getCodeQualifier() {
        return codeQualifier;
    }

    /** 
     * Set the 'codeQualifier' element value. To convey the type of nationality.
     * 
     * @param codeQualifier
     */
    public void setCodeQualifier(String codeQualifier) {
        this.codeQualifier = codeQualifier;
    }

    /** 
     * Get the 'nationalityDetails' element value. To convey the nationality itself..
     * 
     * @return value
     */
    public NationalityDetails118728CCUSPNRDataFeed132 getNationalityDetails() {
        return nationalityDetails;
    }

    /** 
     * Set the 'nationalityDetails' element value. To convey the nationality itself..
     * 
     * @param nationalityDetails
     */
    public void setNationalityDetails(
            NationalityDetails118728CCUSPNRDataFeed132 nationalityDetails) {
        this.nationalityDetails = nationalityDetails;
    }
}
