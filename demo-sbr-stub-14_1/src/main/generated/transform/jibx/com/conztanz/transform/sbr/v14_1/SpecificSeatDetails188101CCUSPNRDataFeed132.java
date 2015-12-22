
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identification of specific seats on a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificSeatDetails_188101_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seat" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificSeatDetails188101CCUSPNRDataFeed132
{
    private List<String> seatList = new ArrayList<String>();

    /** 
     * Get the list of 'seat' element items.
     * 
     * @return list
     */
    public List<String> getSeatList() {
        return seatList;
    }

    /** 
     * Set the list of 'seat' element items.
     * 
     * @param list
     */
    public void setSeatList(List<String> list) {
        seatList = list;
    }
}
