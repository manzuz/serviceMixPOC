
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentification_83034_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductIdentificationDetails_126845_C_CUS_PNRDataFeed_132" name="productData"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentification83034SCUSPNRDataFeed132
{
    private ProductIdentificationDetails126845CCUSPNRDataFeed132 productData;

    /** 
     * Get the 'productData' element value. product name and code to which prices data apply
     * 
     * @return value
     */
    public ProductIdentificationDetails126845CCUSPNRDataFeed132 getProductData() {
        return productData;
    }

    /** 
     * Set the 'productData' element value. product name and code to which prices data apply
     * 
     * @param productData
     */
    public void setProductData(
            ProductIdentificationDetails126845CCUSPNRDataFeed132 productData) {
        this.productData = productData;
    }
}
