
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * To indicate quantity and action required in relation to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelatedProductInformation_101070_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="statusCode" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelatedProductInformation101070SCUSPNRDataFeed132
{
    private BigDecimal quantity;
    private List<String> statusCodeList = new ArrayList<String>();

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
     * Get the list of 'statusCode' element items.
     * 
     * @return list
     */
    public List<String> getStatusCodeList() {
        return statusCodeList;
    }

    /** 
     * Set the list of 'statusCode' element items.
     * 
     * @param list
     */
    public void setStatusCodeList(List<String> list) {
        statusCodeList = list;
    }
}
