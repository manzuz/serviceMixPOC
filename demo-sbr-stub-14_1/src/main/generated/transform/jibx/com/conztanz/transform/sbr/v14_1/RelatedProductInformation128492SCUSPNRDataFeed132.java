
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To indicate quantity and action required in relation to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelatedProductInformation_128492_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="statusCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelatedProductInformation128492SCUSPNRDataFeed132
{
    private BigDecimal quantity;
    private String statusCode;

    /** 
     * Get the 'quantity' element value.
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value.
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'statusCode' element value. EC product status code
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'statusCode' element value. EC product status code
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
