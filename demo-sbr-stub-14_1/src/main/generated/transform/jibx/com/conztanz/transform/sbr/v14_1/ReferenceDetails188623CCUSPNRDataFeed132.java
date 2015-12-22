
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceDetails_188623_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceDetails188623CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal number;

    /** 
     * Get the 'qualifier' element value. Amadeus codes: - OT for Other element (non name, non segment) Tattoo - PT for Passenger Tattoo - ST for Segment Tattoo
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Amadeus codes: - OT for Other element (non name, non segment) Tattoo - PT for Passenger Tattoo - ST for Segment Tattoo
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'number' element value. Tattoo number: it is attributed by Central System to reference the PNR segment/element
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Tattoo number: it is attributed by Central System to reference the PNR segment/element
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}
