
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pdx_pax_group_139173_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerInformation_76157_S_CUS_PNRDataFeed_132" name="custdata"/>
 *     &lt;xs:element type="TransportIdentifier_78651_S_CUS_PNRDataFeed_132" name="paxAirline" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_76230_S_CUS_PNRDataFeed_132" name="custDOB" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_trackingDetails_139174_G_CUS_PNRDataFeed_1321" name="trackingDetails" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_76272_S_CUS_PNRDataFeed_132" name="paxlinkId" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="CodedAttribute_76892_S_CUS_PNRDataFeed_132" name="excessBagStatus" minOccurs="0"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_76066_S_CUS_PNRDataFeed_132" name="dsd" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PdxPaxGroup139173GCUSPNRDataFeed1321
{
    private TravellerInformation76157SCUSPNRDataFeed132 custdata;
    private TransportIdentifier78651SCUSPNRDataFeed132 paxAirline;
    private StructuredDateTimeInformation76230SCUSPNRDataFeed132 custDOB;
    private StructuredBookingRecordImageTypeDataElementsMasterTrackingDetails139174GCUSPNRDataFeed1321 trackingDetails;
    private List<ReferenceInformation76272SCUSPNRDataFeed132> paxlinkIdList = new ArrayList<ReferenceInformation76272SCUSPNRDataFeed132>();
    private CodedAttribute76892SCUSPNRDataFeed132 excessBagStatus;
    private ItemReferencesAndVersions76066SCUSPNRDataFeed132 dsd;

    /** 
     * Get the 'custdata' element value. Convey generic information regarding the customer, expecially the adult/inf indicator, gender, title, age
     * 
     * @return value
     */
    public TravellerInformation76157SCUSPNRDataFeed132 getCustdata() {
        return custdata;
    }

    /** 
     * Set the 'custdata' element value. Convey generic information regarding the customer, expecially the adult/inf indicator, gender, title, age
     * 
     * @param custdata
     */
    public void setCustdata(TravellerInformation76157SCUSPNRDataFeed132 custdata) {
        this.custdata = custdata;
    }

    /** 
     * Get the 'paxAirline' element value. Airline code of the airline responsible for current pax data
     * 
     * @return value
     */
    public TransportIdentifier78651SCUSPNRDataFeed132 getPaxAirline() {
        return paxAirline;
    }

    /** 
     * Set the 'paxAirline' element value. Airline code of the airline responsible for current pax data
     * 
     * @param paxAirline
     */
    public void setPaxAirline(
            TransportIdentifier78651SCUSPNRDataFeed132 paxAirline) {
        this.paxAirline = paxAirline;
    }

    /** 
     * Get the 'custDOB' element value. Customer date of birth
     * 
     * @return value
     */
    public StructuredDateTimeInformation76230SCUSPNRDataFeed132 getCustDOB() {
        return custDOB;
    }

    /** 
     * Set the 'custDOB' element value. Customer date of birth
     * 
     * @param custDOB
     */
    public void setCustDOB(
            StructuredDateTimeInformation76230SCUSPNRDataFeed132 custDOB) {
        this.custDOB = custDOB;
    }

    /** 
     * Get the 'trackingDetails' element value. Last tracked information : - TLC : location - SDI : date and time
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeDataElementsMasterTrackingDetails139174GCUSPNRDataFeed1321 getTrackingDetails() {
        return trackingDetails;
    }

    /** 
     * Set the 'trackingDetails' element value. Last tracked information : - TLC : location - SDI : date and time
     * 
     * @param trackingDetails
     */
    public void setTrackingDetails(
            StructuredBookingRecordImageTypeDataElementsMasterTrackingDetails139174GCUSPNRDataFeed1321 trackingDetails) {
        this.trackingDetails = trackingDetails;
    }

    /** 
     * Get the list of 'paxlinkId' element items. Convey the link or sub-link ID at pax level
     * 
     * @return list
     */
    public List<ReferenceInformation76272SCUSPNRDataFeed132> getPaxlinkIdList() {
        return paxlinkIdList;
    }

    /** 
     * Set the list of 'paxlinkId' element items. Convey the link or sub-link ID at pax level
     * 
     * @param list
     */
    public void setPaxlinkIdList(
            List<ReferenceInformation76272SCUSPNRDataFeed132> list) {
        paxlinkIdList = list;
    }

    /** 
     * Get the 'excessBagStatus' element value. Excess baggage status: XSC Calculated XSM Manual Pricing Required XSP Paid XST Payment Tickets Issued XSU Unpaid XSW Waived
     * 
     * @return value
     */
    public CodedAttribute76892SCUSPNRDataFeed132 getExcessBagStatus() {
        return excessBagStatus;
    }

    /** 
     * Set the 'excessBagStatus' element value. Excess baggage status: XSC Calculated XSM Manual Pricing Required XSP Paid XST Payment Tickets Issued XSU Unpaid XSW Waived
     * 
     * @param excessBagStatus
     */
    public void setExcessBagStatus(
            CodedAttribute76892SCUSPNRDataFeed132 excessBagStatus) {
        this.excessBagStatus = excessBagStatus;
    }

    /** 
     * Get the 'dsd' element value. Passenger DCS Synchronisation Data. Provides a Master UCI to identify the PNRs merged by DCS.
     * 
     * @return value
     */
    public ItemReferencesAndVersions76066SCUSPNRDataFeed132 getDsd() {
        return dsd;
    }

    /** 
     * Set the 'dsd' element value. Passenger DCS Synchronisation Data. Provides a Master UCI to identify the PNRs merged by DCS.
     * 
     * @param dsd
     */
    public void setDsd(ItemReferencesAndVersions76066SCUSPNRDataFeed132 dsd) {
        this.dsd = dsd;
    }
}
