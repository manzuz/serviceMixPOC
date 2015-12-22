
package com.conztanz.transform.sbr.v14_1;

/** 
 * Miscellaneous remarks
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemark_118783_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="freetext" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status"/>
 *     &lt;xs:element type="xs:string" name="otherStatus"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemark118783CCUSPNRDataFeed132
{
    private String type;
    private String freetext;
    private String status;
    private String otherStatus;

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

    /** 
     * Get the 'status' element value. Priority of the comment, giving indication on how the comment should be processed. High Priority: Comments should inhibit further processing. Normal Priority: Comments should be shown, without inhibitng further processing
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. Priority of the comment, giving indication on how the comment should be processed. High Priority: Comments should inhibit further processing. Normal Priority: Comments should be shown, without inhibitng further processing
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'otherStatus' element value. Status showing if and how the priority comment has been delivered. - default: Not delivered - DSS: Delivered a Suitable Substitute - CDF: Delivery Failed - CDC: Delivery Completed
     * 
     * @return value
     */
    public String getOtherStatus() {
        return otherStatus;
    }

    /** 
     * Set the 'otherStatus' element value. Status showing if and how the priority comment has been delivered. - default: Not delivered - DSS: Delivered a Suitable Substitute - CDF: Delivery Failed - CDC: Delivery Completed
     * 
     * @param otherStatus
     */
    public void setOtherStatus(String otherStatus) {
        this.otherStatus = otherStatus;
    }
}
