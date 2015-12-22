
package com.conztanz.transform.sbr.v14_1;

/** 
 * Convey coded key and corresponding value
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttributeInformation_188409_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *     &lt;xs:element type="xs:string" name="attributeDescription" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="language" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="encoding" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="source" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttributeInformation188409CCUSPNRDataFeed132
{
    private String attributeType;
    private String attributeDescription;
    private String language;
    private String encoding;
    private String source;

    /** 
     * Get the 'attributeType' element value. provides the attribute Type
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. provides the attribute Type
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /** 
     * Get the 'attributeDescription' element value. provides a description for the attribute
     * 
     * @return value
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /** 
     * Set the 'attributeDescription' element value. provides a description for the attribute
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
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
}
