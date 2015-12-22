
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_27414_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_49124_C_CUS_PNRDataFeed_132" name="reservation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation27414SCUSPNRDataFeed132
{
    private ReservationControlInformation49124CCUSPNRDataFeed132 reservation;

    /** 
     * Get the 'reservation' element value. Identifier of the negociated space block (DBID).
     * 
     * @return value
     */
    public ReservationControlInformation49124CCUSPNRDataFeed132 getReservation() {
        return reservation;
    }

    /** 
     * Set the 'reservation' element value. Identifier of the negociated space block (DBID).
     * 
     * @param reservation
     */
    public void setReservation(
            ReservationControlInformation49124CCUSPNRDataFeed132 reservation) {
        this.reservation = reservation;
    }
}
