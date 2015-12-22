
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the number of units required
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnits_121361_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NumberOfUnitDetails_177863_C_CUS_PNRDataFeed_132" name="quantityDetails" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnits121361SCUSPNRDataFeed132
{
    private List<NumberOfUnitDetails177863CCUSPNRDataFeed132> quantityDetailList = new ArrayList<NumberOfUnitDetails177863CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'quantityDetails' element items. Number of Unit Details
     * 
     * @return list
     */
    public List<NumberOfUnitDetails177863CCUSPNRDataFeed132> getQuantityDetailList() {
        return quantityDetailList;
    }

    /** 
     * Set the list of 'quantityDetails' element items. Number of Unit Details
     * 
     * @param list
     */
    public void setQuantityDetailList(
            List<NumberOfUnitDetails177863CCUSPNRDataFeed132> list) {
        quantityDetailList = list;
    }
}
