
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentification_95635_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductIdentificationDetails_143527_C_CUS_PNRDataFeed_132" name="productData" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentification95635SCUSPNRDataFeed132
{
    private List<ProductIdentificationDetails143527CCUSPNRDataFeed132> productDataList = new ArrayList<ProductIdentificationDetails143527CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'productData' element items.
     * 
     * @return list
     */
    public List<ProductIdentificationDetails143527CCUSPNRDataFeed132> getProductDataList() {
        return productDataList;
    }

    /** 
     * Set the list of 'productData' element items.
     * 
     * @param list
     */
    public void setProductDataList(
            List<ProductIdentificationDetails143527CCUSPNRDataFeed132> list) {
        productDataList = list;
    }
}
