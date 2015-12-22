
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_subscriberAddressSection_145848_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Name_128672_S_CUS_PNRDataFeed_132" name="nameDetails"/>
 *     &lt;xs:element type="Address_128671_S_CUS_PNRDataFeed_132" name="addressInfo" minOccurs="0"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_128670_S_CUS_PNRDataFeed_132" name="phoneNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupSubscriberAddressSection145848GCUSPNRDataFeed1323
{
    private Name128672SCUSPNRDataFeed132 nameDetails;
    private Address128671SCUSPNRDataFeed132 addressInfo;
    private PhoneAndEmailAddress128670SCUSPNRDataFeed132 phoneNumber;

    /** 
     * Get the 'nameDetails' element value. This segment is used to convey the contact name
     * 
     * @return value
     */
    public Name128672SCUSPNRDataFeed132 getNameDetails() {
        return nameDetails;
    }

    /** 
     * Set the 'nameDetails' element value. This segment is used to convey the contact name
     * 
     * @param nameDetails
     */
    public void setNameDetails(Name128672SCUSPNRDataFeed132 nameDetails) {
        this.nameDetails = nameDetails;
    }

    /** 
     * Get the 'addressInfo' element value. to specify the address of the subscriber
     * 
     * @return value
     */
    public Address128671SCUSPNRDataFeed132 getAddressInfo() {
        return addressInfo;
    }

    /** 
     * Set the 'addressInfo' element value. to specify the address of the subscriber
     * 
     * @param addressInfo
     */
    public void setAddressInfo(Address128671SCUSPNRDataFeed132 addressInfo) {
        this.addressInfo = addressInfo;
    }

    /** 
     * Get the 'phoneNumber' element value. Used to specify a phone number
     * 
     * @return value
     */
    public PhoneAndEmailAddress128670SCUSPNRDataFeed132 getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'phoneNumber' element value. Used to specify a phone number
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(
            PhoneAndEmailAddress128670SCUSPNRDataFeed132 phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
