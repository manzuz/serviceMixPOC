
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an Amadeus PNR Ticket element
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketElement_6016_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="passengerType" minOccurs="0"/>
 *     &lt;xs:element type="TicketInformation_10089_C_CUS_PNRDataFeed_132" name="ticket"/>
 *     &lt;xs:element type="xs:string" name="printOptions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketElement6016SCUSPNRDataFeed132
{
    private String passengerType;
    private TicketInformation10089CCUSPNRDataFeed132 ticket;
    private String printOptions;

    /** 
     * Get the 'passengerType' element value. Passenger type  PAX for Passenger  INF for Infant not occupying a seat
     * 
     * @return value
     */
    public String getPassengerType() {
        return passengerType;
    }

    /** 
     * Set the 'passengerType' element value. Passenger type  PAX for Passenger  INF for Infant not occupying a seat
     * 
     * @param passengerType
     */
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    /** 
     * Get the 'ticket' element value. Ticket information
     * 
     * @return value
     */
    public TicketInformation10089CCUSPNRDataFeed132 getTicket() {
        return ticket;
    }

    /** 
     * Set the 'ticket' element value. Ticket information
     * 
     * @param ticket
     */
    public void setTicket(TicketInformation10089CCUSPNRDataFeed132 ticket) {
        this.ticket = ticket;
    }

    /** 
     * Get the 'printOptions' element value. Print options (//print options after double slash)
     * 
     * @return value
     */
    public String getPrintOptions() {
        return printOptions;
    }

    /** 
     * Set the 'printOptions' element value. Print options (//print options after double slash)
     * 
     * @param printOptions
     */
    public void setPrintOptions(String printOptions) {
        this.printOptions = printOptions;
    }
}
