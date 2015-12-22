
package com.conztanz.transform.sbr.v14_1;

/** 
 * Miscellaneous remarks
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemark_62843_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="freetext" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="businessFunction" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="language" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="source" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="encoding" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemark62843CCUSPNRDataFeed132
{
    private String type;
    private String freetext;
    private String businessFunction;
    private String language;
    private String source;
    private String encoding;

    /** 
     * Get the 'type' element value. This data element is used to convey the type of the remark. (see data mapping to view the codes)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. This data element is used to convey the type of the remark. (see data mapping to view the codes)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'freetext' element value. Free text and message sequence numbers of the remarks.
     * 
     * @return value
     */
    public String getFreetext() {
        return freetext;
    }

    /** 
     * Set the 'freetext' element value. Free text and message sequence numbers of the remarks.
     * 
     * @param freetext
     */
    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }

    /** 
     * Get the 'businessFunction' element value. This data element is used to convey the business function
     * 
     * @return value
     */
    public String getBusinessFunction() {
        return businessFunction;
    }

    /** 
     * Set the 'businessFunction' element value. This data element is used to convey the business function
     * 
     * @param businessFunction
     */
    public void setBusinessFunction(String businessFunction) {
        this.businessFunction = businessFunction;
    }

    /** 
     * Get the 'language' element value. language used for the free text.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'language' element value. language used for the free text.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the 'source' element value. Indicates if it has been manually entered by an agent or system generated.
     * 
     * @return value
     */
    public String getSource() {
        return source;
    }

    /** 
     * Set the 'source' element value. Indicates if it has been manually entered by an agent or system generated.
     * 
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /** 
     * Get the 'encoding' element value. Coded identification of the character encoding used in the interchange
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' element value. Coded identification of the character encoding used in the interchange
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
