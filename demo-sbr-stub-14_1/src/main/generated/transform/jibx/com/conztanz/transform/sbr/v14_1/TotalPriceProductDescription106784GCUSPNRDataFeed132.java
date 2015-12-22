
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TotalPrice_productDescription_106784_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductIdentification_83034_S_CUS_PNRDataFeed_132" name="product"/>
 *     &lt;xs:element type="TrafficRestrictionDetails_83035_S_CUS_PNRDataFeed_132" name="productRestriction" minOccurs="0" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TotalPriceProductDescription106784GCUSPNRDataFeed132
{
    private ProductIdentification83034SCUSPNRDataFeed132 product;
    private List<TrafficRestrictionDetails83035SCUSPNRDataFeed132> productRestrictionList = new ArrayList<TrafficRestrictionDetails83035SCUSPNRDataFeed132>();

    /** 
     * Get the 'product' element value. product associated to the price item
     * 
     * @return value
     */
    public ProductIdentification83034SCUSPNRDataFeed132 getProduct() {
        return product;
    }

    /** 
     * Set the 'product' element value. product associated to the price item
     * 
     * @param product
     */
    public void setProduct(ProductIdentification83034SCUSPNRDataFeed132 product) {
        this.product = product;
    }

    /** 
     * Get the list of 'productRestriction' element items. product restrictions and attributes: route code and description, crossLondon and advanced purchase.
     * 
     * @return list
     */
    public List<TrafficRestrictionDetails83035SCUSPNRDataFeed132> getProductRestrictionList() {
        return productRestrictionList;
    }

    /** 
     * Set the list of 'productRestriction' element items. product restrictions and attributes: route code and description, crossLondon and advanced purchase.
     * 
     * @param list
     */
    public void setProductRestrictionList(
            List<TrafficRestrictionDetails83035SCUSPNRDataFeed132> list) {
        productRestrictionList = list;
    }
}
