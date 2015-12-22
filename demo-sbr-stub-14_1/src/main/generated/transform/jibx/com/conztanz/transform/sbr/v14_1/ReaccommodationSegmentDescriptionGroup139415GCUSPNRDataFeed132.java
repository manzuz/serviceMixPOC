
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to described a Segment (FROM or TO) of a given re-accommodation
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReaccommodationSegmentDescriptionGroup_139415_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_27414_S_CUS_PNRDataFeed_132" name="recordLocator"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_17940_S_CUS_PNRDataFeed_132" name="passengerIdentificationData" minOccurs="0"/>
 *     &lt;xs:element type="ElementManagementSegment_106214_S_CUS_PNRDataFeed_132" name="passengerReference" minOccurs="0"/>
 *     &lt;xs:element type="ReaccommodationSegmentDescriptionGroup_passengerBookingsAndServices_139417_G_CUS_PNRDataFeed_132" name="passengerBookingsAndServices" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ReaccommodationSegmentDescriptionGroup_passengerSeats_139416_G_CUS_PNRDataFeed_132" name="passengerSeats" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132
{
    private ReservationControlInformation27414SCUSPNRDataFeed132 recordLocator;
    private ItemReferencesAndVersions17940SCUSPNRDataFeed132 passengerIdentificationData;
    private ElementManagementSegment106214SCUSPNRDataFeed132 passengerReference;
    private List<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServices139417GCUSPNRDataFeed132> passengerBookingsAndServiceList = new ArrayList<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServices139417GCUSPNRDataFeed132>();
    private List<ReaccommodationSegmentDescriptionGroupPassengerSeats139416GCUSPNRDataFeed132> passengerSeatList = new ArrayList<ReaccommodationSegmentDescriptionGroupPassengerSeats139416GCUSPNRDataFeed132>();

    /** 
     * Get the 'recordLocator' element value.
     * 
     * @return value
     */
    public ReservationControlInformation27414SCUSPNRDataFeed132 getRecordLocator() {
        return recordLocator;
    }

    /** 
     * Set the 'recordLocator' element value.
     * 
     * @param recordLocator
     */
    public void setRecordLocator(
            ReservationControlInformation27414SCUSPNRDataFeed132 recordLocator) {
        this.recordLocator = recordLocator;
    }

    /** 
     * Get the 'passengerIdentificationData' element value.
     * 
     * @return value
     */
    public ItemReferencesAndVersions17940SCUSPNRDataFeed132 getPassengerIdentificationData() {
        return passengerIdentificationData;
    }

    /** 
     * Set the 'passengerIdentificationData' element value.
     * 
     * @param passengerIdentificationData
     */
    public void setPassengerIdentificationData(
            ItemReferencesAndVersions17940SCUSPNRDataFeed132 passengerIdentificationData) {
        this.passengerIdentificationData = passengerIdentificationData;
    }

    /** 
     * Get the 'passengerReference' element value.
     * 
     * @return value
     */
    public ElementManagementSegment106214SCUSPNRDataFeed132 getPassengerReference() {
        return passengerReference;
    }

    /** 
     * Set the 'passengerReference' element value.
     * 
     * @param passengerReference
     */
    public void setPassengerReference(
            ElementManagementSegment106214SCUSPNRDataFeed132 passengerReference) {
        this.passengerReference = passengerReference;
    }

    /** 
     * Get the list of 'passengerBookingsAndServices' element items. - As it is the same group used to described From and To Segments:  Cardinality = max(max(FROMs),max(TOs))
     * 
     * @return list
     */
    public List<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServices139417GCUSPNRDataFeed132> getPassengerBookingsAndServiceList() {
        return passengerBookingsAndServiceList;
    }

    /** 
     * Set the list of 'passengerBookingsAndServices' element items. - As it is the same group used to described From and To Segments:  Cardinality = max(max(FROMs),max(TOs))
     * 
     * @param list
     */
    public void setPassengerBookingsAndServiceList(
            List<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServices139417GCUSPNRDataFeed132> list) {
        passengerBookingsAndServiceList = list;
    }

    /** 
     * Get the list of 'passengerSeats' element items.
     * 
     * @return list
     */
    public List<ReaccommodationSegmentDescriptionGroupPassengerSeats139416GCUSPNRDataFeed132> getPassengerSeatList() {
        return passengerSeatList;
    }

    /** 
     * Set the list of 'passengerSeats' element items.
     * 
     * @param list
     */
    public void setPassengerSeatList(
            List<ReaccommodationSegmentDescriptionGroupPassengerSeats139416GCUSPNRDataFeed132> list) {
        passengerSeatList = list;
    }
}
