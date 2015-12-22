
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * Option element information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OptionElementInformation_87450_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="mainOffice"/>
 *     &lt;xs:element type="xs:string" name="date" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="queue" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="category" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freetext" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherOffice" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="xs:string" name="time" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OptionElementInformation87450CCUSPNRDataFeed132
{
    private String mainOffice;
    private String date;
    private BigDecimal queue;
    private BigDecimal category;
    private String freetext;
    private List<String> otherOfficeList = new ArrayList<String>();
    private String time;

    /** 
     * Get the 'mainOffice' element value. Option element office id
     * 
     * @return value
     */
    public String getMainOffice() {
        return mainOffice;
    }

    /** 
     * Set the 'mainOffice' element value. Option element office id
     * 
     * @param mainOffice
     */
    public void setMainOffice(String mainOffice) {
        this.mainOffice = mainOffice;
    }

    /** 
     * Get the 'date' element value. Date
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' element value. Date
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Get the 'queue' element value. Queue number
     * 
     * @return value
     */
    public BigDecimal getQueue() {
        return queue;
    }

    /** 
     * Set the 'queue' element value. Queue number
     * 
     * @param queue
     */
    public void setQueue(BigDecimal queue) {
        this.queue = queue;
    }

    /** 
     * Get the 'category' element value. Category number
     * 
     * @return value
     */
    public BigDecimal getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value. Category number
     * 
     * @param category
     */
    public void setCategory(BigDecimal category) {
        this.category = category;
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
     * Get the list of 'otherOffice' element items. additional office id
     * 
     * @return list
     */
    public List<String> getOtherOfficeList() {
        return otherOfficeList;
    }

    /** 
     * Set the list of 'otherOffice' element items. additional office id
     * 
     * @param list
     */
    public void setOtherOfficeList(List<String> list) {
        otherOfficeList = list;
    }

    /** 
     * Get the 'time' element value. queuing or cancellation time
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'time' element value. queuing or cancellation time
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
