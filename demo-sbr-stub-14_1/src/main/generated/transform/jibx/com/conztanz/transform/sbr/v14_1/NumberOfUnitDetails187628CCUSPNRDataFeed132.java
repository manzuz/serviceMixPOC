
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Identification of number of units and its purpose.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnitDetails_187628_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="numberOfUnit" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnitDetails187628CCUSPNRDataFeed132
{
    private BigDecimal numberOfUnit;
    private String unitQualifier;

    /** 
     * Get the 'numberOfUnit' element value. Number of elements of type "unitQualifier".
     * 
     * @return value
     */
    public BigDecimal getNumberOfUnit() {
        return numberOfUnit;
    }

    /** 
     * Set the 'numberOfUnit' element value. Number of elements of type "unitQualifier".
     * 
     * @param numberOfUnit
     */
    public void setNumberOfUnit(BigDecimal numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
    }

    /** 
     * Get the 'unitQualifier' element value. Allows to indicate the kind of information we are counting: - DRI number of drivers
     * 
     * @return value
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /** 
     * Set the 'unitQualifier' element value. Allows to indicate the kind of information we are counting: - DRI number of drivers
     * 
     * @param unitQualifier
     */
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }
}
