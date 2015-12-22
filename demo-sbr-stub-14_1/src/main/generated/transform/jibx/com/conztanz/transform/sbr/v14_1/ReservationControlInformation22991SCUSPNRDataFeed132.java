
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_22991_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_45344_C_CUS_PNRDataFeed_132" name="reservation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation22991SCUSPNRDataFeed132
{
    private ReservationControlInformation45344CCUSPNRDataFeed132 reservation;

    /** 
     * Get the 'reservation' element value. Reservation Information
     * 
     * @return value
     */
    public ReservationControlInformation45344CCUSPNRDataFeed132 getReservation() {
        return reservation;
    }

    /** 
     * Set the 'reservation' element value. Reservation Information
     * 
     * @param reservation
     */
    public void setReservation(
            ReservationControlInformation45344CCUSPNRDataFeed132 reservation) {
        this.reservation = reservation;
    }
}
