
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details relating to tax(es).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_70489_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="taxCategory"/>
 *     &lt;xs:element type="TaxDetails_109771_C_CUS_PNRDataFeed_132" name="taxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails70489SCUSPNRDataFeed132
{
    private String taxCategory;
    private TaxDetails109771CCUSPNRDataFeed132 taxDetails;

    /** 
     * Get the 'taxCategory' element value. New or refundable taxes.
     * 
     * @return value
     */
    public String getTaxCategory() {
        return taxCategory;
    }

    /** 
     * Set the 'taxCategory' element value. New or refundable taxes.
     * 
     * @param taxCategory
     */
    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }

    /** 
     * Get the 'taxDetails' element value. Tax value.
     * 
     * @return value
     */
    public TaxDetails109771CCUSPNRDataFeed132 getTaxDetails() {
        return taxDetails;
    }

    /** 
     * Set the 'taxDetails' element value. Tax value.
     * 
     * @param taxDetails
     */
    public void setTaxDetails(TaxDetails109771CCUSPNRDataFeed132 taxDetails) {
        this.taxDetails = taxDetails;
    }
}
