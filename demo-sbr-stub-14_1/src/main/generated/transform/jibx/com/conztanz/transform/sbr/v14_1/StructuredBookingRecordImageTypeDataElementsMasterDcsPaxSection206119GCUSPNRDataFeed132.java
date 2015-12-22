
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_dcsPaxSection_206119_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PassengerFlightDetails_79585_S_CUS_PNRDataFeed_132" name="passengerFlightDetails"/>
 *     &lt;xs:element type="Pdx_pax_group_139173_G_CUS_PNRDataFeed_1321" name="dcsPaxInfo" minOccurs="0"/>
 *     &lt;xs:element type="Pdx_seg_group_139260_G_CUS_PNRDataFeed_1321" name="dcsSegmentInfo" minOccurs="0"/>
 *     &lt;xs:element type="Pdx_leg_group_139957_G_CUS_PNRDataFeed_1321" name="dcsLegInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterDcsPaxSection206119GCUSPNRDataFeed132
{
    private PassengerFlightDetails79585SCUSPNRDataFeed132 passengerFlightDetails;
    private PdxPaxGroup139173GCUSPNRDataFeed1321 dcsPaxInfo;
    private PdxSegGroup139260GCUSPNRDataFeed1321 dcsSegmentInfo;
    private PdxLegGroup139957GCUSPNRDataFeed1321 dcsLegInfo;

    /** 
     * Get the 'passengerFlightDetails' element value. The PFD is used as a trigger segment to give accurate details on DCS data information
     * 
     * @return value
     */
    public PassengerFlightDetails79585SCUSPNRDataFeed132 getPassengerFlightDetails() {
        return passengerFlightDetails;
    }

    /** 
     * Set the 'passengerFlightDetails' element value. The PFD is used as a trigger segment to give accurate details on DCS data information
     * 
     * @param passengerFlightDetails
     */
    public void setPassengerFlightDetails(
            PassengerFlightDetails79585SCUSPNRDataFeed132 passengerFlightDetails) {
        this.passengerFlightDetails = passengerFlightDetails;
    }

    /** 
     * Get the 'dcsPaxInfo' element value. Conveys the DCS data at Passenger level.  Up to 198 repetitions (99 pax + 99 infants)
     * 
     * @return value
     */
    public PdxPaxGroup139173GCUSPNRDataFeed1321 getDcsPaxInfo() {
        return dcsPaxInfo;
    }

    /** 
     * Set the 'dcsPaxInfo' element value. Conveys the DCS data at Passenger level.  Up to 198 repetitions (99 pax + 99 infants)
     * 
     * @param dcsPaxInfo
     */
    public void setDcsPaxInfo(PdxPaxGroup139173GCUSPNRDataFeed1321 dcsPaxInfo) {
        this.dcsPaxInfo = dcsPaxInfo;
    }

    /** 
     * Get the 'dcsSegmentInfo' element value.
     * 
     * @return value
     */
    public PdxSegGroup139260GCUSPNRDataFeed1321 getDcsSegmentInfo() {
        return dcsSegmentInfo;
    }

    /** 
     * Set the 'dcsSegmentInfo' element value.
     * 
     * @param dcsSegmentInfo
     */
    public void setDcsSegmentInfo(
            PdxSegGroup139260GCUSPNRDataFeed1321 dcsSegmentInfo) {
        this.dcsSegmentInfo = dcsSegmentInfo;
    }

    /** 
     * Get the 'dcsLegInfo' element value. Conveys the DCS info at leg level.  Up to 76418 repetitions (9 legs * 99 segments * 198 pax)
     * 
     * @return value
     */
    public PdxLegGroup139957GCUSPNRDataFeed1321 getDcsLegInfo() {
        return dcsLegInfo;
    }

    /** 
     * Set the 'dcsLegInfo' element value. Conveys the DCS info at leg level.  Up to 76418 repetitions (9 legs * 99 segments * 198 pax)
     * 
     * @param dcsLegInfo
     */
    public void setDcsLegInfo(PdxLegGroup139957GCUSPNRDataFeed1321 dcsLegInfo) {
        this.dcsLegInfo = dcsLegInfo;
    }
}
