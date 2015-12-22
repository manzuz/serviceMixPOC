
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryLegDescription_145705_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelProductInformation_129130_S_CUS_PNRDataFeed_132" name="sailingDetails"/>
 *     &lt;xs:element type="ShipIdentification_129129_S_CUS_PNRDataFeed_132" name="shipDescription" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_129128_S_CUS_PNRDataFeed_132" name="sailingLegCheckInInformation" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_129127_S_CUS_PNRDataFeed_132" name="passengerAssociation" minOccurs="0"/>
 *     &lt;xs:element type="FerryLegDescription_priceInfoGroup_145706_G_CUS_PNRDataFeed_132" name="priceInfoGroup" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element type="FerryLegDescription_vehicleInfoGroup_145707_G_CUS_PNRDataFeed_132" name="vehicleInfoGroup" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="FerryLegDescription_serviceInfoGroup_145708_G_CUS_PNRDataFeed_132" name="serviceInfoGroup" minOccurs="0" maxOccurs="18"/>
 *     &lt;xs:element type="FerryLegDescription_animalInfoGroup_145709_G_CUS_PNRDataFeed_132" name="animalInfoGroup" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryLegDescription145705GCUSPNRDataFeed132
{
    private TravelProductInformation129130SCUSPNRDataFeed132 sailingDetails;
    private ShipIdentification129129SCUSPNRDataFeed132 shipDescription;
    private StructuredDateTimeInformation129128SCUSPNRDataFeed132 sailingLegCheckInInformation;
    private ReferenceInformation129127SCUSPNRDataFeed132 passengerAssociation;
    private List<FerryLegDescriptionPriceInfoGroup145706GCUSPNRDataFeed132> priceInfoGroupList = new ArrayList<FerryLegDescriptionPriceInfoGroup145706GCUSPNRDataFeed132>();
    private List<FerryLegDescriptionVehicleInfoGroup145707GCUSPNRDataFeed132> vehicleInfoGroupList = new ArrayList<FerryLegDescriptionVehicleInfoGroup145707GCUSPNRDataFeed132>();
    private List<FerryLegDescriptionServiceInfoGroup145708GCUSPNRDataFeed132> serviceInfoGroupList = new ArrayList<FerryLegDescriptionServiceInfoGroup145708GCUSPNRDataFeed132>();
    private List<FerryLegDescriptionAnimalInfoGroup145709GCUSPNRDataFeed132> animalInfoGroupList = new ArrayList<FerryLegDescriptionAnimalInfoGroup145709GCUSPNRDataFeed132>();

    /** 
     * Get the 'sailingDetails' element value. Conveys the sailing details for an itinerary leg.
     * 
     * @return value
     */
    public TravelProductInformation129130SCUSPNRDataFeed132 getSailingDetails() {
        return sailingDetails;
    }

    /** 
     * Set the 'sailingDetails' element value. Conveys the sailing details for an itinerary leg.
     * 
     * @param sailingDetails
     */
    public void setSailingDetails(
            TravelProductInformation129130SCUSPNRDataFeed132 sailingDetails) {
        this.sailingDetails = sailingDetails;
    }

    /** 
     * Get the 'shipDescription' element value. Conveys the ship code and ship name.
     * 
     * @return value
     */
    public ShipIdentification129129SCUSPNRDataFeed132 getShipDescription() {
        return shipDescription;
    }

    /** 
     * Set the 'shipDescription' element value. Conveys the ship code and ship name.
     * 
     * @param shipDescription
     */
    public void setShipDescription(
            ShipIdentification129129SCUSPNRDataFeed132 shipDescription) {
        this.shipDescription = shipDescription;
    }

    /** 
     * Get the 'sailingLegCheckInInformation' element value. This segment conveys the check-in time for the ferry sailing leg to which it is attached.
     * 
     * @return value
     */
    public StructuredDateTimeInformation129128SCUSPNRDataFeed132 getSailingLegCheckInInformation() {
        return sailingLegCheckInInformation;
    }

    /** 
     * Set the 'sailingLegCheckInInformation' element value. This segment conveys the check-in time for the ferry sailing leg to which it is attached.
     * 
     * @param sailingLegCheckInInformation
     */
    public void setSailingLegCheckInInformation(
            StructuredDateTimeInformation129128SCUSPNRDataFeed132 sailingLegCheckInInformation) {
        this.sailingLegCheckInInformation = sailingLegCheckInInformation;
    }

    /** 
     * Get the 'passengerAssociation' element value. Conveys the list of passengers associated to the ferry leg.
     * 
     * @return value
     */
    public ReferenceInformation129127SCUSPNRDataFeed132 getPassengerAssociation() {
        return passengerAssociation;
    }

    /** 
     * Set the 'passengerAssociation' element value. Conveys the list of passengers associated to the ferry leg.
     * 
     * @param passengerAssociation
     */
    public void setPassengerAssociation(
            ReferenceInformation129127SCUSPNRDataFeed132 passengerAssociation) {
        this.passengerAssociation = passengerAssociation;
    }

    /** 
     * Get the list of 'priceInfoGroup' element items. Conveys the price information per leg per passenger.
     * 
     * @return list
     */
    public List<FerryLegDescriptionPriceInfoGroup145706GCUSPNRDataFeed132> getPriceInfoGroupList() {
        return priceInfoGroupList;
    }

    /** 
     * Set the list of 'priceInfoGroup' element items. Conveys the price information per leg per passenger.
     * 
     * @param list
     */
    public void setPriceInfoGroupList(
            List<FerryLegDescriptionPriceInfoGroup145706GCUSPNRDataFeed132> list) {
        priceInfoGroupList = list;
    }

    /** 
     * Get the list of 'vehicleInfoGroup' element items. This group describes the list of vehicles attached to the linked sailing leg.
     * 
     * @return list
     */
    public List<FerryLegDescriptionVehicleInfoGroup145707GCUSPNRDataFeed132> getVehicleInfoGroupList() {
        return vehicleInfoGroupList;
    }

    /** 
     * Set the list of 'vehicleInfoGroup' element items. This group describes the list of vehicles attached to the linked sailing leg.
     * 
     * @param list
     */
    public void setVehicleInfoGroupList(
            List<FerryLegDescriptionVehicleInfoGroup145707GCUSPNRDataFeed132> list) {
        vehicleInfoGroupList = list;
    }

    /** 
     * Get the list of 'serviceInfoGroup' element items. This segment describes the on-board service(s) in the linked sailing leg.
     * 
     * @return list
     */
    public List<FerryLegDescriptionServiceInfoGroup145708GCUSPNRDataFeed132> getServiceInfoGroupList() {
        return serviceInfoGroupList;
    }

    /** 
     * Set the list of 'serviceInfoGroup' element items. This segment describes the on-board service(s) in the linked sailing leg.
     * 
     * @param list
     */
    public void setServiceInfoGroupList(
            List<FerryLegDescriptionServiceInfoGroup145708GCUSPNRDataFeed132> list) {
        serviceInfoGroupList = list;
    }

    /** 
     * Get the list of 'animalInfoGroup' element items. This group is used to describe the animals linked to the ferry booking.
     * 
     * @return list
     */
    public List<FerryLegDescriptionAnimalInfoGroup145709GCUSPNRDataFeed132> getAnimalInfoGroupList() {
        return animalInfoGroupList;
    }

    /** 
     * Set the list of 'animalInfoGroup' element items. This group is used to describe the animals linked to the ferry booking.
     * 
     * @param list
     */
    public void setAnimalInfoGroupList(
            List<FerryLegDescriptionAnimalInfoGroup145709GCUSPNRDataFeed132> list) {
        animalInfoGroupList = list;
    }
}
