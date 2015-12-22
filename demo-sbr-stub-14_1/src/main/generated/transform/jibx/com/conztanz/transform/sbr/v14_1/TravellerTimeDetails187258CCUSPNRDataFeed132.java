
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Dates and times relevant to a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerTimeDetails_187258_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="checkInDateTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerTimeDetails187258CCUSPNRDataFeed132
{
    private BigDecimal checkInDateTime;

    /** 
     * Get the 'checkInDateTime' element value. Check in time: Format is HHMM
     * 
     * @return value
     */
    public BigDecimal getCheckInDateTime() {
        return checkInDateTime;
    }

    /** 
     * Set the 'checkInDateTime' element value. Check in time: Format is HHMM
     * 
     * @param checkInDateTime
     */
    public void setCheckInDateTime(BigDecimal checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }
}
