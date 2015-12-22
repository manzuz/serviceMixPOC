
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the number of units required
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnits_128776_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NumberOfUnitDetails_187628_C_CUS_PNRDataFeed_132" name="quantityDetails" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnits128776SCUSPNRDataFeed132
{
    private List<NumberOfUnitDetails187628CCUSPNRDataFeed132> quantityDetailList = new ArrayList<NumberOfUnitDetails187628CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'quantityDetails' element items. Information on the elements we want to count.
     * 
     * @return list
     */
    public List<NumberOfUnitDetails187628CCUSPNRDataFeed132> getQuantityDetailList() {
        return quantityDetailList;
    }

    /** 
     * Set the list of 'quantityDetails' element items. Information on the elements we want to count.
     * 
     * @param list
     */
    public void setQuantityDetailList(
            List<NumberOfUnitDetails187628CCUSPNRDataFeed132> list) {
        quantityDetailList = list;
    }
}
