
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code, number or name to identify a specific product or service and a code to identify the level or type of product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_143527_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="productIdCharacteristic"/>
 *     &lt;xs:element type="xs:string" name="description1" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description2" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails143527CCUSPNRDataFeed132
{
    private String productIdCharacteristic;
    private String description1;
    private String description2;
    private String name;

    /** 
     * Get the 'productIdCharacteristic' element value.
     * 
     * @return value
     */
    public String getProductIdCharacteristic() {
        return productIdCharacteristic;
    }

    /** 
     * Set the 'productIdCharacteristic' element value.
     * 
     * @param productIdCharacteristic
     */
    public void setProductIdCharacteristic(String productIdCharacteristic) {
        this.productIdCharacteristic = productIdCharacteristic;
    }

    /** 
     * Get the 'description1' element value.
     * 
     * @return value
     */
    public String getDescription1() {
        return description1;
    }

    /** 
     * Set the 'description1' element value.
     * 
     * @param description1
     */
    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    /** 
     * Get the 'description2' element value.
     * 
     * @return value
     */
    public String getDescription2() {
        return description2;
    }

    /** 
     * Set the 'description2' element value.
     * 
     * @param description2
     */
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    /** 
     * Get the 'name' element value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
