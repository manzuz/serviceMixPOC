
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * To indicate quantity and action required in relation to a product
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelatedProductInformation_4795_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelatedProductInformation4795SCUSPNRDataFeed132
{
    private BigDecimal quantity;
    private List<String> statuList = new ArrayList<String>();

    /** 
     * Get the 'quantity' element value. Quantity returned
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value. Quantity returned
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'status' element items. - PNR Header: padded with 1 blank - Else, Status code: Use defined code or an ATA/IATA defined action code (See AIRIMP 7.1.2/7.1.3/7.1.4/8.14.1 (as bilaterally agreed), SIPP 105.170.1.1).
     * 
     * @return list
     */
    public List<String> getStatuList() {
        return statuList;
    }

    /** 
     * Set the list of 'status' element items. - PNR Header: padded with 1 blank - Else, Status code: Use defined code or an ATA/IATA defined action code (See AIRIMP 7.1.2/7.1.3/7.1.4/8.14.1 (as bilaterally agreed), SIPP 105.170.1.1).
     * 
     * @param list
     */
    public void setStatuList(List<String> list) {
        statuList = list;
    }
}
