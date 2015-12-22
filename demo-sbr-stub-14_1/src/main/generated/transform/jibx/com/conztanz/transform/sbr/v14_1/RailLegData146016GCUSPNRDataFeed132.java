
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * contains the data of a rail leg
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailLegData_146016_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TrainProductInformation_129400_S_CUS_PNRDataFeed_132" name="trainProductInfo"/>
 *     &lt;xs:element type="QuantityAndActionDetails_32609_S_CUS_PNRDataFeed_132" name="reservableStatus" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_129285_S_CUS_PNRDataFeed_132" name="legDateTime" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="PlaceLocationIdentification_129295_S_CUS_PNRDataFeed_132" name="location" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="ItemNumber_83598_S_CUS_PNRDataFeed_132" name="legReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailLegData146016GCUSPNRDataFeed132
{
    private TrainProductInformation129400SCUSPNRDataFeed132 trainProductInfo;
    private QuantityAndActionDetails32609SCUSPNRDataFeed132 reservableStatus;
    private List<StructuredDateTimeInformation129285SCUSPNRDataFeed132> legDateTimeList = new ArrayList<StructuredDateTimeInformation129285SCUSPNRDataFeed132>();
    private List<PlaceLocationIdentification129295SCUSPNRDataFeed132> locationList = new ArrayList<PlaceLocationIdentification129295SCUSPNRDataFeed132>();
    private ItemNumber83598SCUSPNRDataFeed132 legReference;

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
     * Get the 'reservableStatus' element value. Reservation Mandatory, Advised, Possible, Not Possible
     * 
     * @return value
     */
    public QuantityAndActionDetails32609SCUSPNRDataFeed132 getReservableStatus() {
        return reservableStatus;
    }

    /** 
     * Set the 'reservableStatus' element value. Reservation Mandatory, Advised, Possible, Not Possible
     * 
     * @param reservableStatus
     */
    public void setReservableStatus(
            QuantityAndActionDetails32609SCUSPNRDataFeed132 reservableStatus) {
        this.reservableStatus = reservableStatus;
    }

    /** 
     * Get the list of 'legDateTime' element items. Leg departure and arrival dates and times
     * 
     * @return list
     */
    public List<StructuredDateTimeInformation129285SCUSPNRDataFeed132> getLegDateTimeList() {
        return legDateTimeList;
    }

    /** 
     * Set the list of 'legDateTime' element items. Leg departure and arrival dates and times
     * 
     * @param list
     */
    public void setLegDateTimeList(
            List<StructuredDateTimeInformation129285SCUSPNRDataFeed132> list) {
        legDateTimeList = list;
    }

    /** 
     * Get the list of 'location' element items. Departure/Arrival station location
     * 
     * @return list
     */
    public List<PlaceLocationIdentification129295SCUSPNRDataFeed132> getLocationList() {
        return locationList;
    }

    /** 
     * Set the list of 'location' element items. Departure/Arrival station location
     * 
     * @param list
     */
    public void setLocationList(
            List<PlaceLocationIdentification129295SCUSPNRDataFeed132> list) {
        locationList = list;
    }

    /** 
     * Get the 'legReference' element value. leg reference: leg order within the itinerary
     * 
     * @return value
     */
    public ItemNumber83598SCUSPNRDataFeed132 getLegReference() {
        return legReference;
    }

    /** 
     * Set the 'legReference' element value. leg reference: leg order within the itinerary
     * 
     * @param legReference
     */
    public void setLegReference(ItemNumber83598SCUSPNRDataFeed132 legReference) {
        this.legReference = legReference;
    }
}
