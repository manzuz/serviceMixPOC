
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Identification of number of units and its purpose.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnitDetails_188165_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="numberOfUnit"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnitDetails188165CCUSPNRDataFeed132
{
    private BigDecimal numberOfUnit;

    /** 
     * Get the 'numberOfUnit' element value.
     * 
     * @return value
     */
    public BigDecimal getNumberOfUnit() {
        return numberOfUnit;
    }

    /** 
     * Set the 'numberOfUnit' element value.
     * 
     * @param numberOfUnit
     */
    public void setNumberOfUnit(BigDecimal numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
    }
}
