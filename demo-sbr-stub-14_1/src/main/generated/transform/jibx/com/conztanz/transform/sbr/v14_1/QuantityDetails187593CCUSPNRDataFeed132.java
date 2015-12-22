
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Quantity information in a transaction, qualified when relevant.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityDetails_187593_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="value"/>
 *     &lt;xs:element type="xs:string" name="unit" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class QuantityDetails187593CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal value;
    private String unit;

    /** 
     * Get the 'qualifier' element value. Precise the kind of Car information detailed:  -NOD Number of Doors -MOD Maximum number of Doors -NOS Number of Seats -MOD Number of Seats -NOB Number of Bags -VOB Volume of Boots
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Precise the kind of Car information detailed:  -NOD Number of Doors -MOD Maximum number of Doors -NOS Number of Seats -MOD Number of Seats -NOB Number of Bags -VOB Volume of Boots
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'value' element value. Value number corresponding to the qualifier type.
     * 
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. Value number corresponding to the qualifier type.
     * 
     * @param value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /** 
     * Get the 'unit' element value. Used to define the unit when applicable  (for the Volume of the boots) - DM3  - FT3
     * 
     * @return value
     */
    public String getUnit() {
        return unit;
    }

    /** 
     * Set the 'unit' element value. Used to define the unit when applicable  (for the Volume of the boots) - DM3  - FT3
     * 
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
