
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatReferenceInformation_63313_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="coachNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="deckNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatReferenceInformation63313CCUSPNRDataFeed132
{
    private String coachNumber;
    private String deckNumber;
    private String seatNumber;

    /** 
     * Get the 'coachNumber' element value. Coach number.
     * 
     * @return value
     */
    public String getCoachNumber() {
        return coachNumber;
    }

    /** 
     * Set the 'coachNumber' element value. Coach number.
     * 
     * @param coachNumber
     */
    public void setCoachNumber(String coachNumber) {
        this.coachNumber = coachNumber;
    }

    /** 
     * Get the 'deckNumber' element value. Deck number.
     * 
     * @return value
     */
    public String getDeckNumber() {
        return deckNumber;
    }

    /** 
     * Set the 'deckNumber' element value. Deck number.
     * 
     * @param deckNumber
     */
    public void setDeckNumber(String deckNumber) {
        this.deckNumber = deckNumber;
    }

    /** 
     * Get the 'seatNumber' element value. Seat number.
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'seatNumber' element value. Seat number.
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
