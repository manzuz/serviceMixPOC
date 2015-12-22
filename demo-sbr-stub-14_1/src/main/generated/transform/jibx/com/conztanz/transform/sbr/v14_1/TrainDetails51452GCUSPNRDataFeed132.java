
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Group together train business data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrainDetails_51452_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TrainProductInformation_19451_S_CUS_PNRDataFeed_132" name="trainProductInfo"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_32362_S_CUS_PNRDataFeed_132" name="tripDateTime" maxOccurs="2"/>
 *     &lt;xs:element type="PlaceLocationIdentification_32347_S_CUS_PNRDataFeed_132" name="depLocation"/>
 *     &lt;xs:element type="PlaceLocationIdentification_32347_S_CUS_PNRDataFeed_132" name="arrLocation"/>
 *     &lt;xs:element type="RailLegData_51453_G_CUS_PNRDataFeed_132" name="railLeg" minOccurs="0" maxOccurs="6"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrainDetails51452GCUSPNRDataFeed132
{
    private TrainProductInformation19451SCUSPNRDataFeed132 trainProductInfo;
    private List<StructuredDateTimeInformation32362SCUSPNRDataFeed132> tripDateTimeList = new ArrayList<StructuredDateTimeInformation32362SCUSPNRDataFeed132>();
    private PlaceLocationIdentification32347SCUSPNRDataFeed132 depLocation;
    private PlaceLocationIdentification32347SCUSPNRDataFeed132 arrLocation;
    private List<RailLegData51453GCUSPNRDataFeed132> railLegList = new ArrayList<RailLegData51453GCUSPNRDataFeed132>();

    /** 
     * Get the 'trainProductInfo' element value. Information pertaining to the train product
     * 
     * @return value
     */
    public TrainProductInformation19451SCUSPNRDataFeed132 getTrainProductInfo() {
        return trainProductInfo;
    }

    /** 
     * Set the 'trainProductInfo' element value. Information pertaining to the train product
     * 
     * @param trainProductInfo
     */
    public void setTrainProductInfo(
            TrainProductInformation19451SCUSPNRDataFeed132 trainProductInfo) {
        this.trainProductInfo = trainProductInfo;
    }

    /** 
     * Get the list of 'tripDateTime' element items. Trip dates and times
     * 
     * @return list
     */
    public List<StructuredDateTimeInformation32362SCUSPNRDataFeed132> getTripDateTimeList() {
        return tripDateTimeList;
    }

    /** 
     * Set the list of 'tripDateTime' element items. Trip dates and times
     * 
     * @param list
     */
    public void setTripDateTimeList(
            List<StructuredDateTimeInformation32362SCUSPNRDataFeed132> list) {
        tripDateTimeList = list;
    }

    /** 
     * Get the 'depLocation' element value. Departure station location
     * 
     * @return value
     */
    public PlaceLocationIdentification32347SCUSPNRDataFeed132 getDepLocation() {
        return depLocation;
    }

    /** 
     * Set the 'depLocation' element value. Departure station location
     * 
     * @param depLocation
     */
    public void setDepLocation(
            PlaceLocationIdentification32347SCUSPNRDataFeed132 depLocation) {
        this.depLocation = depLocation;
    }

    /** 
     * Get the 'arrLocation' element value. Arrival station location
     * 
     * @return value
     */
    public PlaceLocationIdentification32347SCUSPNRDataFeed132 getArrLocation() {
        return arrLocation;
    }

    /** 
     * Set the 'arrLocation' element value. Arrival station location
     * 
     * @param arrLocation
     */
    public void setArrLocation(
            PlaceLocationIdentification32347SCUSPNRDataFeed132 arrLocation) {
        this.arrLocation = arrLocation;
    }

    /** 
     * Get the list of 'railLeg' element items. Rail leg (train number, train provider, departure/arrival locations and dates, reservable status)
     * 
     * @return list
     */
    public List<RailLegData51453GCUSPNRDataFeed132> getRailLegList() {
        return railLegList;
    }

    /** 
     * Set the list of 'railLeg' element items. Rail leg (train number, train provider, departure/arrival locations and dates, reservable status)
     * 
     * @param list
     */
    public void setRailLegList(List<RailLegData51453GCUSPNRDataFeed132> list) {
        railLegList = list;
    }
}
