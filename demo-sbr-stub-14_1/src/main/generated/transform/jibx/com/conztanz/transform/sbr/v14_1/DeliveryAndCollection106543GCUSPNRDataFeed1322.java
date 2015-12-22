
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeliveryAndCollection_106543_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Address_87614_S_CUS_PNRDataFeed_132" name="addressDeliveryCollection"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_87615_S_CUS_PNRDataFeed_132" name="phoneNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DeliveryAndCollection106543GCUSPNRDataFeed1322
{
    private Address87614SCUSPNRDataFeed132 addressDeliveryCollection;
    private PhoneAndEmailAddress87615SCUSPNRDataFeed132 phoneNumber;

    /** 
     * Get the 'addressDeliveryCollection' element value. This Segment is used to Delivery and Collection information:  Format 1- (Home Collection): - Address - City - State - Country - Zip Code  Format 2- (Site Collection): - Site Ref Id - Site Name
     * 
     * @return value
     */
    public Address87614SCUSPNRDataFeed132 getAddressDeliveryCollection() {
        return addressDeliveryCollection;
    }

    /** 
     * Set the 'addressDeliveryCollection' element value. This Segment is used to Delivery and Collection information:  Format 1- (Home Collection): - Address - City - State - Country - Zip Code  Format 2- (Site Collection): - Site Ref Id - Site Name
     * 
     * @param addressDeliveryCollection
     */
    public void setAddressDeliveryCollection(
            Address87614SCUSPNRDataFeed132 addressDeliveryCollection) {
        this.addressDeliveryCollection = addressDeliveryCollection;
    }

    /** 
     * Get the 'phoneNumber' element value. This segment is used to carry phone number associated to a Delivery / Collection address
     * 
     * @return value
     */
    public PhoneAndEmailAddress87615SCUSPNRDataFeed132 getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'phoneNumber' element value. This segment is used to carry phone number associated to a Delivery / Collection address
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(
            PhoneAndEmailAddress87615SCUSPNRDataFeed132 phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
