
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To provide reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencingDetails_256573_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencingDetails256573CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal number;

    /** 
     * Get the 'qualifier' element value.
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value.
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'number' element value.
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value.
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}
