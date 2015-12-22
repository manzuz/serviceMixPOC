
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * HAND BAGGAGE DETAILS
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HandBaggageDetails_117841_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *     &lt;xs:element type="xs:decimal" name="weight" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HandBaggageDetails117841CCUSPNRDataFeed132
{
    private BigDecimal number;
    private BigDecimal weight;

    /** 
     * Get the 'number' element value. To specify the total number of Hand Baggage.
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. To specify the total number of Hand Baggage.
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /** 
     * Get the 'weight' element value. To specify the total Weight of Hand Baggage in the aircraft.
     * 
     * @return value
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /** 
     * Set the 'weight' element value. To specify the total Weight of Hand Baggage in the aircraft.
     * 
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
