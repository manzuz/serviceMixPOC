
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information related to a specific ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_163726_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_231872_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails163726SCUSPNRDataFeed132
{
    private TicketNumberDetails231872CCUSPNRDataFeed132 documentDetails;

    /** 
     * Get the 'documentDetails' element value. documentDetails
     * 
     * @return value
     */
    public TicketNumberDetails231872CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. documentDetails
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            TicketNumberDetails231872CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }
}
