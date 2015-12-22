
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey pricing and date information related to a ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingTicketingDetails_71674_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="idNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingTicketingDetails71674SCUSPNRDataFeed132
{
    private String idNumber;

    /** 
     * Get the 'idNumber' element value. Id Number - empty
     * 
     * @return value
     */
    public String getIdNumber() {
        return idNumber;
    }

    /** 
     * Set the 'idNumber' element value. Id Number - empty
     * 
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
