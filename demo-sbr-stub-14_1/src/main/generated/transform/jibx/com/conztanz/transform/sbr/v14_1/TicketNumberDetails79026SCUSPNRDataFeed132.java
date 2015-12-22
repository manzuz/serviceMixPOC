
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information related to a specific ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_79026_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_121377_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails79026SCUSPNRDataFeed132
{
    private TicketNumberDetails121377CCUSPNRDataFeed132 documentDetails;

    /** 
     * Get the 'documentDetails' element value. Document details
     * 
     * @return value
     */
    public TicketNumberDetails121377CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. Document details
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            TicketNumberDetails121377CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }
}
