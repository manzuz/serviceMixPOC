
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the dates and times associated with a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDateTime_173492_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="departureDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="departureTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrivalDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="arrivalTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dateVariation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDateTime173492CCUSPNRDataFeed132
{
    private String departureDate;
    private BigDecimal departureTime;
    private String arrivalDate;
    private BigDecimal arrivalTime;
    private String dateVariation;

    /** 
     * Get the 'departureDate' element value.
     * 
     * @return value
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'departureDate' element value.
     * 
     * @param departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /** 
     * Get the 'departureTime' element value.
     * 
     * @return value
     */
    public BigDecimal getDepartureTime() {
        return departureTime;
    }

    /** 
     * Set the 'departureTime' element value.
     * 
     * @param departureTime
     */
    public void setDepartureTime(BigDecimal departureTime) {
        this.departureTime = departureTime;
    }

    /** 
     * Get the 'arrivalDate' element value.
     * 
     * @return value
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /** 
     * Set the 'arrivalDate' element value.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /** 
     * Get the 'arrivalTime' element value.
     * 
     * @return value
     */
    public BigDecimal getArrivalTime() {
        return arrivalTime;
    }

    /** 
     * Set the 'arrivalTime' element value.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(BigDecimal arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /** 
     * Get the 'dateVariation' element value.
     * 
     * @return value
     */
    public String getDateVariation() {
        return dateVariation;
    }

    /** 
     * Set the 'dateVariation' element value.
     * 
     * @param dateVariation
     */
    public void setDateVariation(String dateVariation) {
        this.dateVariation = dateVariation;
    }
}
