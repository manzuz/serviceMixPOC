
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify outbound and inbound flight information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightDetailsQuery_94702_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OutboundCarrierDetails_142342_C_CUS_PNRDataFeed_132" name="carrierDetails"/>
 *     &lt;xs:element type="OutboundFlightNumberDetails_142343_C_CUS_PNRDataFeed_132" name="flightDetails"/>
 *     &lt;xs:element type="xs:decimal" name="departureDate"/>
 *     &lt;xs:element type="xs:string" name="boardPoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="offPoint" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FlightDetailsQuery94702SCUSPNRDataFeed132
{
    private OutboundCarrierDetails142342CCUSPNRDataFeed132 carrierDetails;
    private OutboundFlightNumberDetails142343CCUSPNRDataFeed132 flightDetails;
    private BigDecimal departureDate;
    private String boardPoint;
    private String offPoint;

    /** 
     * Get the 'carrierDetails' element value. provide information on the oncarriage flight carrier
     * 
     * @return value
     */
    public OutboundCarrierDetails142342CCUSPNRDataFeed132 getCarrierDetails() {
        return carrierDetails;
    }

    /** 
     * Set the 'carrierDetails' element value. provide information on the oncarriage flight carrier
     * 
     * @param carrierDetails
     */
    public void setCarrierDetails(
            OutboundCarrierDetails142342CCUSPNRDataFeed132 carrierDetails) {
        this.carrierDetails = carrierDetails;
    }

    /** 
     * Get the 'flightDetails' element value. Reference of the oncarriage Flight
     * 
     * @return value
     */
    public OutboundFlightNumberDetails142343CCUSPNRDataFeed132 getFlightDetails() {
        return flightDetails;
    }

    /** 
     * Set the 'flightDetails' element value. Reference of the oncarriage Flight
     * 
     * @param flightDetails
     */
    public void setFlightDetails(
            OutboundFlightNumberDetails142343CCUSPNRDataFeed132 flightDetails) {
        this.flightDetails = flightDetails;
    }

    /** 
     * Get the 'departureDate' element value. To convey the Departure Date of the Flight.
     * 
     * @return value
     */
    public BigDecimal getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'departureDate' element value. To convey the Departure Date of the Flight.
     * 
     * @param departureDate
     */
    public void setDepartureDate(BigDecimal departureDate) {
        this.departureDate = departureDate;
    }

    /** 
     * Get the 'boardPoint' element value. The port of departure code of the oncarriage flight
     * 
     * @return value
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /** 
     * Set the 'boardPoint' element value. The port of departure code of the oncarriage flight
     * 
     * @param boardPoint
     */
    public void setBoardPoint(String boardPoint) {
        this.boardPoint = boardPoint;
    }

    /** 
     * Get the 'offPoint' element value. The port of destination code of the oncarriage flight
     * 
     * @return value
     */
    public String getOffPoint() {
        return offPoint;
    }

    /** 
     * Set the 'offPoint' element value. The port of destination code of the oncarriage flight
     * 
     * @param offPoint
     */
    public void setOffPoint(String offPoint) {
        this.offPoint = offPoint;
    }
}
