
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the Group PNR counters
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnits_91398_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NumberOfUnitDetails_137750_C_CUS_PNRDataFeed_132" name="quantityDetails" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnits91398SCUSPNRDataFeed132
{
    private List<NumberOfUnitDetails137750CCUSPNRDataFeed132> quantityDetailList = new ArrayList<NumberOfUnitDetails137750CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'quantityDetails' element items. Number of Unit Details
     * 
     * @return list
     */
    public List<NumberOfUnitDetails137750CCUSPNRDataFeed132> getQuantityDetailList() {
        return quantityDetailList;
    }

    /** 
     * Set the list of 'quantityDetails' element items. Number of Unit Details
     * 
     * @param list
     */
    public void setQuantityDetailList(
            List<NumberOfUnitDetails137750CCUSPNRDataFeed132> list) {
        quantityDetailList = list;
    }
}
