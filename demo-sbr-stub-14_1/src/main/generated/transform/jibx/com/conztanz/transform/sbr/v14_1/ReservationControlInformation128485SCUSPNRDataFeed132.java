
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify a reference to a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_128485_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_187248_C_CUS_PNRDataFeed_132" name="reservation" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation128485SCUSPNRDataFeed132
{
    private List<ReservationControlInformation187248CCUSPNRDataFeed132> reservationList = new ArrayList<ReservationControlInformation187248CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'reservation' element items. Confirmation and/or Cancellation number
     * 
     * @return list
     */
    public List<ReservationControlInformation187248CCUSPNRDataFeed132> getReservationList() {
        return reservationList;
    }

    /** 
     * Set the list of 'reservation' element items. Confirmation and/or Cancellation number
     * 
     * @param list
     */
    public void setReservationList(
            List<ReservationControlInformation187248CCUSPNRDataFeed132> list) {
        reservationList = list;
    }
}
