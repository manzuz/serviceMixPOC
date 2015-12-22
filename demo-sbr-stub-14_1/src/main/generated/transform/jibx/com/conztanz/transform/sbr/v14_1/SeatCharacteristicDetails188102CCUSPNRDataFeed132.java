
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identification of the characteristics of a seat on a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatCharacteristicDetails_188102_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="characteristics" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatCharacteristicDetails188102CCUSPNRDataFeed132
{
    private List<String> characteristicList = new ArrayList<String>();

    /** 
     * Get the list of 'characteristics' element items.
     * 
     * @return list
     */
    public List<String> getCharacteristicList() {
        return characteristicList;
    }

    /** 
     * Set the list of 'characteristics' element items.
     * 
     * @param list
     */
    public void setCharacteristicList(List<String> list) {
        characteristicList = list;
    }
}
