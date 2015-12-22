
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EcRail_147333_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelItineraryInformation_129342_S_CUS_PNRDataFeed_132" name="journeyDuration"/>
 *     &lt;xs:element type="CodedAttribute_129339_S_CUS_PNRDataFeed_132" name="keyValueTree" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="StatusDetails_129338_S_CUS_PNRDataFeed_132" name="updatePermission" minOccurs="0"/>
 *     &lt;xs:element type="TrainDetails_146025_G_CUS_PNRDataFeed_132" name="tripDetails" minOccurs="0"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_129358_S_CUS_PNRDataFeed_132" name="providerTattoo" minOccurs="0"/>
 *     &lt;xs:element type="ClassConfigurationDetails_129343_S_CUS_PNRDataFeed_132" name="classInfo"/>
 *     &lt;xs:element type="StatusDetails_129394_S_CUS_PNRDataFeed_132" name="openSegment" minOccurs="0"/>
 *     &lt;xs:element type="QuantityAndActionDetails_129346_S_CUS_PNRDataFeed_132" name="reservableStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EcRail147333GCUSPNRDataFeed1323
{
    private TravelItineraryInformation129342SCUSPNRDataFeed132 journeyDuration;
    private List<CodedAttribute129339SCUSPNRDataFeed132> keyValueTreeList = new ArrayList<CodedAttribute129339SCUSPNRDataFeed132>();
    private StatusDetails129338SCUSPNRDataFeed132 updatePermission;
    private TrainDetails146025GCUSPNRDataFeed132 tripDetails;
    private ItemReferencesAndVersions129358SCUSPNRDataFeed132 providerTattoo;
    private ClassConfigurationDetails129343SCUSPNRDataFeed132 classInfo;
    private StatusDetails129394SCUSPNRDataFeed132 openSegment;
    private QuantityAndActionDetails129346SCUSPNRDataFeed132 reservableStatus;

    /** 
     * Get the 'journeyDuration' element value. Journey direction: outward, return, single
     * 
     * @return value
     */
    public TravelItineraryInformation129342SCUSPNRDataFeed132 getJourneyDuration() {
        return journeyDuration;
    }

    /** 
     * Set the 'journeyDuration' element value. Journey direction: outward, return, single
     * 
     * @param journeyDuration
     */
    public void setJourneyDuration(
            TravelItineraryInformation129342SCUSPNRDataFeed132 journeyDuration) {
        this.journeyDuration = journeyDuration;
    }

    /** 
     * Get the list of 'keyValueTree' element items. Spare for two-level tree of key values: List of key1, [list of [key2, value]]
     * 
     * @return list
     */
    public List<CodedAttribute129339SCUSPNRDataFeed132> getKeyValueTreeList() {
        return keyValueTreeList;
    }

    /** 
     * Set the list of 'keyValueTree' element items. Spare for two-level tree of key values: List of key1, [list of [key2, value]]
     * 
     * @param list
     */
    public void setKeyValueTreeList(
            List<CodedAttribute129339SCUSPNRDataFeed132> list) {
        keyValueTreeList = list;
    }

    /** 
     * Get the 'updatePermission' element value. Indicates whether or not the reservation can be modified directly in the Amadeus system
     * 
     * @return value
     */
    public StatusDetails129338SCUSPNRDataFeed132 getUpdatePermission() {
        return updatePermission;
    }

    /** 
     * Set the 'updatePermission' element value. Indicates whether or not the reservation can be modified directly in the Amadeus system
     * 
     * @param updatePermission
     */
    public void setUpdatePermission(
            StatusDetails129338SCUSPNRDataFeed132 updatePermission) {
        this.updatePermission = updatePermission;
    }

    /** 
     * Get the 'tripDetails' element value. train number, equipment code, departure and arrival dates and times.
     * 
     * @return value
     */
    public TrainDetails146025GCUSPNRDataFeed132 getTripDetails() {
        return tripDetails;
    }

    /** 
     * Set the 'tripDetails' element value. train number, equipment code, departure and arrival dates and times.
     * 
     * @param tripDetails
     */
    public void setTripDetails(TrainDetails146025GCUSPNRDataFeed132 tripDetails) {
        this.tripDetails = tripDetails;
    }

    /** 
     * Get the 'providerTattoo' element value. Rail provider segment tattoo reference
     * 
     * @return value
     */
    public ItemReferencesAndVersions129358SCUSPNRDataFeed132 getProviderTattoo() {
        return providerTattoo;
    }

    /** 
     * Set the 'providerTattoo' element value. Rail provider segment tattoo reference
     * 
     * @param providerTattoo
     */
    public void setProviderTattoo(
            ItemReferencesAndVersions129358SCUSPNRDataFeed132 providerTattoo) {
        this.providerTattoo = providerTattoo;
    }

    /** 
     * Get the 'classInfo' element value. Information pertaining to the class of service including number of seats
     * 
     * @return value
     */
    public ClassConfigurationDetails129343SCUSPNRDataFeed132 getClassInfo() {
        return classInfo;
    }

    /** 
     * Set the 'classInfo' element value. Information pertaining to the class of service including number of seats
     * 
     * @param classInfo
     */
    public void setClassInfo(
            ClassConfigurationDetails129343SCUSPNRDataFeed132 classInfo) {
        this.classInfo = classInfo;
    }

    /** 
     * Get the 'openSegment' element value. indicate that the train segment is open.
     * 
     * @return value
     */
    public StatusDetails129394SCUSPNRDataFeed132 getOpenSegment() {
        return openSegment;
    }

    /** 
     * Set the 'openSegment' element value. indicate that the train segment is open.
     * 
     * @param openSegment
     */
    public void setOpenSegment(StatusDetails129394SCUSPNRDataFeed132 openSegment) {
        this.openSegment = openSegment;
    }

    /** 
     * Get the 'reservableStatus' element value. Reservation Mandatory, Advised, Possible, Not Possible
     * 
     * @return value
     */
    public QuantityAndActionDetails129346SCUSPNRDataFeed132 getReservableStatus() {
        return reservableStatus;
    }

    /** 
     * Set the 'reservableStatus' element value. Reservation Mandatory, Advised, Possible, Not Possible
     * 
     * @param reservableStatus
     */
    public void setReservableStatus(
            QuantityAndActionDetails129346SCUSPNRDataFeed132 reservableStatus) {
        this.reservableStatus = reservableStatus;
    }
}
