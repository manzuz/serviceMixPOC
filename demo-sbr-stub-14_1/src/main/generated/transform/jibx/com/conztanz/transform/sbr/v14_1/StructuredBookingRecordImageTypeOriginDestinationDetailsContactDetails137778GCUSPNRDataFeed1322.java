
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_contactDetails_137778_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MiscellaneousRemarks_12240_S_CUS_PNRDataFeed_132" name="miscelaneous"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_32298_S_CUS_PNRDataFeed_132" name="phoneNumber" minOccurs="0"/>
 *     &lt;xs:element type="TravellerInformation_10054_S_CUS_PNRDataFeed_132" name="contactName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails137778GCUSPNRDataFeed1322
{
    private MiscellaneousRemarks12240SCUSPNRDataFeed132 miscelaneous;
    private PhoneAndEmailAddress32298SCUSPNRDataFeed132 phoneNumber;
    private TravellerInformation10054SCUSPNRDataFeed132 contactName;

    /** 
     * Get the 'miscelaneous' element value. data to add some comments on the insurance element
     * 
     * @return value
     */
    public MiscellaneousRemarks12240SCUSPNRDataFeed132 getMiscelaneous() {
        return miscelaneous;
    }

    /** 
     * Set the 'miscelaneous' element value. data to add some comments on the insurance element
     * 
     * @param miscelaneous
     */
    public void setMiscelaneous(
            MiscellaneousRemarks12240SCUSPNRDataFeed132 miscelaneous) {
        this.miscelaneous = miscelaneous;
    }

    /** 
     * Get the 'phoneNumber' element value. Used to specify a phone number as an emergency contact
     * 
     * @return value
     */
    public PhoneAndEmailAddress32298SCUSPNRDataFeed132 getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'phoneNumber' element value. Used to specify a phone number as an emergency contact
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(
            PhoneAndEmailAddress32298SCUSPNRDataFeed132 phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** 
     * Get the 'contactName' element value. to specify the name of a person in case of an emergeny
     * 
     * @return value
     */
    public TravellerInformation10054SCUSPNRDataFeed132 getContactName() {
        return contactName;
    }

    /** 
     * Set the 'contactName' element value. to specify the name of a person in case of an emergeny
     * 
     * @param contactName
     */
    public void setContactName(
            TravellerInformation10054SCUSPNRDataFeed132 contactName) {
        this.contactName = contactName;
    }
}
