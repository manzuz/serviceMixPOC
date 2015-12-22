
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Store date and time in a structured way
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_188156_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="hour" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="minutes" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation188156CCUSPNRDataFeed132
{
    private BigDecimal hour;
    private BigDecimal minutes;

    /** 
     * Get the 'hour' element value. Hour between 0 and 23
     * 
     * @return value
     */
    public BigDecimal getHour() {
        return hour;
    }

    /** 
     * Set the 'hour' element value. Hour between 0 and 23
     * 
     * @param hour
     */
    public void setHour(BigDecimal hour) {
        this.hour = hour;
    }

    /** 
     * Get the 'minutes' element value. Minutes between 0 and 59
     * 
     * @return value
     */
    public BigDecimal getMinutes() {
        return minutes;
    }

    /** 
     * Set the 'minutes' element value. Minutes between 0 and 59
     * 
     * @param minutes
     */
    public void setMinutes(BigDecimal minutes) {
        this.minutes = minutes;
    }
}
