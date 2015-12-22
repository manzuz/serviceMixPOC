
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify specific data and a quantity related to the data.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataInformation_118475_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="value"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataInformation118475CCUSPNRDataFeed132
{
    private BigDecimal value;

    /** 
     * Get the 'value' element value. Actual APP approval code.  Only 4 characters are needed.
     * 
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. Actual APP approval code.  Only 4 characters are needed.
     * 
     * @param value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
