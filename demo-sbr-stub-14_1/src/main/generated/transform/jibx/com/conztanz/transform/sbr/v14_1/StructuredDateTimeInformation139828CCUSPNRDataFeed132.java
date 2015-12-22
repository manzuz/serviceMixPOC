
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Store date and time in a structured way
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_139828_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="year" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="month" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="day" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation139828CCUSPNRDataFeed132
{
    private String year;
    private BigDecimal month;
    private BigDecimal day;

    /** 
     * Get the 'year' element value. Year number.
     * 
     * @return value
     */
    public String getYear() {
        return year;
    }

    /** 
     * Set the 'year' element value. Year number.
     * 
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /** 
     * Get the 'month' element value. Month number in the year ( begins to 1 )
     * 
     * @return value
     */
    public BigDecimal getMonth() {
        return month;
    }

    /** 
     * Set the 'month' element value. Month number in the year ( begins to 1 )
     * 
     * @param month
     */
    public void setMonth(BigDecimal month) {
        this.month = month;
    }

    /** 
     * Get the 'day' element value. Day number in the month ( begins to 1 )
     * 
     * @return value
     */
    public BigDecimal getDay() {
        return day;
    }

    /** 
     * Set the 'day' element value. Day number in the month ( begins to 1 )
     * 
     * @param day
     */
    public void setDay(BigDecimal day) {
        this.day = day;
    }
}
