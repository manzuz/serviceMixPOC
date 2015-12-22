
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the number and weight of baggage.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BaggageDetails_121368_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="freeAllowance" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="quantityCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BaggageDetails121368CCUSPNRDataFeed132
{
    private BigDecimal freeAllowance;
    private String quantityCode;
    private String unitQualifier;

    /** 
     * Get the 'freeAllowance' element value. Total number of units.
     * 
     * @return value
     */
    public BigDecimal getFreeAllowance() {
        return freeAllowance;
    }

    /** 
     * Set the 'freeAllowance' element value. Total number of units.
     * 
     * @param freeAllowance
     */
    public void setFreeAllowance(BigDecimal freeAllowance) {
        this.freeAllowance = freeAllowance;
    }

    /** 
     * Get the 'quantityCode' element value. Code to qualify unit as pieces or seats.
     * 
     * @return value
     */
    public String getQuantityCode() {
        return quantityCode;
    }

    /** 
     * Set the 'quantityCode' element value. Code to qualify unit as pieces or seats.
     * 
     * @param quantityCode
     */
    public void setQuantityCode(String quantityCode) {
        this.quantityCode = quantityCode;
    }

    /** 
     * Get the 'unitQualifier' element value. Code to qualify unit as pounds or kilos.
     * 
     * @return value
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /** 
     * Set the 'unitQualifier' element value. Code to qualify unit as pounds or kilos.
     * 
     * @param unitQualifier
     */
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }
}
