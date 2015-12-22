
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify additional requirements concerning a special request/requirement and to reference to a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDataDetails_117833_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seatNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatCharacteristic" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDataDetails117833CCUSPNRDataFeed132
{
    private String seatNumber;
    private List<String> seatCharacteristicList = new ArrayList<String>();

    /** 
     * Get the 'seatNumber' element value. The seat number
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'seatNumber' element value. The seat number
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /** 
     * Get the list of 'seatCharacteristic' element items. type of the seat
     * 
     * @return list
     */
    public List<String> getSeatCharacteristicList() {
        return seatCharacteristicList;
    }

    /** 
     * Set the list of 'seatCharacteristic' element items. type of the seat
     * 
     * @param list
     */
    public void setSeatCharacteristicList(List<String> list) {
        seatCharacteristicList = list;
    }
}
