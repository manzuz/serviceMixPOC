
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Quantity information in a transaction, qualified when relevant.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityDetails_142179_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="value"/>
 *     &lt;xs:element type="xs:string" name="unit"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class QuantityDetails142179CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal value;
    private String unit;

    /** 
     * Get the 'qualifier' element value. it will be L for Life time period
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. it will be L for Life time period
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'value' element value. duration expressed in Seconds during the consumer has to do the payment
     * 
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. duration expressed in Seconds during the consumer has to do the payment
     * 
     * @param value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /** 
     * Get the 'unit' element value. SEC for duration in seconds
     * 
     * @return value
     */
    public String getUnit() {
        return unit;
    }

    /** 
     * Set the 'unit' element value. SEC for duration in seconds
     * 
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}