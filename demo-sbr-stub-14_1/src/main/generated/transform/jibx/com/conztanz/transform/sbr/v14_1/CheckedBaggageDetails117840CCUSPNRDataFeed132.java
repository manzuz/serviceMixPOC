
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * CHECKED BAGGAGE DETAILS
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CheckedBaggageDetails_117840_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *     &lt;xs:element type="xs:decimal" name="weight" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CheckedBaggageDetails117840CCUSPNRDataFeed132
{
    private BigDecimal number;
    private BigDecimal weight;

    /** 
     * Get the 'number' element value. To specify the total number of Hold Baggage in the aircraft.
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. To specify the total number of Hold Baggage in the aircraft.
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /** 
     * Get the 'weight' element value. To specify the total baggage weight in the aircraft
     * 
     * @return value
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /** 
     * Set the 'weight' element value. To specify the total baggage weight in the aircraft
     * 
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
