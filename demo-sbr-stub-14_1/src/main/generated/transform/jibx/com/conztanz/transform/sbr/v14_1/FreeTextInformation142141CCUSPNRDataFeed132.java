
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_142141_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textSubjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="informationType"/>
 *     &lt;xs:element type="xs:string" name="source"/>
 *     &lt;xs:element type="xs:string" name="encoding"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation142141CCUSPNRDataFeed132
{
    private String textSubjectQualifier;
    private String informationType;
    private String source;
    private String encoding;

    /** 
     * Get the 'textSubjectQualifier' element value. mutually defined ZZZ
     * 
     * @return value
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /** 
     * Set the 'textSubjectQualifier' element value. mutually defined ZZZ
     * 
     * @param textSubjectQualifier
     */
    public void setTextSubjectQualifier(String textSubjectQualifier) {
        this.textSubjectQualifier = textSubjectQualifier;
    }

    /** 
     * Get the 'informationType' element value. AH Browser Accept headers UA Browser User Agent
     * 
     * @return value
     */
    public String getInformationType() {
        return informationType;
    }

    /** 
     * Set the 'informationType' element value. AH Browser Accept headers UA Browser User Agent
     * 
     * @param informationType
     */
    public void setInformationType(String informationType) {
        this.informationType = informationType;
    }

    /** 
     * Get the 'source' element value. Manual : M
     * 
     * @return value
     */
    public String getSource() {
        return source;
    }

    /** 
     * Set the 'source' element value. Manual : M
     * 
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /** 
     * Get the 'encoding' element value. ZZZ mutually agreed
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' element value. ZZZ mutually agreed
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
