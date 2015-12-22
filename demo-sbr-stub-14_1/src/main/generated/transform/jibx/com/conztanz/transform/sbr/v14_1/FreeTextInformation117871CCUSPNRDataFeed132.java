
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_117871_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textSubjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="language" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="source"/>
 *     &lt;xs:element type="xs:string" name="encoding"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation117871CCUSPNRDataFeed132
{
    private String textSubjectQualifier;
    private String language;
    private String source;
    private String encoding;

    /** 
     * Get the 'textSubjectQualifier' element value. text type
     * 
     * @return value
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /** 
     * Set the 'textSubjectQualifier' element value. text type
     * 
     * @param textSubjectQualifier
     */
    public void setTextSubjectQualifier(String textSubjectQualifier) {
        this.textSubjectQualifier = textSubjectQualifier;
    }

    /** 
     * Get the 'language' element value. language code of the freetext
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'language' element value. language code of the freetext
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the 'source' element value. Source of the freetext (Manual, automated system...)
     * 
     * @return value
     */
    public String getSource() {
        return source;
    }

    /** 
     * Set the 'source' element value. Source of the freetext (Manual, automated system...)
     * 
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /** 
     * Get the 'encoding' element value. Character encoding of the freetext, which should be ASCII 7-bits
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' element value. Character encoding of the freetext, which should be ASCII 7-bits
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
