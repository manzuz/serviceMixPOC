
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the number and weight of baggage.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BaggageDetails_188140_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="freeAllowance" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="measurement" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="quantityCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="processIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BaggageDetails188140CCUSPNRDataFeed132
{
    private BigDecimal freeAllowance;
    private BigDecimal measurement;
    private String quantityCode;
    private String unitQualifier;
    private String processIndicator;

    /** 
     * Get the 'freeAllowance' element value. Number of pieces or weight
     * 
     * @return value
     */
    public BigDecimal getFreeAllowance() {
        return freeAllowance;
    }

    /** 
     * Set the 'freeAllowance' element value. Number of pieces or weight
     * 
     * @param freeAllowance
     */
    public void setFreeAllowance(BigDecimal freeAllowance) {
        this.freeAllowance = freeAllowance;
    }

    /** 
     * Get the 'measurement' element value. Measurement
     * 
     * @return value
     */
    public BigDecimal getMeasurement() {
        return measurement;
    }

    /** 
     * Set the 'measurement' element value. Measurement
     * 
     * @param measurement
     */
    public void setMeasurement(BigDecimal measurement) {
        this.measurement = measurement;
    }

    /** 
     * Get the 'quantityCode' element value. Nature of the free allowance ( Number of pieces or weight)
     * 
     * @return value
     */
    public String getQuantityCode() {
        return quantityCode;
    }

    /** 
     * Set the 'quantityCode' element value. Nature of the free allowance ( Number of pieces or weight)
     * 
     * @param quantityCode
     */
    public void setQuantityCode(String quantityCode) {
        this.quantityCode = quantityCode;
    }

    /** 
     * Get the 'unitQualifier' element value.
     * 
     * @return value
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /** 
     * Set the 'unitQualifier' element value.
     * 
     * @param unitQualifier
     */
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }

    /** 
     * Get the 'processIndicator' element value. Process indicator
     * 
     * @return value
     */
    public String getProcessIndicator() {
        return processIndicator;
    }

    /** 
     * Set the 'processIndicator' element value. Process indicator
     * 
     * @param processIndicator
     */
    public void setProcessIndicator(String processIndicator) {
        this.processIndicator = processIndicator;
    }
}
