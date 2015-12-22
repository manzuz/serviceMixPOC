
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details relating to tax(es).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_79017_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="taxCategory"/>
 *     &lt;xs:element type="TaxDetails_121362_C_CUS_PNRDataFeed_132" name="taxDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails79017SCUSPNRDataFeed132
{
    private String taxCategory;
    private TaxDetails121362CCUSPNRDataFeed132 taxDetails;

    /** 
     * Get the 'taxCategory' element value. Tax category to distinct old from new taxes
     * 
     * @return value
     */
    public String getTaxCategory() {
        return taxCategory;
    }

    /** 
     * Set the 'taxCategory' element value. Tax category to distinct old from new taxes
     * 
     * @param taxCategory
     */
    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }

    /** 
     * Get the 'taxDetails' element value. Details of tax
     * 
     * @return value
     */
    public TaxDetails121362CCUSPNRDataFeed132 getTaxDetails() {
        return taxDetails;
    }

    /** 
     * Set the 'taxDetails' element value. Details of tax
     * 
     * @param taxDetails
     */
    public void setTaxDetails(TaxDetails121362CCUSPNRDataFeed132 taxDetails) {
        this.taxDetails = taxDetails;
    }
}
