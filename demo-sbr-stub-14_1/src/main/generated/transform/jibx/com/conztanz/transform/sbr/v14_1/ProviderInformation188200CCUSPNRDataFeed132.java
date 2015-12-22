
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProviderInformation_188200_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="productFamilyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="producttype" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProviderInformation188200CCUSPNRDataFeed132
{
    private String code;
    private String name;
    private String productFamilyCode;
    private String producttype;

    /** 
     * Get the 'code' element value. productcode
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. productcode
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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

    /** 
     * Get the 'productFamilyCode' element value. Product Famili Code
     * 
     * @return value
     */
    public String getProductFamilyCode() {
        return productFamilyCode;
    }

    /** 
     * Set the 'productFamilyCode' element value. Product Famili Code
     * 
     * @param productFamilyCode
     */
    public void setProductFamilyCode(String productFamilyCode) {
        this.productFamilyCode = productFamilyCode;
    }

    /** 
     * Get the 'producttype' element value. To contain Insurance plan type
     * 
     * @return value
     */
    public String getProducttype() {
        return producttype;
    }

    /** 
     * Set the 'producttype' element value. To contain Insurance plan type
     * 
     * @param producttype
     */
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
}
