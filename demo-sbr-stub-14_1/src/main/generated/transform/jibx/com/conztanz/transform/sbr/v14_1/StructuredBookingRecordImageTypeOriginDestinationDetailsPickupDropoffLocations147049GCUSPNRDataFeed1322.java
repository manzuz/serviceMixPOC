
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_pickupDropoffLocations_147049_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PlaceLocationIdentification_128800_S_CUS_PNRDataFeed_132" name="locationInfo"/>
 *     &lt;xs:element type="Address_128801_S_CUS_PNRDataFeed_132" name="address" minOccurs="0"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_128774_S_CUS_PNRDataFeed_132" name="phone" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocations147049GCUSPNRDataFeed1322
{
    private PlaceLocationIdentification128800SCUSPNRDataFeed132 locationInfo;
    private Address128801SCUSPNRDataFeed132 address;
    private List<PhoneAndEmailAddress128774SCUSPNRDataFeed132> phoneList = new ArrayList<PhoneAndEmailAddress128774SCUSPNRDataFeed132>();

    /** 
     * Get the 'locationInfo' element value. Car pickup and dropoff location parameters (for Amadeus and Provider locations).
     * 
     * @return value
     */
    public PlaceLocationIdentification128800SCUSPNRDataFeed132 getLocationInfo() {
        return locationInfo;
    }

    /** 
     * Set the 'locationInfo' element value. Car pickup and dropoff location parameters (for Amadeus and Provider locations).
     * 
     * @param locationInfo
     */
    public void setLocationInfo(
            PlaceLocationIdentification128800SCUSPNRDataFeed132 locationInfo) {
        this.locationInfo = locationInfo;
    }

    /** 
     * Get the 'address' element value. Location address.
     * 
     * @return value
     */
    public Address128801SCUSPNRDataFeed132 getAddress() {
        return address;
    }

    /** 
     * Set the 'address' element value. Location address.
     * 
     * @param address
     */
    public void setAddress(Address128801SCUSPNRDataFeed132 address) {
        this.address = address;
    }

    /** 
     * Get the list of 'phone' element items. Phone or Fax number.
     * 
     * @return list
     */
    public List<PhoneAndEmailAddress128774SCUSPNRDataFeed132> getPhoneList() {
        return phoneList;
    }

    /** 
     * Set the list of 'phone' element items. Phone or Fax number.
     * 
     * @param list
     */
    public void setPhoneList(
            List<PhoneAndEmailAddress128774SCUSPNRDataFeed132> list) {
        phoneList = list;
    }
}
