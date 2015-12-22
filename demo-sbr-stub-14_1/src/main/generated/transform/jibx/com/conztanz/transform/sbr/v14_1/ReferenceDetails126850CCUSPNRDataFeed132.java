
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceDetails_126850_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceDetails126850CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal number;

    /** 
     * Get the 'qualifier' element value. Shopping Basket codes : CDS Shopping Basket Distribution record CRR Shopping Basket Reservation RecordCST Shopping Basket customer DOC Shopping Basket document FAR Shopping Basket fares and fees information FFY Shopping Basket frequent flyer information FOP Shopping Basket form of payment PRD Shopping Basket product RMK Shopping Basket remark SBK Shopping Basket (used in search results)
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Shopping Basket codes : CDS Shopping Basket Distribution record CRR Shopping Basket Reservation RecordCST Shopping Basket customer DOC Shopping Basket document FAR Shopping Basket fares and fees information FFY Shopping Basket frequent flyer information FOP Shopping Basket form of payment PRD Shopping Basket product RMK Shopping Basket remark SBK Shopping Basket (used in search results)
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'number' element value. Number attributed by the Server to reference the shopping basket item.
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Number attributed by the Server to reference the shopping basket item.
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}
