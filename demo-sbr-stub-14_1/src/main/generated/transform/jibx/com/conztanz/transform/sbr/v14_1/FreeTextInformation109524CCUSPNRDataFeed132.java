
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_109524_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="textSubjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="source"/>
 *     &lt;xs:element type="xs:string" name="encoding"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation109524CCUSPNRDataFeed132
{
    private String textSubjectQualifier;
    private String source;
    private String encoding;

    /** 
     * Get the 'textSubjectQualifier' element value. textSubjectQualifier
     * 
     * @return value
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /** 
     * Set the 'textSubjectQualifier' element value. textSubjectQualifier
     * 
     * @param textSubjectQualifier
     */
    public void setTextSubjectQualifier(String textSubjectQualifier) {
        this.textSubjectQualifier = textSubjectQualifier;
    }

    /** 
     * Get the 'source' element value. source
     * 
     * @return value
     */
    public String getSource() {
        return source;
    }

    /** 
     * Set the 'source' element value. source
     * 
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /** 
     * Get the 'encoding' element value. encoding
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' element value. encoding
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
