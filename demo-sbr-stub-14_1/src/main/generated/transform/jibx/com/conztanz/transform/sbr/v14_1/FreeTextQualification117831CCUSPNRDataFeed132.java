
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the type, purpose, and language of free text and whether any action is required.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextQualification_117831_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textSubjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="informationType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextQualification117831CCUSPNRDataFeed132
{
    private String textSubjectQualifier;
    private String informationType;
    private String companyId;

    /** 
     * Get the 'textSubjectQualifier' element value. Categorise the format of the text (free text, coded,...)
     * 
     * @return value
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /** 
     * Set the 'textSubjectQualifier' element value. Categorise the format of the text (free text, coded,...)
     * 
     * @param textSubjectQualifier
     */
    public void setTextSubjectQualifier(String textSubjectQualifier) {
        this.textSubjectQualifier = textSubjectQualifier;
    }

    /** 
     * Get the 'informationType' element value. Provides a code identifying the information (phone, OSI, etc...)
     * 
     * @return value
     */
    public String getInformationType() {
        return informationType;
    }

    /** 
     * Set the 'informationType' element value. Provides a code identifying the information (phone, OSI, etc...)
     * 
     * @param informationType
     */
    public void setInformationType(String informationType) {
        this.informationType = informationType;
    }

    /** 
     * Get the 'companyId' element value. The airline code that may be associated to this information
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. The airline code that may be associated to this information
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
