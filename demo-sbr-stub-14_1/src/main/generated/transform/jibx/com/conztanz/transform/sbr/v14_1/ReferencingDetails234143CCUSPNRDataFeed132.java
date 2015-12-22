
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To provide reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencingDetails_234143_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="value" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencingDetails234143CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal value;

    /** 
     * Get the 'type' element value. type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'value' element value. Passenger numbers  Segment numbers
     * 
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. Passenger numbers  Segment numbers
     * 
     * @param value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
