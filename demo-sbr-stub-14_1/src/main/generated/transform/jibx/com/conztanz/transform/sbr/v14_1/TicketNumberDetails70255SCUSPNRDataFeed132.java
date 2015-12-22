
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information related to a specific ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_70255_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_109493_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *     &lt;xs:element type="xs:string" name="status"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails70255SCUSPNRDataFeed132
{
    private TicketNumberDetails109493CCUSPNRDataFeed132 documentDetails;
    private String status;

    /** 
     * Get the 'documentDetails' element value. 1st occurence contains ticket number, type, status and conjuctive data
     * 
     * @return value
     */
    public TicketNumberDetails109493CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. 1st occurence contains ticket number, type, status and conjuctive data
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            TicketNumberDetails109493CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }

    /** 
     * Get the 'status' element value. used to transmit status issuance void refund
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. used to transmit status issuance void refund
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
