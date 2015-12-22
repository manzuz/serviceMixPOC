
package com.conztanz.transform.sbr.v14_1;

/** 
 * Miscellaneous remarks
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemark_18076_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="freetext" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemark18076CCUSPNRDataFeed132
{
    private String type;
    private String freetext;

    /** 
     * Get the 'type' element value. RC for confidential remark  RI for invoice remark  RM for miscellaneous remark  RQ for quality control remark . ACC for Acceptance . BGG for Baggage . BPP for Boarding Pass Printing . GT for Gate . GNL for General
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. RC for confidential remark  RI for invoice remark  RM for miscellaneous remark  RQ for quality control remark . ACC for Acceptance . BGG for Baggage . BPP for Boarding Pass Printing . GT for Gate . GNL for General
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
}
