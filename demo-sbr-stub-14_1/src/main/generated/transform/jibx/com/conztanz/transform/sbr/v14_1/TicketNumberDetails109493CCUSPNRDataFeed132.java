
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify a ticket number, type of ticket, and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_109493_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberOfBooklets" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dataIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="requestNotification" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails109493CCUSPNRDataFeed132
{
    private BigDecimal number;
    private String type;
    private BigDecimal numberOfBooklets;
    private String dataIndicator;
    private String requestNotification;

    /** 
     * Get the 'number' element value. contains the ticket number nnnnnnnnnn(n) i.e 1234567890 The ticket number could also contain the optional check digit
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. contains the ticket number nnnnnnnnnn(n) i.e 1234567890 The ticket number could also contain the optional check digit
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /** 
     * Get the 'type' element value. Type is composed of transaction type : T(Ticket), M(MCO), X(XSB), S(SVC)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Type is composed of transaction type : T(Ticket), M(MCO), X(XSB), S(SVC)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'numberOfBooklets' element value. used in case of conjuctive ticket for the number of booklets based on   NumberOfBooklet value = conjuctive - ticket number
     * 
     * @return value
     */
    public BigDecimal getNumberOfBooklets() {
        return numberOfBooklets;
    }

    /** 
     * Set the 'numberOfBooklets' element value. used in case of conjuctive ticket for the number of booklets based on   NumberOfBooklet value = conjuctive - ticket number
     * 
     * @param numberOfBooklets
     */
    public void setNumberOfBooklets(BigDecimal numberOfBooklets) {
        this.numberOfBooklets = numberOfBooklets;
    }

    /** 
     * Get the 'dataIndicator' element value. defines if an old or a new element !!!! FA or FHM are new FHA and FHE are old
     * 
     * @return value
     */
    public String getDataIndicator() {
        return dataIndicator;
    }

    /** 
     * Set the 'dataIndicator' element value. defines if an old or a new element !!!! FA or FHM are new FHA and FHE are old
     * 
     * @param dataIndicator
     */
    public void setDataIndicator(String dataIndicator) {
        this.dataIndicator = dataIndicator;
    }

    /** 
     * Get the 'requestNotification' element value. A-manual entry, S-automatic entry, H-data to be kept as historical
     * 
     * @return value
     */
    public String getRequestNotification() {
        return requestNotification;
    }

    /** 
     * Set the 'requestNotification' element value. A-manual entry, S-automatic entry, H-data to be kept as historical
     * 
     * @param requestNotification
     */
    public void setRequestNotification(String requestNotification) {
        this.requestNotification = requestNotification;
    }
}
