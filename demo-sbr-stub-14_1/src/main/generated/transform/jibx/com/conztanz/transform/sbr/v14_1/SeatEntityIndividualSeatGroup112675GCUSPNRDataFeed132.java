
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatEntity_individualSeatGroup_112675_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SeatRequestParameters_25829_S_CUS_PNRDataFeed_132" name="seatPassenger"/>
 *     &lt;xs:element type="StatusDetails_69892_S_CUS_PNRDataFeed_132" name="seatIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatEntityIndividualSeatGroup112675GCUSPNRDataFeed132
{
    private SeatRequestParameters25829SCUSPNRDataFeed132 seatPassenger;
    private StatusDetails69892SCUSPNRDataFeed132 seatIndicator;

    /** 
     * Get the 'seatPassenger' element value. This contains the seat information per passenger: seat number and associated passenger
     * 
     * @return value
     */
    public SeatRequestParameters25829SCUSPNRDataFeed132 getSeatPassenger() {
        return seatPassenger;
    }

    /** 
     * Set the 'seatPassenger' element value. This contains the seat information per passenger: seat number and associated passenger
     * 
     * @param seatPassenger
     */
    public void setSeatPassenger(
            SeatRequestParameters25829SCUSPNRDataFeed132 seatPassenger) {
        this.seatPassenger = seatPassenger;
    }

    /** 
     * Get the 'seatIndicator' element value. Conveys the chargeable indicator status
     * 
     * @return value
     */
    public StatusDetails69892SCUSPNRDataFeed132 getSeatIndicator() {
        return seatIndicator;
    }

    /** 
     * Set the 'seatIndicator' element value. Conveys the chargeable indicator status
     * 
     * @param seatIndicator
     */
    public void setSeatIndicator(
            StatusDetails69892SCUSPNRDataFeed132 seatIndicator) {
        this.seatIndicator = seatIndicator;
    }
}
