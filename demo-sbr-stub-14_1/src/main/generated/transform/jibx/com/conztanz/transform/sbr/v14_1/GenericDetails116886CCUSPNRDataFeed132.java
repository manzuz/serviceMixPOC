
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify the type of seat requested.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GenericDetails_116886_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seatCharacteristic" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GenericDetails116886CCUSPNRDataFeed132
{
    private List<String> seatCharacteristicList = new ArrayList<String>();

    /** 
     * Get the list of 'seatCharacteristic' element items. This element conveys the characteristics of the seat (up to 5 characteristics)
     * 
     * @return list
     */
    public List<String> getSeatCharacteristicList() {
        return seatCharacteristicList;
    }

    /** 
     * Set the list of 'seatCharacteristic' element items. This element conveys the characteristics of the seat (up to 5 characteristics)
     * 
     * @param list
     */
    public void setSeatCharacteristicList(List<String> list) {
        seatCharacteristicList = list;
    }
}
