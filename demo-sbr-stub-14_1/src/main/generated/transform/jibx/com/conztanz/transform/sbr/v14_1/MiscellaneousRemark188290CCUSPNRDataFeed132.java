
package com.conztanz.transform.sbr.v14_1;

/** 
 * Miscellaneous remarks
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemark_188290_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="category" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freetext"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="encoding" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemark188290CCUSPNRDataFeed132
{
    private String type;
    private String category;
    private String freetext;
    private String status;
    private String encoding;

    /** 
     * Get the 'type' element value. Remark Type:  RM  for General Remark  RIF for Invoice Remark  RII for Itineray and Invoice Remark  RIR for Itinerary Remark  RIZ for Mini-Itinerary Remark
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Remark Type:  RM  for General Remark  RIF for Invoice Remark  RII for Itineray and Invoice Remark  RIR for Itinerary Remark  RIZ for Mini-Itinerary Remark
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'category' element value. This is the category of the Remark
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value. This is the category of the Remark
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** 
     * Get the 'freetext' element value. Free text of the remarks.
     * 
     * @return value
     */
    public String getFreetext() {
        return freetext;
    }

    /** 
     * Set the 'freetext' element value. Free text of the remarks.
     * 
     * @param freetext
     */
    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }

    /** 
     * Get the 'status' element value. Specify if the remark is not displayable to the user due to non supported Unicode characters (NAV: Not Available)
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. Specify if the remark is not displayable to the user due to non supported Unicode characters (NAV: Not Available)
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'encoding' element value. To specify if the remark is in Unicode or ASCII.
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' element value. To specify if the remark is in Unicode or ASCII.
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
