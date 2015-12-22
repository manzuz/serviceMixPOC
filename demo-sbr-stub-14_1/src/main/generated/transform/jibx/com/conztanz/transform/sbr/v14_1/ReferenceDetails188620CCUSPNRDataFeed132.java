
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceDetails_188620_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceDetails188620CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal number;

    /** 
     * Get the 'qualifier' element value. Amadeus codes :  OT for Other element(non name, non segment) Tattoo   PT for Passenger Tattoo   ST for Segment Tattoo   SS for Segment Tattoo+SubTattoo  OOT Offer Other element Tattoo  OST Offer Segment Tattoo
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Amadeus codes :  OT for Other element(non name, non segment) Tattoo   PT for Passenger Tattoo   ST for Segment Tattoo   SS for Segment Tattoo+SubTattoo  OOT Offer Other element Tattoo  OST Offer Segment Tattoo
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'number' element value. Number attributed by the Server to reference the PNR segment/element Limited to the time the PNR is worked (First retrieve - End of Transaction)
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Number attributed by the Server to reference the PNR segment/element Limited to the time the PNR is worked (First retrieve - End of Transaction)
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}
