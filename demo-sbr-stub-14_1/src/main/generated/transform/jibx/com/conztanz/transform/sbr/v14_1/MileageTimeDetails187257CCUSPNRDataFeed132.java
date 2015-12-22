
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Information about the distance/duration of a trip.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MileageTimeDetails_187257_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="mileage" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MileageTimeDetails187257CCUSPNRDataFeed132
{
    private BigDecimal mileage;
    private String unitQualifier;

    /** 
     * Get the 'mileage' element value.
     * 
     * @return value
     */
    public BigDecimal getMileage() {
        return mileage;
    }

    /** 
     * Set the 'mileage' element value.
     * 
     * @param mileage
     */
    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    /** 
     * Get the 'unitQualifier' element value. Mileage unit
     * 
     * @return value
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /** 
     * Set the 'unitQualifier' element value. Mileage unit
     * 
     * @param unitQualifier
     */
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }
}
