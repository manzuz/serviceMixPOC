
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To provide date and time details relative to flight movements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateAndTimeDetails_29843_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="date"/>
 *     &lt;xs:element type="xs:decimal" name="time"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateAndTimeDetails29843CCUSPNRDataFeed132
{
    private String qualifier;
    private String date;
    private BigDecimal time;

    /** 
     * Get the 'qualifier' element value. GMT time or  Local time
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. GMT time or  Local time
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'date' element value. Format is DDMMYY
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' element value. Format is DDMMYY
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Get the 'time' element value. Format is HHMM
     * 
     * @return value
     */
    public BigDecimal getTime() {
        return time;
    }

    /** 
     * Set the 'time' element value. Format is HHMM
     * 
     * @param time
     */
    public void setTime(BigDecimal time) {
        this.time = time;
    }
}
