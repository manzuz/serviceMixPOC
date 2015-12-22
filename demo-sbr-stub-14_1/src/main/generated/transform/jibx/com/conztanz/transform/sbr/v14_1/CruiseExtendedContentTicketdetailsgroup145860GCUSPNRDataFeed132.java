
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CruiseExtendedContent_ticketdetailsgroup_145860_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_128754_S_CUS_PNRDataFeed_132" name="ticketNumber"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128714_S_CUS_PNRDataFeed_132" name="ticketIssuancedate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CruiseExtendedContentTicketdetailsgroup145860GCUSPNRDataFeed132
{
    private TicketNumberDetails128754SCUSPNRDataFeed132 ticketNumber;
    private StructuredDateTimeInformation128714SCUSPNRDataFeed132 ticketIssuancedate;

    /** 
     * Get the 'ticketNumber' element value.
     * 
     * @return value
     */
    public TicketNumberDetails128754SCUSPNRDataFeed132 getTicketNumber() {
        return ticketNumber;
    }

    /** 
     * Set the 'ticketNumber' element value.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(
            TicketNumberDetails128754SCUSPNRDataFeed132 ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /** 
     * Get the 'ticketIssuancedate' element value. Issuance Date of the ticket.
     * 
     * @return value
     */
    public StructuredDateTimeInformation128714SCUSPNRDataFeed132 getTicketIssuancedate() {
        return ticketIssuancedate;
    }

    /** 
     * Set the 'ticketIssuancedate' element value. Issuance Date of the ticket.
     * 
     * @param ticketIssuancedate
     */
    public void setTicketIssuancedate(
            StructuredDateTimeInformation128714SCUSPNRDataFeed132 ticketIssuancedate) {
        this.ticketIssuancedate = ticketIssuancedate;
    }
}
