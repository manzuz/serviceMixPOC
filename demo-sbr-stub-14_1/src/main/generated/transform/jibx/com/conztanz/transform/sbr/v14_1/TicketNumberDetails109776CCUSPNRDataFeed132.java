
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a ticket number, type of ticket, and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_109776_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails109776CCUSPNRDataFeed132
{
    private String number;

    /** 
     * Get the 'number' element value. Number with conjunctive tickets.
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Number with conjunctive tickets.
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
