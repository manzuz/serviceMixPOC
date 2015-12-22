
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify a ticket number, type of ticket, and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_231872_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *     &lt;xs:element type="xs:decimal" name="numberOfBooklets" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dataIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails231872CCUSPNRDataFeed132
{
    private BigDecimal number;
    private BigDecimal numberOfBooklets;
    private String dataIndicator;

    /** 
     * Get the 'number' element value. 13 Numbers = [(First 3N is Airline Code)+ (Following 10N is TKT Nr)]  14 Numbers = [(First 3N is Airline Code)+ (Following 10N is TKT Nr)+(1 Check digit)]
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. 13 Numbers = [(First 3N is Airline Code)+ (Following 10N is TKT Nr)]  14 Numbers = [(First 3N is Airline Code)+ (Following 10N is TKT Nr)+(1 Check digit)]
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /** 
     * Get the 'numberOfBooklets' element value. booklets number, number of TKT in case of conjunctive
     * 
     * @return value
     */
    public BigDecimal getNumberOfBooklets() {
        return numberOfBooklets;
    }

    /** 
     * Set the 'numberOfBooklets' element value. booklets number, number of TKT in case of conjunctive
     * 
     * @param numberOfBooklets
     */
    public void setNumberOfBooklets(BigDecimal numberOfBooklets) {
        this.numberOfBooklets = numberOfBooklets;
    }

    /** 
     * Get the 'dataIndicator' element value. tktOrgOrExch
     * 
     * @return value
     */
    public String getDataIndicator() {
        return dataIndicator;
    }

    /** 
     * Set the 'dataIndicator' element value. tktOrgOrExch
     * 
     * @param dataIndicator
     */
    public void setDataIndicator(String dataIndicator) {
        this.dataIndicator = dataIndicator;
    }
}
