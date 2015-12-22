
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailSeatConfiguration_63309_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seatSpace" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="coachType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatEquipment" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatPosition" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatDirection" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatDeck" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="specialPassengerType" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailSeatConfiguration63309CCUSPNRDataFeed132
{
    private String seatSpace;
    private String coachType;
    private String seatEquipment;
    private String seatPosition;
    private String seatDirection;
    private String seatDeck;
    private List<String> specialPassengerTypeList = new ArrayList<String>();

    /** 
     * Get the 'seatSpace' element value. Seat space.
     * 
     * @return value
     */
    public String getSeatSpace() {
        return seatSpace;
    }

    /** 
     * Set the 'seatSpace' element value. Seat space.
     * 
     * @param seatSpace
     */
    public void setSeatSpace(String seatSpace) {
        this.seatSpace = seatSpace;
    }

    /** 
     * Get the 'coachType' element value. Coach type.
     * 
     * @return value
     */
    public String getCoachType() {
        return coachType;
    }

    /** 
     * Set the 'coachType' element value. Coach type.
     * 
     * @param coachType
     */
    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    /** 
     * Get the 'seatEquipment' element value. Seat equipment.
     * 
     * @return value
     */
    public String getSeatEquipment() {
        return seatEquipment;
    }

    /** 
     * Set the 'seatEquipment' element value. Seat equipment.
     * 
     * @param seatEquipment
     */
    public void setSeatEquipment(String seatEquipment) {
        this.seatEquipment = seatEquipment;
    }

    /** 
     * Get the 'seatPosition' element value. Seat position.
     * 
     * @return value
     */
    public String getSeatPosition() {
        return seatPosition;
    }

    /** 
     * Set the 'seatPosition' element value. Seat position.
     * 
     * @param seatPosition
     */
    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    /** 
     * Get the 'seatDirection' element value. Seat direction.
     * 
     * @return value
     */
    public String getSeatDirection() {
        return seatDirection;
    }

    /** 
     * Set the 'seatDirection' element value. Seat direction.
     * 
     * @param seatDirection
     */
    public void setSeatDirection(String seatDirection) {
        this.seatDirection = seatDirection;
    }

    /** 
     * Get the 'seatDeck' element value. Seat deck.
     * 
     * @return value
     */
    public String getSeatDeck() {
        return seatDeck;
    }

    /** 
     * Set the 'seatDeck' element value. Seat deck.
     * 
     * @param seatDeck
     */
    public void setSeatDeck(String seatDeck) {
        this.seatDeck = seatDeck;
    }

    /** 
     * Get the list of 'specialPassengerType' element items. Special passenger information.
     * 
     * @return list
     */
    public List<String> getSpecialPassengerTypeList() {
        return specialPassengerTypeList;
    }

    /** 
     * Set the list of 'specialPassengerType' element items. Special passenger information.
     * 
     * @param list
     */
    public void setSpecialPassengerTypeList(List<String> list) {
        specialPassengerTypeList = list;
    }
}
