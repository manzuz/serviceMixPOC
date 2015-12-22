
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey full reference for a rail seat.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailSeatReferenceInformation_37037_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SeatReferenceInformation_63313_C_CUS_PNRDataFeed_132" name="railSeatReferenceDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailSeatReferenceInformation37037SCUSPNRDataFeed132
{
    private SeatReferenceInformation63313CCUSPNRDataFeed132 railSeatReferenceDetails;

    /** 
     * Get the 'railSeatReferenceDetails' element value. Rail seat reference information.
     * 
     * @return value
     */
    public SeatReferenceInformation63313CCUSPNRDataFeed132 getRailSeatReferenceDetails() {
        return railSeatReferenceDetails;
    }

    /** 
     * Set the 'railSeatReferenceDetails' element value. Rail seat reference information.
     * 
     * @param railSeatReferenceDetails
     */
    public void setRailSeatReferenceDetails(
            SeatReferenceInformation63313CCUSPNRDataFeed132 railSeatReferenceDetails) {
        this.railSeatReferenceDetails = railSeatReferenceDetails;
    }
}
