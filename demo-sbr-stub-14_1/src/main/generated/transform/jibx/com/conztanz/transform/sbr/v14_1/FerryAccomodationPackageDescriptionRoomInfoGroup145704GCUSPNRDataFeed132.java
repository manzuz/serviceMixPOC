
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryAccomodationPackageDescription_roomInfoGroup_145704_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelRoom_129126_S_CUS_PNRDataFeed_132" name="roomDetailsInformation"/>
 *     &lt;xs:element type="NumberOfUnits_129120_S_CUS_PNRDataFeed_132" name="numberOfRooms" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryAccomodationPackageDescriptionRoomInfoGroup145704GCUSPNRDataFeed132
{
    private HotelRoom129126SCUSPNRDataFeed132 roomDetailsInformation;
    private NumberOfUnits129120SCUSPNRDataFeed132 numberOfRooms;

    /** 
     * Get the 'roomDetailsInformation' element value. This segment is used to describe the room to which it is attached.
     * 
     * @return value
     */
    public HotelRoom129126SCUSPNRDataFeed132 getRoomDetailsInformation() {
        return roomDetailsInformation;
    }

    /** 
     * Set the 'roomDetailsInformation' element value. This segment is used to describe the room to which it is attached.
     * 
     * @param roomDetailsInformation
     */
    public void setRoomDetailsInformation(
            HotelRoom129126SCUSPNRDataFeed132 roomDetailsInformation) {
        this.roomDetailsInformation = roomDetailsInformation;
    }

    /** 
     * Get the 'numberOfRooms' element value. This segment is used to convey the number of instances of the room to which it is attached.
     * 
     * @return value
     */
    public NumberOfUnits129120SCUSPNRDataFeed132 getNumberOfRooms() {
        return numberOfRooms;
    }

    /** 
     * Set the 'numberOfRooms' element value. This segment is used to convey the number of instances of the room to which it is attached.
     * 
     * @param numberOfRooms
     */
    public void setNumberOfRooms(
            NumberOfUnits129120SCUSPNRDataFeed132 numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
