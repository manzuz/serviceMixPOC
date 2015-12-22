
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information related to a specific ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_118076_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_173487_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails118076SCUSPNRDataFeed132
{
    private TicketNumberDetails173487CCUSPNRDataFeed132 documentDetails;
    private String status;

    /** 
     * Get the 'documentDetails' element value.
     * 
     * @return value
     */
    public TicketNumberDetails173487CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value.
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            TicketNumberDetails173487CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }

    /** 
     * Get the 'status' element value. provides ticket status
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. provides ticket status
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
