
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information related to a specific ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_76105_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_117872_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails76105SCUSPNRDataFeed132
{
    private TicketNumberDetails117872CCUSPNRDataFeed132 documentDetails;

    /** 
     * Get the 'documentDetails' element value. Ticket conjunction number details
     * 
     * @return value
     */
    public TicketNumberDetails117872CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. Ticket conjunction number details
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            TicketNumberDetails117872CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }
}
