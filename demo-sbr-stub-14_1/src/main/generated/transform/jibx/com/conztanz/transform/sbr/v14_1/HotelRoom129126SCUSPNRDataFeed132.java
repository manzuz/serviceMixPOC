
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the hotel room information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelRoom_129126_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="roomTypeOverride"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelRoom129126SCUSPNRDataFeed132
{
    private String roomTypeOverride;

    /** 
     * Get the 'roomTypeOverride' element value. This data element is used to convey the override room type (non-Amadeus room types).
     * 
     * @return value
     */
    public String getRoomTypeOverride() {
        return roomTypeOverride;
    }

    /** 
     * Set the 'roomTypeOverride' element value. This data element is used to convey the override room type (non-Amadeus room types).
     * 
     * @param roomTypeOverride
     */
    public void setRoomTypeOverride(String roomTypeOverride) {
        this.roomTypeOverride = roomTypeOverride;
    }
}
