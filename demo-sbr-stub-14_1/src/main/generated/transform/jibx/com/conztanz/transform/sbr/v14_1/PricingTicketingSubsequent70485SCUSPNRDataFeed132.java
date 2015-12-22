
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey additional information related to a ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingTicketingSubsequent_70485_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="mdNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingTicketingSubsequent70485SCUSPNRDataFeed132
{
    private String mdNumber;

    /** 
     * Get the 'mdNumber' element value. MD number.
     * 
     * @return value
     */
    public String getMdNumber() {
        return mdNumber;
    }

    /** 
     * Set the 'mdNumber' element value. MD number.
     * 
     * @param mdNumber
     */
    public void setMdNumber(String mdNumber) {
        this.mdNumber = mdNumber;
    }
}
