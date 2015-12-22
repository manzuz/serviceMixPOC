
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details relating to tax(es).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_79038_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="taxCategory" minOccurs="0"/>
 *     &lt;xs:element type="TaxDetails_121395_C_CUS_PNRDataFeed_132" name="taxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails79038SCUSPNRDataFeed132
{
    private String taxCategory;
    private TaxDetails121395CCUSPNRDataFeed132 taxDetails;

    /** 
     * Get the 'taxCategory' element value.
     * 
     * @return value
     */
    public String getTaxCategory() {
        return taxCategory;
    }

    /** 
     * Set the 'taxCategory' element value.
     * 
     * @param taxCategory
     */
    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }

    /** 
     * Get the 'taxDetails' element value.
     * 
     * @return value
     */
    public TaxDetails121395CCUSPNRDataFeed132 getTaxDetails() {
        return taxDetails;
    }

    /** 
     * Set the 'taxDetails' element value.
     * 
     * @param taxDetails
     */
    public void setTaxDetails(TaxDetails121395CCUSPNRDataFeed132 taxDetails) {
        this.taxDetails = taxDetails;
    }
}
