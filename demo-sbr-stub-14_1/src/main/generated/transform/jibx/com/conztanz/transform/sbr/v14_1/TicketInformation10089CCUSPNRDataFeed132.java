
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketInformation_10089_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator"/>
 *     &lt;xs:element type="xs:string" name="date" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="time" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="officeId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freetext" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="transactionFlag" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="electronicTicketFlag" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="airlineCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="queueNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="queueCategory" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="sitaAddress" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketInformation10089CCUSPNRDataFeed132
{
    private String indicator;
    private String date;
    private String time;
    private String officeId;
    private String freetext;
    private String transactionFlag;
    private String electronicTicketFlag;
    private String airlineCode;
    private String queueNumber;
    private String queueCategory;
    private List<String> sitaAddressList = new ArrayList<String>();

    /** 
     * Get the 'indicator' element value. Ticketing type  TL, OK, DO, IN, MA, TR, AT, PT, XL, ST, SS
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. Ticketing type  TL, OK, DO, IN, MA, TR, AT, PT, XL, ST, SS
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'date' element value. Ticketing date
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' element value. Ticketing date
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Get the 'time' element value. Ticketing time
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'time' element value. Ticketing time
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'officeId' element value. Office Id
     * 
     * @return value
     */
    public String getOfficeId() {
        return officeId;
    }

    /** 
     * Set the 'officeId' element value. Office Id
     * 
     * @param officeId
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    /** 
     * Get the 'freetext' element value. Free flow text
     * 
     * @return value
     */
    public String getFreetext() {
        return freetext;
    }

    /** 
     * Set the 'freetext' element value. Free flow text
     * 
     * @param freetext
     */
    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }

    /** 
     * Get the 'transactionFlag' element value. Air France flag (e.g. TELEPAYE for MINITEL)
     * 
     * @return value
     */
    public String getTransactionFlag() {
        return transactionFlag;
    }

    /** 
     * Set the 'transactionFlag' element value. Air France flag (e.g. TELEPAYE for MINITEL)
     * 
     * @param transactionFlag
     */
    public void setTransactionFlag(String transactionFlag) {
        this.transactionFlag = transactionFlag;
    }

    /** 
     * Get the 'electronicTicketFlag' element value. Electronic ticketing flag   ET for Electronic ticket candidate
     * 
     * @return value
     */
    public String getElectronicTicketFlag() {
        return electronicTicketFlag;
    }

    /** 
     * Set the 'electronicTicketFlag' element value. Electronic ticketing flag   ET for Electronic ticket candidate
     * 
     * @param electronicTicketFlag
     */
    public void setElectronicTicketFlag(String electronicTicketFlag) {
        this.electronicTicketFlag = electronicTicketFlag;
    }

    /** 
     * Get the 'airlineCode' element value. Airline code
     * 
     * @return value
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /** 
     * Set the 'airlineCode' element value. Airline code
     * 
     * @param airlineCode
     */
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    /** 
     * Get the 'queueNumber' element value. Queue number
     * 
     * @return value
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /** 
     * Set the 'queueNumber' element value. Queue number
     * 
     * @param queueNumber
     */
    public void setQueueNumber(String queueNumber) {
        this.queueNumber = queueNumber;
    }

    /** 
     * Get the 'queueCategory' element value. Category number
     * 
     * @return value
     */
    public String getQueueCategory() {
        return queueCategory;
    }

    /** 
     * Set the 'queueCategory' element value. Category number
     * 
     * @param queueCategory
     */
    public void setQueueCategory(String queueCategory) {
        this.queueCategory = queueCategory;
    }

    /** 
     * Get the list of 'sitaAddress' element items. SITA addresses
     * 
     * @return list
     */
    public List<String> getSitaAddressList() {
        return sitaAddressList;
    }

    /** 
     * Set the list of 'sitaAddress' element items. SITA addresses
     * 
     * @param list
     */
    public void setSitaAddressList(List<String> list) {
        sitaAddressList = list;
    }
}
