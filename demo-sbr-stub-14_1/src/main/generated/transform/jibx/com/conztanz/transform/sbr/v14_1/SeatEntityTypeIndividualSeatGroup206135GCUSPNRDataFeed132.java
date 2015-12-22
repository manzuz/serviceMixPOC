
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatEntityType_individualSeatGroup_206135_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SeatRequestParameters_75321_S_CUS_PNRDataFeed_132" name="seatPassenger"/>
 *     &lt;xs:element type="StatusDetails_182613_S_CUS_PNRDataFeed_132" name="seatIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatEntityTypeIndividualSeatGroup206135GCUSPNRDataFeed132
{
    private SeatRequestParameters75321SCUSPNRDataFeed132 seatPassenger;
    private StatusDetails182613SCUSPNRDataFeed132 seatIndicator;

    /** 
     * Get the 'seatPassenger' element value.
     * 
     * @return value
     */
    public SeatRequestParameters75321SCUSPNRDataFeed132 getSeatPassenger() {
        return seatPassenger;
    }

    /** 
     * Set the 'seatPassenger' element value.
     * 
     * @param seatPassenger
     */
    public void setSeatPassenger(
            SeatRequestParameters75321SCUSPNRDataFeed132 seatPassenger) {
        this.seatPassenger = seatPassenger;
    }

    /** 
     * Get the 'seatIndicator' element value. To convey indicators at seat level( chargeable indicator, pricing mode ...)
     * 
     * @return value
     */
    public StatusDetails182613SCUSPNRDataFeed132 getSeatIndicator() {
        return seatIndicator;
    }

    /** 
     * Set the 'seatIndicator' element value. To convey indicators at seat level( chargeable indicator, pricing mode ...)
     * 
     * @param seatIndicator
     */
    public void setSeatIndicator(
            StatusDetails182613SCUSPNRDataFeed132 seatIndicator) {
        this.seatIndicator = seatIndicator;
    }
}
