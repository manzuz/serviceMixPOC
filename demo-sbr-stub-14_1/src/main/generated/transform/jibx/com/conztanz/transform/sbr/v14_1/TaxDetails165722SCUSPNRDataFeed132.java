
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify details relating to tax(es).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_165722_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="taxCategory" minOccurs="0"/>
 *     &lt;xs:element type="TaxDetails_234426_C_CUS_PNRDataFeed_132" name="taxDetails" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails165722SCUSPNRDataFeed132
{
    private String taxCategory;
    private List<TaxDetails234426CCUSPNRDataFeed132> taxDetailList = new ArrayList<TaxDetails234426CCUSPNRDataFeed132>();

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
     * Get the list of 'taxDetails' element items. taxDetails
     * 
     * @return list
     */
    public List<TaxDetails234426CCUSPNRDataFeed132> getTaxDetailList() {
        return taxDetailList;
    }

    /** 
     * Set the list of 'taxDetails' element items. taxDetails
     * 
     * @param list
     */
    public void setTaxDetailList(List<TaxDetails234426CCUSPNRDataFeed132> list) {
        taxDetailList = list;
    }
}
