
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * This segment is used to convey the hotel room information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelRoom_129168_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelRoomRateInformation_188211_C_CUS_PNRDataFeed_132" name="roomRateIdentifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="bookingCode" minOccurs="0"/>
 *     &lt;xs:element type="NumberOfUnitDetails_188212_C_CUS_PNRDataFeed_132" name="guestCountDetails" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="xs:string" name="roomTypeOverride" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelRoom129168SCUSPNRDataFeed132
{
    private HotelRoomRateInformation188211CCUSPNRDataFeed132 roomRateIdentifier;
    private String bookingCode;
    private List<NumberOfUnitDetails188212CCUSPNRDataFeed132> guestCountDetailList = new ArrayList<NumberOfUnitDetails188212CCUSPNRDataFeed132>();
    private String roomTypeOverride;

    /** 
     * Get the 'roomRateIdentifier' element value. This composite is used to convey the room rate identifier.
     * 
     * @return value
     */
    public HotelRoomRateInformation188211CCUSPNRDataFeed132 getRoomRateIdentifier() {
        return roomRateIdentifier;
    }

    /** 
     * Set the 'roomRateIdentifier' element value. This composite is used to convey the room rate identifier.
     * 
     * @param roomRateIdentifier
     */
    public void setRoomRateIdentifier(
            HotelRoomRateInformation188211CCUSPNRDataFeed132 roomRateIdentifier) {
        this.roomRateIdentifier = roomRateIdentifier;
    }

    /** 
     * Get the 'bookingCode' element value. This data element is used to convey the booking code.
     * 
     * @return value
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /** 
     * Set the 'bookingCode' element value. This data element is used to convey the booking code.
     * 
     * @param bookingCode
     */
    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    /** 
     * Get the list of 'guestCountDetails' element items. This composite is used to convey the occupancy level of the hotel room.
     * 
     * @return list
     */
    public List<NumberOfUnitDetails188212CCUSPNRDataFeed132> getGuestCountDetailList() {
        return guestCountDetailList;
    }

    /** 
     * Set the list of 'guestCountDetails' element items. This composite is used to convey the occupancy level of the hotel room.
     * 
     * @param list
     */
    public void setGuestCountDetailList(
            List<NumberOfUnitDetails188212CCUSPNRDataFeed132> list) {
        guestCountDetailList = list;
    }

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
