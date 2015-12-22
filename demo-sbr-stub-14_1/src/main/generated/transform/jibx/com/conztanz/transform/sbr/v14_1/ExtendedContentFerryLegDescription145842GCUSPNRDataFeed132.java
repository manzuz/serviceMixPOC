
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * conveys the extended content for ferry
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedContentFerryLegDescription_145842_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CabinDescription_128773_S_CUS_PNRDataFeed_132" name="cabinDescription"/>
 *     &lt;xs:element type="Quantity_128822_S_CUS_PNRDataFeed_132" name="mileageInfo" minOccurs="0"/>
 *     &lt;xs:element type="ExtendedContentFerryLegDescription_ticketInfogroup_145843_G_CUS_PNRDataFeed_132" name="ticketInfogroup" minOccurs="0"/>
 *     &lt;xs:element type="FerryLegDescription_145705_G_CUS_PNRDataFeed_132" name="itineraryInfoGroup" minOccurs="0" maxOccurs="12"/>
 *     &lt;xs:element type="FerryAccomodationPackageDescription_145703_G_CUS_PNRDataFeed_132" name="accomodationPackageInfoGroup" minOccurs="0" maxOccurs="4"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedContentFerryLegDescription145842GCUSPNRDataFeed132
{
    private CabinDescription128773SCUSPNRDataFeed132 cabinDescription;
    private Quantity128822SCUSPNRDataFeed132 mileageInfo;
    private ExtendedContentFerryLegDescriptionTicketInfogroup145843GCUSPNRDataFeed132 ticketInfogroup;
    private List<FerryLegDescription145705GCUSPNRDataFeed132> itineraryInfoGroupList = new ArrayList<FerryLegDescription145705GCUSPNRDataFeed132>();
    private List<FerryAccomodationPackageDescription145703GCUSPNRDataFeed132> accomodationPackageInfoGroupList = new ArrayList<FerryAccomodationPackageDescription145703GCUSPNRDataFeed132>();

    /** 
     * Get the 'cabinDescription' element value. conveys the cabin description information
     * 
     * @return value
     */
    public CabinDescription128773SCUSPNRDataFeed132 getCabinDescription() {
        return cabinDescription;
    }

    /** 
     * Set the 'cabinDescription' element value. conveys the cabin description information
     * 
     * @param cabinDescription
     */
    public void setCabinDescription(
            CabinDescription128773SCUSPNRDataFeed132 cabinDescription) {
        this.cabinDescription = cabinDescription;
    }

    /** 
     * Get the 'mileageInfo' element value. conveys the information about the distance and mileage of the ferry leg
     * 
     * @return value
     */
    public Quantity128822SCUSPNRDataFeed132 getMileageInfo() {
        return mileageInfo;
    }

    /** 
     * Set the 'mileageInfo' element value. conveys the information about the distance and mileage of the ferry leg
     * 
     * @param mileageInfo
     */
    public void setMileageInfo(Quantity128822SCUSPNRDataFeed132 mileageInfo) {
        this.mileageInfo = mileageInfo;
    }

    /** 
     * Get the 'ticketInfogroup' element value. conveys the information about the ticket related to the ferry trip
     * 
     * @return value
     */
    public ExtendedContentFerryLegDescriptionTicketInfogroup145843GCUSPNRDataFeed132 getTicketInfogroup() {
        return ticketInfogroup;
    }

    /** 
     * Set the 'ticketInfogroup' element value. conveys the information about the ticket related to the ferry trip
     * 
     * @param ticketInfogroup
     */
    public void setTicketInfogroup(
            ExtendedContentFerryLegDescriptionTicketInfogroup145843GCUSPNRDataFeed132 ticketInfogroup) {
        this.ticketInfogroup = ticketInfogroup;
    }

    /** 
     * Get the list of 'itineraryInfoGroup' element items. This group describes the ferry booking itinerary. It contains the list of all the sailing legs attached to the booking.
     * 
     * @return list
     */
    public List<FerryLegDescription145705GCUSPNRDataFeed132> getItineraryInfoGroupList() {
        return itineraryInfoGroupList;
    }

    /** 
     * Set the list of 'itineraryInfoGroup' element items. This group describes the ferry booking itinerary. It contains the list of all the sailing legs attached to the booking.
     * 
     * @param list
     */
    public void setItineraryInfoGroupList(
            List<FerryLegDescription145705GCUSPNRDataFeed132> list) {
        itineraryInfoGroupList = list;
    }

    /** 
     * Get the list of 'accomodationPackageInfoGroup' element items. This group describes the accomodation (hotel) package attached to the booking.
     * 
     * @return list
     */
    public List<FerryAccomodationPackageDescription145703GCUSPNRDataFeed132> getAccomodationPackageInfoGroupList() {
        return accomodationPackageInfoGroupList;
    }

    /** 
     * Set the list of 'accomodationPackageInfoGroup' element items. This group describes the accomodation (hotel) package attached to the booking.
     * 
     * @param list
     */
    public void setAccomodationPackageInfoGroupList(
            List<FerryAccomodationPackageDescription145703GCUSPNRDataFeed132> list) {
        accomodationPackageInfoGroupList = list;
    }
}
