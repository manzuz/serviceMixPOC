
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_72884_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_112974_C_CUS_PNRDataFeed_132" name="reservation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation72884SCUSPNRDataFeed132
{
    private ReservationControlInformation112974CCUSPNRDataFeed132 reservation;

    /** 
     * Get the 'reservation' element value. RESERVATION CONTROL INFORMATION
     * 
     * @return value
     */
    public ReservationControlInformation112974CCUSPNRDataFeed132 getReservation() {
        return reservation;
    }

    /** 
     * Set the 'reservation' element value. RESERVATION CONTROL INFORMATION
     * 
     * @param reservation
     */
    public void setReservation(
            ReservationControlInformation112974CCUSPNRDataFeed132 reservation) {
        this.reservation = reservation;
    }
}
