
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a pertinent quantity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Quantity_87606_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="QuantityDetails_132916_C_CUS_PNRDataFeed_132" name="quantityDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Quantity87606SCUSPNRDataFeed132
{
    private QuantityDetails132916CCUSPNRDataFeed132 quantityDetails;

    /** 
     * Get the 'quantityDetails' element value. Estinated distance details
     * 
     * @return value
     */
    public QuantityDetails132916CCUSPNRDataFeed132 getQuantityDetails() {
        return quantityDetails;
    }

    /** 
     * Set the 'quantityDetails' element value. Estinated distance details
     * 
     * @param quantityDetails
     */
    public void setQuantityDetails(
            QuantityDetails132916CCUSPNRDataFeed132 quantityDetails) {
        this.quantityDetails = quantityDetails;
    }
}
