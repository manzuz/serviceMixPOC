
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_contactDetails_145847_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MiscellaneousRemarks_128669_S_CUS_PNRDataFeed_132" name="miscelaneous"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_128670_S_CUS_PNRDataFeed_132" name="phoneNumber" minOccurs="0"/>
 *     &lt;xs:element type="TravellerInformation_128664_S_CUS_PNRDataFeed_132" name="contactName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails145847GCUSPNRDataFeed1322
{
    private MiscellaneousRemarks128669SCUSPNRDataFeed132 miscelaneous;
    private PhoneAndEmailAddress128670SCUSPNRDataFeed132 phoneNumber;
    private TravellerInformation128664SCUSPNRDataFeed132 contactName;

    /** 
     * Get the 'miscelaneous' element value. data to add some comments on the insurance element
     * 
     * @return value
     */
    public MiscellaneousRemarks128669SCUSPNRDataFeed132 getMiscelaneous() {
        return miscelaneous;
    }

    /** 
     * Set the 'miscelaneous' element value. data to add some comments on the insurance element
     * 
     * @param miscelaneous
     */
    public void setMiscelaneous(
            MiscellaneousRemarks128669SCUSPNRDataFeed132 miscelaneous) {
        this.miscelaneous = miscelaneous;
    }

    /** 
     * Get the 'phoneNumber' element value. Used to specify a phone number as an emergency contact
     * 
     * @return value
     */
    public PhoneAndEmailAddress128670SCUSPNRDataFeed132 getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'phoneNumber' element value. Used to specify a phone number as an emergency contact
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(
            PhoneAndEmailAddress128670SCUSPNRDataFeed132 phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** 
     * Get the 'contactName' element value. to specify the name of a person in case of an emergeny
     * 
     * @return value
     */
    public TravellerInformation128664SCUSPNRDataFeed132 getContactName() {
        return contactName;
    }

    /** 
     * Set the 'contactName' element value. to specify the name of a person in case of an emergeny
     * 
     * @param contactName
     */
    public void setContactName(
            TravellerInformation128664SCUSPNRDataFeed132 contactName) {
        this.contactName = contactName;
    }
}
