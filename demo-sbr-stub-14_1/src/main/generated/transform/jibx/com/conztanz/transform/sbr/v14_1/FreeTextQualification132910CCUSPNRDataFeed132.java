
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextQualification_132910_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="subjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="language" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextQualification132910CCUSPNRDataFeed132
{
    private String subjectQualifier;
    private String type;
    private String companyId;
    private String language;

    /** 
     * Get the 'subjectQualifier' element value. Identifies whether the free text is coded or not coded  3 for Literal text
     * 
     * @return value
     */
    public String getSubjectQualifier() {
        return subjectQualifier;
    }

    /** 
     * Set the 'subjectQualifier' element value. Identifies whether the free text is coded or not coded  3 for Literal text
     * 
     * @param subjectQualifier
     */
    public void setSubjectQualifier(String subjectQualifier) {
        this.subjectQualifier = subjectQualifier;
    }

    /** 
     * Get the 'type' element value. Coded text, or specifies type of  info   Surface segment : 2 for Address  or 5 for Telephone nature un known  Cruise segment : P30 for Ship Name
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Coded text, or specifies type of  info   Surface segment : 2 for Address  or 5 for Telephone nature un known  Cruise segment : P30 for Ship Name
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'companyId' element value. Company code
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. Company code
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'language' element value. ISO code for language of free text
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'language' element value. ISO code for language of free text
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
}
