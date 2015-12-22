
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify tax details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Taxes_83033_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TaxDetails_126844_C_CUS_PNRDataFeed_132" name="additionnalCharge"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Taxes83033SCUSPNRDataFeed132
{
    private TaxDetails126844CCUSPNRDataFeed132 additionnalCharge;

    /** 
     * Get the 'additionnalCharge' element value. Tax details description.
     * 
     * @return value
     */
    public TaxDetails126844CCUSPNRDataFeed132 getAdditionnalCharge() {
        return additionnalCharge;
    }

    /** 
     * Set the 'additionnalCharge' element value. Tax details description.
     * 
     * @param additionnalCharge
     */
    public void setAdditionnalCharge(
            TaxDetails126844CCUSPNRDataFeed132 additionnalCharge) {
        this.additionnalCharge = additionnalCharge;
    }
}
