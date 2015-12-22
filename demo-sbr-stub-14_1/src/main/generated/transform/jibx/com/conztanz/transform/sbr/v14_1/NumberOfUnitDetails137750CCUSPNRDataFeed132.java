
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Identification of number of units and its purpose.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnitDetails_137750_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="numberOfUnit" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnitDetails137750CCUSPNRDataFeed132
{
    private BigDecimal numberOfUnit;
    private String unitQualifier;

    /** 
     * Get the 'numberOfUnit' element value. Group counter corresponding to passengers, and so value from 0 to 99.
     * 
     * @return value
     */
    public BigDecimal getNumberOfUnit() {
        return numberOfUnit;
    }

    /** 
     * Set the 'numberOfUnit' element value. Group counter corresponding to passengers, and so value from 0 to 99.
     * 
     * @param numberOfUnit
     */
    public void setNumberOfUnit(BigDecimal numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
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
}
