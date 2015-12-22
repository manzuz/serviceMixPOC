
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailSleeperDescription_63310_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="berthDeck" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cabinPosition" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cabinShareType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cabinOccupancy" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailSleeperDescription63310CCUSPNRDataFeed132
{
    private String berthDeck;
    private String cabinPosition;
    private String cabinShareType;
    private String cabinOccupancy;

    /** 
     * Get the 'berthDeck' element value. Berth deck
     * 
     * @return value
     */
    public String getBerthDeck() {
        return berthDeck;
    }

    /** 
     * Set the 'berthDeck' element value. Berth deck
     * 
     * @param berthDeck
     */
    public void setBerthDeck(String berthDeck) {
        this.berthDeck = berthDeck;
    }

    /** 
     * Get the 'cabinPosition' element value. Cabin position
     * 
     * @return value
     */
    public String getCabinPosition() {
        return cabinPosition;
    }

    /** 
     * Set the 'cabinPosition' element value. Cabin position
     * 
     * @param cabinPosition
     */
    public void setCabinPosition(String cabinPosition) {
        this.cabinPosition = cabinPosition;
    }

    /** 
     * Get the 'cabinShareType' element value. Cabin share type
     * 
     * @return value
     */
    public String getCabinShareType() {
        return cabinShareType;
    }

    /** 
     * Set the 'cabinShareType' element value. Cabin share type
     * 
     * @param cabinShareType
     */
    public void setCabinShareType(String cabinShareType) {
        this.cabinShareType = cabinShareType;
    }

    /** 
     * Get the 'cabinOccupancy' element value. Cabin occupancy
     * 
     * @return value
     */
    public String getCabinOccupancy() {
        return cabinOccupancy;
    }

    /** 
     * Set the 'cabinOccupancy' element value. Cabin occupancy
     * 
     * @param cabinOccupancy
     */
    public void setCabinOccupancy(String cabinOccupancy) {
        this.cabinOccupancy = cabinOccupancy;
    }
}
