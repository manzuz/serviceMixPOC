
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify specific data and a quantity related to the data.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataInformation_188173_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator"/>
 *     &lt;xs:element type="xs:decimal" name="value" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataInformation188173CCUSPNRDataFeed132
{
    private String indicator;
    private BigDecimal value;

    /** 
     * Get the 'indicator' element value. Animal type
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. Animal type
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'value' element value. Number of animals of the specified category.
     * 
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. Number of animals of the specified category.
     * 
     * @param value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
