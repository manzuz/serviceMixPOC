
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrainDetails_146025_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TrainProductInformation_129400_S_CUS_PNRDataFeed_132" name="trainProductInfo"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_129285_S_CUS_PNRDataFeed_132" name="tripDateTime" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="PlaceLocationIdentification_129295_S_CUS_PNRDataFeed_132" name="location" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="RailLegData_146016_G_CUS_PNRDataFeed_132" name="railLeg" minOccurs="0" maxOccurs="6"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrainDetails146025GCUSPNRDataFeed132
{
    private TrainProductInformation129400SCUSPNRDataFeed132 trainProductInfo;
    private List<StructuredDateTimeInformation129285SCUSPNRDataFeed132> tripDateTimeList = new ArrayList<StructuredDateTimeInformation129285SCUSPNRDataFeed132>();
    private List<PlaceLocationIdentification129295SCUSPNRDataFeed132> locationList = new ArrayList<PlaceLocationIdentification129295SCUSPNRDataFeed132>();
    private List<RailLegData146016GCUSPNRDataFeed132> railLegList = new ArrayList<RailLegData146016GCUSPNRDataFeed132>();

    /** 
     * Get the 'trainProductInfo' element value. Information pertaining to the train product
     * 
     * @return value
     */
    public TrainProductInformation129400SCUSPNRDataFeed132 getTrainProductInfo() {
        return trainProductInfo;
    }

    /** 
     * Set the 'trainProductInfo' element value. Information pertaining to the train product
     * 
     * @param trainProductInfo
     */
    public void setTrainProductInfo(
            TrainProductInformation129400SCUSPNRDataFeed132 trainProductInfo) {
        this.trainProductInfo = trainProductInfo;
    }

    /** 
     * Get the list of 'tripDateTime' element items. Trip dates and times
     * 
     * @return list
     */
    public List<StructuredDateTimeInformation129285SCUSPNRDataFeed132> getTripDateTimeList() {
        return tripDateTimeList;
    }

    /** 
     * Set the list of 'tripDateTime' element items. Trip dates and times
     * 
     * @param list
     */
    public void setTripDateTimeList(
            List<StructuredDateTimeInformation129285SCUSPNRDataFeed132> list) {
        tripDateTimeList = list;
    }

    /** 
     * Get the list of 'location' element items. Arrival?Departure station location
     * 
     * @return list
     */
    public List<PlaceLocationIdentification129295SCUSPNRDataFeed132> getLocationList() {
        return locationList;
    }

    /** 
     * Set the list of 'location' element items. Arrival?Departure station location
     * 
     * @param list
     */
    public void setLocationList(
            List<PlaceLocationIdentification129295SCUSPNRDataFeed132> list) {
        locationList = list;
    }

    /** 
     * Get the list of 'railLeg' element items. Rail leg (train number, train provider, departure/arrival locations and dates, reservable status)
     * 
     * @return list
     */
    public List<RailLegData146016GCUSPNRDataFeed132> getRailLegList() {
        return railLegList;
    }

    /** 
     * Set the list of 'railLeg' element items. Rail leg (train number, train provider, departure/arrival locations and dates, reservable status)
     * 
     * @param list
     */
    public void setRailLegList(List<RailLegData146016GCUSPNRDataFeed132> list) {
        railLegList = list;
    }
}
