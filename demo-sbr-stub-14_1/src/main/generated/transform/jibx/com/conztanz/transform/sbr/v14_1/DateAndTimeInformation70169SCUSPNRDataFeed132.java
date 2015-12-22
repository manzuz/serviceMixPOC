
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide date and time details relative to flight movements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateAndTimeInformation_70169_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DateAndTimeDetails_109402_C_CUS_PNRDataFeed_132" name="dateAndTimeDetails" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateAndTimeInformation70169SCUSPNRDataFeed132
{
    private List<DateAndTimeDetails109402CCUSPNRDataFeed132> dateAndTimeDetailList = new ArrayList<DateAndTimeDetails109402CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'dateAndTimeDetails' element items.
     * 
     * @return list
     */
    public List<DateAndTimeDetails109402CCUSPNRDataFeed132> getDateAndTimeDetailList() {
        return dateAndTimeDetailList;
    }

    /** 
     * Set the list of 'dateAndTimeDetails' element items.
     * 
     * @param list
     */
    public void setDateAndTimeDetailList(
            List<DateAndTimeDetails109402CCUSPNRDataFeed132> list) {
        dateAndTimeDetailList = list;
    }
}
