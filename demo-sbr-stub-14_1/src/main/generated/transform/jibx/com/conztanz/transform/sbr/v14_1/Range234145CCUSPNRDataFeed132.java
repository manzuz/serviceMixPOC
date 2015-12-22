
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Range minimum and maximum limits.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Range_234145_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="min" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="max" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Range234145CCUSPNRDataFeed132
{
    private BigDecimal min;
    private BigDecimal max;

    /** 
     * Get the 'min' element value. Coupon number [MIN]
     * 
     * @return value
     */
    public BigDecimal getMin() {
        return min;
    }

    /** 
     * Set the 'min' element value. Coupon number [MIN]
     * 
     * @param min
     */
    public void setMin(BigDecimal min) {
        this.min = min;
    }

    /** 
     * Get the 'max' element value. Coupon number [MAX]
     * 
     * @return value
     */
    public BigDecimal getMax() {
        return max;
    }

    /** 
     * Set the 'max' element value. Coupon number [MAX]
     * 
     * @param max
     */
    public void setMax(BigDecimal max) {
        this.max = max;
    }
}
