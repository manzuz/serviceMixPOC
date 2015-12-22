
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_subscriberAddressSection_137779_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Name_10046_S_CUS_PNRDataFeed_132" name="nameDetails"/>
 *     &lt;xs:element type="Address_10047_S_CUS_PNRDataFeed_132" name="addressInfo" minOccurs="0"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_32298_S_CUS_PNRDataFeed_132" name="phoneNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection137779GCUSPNRDataFeed1322
{
    private Name10046SCUSPNRDataFeed132 nameDetails;
    private Address10047SCUSPNRDataFeed132 addressInfo;
    private PhoneAndEmailAddress32298SCUSPNRDataFeed132 phoneNumber;

    /** 
     * Get the 'nameDetails' element value. This segment is used to convey the contact name
     * 
     * @return value
     */
    public Name10046SCUSPNRDataFeed132 getNameDetails() {
        return nameDetails;
    }

    /** 
     * Set the 'nameDetails' element value. This segment is used to convey the contact name
     * 
     * @param nameDetails
     */
    public void setNameDetails(Name10046SCUSPNRDataFeed132 nameDetails) {
        this.nameDetails = nameDetails;
    }

    /** 
     * Get the 'addressInfo' element value. to specify the address of the subscriber
     * 
     * @return value
     */
    public Address10047SCUSPNRDataFeed132 getAddressInfo() {
        return addressInfo;
    }

    /** 
     * Set the 'addressInfo' element value. to specify the address of the subscriber
     * 
     * @param addressInfo
     */
    public void setAddressInfo(Address10047SCUSPNRDataFeed132 addressInfo) {
        this.addressInfo = addressInfo;
    }

    /** 
     * Get the 'phoneNumber' element value. Used to specify a phone number
     * 
     * @return value
     */
    public PhoneAndEmailAddress32298SCUSPNRDataFeed132 getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'phoneNumber' element value. Used to specify a phone number
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(
            PhoneAndEmailAddress32298SCUSPNRDataFeed132 phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
