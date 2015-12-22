
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify a pertinent quantity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Quantity_94558_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="QuantityDetails_142179_C_CUS_PNRDataFeed_132" name="quantityDetails" maxOccurs="20"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Quantity94558SCUSPNRDataFeed132
{
    private List<QuantityDetails142179CCUSPNRDataFeed132> quantityDetailList = new ArrayList<QuantityDetails142179CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'quantityDetails' element items. To specify an appropriate quantity.
     * 
     * @return list
     */
    public List<QuantityDetails142179CCUSPNRDataFeed132> getQuantityDetailList() {
        return quantityDetailList;
    }

    /** 
     * Set the list of 'quantityDetails' element items. To specify an appropriate quantity.
     * 
     * @param list
     */
    public void setQuantityDetailList(
            List<QuantityDetails142179CCUSPNRDataFeed132> list) {
        quantityDetailList = list;
    }
}
