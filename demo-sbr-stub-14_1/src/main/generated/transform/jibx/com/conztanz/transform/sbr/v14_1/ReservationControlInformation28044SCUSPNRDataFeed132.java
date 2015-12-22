
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_28044_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_50047_C_CUS_PNRDataFeed_132" name="reservation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation28044SCUSPNRDataFeed132
{
    private ReservationControlInformation50047CCUSPNRDataFeed132 reservation;

    /** 
     * Get the 'reservation' element value. record locator information
     * 
     * @return value
     */
    public ReservationControlInformation50047CCUSPNRDataFeed132 getReservation() {
        return reservation;
    }

    /** 
     * Set the 'reservation' element value. record locator information
     * 
     * @param reservation
     */
    public void setReservation(
            ReservationControlInformation50047CCUSPNRDataFeed132 reservation) {
        this.reservation = reservation;
    }
}
