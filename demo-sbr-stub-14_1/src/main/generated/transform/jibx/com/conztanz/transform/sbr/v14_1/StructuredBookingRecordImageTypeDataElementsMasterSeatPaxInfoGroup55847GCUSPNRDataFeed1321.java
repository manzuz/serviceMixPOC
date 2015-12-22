
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_seatPaxInfoGroup_55847_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RailSeatReferenceInformation_37037_S_CUS_PNRDataFeed_132" name="railSeatNumber"/>
 *     &lt;xs:element type="ReferenceInformation_37042_S_CUS_PNRDataFeed_132" name="paxAssoc"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterSeatPaxInfoGroup55847GCUSPNRDataFeed1321
{
    private RailSeatReferenceInformation37037SCUSPNRDataFeed132 railSeatNumber;
    private ReferenceInformation37042SCUSPNRDataFeed132 paxAssoc;

    /** 
     * Get the 'railSeatNumber' element value. rail seat number
     * 
     * @return value
     */
    public RailSeatReferenceInformation37037SCUSPNRDataFeed132 getRailSeatNumber() {
        return railSeatNumber;
    }

    /** 
     * Set the 'railSeatNumber' element value. rail seat number
     * 
     * @param railSeatNumber
     */
    public void setRailSeatNumber(
            RailSeatReferenceInformation37037SCUSPNRDataFeed132 railSeatNumber) {
        this.railSeatNumber = railSeatNumber;
    }

    /** 
     * Get the 'paxAssoc' element value. pax association
     * 
     * @return value
     */
    public ReferenceInformation37042SCUSPNRDataFeed132 getPaxAssoc() {
        return paxAssoc;
    }

    /** 
     * Set the 'paxAssoc' element value. pax association
     * 
     * @param paxAssoc
     */
    public void setPaxAssoc(ReferenceInformation37042SCUSPNRDataFeed132 paxAssoc) {
        this.paxAssoc = paxAssoc;
    }
}
