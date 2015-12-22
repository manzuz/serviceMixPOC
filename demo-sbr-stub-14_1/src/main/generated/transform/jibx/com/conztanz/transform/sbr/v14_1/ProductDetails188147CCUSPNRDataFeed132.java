
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify availability and additional services for a product class.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDetails_188147_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="designator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDetails188147CCUSPNRDataFeed132
{
    private String designator;

    /** 
     * Get the 'designator' element value.
     * 
     * @return value
     */
    public String getDesignator() {
        return designator;
    }

    /** 
     * Set the 'designator' element value.
     * 
     * @param designator
     */
    public void setDesignator(String designator) {
        this.designator = designator;
    }
}
