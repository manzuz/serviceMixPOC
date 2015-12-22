
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify a ticket number, type of ticket, and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_173487_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberOfBooklets" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dataIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="requestNotification" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inConnectionWith" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails173487CCUSPNRDataFeed132
{
    private String number;
    private String type;
    private BigDecimal numberOfBooklets;
    private String dataIndicator;
    private String requestNotification;
    private String inConnectionWith;

    /** 
     * Get the 'number' element value. provides ticket number
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. provides ticket number
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'numberOfBooklets' element value.
     * 
     * @return value
     */
    public BigDecimal getNumberOfBooklets() {
        return numberOfBooklets;
    }

    /** 
     * Set the 'numberOfBooklets' element value.
     * 
     * @param numberOfBooklets
     */
    public void setNumberOfBooklets(BigDecimal numberOfBooklets) {
        this.numberOfBooklets = numberOfBooklets;
    }

    /** 
     * Get the 'dataIndicator' element value.
     * 
     * @return value
     */
    public String getDataIndicator() {
        return dataIndicator;
    }

    /** 
     * Set the 'dataIndicator' element value.
     * 
     * @param dataIndicator
     */
    public void setDataIndicator(String dataIndicator) {
        this.dataIndicator = dataIndicator;
    }

    /** 
     * Get the 'requestNotification' element value.
     * 
     * @return value
     */
    public String getRequestNotification() {
        return requestNotification;
    }

    /** 
     * Set the 'requestNotification' element value.
     * 
     * @param requestNotification
     */
    public void setRequestNotification(String requestNotification) {
        this.requestNotification = requestNotification;
    }

    /** 
     * Get the 'inConnectionWith' element value.
     * 
     * @return value
     */
    public String getInConnectionWith() {
        return inConnectionWith;
    }

    /** 
     * Set the 'inConnectionWith' element value.
     * 
     * @param inConnectionWith
     */
    public void setInConnectionWith(String inConnectionWith) {
        this.inConnectionWith = inConnectionWith;
    }
}
