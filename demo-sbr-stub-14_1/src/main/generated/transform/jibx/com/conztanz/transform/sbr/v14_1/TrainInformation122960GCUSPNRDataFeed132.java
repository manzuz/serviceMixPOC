
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Group together rail segment business data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrainInformation_122960_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyInformation_19450_S_CUS_PNRDataFeed_132" name="companyInfo"/>
 *     &lt;xs:element type="CodedAttribute_105620_S_CUS_PNRDataFeed_132" name="keyValueTree" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element type="TrainDetails_51452_G_CUS_PNRDataFeed_132" name="tripDetails"/>
 *     &lt;xs:element type="StatusDetails_33257_S_CUS_PNRDataFeed_132" name="openSegment" minOccurs="0"/>
 *     &lt;xs:element type="TravelItineraryInformation_33275_S_CUS_PNRDataFeed_132" name="journeyDirection" minOccurs="0"/>
 *     &lt;xs:element type="ClassConfigurationDetails_20530_S_CUS_PNRDataFeed_132" name="classInfo"/>
 *     &lt;xs:element type="QuantityAndActionDetails_32609_S_CUS_PNRDataFeed_132" name="reservableStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrainInformation122960GCUSPNRDataFeed132
{
    private CompanyInformation19450SCUSPNRDataFeed132 companyInfo;
    private List<CodedAttribute105620SCUSPNRDataFeed132> keyValueTreeList = new ArrayList<CodedAttribute105620SCUSPNRDataFeed132>();
    private TrainDetails51452GCUSPNRDataFeed132 tripDetails;
    private StatusDetails33257SCUSPNRDataFeed132 openSegment;
    private TravelItineraryInformation33275SCUSPNRDataFeed132 journeyDirection;
    private ClassConfigurationDetails20530SCUSPNRDataFeed132 classInfo;
    private QuantityAndActionDetails32609SCUSPNRDataFeed132 reservableStatus;

    /** 
     * Get the 'companyInfo' element value. Information pertaining to the rail company
     * 
     * @return value
     */
    public CompanyInformation19450SCUSPNRDataFeed132 getCompanyInfo() {
        return companyInfo;
    }

    /** 
     * Set the 'companyInfo' element value. Information pertaining to the rail company
     * 
     * @param companyInfo
     */
    public void setCompanyInfo(
            CompanyInformation19450SCUSPNRDataFeed132 companyInfo) {
        this.companyInfo = companyInfo;
    }

    /** 
     * Get the list of 'keyValueTree' element items. Spare for two-level tree of key values: List of key1, [list of [key2, value]]  key1=BIL Key2= -CDC (Distribution channels/PNR Modification channel) -PDC (ProDuct Channel) -BCT (Booking  and cancellation CounT) -TCT (Ticketing CounT)
     * 
     * @return list
     */
    public List<CodedAttribute105620SCUSPNRDataFeed132> getKeyValueTreeList() {
        return keyValueTreeList;
    }

    /** 
     * Set the list of 'keyValueTree' element items. Spare for two-level tree of key values: List of key1, [list of [key2, value]]  key1=BIL Key2= -CDC (Distribution channels/PNR Modification channel) -PDC (ProDuct Channel) -BCT (Booking  and cancellation CounT) -TCT (Ticketing CounT)
     * 
     * @param list
     */
    public void setKeyValueTreeList(
            List<CodedAttribute105620SCUSPNRDataFeed132> list) {
        keyValueTreeList = list;
    }

    /** 
     * Get the 'tripDetails' element value. train number, equipment code, departure and arrival dates and times.
     * 
     * @return value
     */
    public TrainDetails51452GCUSPNRDataFeed132 getTripDetails() {
        return tripDetails;
    }

    /** 
     * Set the 'tripDetails' element value. train number, equipment code, departure and arrival dates and times.
     * 
     * @param tripDetails
     */
    public void setTripDetails(TrainDetails51452GCUSPNRDataFeed132 tripDetails) {
        this.tripDetails = tripDetails;
    }

    /** 
     * Get the 'openSegment' element value. indicate that the train segment is open.
     * 
     * @return value
     */
    public StatusDetails33257SCUSPNRDataFeed132 getOpenSegment() {
        return openSegment;
    }

    /** 
     * Set the 'openSegment' element value. indicate that the train segment is open.
     * 
     * @param openSegment
     */
    public void setOpenSegment(StatusDetails33257SCUSPNRDataFeed132 openSegment) {
        this.openSegment = openSegment;
    }

    /** 
     * Get the 'journeyDirection' element value. Journey direction: outward, return, single
     * 
     * @return value
     */
    public TravelItineraryInformation33275SCUSPNRDataFeed132 getJourneyDirection() {
        return journeyDirection;
    }

    /** 
     * Set the 'journeyDirection' element value. Journey direction: outward, return, single
     * 
     * @param journeyDirection
     */
    public void setJourneyDirection(
            TravelItineraryInformation33275SCUSPNRDataFeed132 journeyDirection) {
        this.journeyDirection = journeyDirection;
    }

    /** 
     * Get the 'classInfo' element value. Information pertaining to the class of service including number of seats
     * 
     * @return value
     */
    public ClassConfigurationDetails20530SCUSPNRDataFeed132 getClassInfo() {
        return classInfo;
    }

    /** 
     * Set the 'classInfo' element value. Information pertaining to the class of service including number of seats
     * 
     * @param classInfo
     */
    public void setClassInfo(
            ClassConfigurationDetails20530SCUSPNRDataFeed132 classInfo) {
        this.classInfo = classInfo;
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
}
