
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify a reference to a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_83071_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_126899_C_CUS_PNRDataFeed_132" name="reservation" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation83071SCUSPNRDataFeed132
{
    private List<ReservationControlInformation126899CCUSPNRDataFeed132> reservationList = new ArrayList<ReservationControlInformation126899CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'reservation' element items. Cruise booking reference.
     * 
     * @return list
     */
    public List<ReservationControlInformation126899CCUSPNRDataFeed132> getReservationList() {
        return reservationList;
    }

    /** 
     * Set the list of 'reservation' element items. Cruise booking reference.
     * 
     * @param list
     */
    public void setReservationList(
            List<ReservationControlInformation126899CCUSPNRDataFeed132> list) {
        reservationList = list;
    }
}
