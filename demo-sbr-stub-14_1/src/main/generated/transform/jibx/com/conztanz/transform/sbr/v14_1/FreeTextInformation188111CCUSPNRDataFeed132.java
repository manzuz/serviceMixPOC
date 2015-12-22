
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_188111_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textSubjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="informationType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="language" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="source"/>
 *     &lt;xs:element type="xs:string" name="encoding"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation188111CCUSPNRDataFeed132
{
    private String textSubjectQualifier;
    private String informationType;
    private String companyId;
    private String language;
    private String source;
    private String encoding;

    /** 
     * Get the 'textSubjectQualifier' element value.
     * 
     * @return value
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /** 
     * Set the 'textSubjectQualifier' element value.
     * 
     * @param textSubjectQualifier
     */
    public void setTextSubjectQualifier(String textSubjectQualifier) {
        this.textSubjectQualifier = textSubjectQualifier;
    }

    /** 
     * Get the 'informationType' element value.
     * 
     * @return value
     */
    public String getInformationType() {
        return informationType;
    }

    /** 
     * Set the 'informationType' element value.
     * 
     * @param informationType
     */
    public void setInformationType(String informationType) {
        this.informationType = informationType;
    }

    /** 
     * Get the 'companyId' element value.
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value.
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'language' element value.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'language' element value.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the 'source' element value.
     * 
     * @return value
     */
    public String getSource() {
        return source;
    }

    /** 
     * Set the 'source' element value.
     * 
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /** 
     * Get the 'encoding' element value.
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' element value.
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
