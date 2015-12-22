
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_29596_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_52416_C_CUS_PNRDataFeed_132" name="reservation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation29596SCUSPNRDataFeed132
{
    private ReservationControlInformation52416CCUSPNRDataFeed132 reservation;

    /** 
     * Get the 'reservation' element value. Reservation Information
     * 
     * @return value
     */
    public ReservationControlInformation52416CCUSPNRDataFeed132 getReservation() {
        return reservation;
    }

    /** 
     * Set the 'reservation' element value. Reservation Information
     * 
     * @param reservation
     */
    public void setReservation(
            ReservationControlInformation52416CCUSPNRDataFeed132 reservation) {
        this.reservation = reservation;
    }
}
