
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * contains the data of a rail leg
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailLegData_51453_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TrainProductInformation_32331_S_CUS_PNRDataFeed_132" name="trainProductInfo"/>
 *     &lt;xs:element type="QuantityAndActionDetails_32609_S_CUS_PNRDataFeed_132" name="reservableStatus" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_32362_S_CUS_PNRDataFeed_132" name="legDateTime" maxOccurs="2"/>
 *     &lt;xs:element type="PlaceLocationIdentification_32347_S_CUS_PNRDataFeed_132" name="depLocation"/>
 *     &lt;xs:element type="PlaceLocationIdentification_32347_S_CUS_PNRDataFeed_132" name="arrLocation"/>
 *     &lt;xs:element type="ItemNumber_33258_S_CUS_PNRDataFeed_132" name="legReference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailLegData51453GCUSPNRDataFeed132
{
    private TrainProductInformation32331SCUSPNRDataFeed132 trainProductInfo;
    private QuantityAndActionDetails32609SCUSPNRDataFeed132 reservableStatus;
    private List<StructuredDateTimeInformation32362SCUSPNRDataFeed132> legDateTimeList = new ArrayList<StructuredDateTimeInformation32362SCUSPNRDataFeed132>();
    private PlaceLocationIdentification32347SCUSPNRDataFeed132 depLocation;
    private PlaceLocationIdentification32347SCUSPNRDataFeed132 arrLocation;
    private ItemNumber33258SCUSPNRDataFeed132 legReference;

    /** 
     * Get the 'trainProductInfo' element value. Information pertaining to the train product
     * 
     * @return value
     */
    public TrainProductInformation32331SCUSPNRDataFeed132 getTrainProductInfo() {
        return trainProductInfo;
    }

    /** 
     * Set the 'trainProductInfo' element value. Information pertaining to the train product
     * 
     * @param trainProductInfo
     */
    public void setTrainProductInfo(
            TrainProductInformation32331SCUSPNRDataFeed132 trainProductInfo) {
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
    public List<StructuredDateTimeInformation32362SCUSPNRDataFeed132> getLegDateTimeList() {
        return legDateTimeList;
    }

    /** 
     * Set the list of 'legDateTime' element items. Leg departure and arrival dates and times
     * 
     * @param list
     */
    public void setLegDateTimeList(
            List<StructuredDateTimeInformation32362SCUSPNRDataFeed132> list) {
        legDateTimeList = list;
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
     * Get the 'legReference' element value. leg reference: leg order within the itinerary
     * 
     * @return value
     */
    public ItemNumber33258SCUSPNRDataFeed132 getLegReference() {
        return legReference;
    }

    /** 
     * Set the 'legReference' element value. leg reference: leg order within the itinerary
     * 
     * @param legReference
     */
    public void setLegReference(ItemNumber33258SCUSPNRDataFeed132 legReference) {
        this.legReference = legReference;
    }
}
