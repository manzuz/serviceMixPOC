
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailSeatGroup_55846_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PlaceLocationIdentification_37036_S_CUS_PNRDataFeed_132" name="boardStation"/>
 *     &lt;xs:element type="PlaceLocationIdentification_37036_S_CUS_PNRDataFeed_132" name="offStation"/>
 *     &lt;xs:element type="SpecialRequirementsDetails_37206_S_CUS_PNRDataFeed_132" name="seatRequest"/>
 *     &lt;xs:element type="RailSeatPreferences_37034_S_CUS_PNRDataFeed_132" name="seatOptions" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_seatPaxInfoGroup_55847_G_CUS_PNRDataFeed_1321" name="seatPaxInfoGroup" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailSeatGroup55846GCUSPNRDataFeed1321
{
    private PlaceLocationIdentification37036SCUSPNRDataFeed132 boardStation;
    private PlaceLocationIdentification37036SCUSPNRDataFeed132 offStation;
    private SpecialRequirementsDetails37206SCUSPNRDataFeed132 seatRequest;
    private RailSeatPreferences37034SCUSPNRDataFeed132 seatOptions;
    private List<StructuredBookingRecordImageTypeDataElementsMasterSeatPaxInfoGroup55847GCUSPNRDataFeed1321> seatPaxInfoGroupList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterSeatPaxInfoGroup55847GCUSPNRDataFeed1321>();

    /** 
     * Get the 'boardStation' element value. board station
     * 
     * @return value
     */
    public PlaceLocationIdentification37036SCUSPNRDataFeed132 getBoardStation() {
        return boardStation;
    }

    /** 
     * Set the 'boardStation' element value. board station
     * 
     * @param boardStation
     */
    public void setBoardStation(
            PlaceLocationIdentification37036SCUSPNRDataFeed132 boardStation) {
        this.boardStation = boardStation;
    }

    /** 
     * Get the 'offStation' element value. off station
     * 
     * @return value
     */
    public PlaceLocationIdentification37036SCUSPNRDataFeed132 getOffStation() {
        return offStation;
    }

    /** 
     * Set the 'offStation' element value. off station
     * 
     * @param offStation
     */
    public void setOffStation(
            PlaceLocationIdentification37036SCUSPNRDataFeed132 offStation) {
        this.offStation = offStation;
    }

    /** 
     * Get the 'seatRequest' element value. seat request
     * 
     * @return value
     */
    public SpecialRequirementsDetails37206SCUSPNRDataFeed132 getSeatRequest() {
        return seatRequest;
    }

    /** 
     * Set the 'seatRequest' element value. seat request
     * 
     * @param seatRequest
     */
    public void setSeatRequest(
            SpecialRequirementsDetails37206SCUSPNRDataFeed132 seatRequest) {
        this.seatRequest = seatRequest;
    }

    /** 
     * Get the 'seatOptions' element value. seat options (on seat or on berths)
     * 
     * @return value
     */
    public RailSeatPreferences37034SCUSPNRDataFeed132 getSeatOptions() {
        return seatOptions;
    }

    /** 
     * Set the 'seatOptions' element value. seat options (on seat or on berths)
     * 
     * @param seatOptions
     */
    public void setSeatOptions(
            RailSeatPreferences37034SCUSPNRDataFeed132 seatOptions) {
        this.seatOptions = seatOptions;
    }

    /** 
     * Get the list of 'seatPaxInfoGroup' element items. group containing seat pax information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterSeatPaxInfoGroup55847GCUSPNRDataFeed1321> getSeatPaxInfoGroupList() {
        return seatPaxInfoGroupList;
    }

    /** 
     * Set the list of 'seatPaxInfoGroup' element items. group containing seat pax information
     * 
     * @param list
     */
    public void setSeatPaxInfoGroupList(
            List<StructuredBookingRecordImageTypeDataElementsMasterSeatPaxInfoGroup55847GCUSPNRDataFeed1321> list) {
        seatPaxInfoGroupList = list;
    }
}
