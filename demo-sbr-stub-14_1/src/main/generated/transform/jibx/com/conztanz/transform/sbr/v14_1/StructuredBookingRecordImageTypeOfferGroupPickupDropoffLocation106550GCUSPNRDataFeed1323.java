
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_pickupDropoffLocation_106550_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PlaceLocationIdentification_87626_S_CUS_PNRDataFeed_132" name="locationInfo"/>
 *     &lt;xs:element type="Address_87625_S_CUS_PNRDataFeed_132" name="address" minOccurs="0"/>
 *     &lt;xs:element type="StructuredPeriodInformation_87628_S_CUS_PNRDataFeed_132" name="openingHours" minOccurs="0" maxOccurs="10"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_87627_S_CUS_PNRDataFeed_132" name="phone" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupPickupDropoffLocation106550GCUSPNRDataFeed1323
{
    private PlaceLocationIdentification87626SCUSPNRDataFeed132 locationInfo;
    private Address87625SCUSPNRDataFeed132 address;
    private List<StructuredPeriodInformation87628SCUSPNRDataFeed132> openingHourList = new ArrayList<StructuredPeriodInformation87628SCUSPNRDataFeed132>();
    private List<PhoneAndEmailAddress87627SCUSPNRDataFeed132> phoneList = new ArrayList<PhoneAndEmailAddress87627SCUSPNRDataFeed132>();

    /** 
     * Get the 'locationInfo' element value. Car AVL pickup and dropoff location parameters (for Amadeus and Provider locations). Used as well to transport the Collection and Delivery place information.
     * 
     * @return value
     */
    public PlaceLocationIdentification87626SCUSPNRDataFeed132 getLocationInfo() {
        return locationInfo;
    }

    /** 
     * Set the 'locationInfo' element value. Car AVL pickup and dropoff location parameters (for Amadeus and Provider locations). Used as well to transport the Collection and Delivery place information.
     * 
     * @param locationInfo
     */
    public void setLocationInfo(
            PlaceLocationIdentification87626SCUSPNRDataFeed132 locationInfo) {
        this.locationInfo = locationInfo;
    }

    /** 
     * Get the 'address' element value. Location Address
     * 
     * @return value
     */
    public Address87625SCUSPNRDataFeed132 getAddress() {
        return address;
    }

    /** 
     * Set the 'address' element value. Location Address
     * 
     * @param address
     */
    public void setAddress(Address87625SCUSPNRDataFeed132 address) {
        this.address = address;
    }

    /** 
     * Get the list of 'openingHours' element items. Location opening hours
     * 
     * @return list
     */
    public List<StructuredPeriodInformation87628SCUSPNRDataFeed132> getOpeningHourList() {
        return openingHourList;
    }

    /** 
     * Set the list of 'openingHours' element items. Location opening hours
     * 
     * @param list
     */
    public void setOpeningHourList(
            List<StructuredPeriodInformation87628SCUSPNRDataFeed132> list) {
        openingHourList = list;
    }

    /** 
     * Get the list of 'phone' element items. Phone / Fax number
     * 
     * @return list
     */
    public List<PhoneAndEmailAddress87627SCUSPNRDataFeed132> getPhoneList() {
        return phoneList;
    }

    /** 
     * Set the list of 'phone' element items. Phone / Fax number
     * 
     * @param list
     */
    public void setPhoneList(
            List<PhoneAndEmailAddress87627SCUSPNRDataFeed132> list) {
        phoneList = list;
    }
}
