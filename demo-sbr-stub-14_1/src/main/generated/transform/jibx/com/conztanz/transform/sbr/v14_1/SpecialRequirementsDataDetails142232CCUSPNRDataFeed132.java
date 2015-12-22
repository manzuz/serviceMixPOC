
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify additional requirements concerning a special request/requirement and to reference to a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDataDetails_142232_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seatCharacteristic" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDataDetails142232CCUSPNRDataFeed132
{
    private List<String> seatCharacteristicList = new ArrayList<String>();

    /** 
     * Get the list of 'seatCharacteristic' element items.
     * 
     * @return list
     */
    public List<String> getSeatCharacteristicList() {
        return seatCharacteristicList;
    }

    /** 
     * Set the list of 'seatCharacteristic' element items.
     * 
     * @param list
     */
    public void setSeatCharacteristicList(List<String> list) {
        seatCharacteristicList = list;
    }
}
