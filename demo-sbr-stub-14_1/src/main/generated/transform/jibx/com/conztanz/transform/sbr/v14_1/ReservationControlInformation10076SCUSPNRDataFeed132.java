
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_10076_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_18446_C_CUS_PNRDataFeed_132" name="reservation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation10076SCUSPNRDataFeed132
{
    private ReservationControlInformation18446CCUSPNRDataFeed132 reservation;

    /** 
     * Get the 'reservation' element value. To specify the confirmation number in case the booking was succesfull
     * 
     * @return value
     */
    public ReservationControlInformation18446CCUSPNRDataFeed132 getReservation() {
        return reservation;
    }

    /** 
     * Set the 'reservation' element value. To specify the confirmation number in case the booking was succesfull
     * 
     * @param reservation
     */
    public void setReservation(
            ReservationControlInformation18446CCUSPNRDataFeed132 reservation) {
        this.reservation = reservation;
    }
}
