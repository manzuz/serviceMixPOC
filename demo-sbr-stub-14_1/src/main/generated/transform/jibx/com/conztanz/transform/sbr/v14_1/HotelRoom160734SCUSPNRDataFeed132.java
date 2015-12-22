
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the hotel room information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelRoom_160734_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelRoomRateInformation_228329_C_CUS_PNRDataFeed_132" name="roomRateIdentifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="bookingCode" minOccurs="0"/>
 *     &lt;xs:element type="NumberOfUnitDetails_62859_C_CUS_PNRDataFeed_132" name="guestCountDetails"/>
 *     &lt;xs:element type="xs:string" name="roomTypeOverride" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelRoom160734SCUSPNRDataFeed132
{
    private HotelRoomRateInformation228329CCUSPNRDataFeed132 roomRateIdentifier;
    private String bookingCode;
    private NumberOfUnitDetails62859CCUSPNRDataFeed132 guestCountDetails;
    private String roomTypeOverride;

    /** 
     * Get the 'roomRateIdentifier' element value. This composite is used to convey the room rate identifier.
     * 
     * @return value
     */
    public HotelRoomRateInformation228329CCUSPNRDataFeed132 getRoomRateIdentifier() {
        return roomRateIdentifier;
    }

    /** 
     * Set the 'roomRateIdentifier' element value. This composite is used to convey the room rate identifier.
     * 
     * @param roomRateIdentifier
     */
    public void setRoomRateIdentifier(
            HotelRoomRateInformation228329CCUSPNRDataFeed132 roomRateIdentifier) {
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
     * Get the 'guestCountDetails' element value. This composite is used to convey the occupancy level of the hotel room.
     * 
     * @return value
     */
    public NumberOfUnitDetails62859CCUSPNRDataFeed132 getGuestCountDetails() {
        return guestCountDetails;
    }

    /** 
     * Set the 'guestCountDetails' element value. This composite is used to convey the occupancy level of the hotel room.
     * 
     * @param guestCountDetails
     */
    public void setGuestCountDetails(
            NumberOfUnitDetails62859CCUSPNRDataFeed132 guestCountDetails) {
        this.guestCountDetails = guestCountDetails;
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
