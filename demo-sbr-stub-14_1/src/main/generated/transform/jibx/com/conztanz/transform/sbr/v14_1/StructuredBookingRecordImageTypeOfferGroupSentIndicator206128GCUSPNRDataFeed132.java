
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_sentIndicator_206128_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DateAndTimeInformation_17649_S_CUS_PNRDataFeed_132" name="dateTimeOFN"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_128749_S_CUS_PNRDataFeed_132" name="phoneEmailOFNIndic"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_128749_S_CUS_PNRDataFeed_132" name="phoneEmailOFN" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupSentIndicator206128GCUSPNRDataFeed132
{
    private DateAndTimeInformation17649SCUSPNRDataFeed132 dateTimeOFN;
    private PhoneAndEmailAddress128749SCUSPNRDataFeed132 phoneEmailOFNIndic;
    private List<PhoneAndEmailAddress128749SCUSPNRDataFeed132> phoneEmailOFNList = new ArrayList<PhoneAndEmailAddress128749SCUSPNRDataFeed132>();

    /** 
     * Get the 'dateTimeOFN' element value. This segment is to show the time and date when the Offer Notification was sent to client.
     * 
     * @return value
     */
    public DateAndTimeInformation17649SCUSPNRDataFeed132 getDateTimeOFN() {
        return dateTimeOFN;
    }

    /** 
     * Set the 'dateTimeOFN' element value. This segment is to show the time and date when the Offer Notification was sent to client.
     * 
     * @param dateTimeOFN
     */
    public void setDateTimeOFN(
            DateAndTimeInformation17649SCUSPNRDataFeed132 dateTimeOFN) {
        this.dateTimeOFN = dateTimeOFN;
    }

    /** 
     * Get the 'phoneEmailOFNIndic' element value. This segment is to show the Channel (phone or email) the Offer Notification was sent to.
     * 
     * @return value
     */
    public PhoneAndEmailAddress128749SCUSPNRDataFeed132 getPhoneEmailOFNIndic() {
        return phoneEmailOFNIndic;
    }

    /** 
     * Set the 'phoneEmailOFNIndic' element value. This segment is to show the Channel (phone or email) the Offer Notification was sent to.
     * 
     * @param phoneEmailOFNIndic
     */
    public void setPhoneEmailOFNIndic(
            PhoneAndEmailAddress128749SCUSPNRDataFeed132 phoneEmailOFNIndic) {
        this.phoneEmailOFNIndic = phoneEmailOFNIndic;
    }

    /** 
     * Get the list of 'phoneEmailOFN' element items. This segment is to show the Channel (phone or email) the Offer Notification was sent to.
     * 
     * @return list
     */
    public List<PhoneAndEmailAddress128749SCUSPNRDataFeed132> getPhoneEmailOFNList() {
        return phoneEmailOFNList;
    }

    /** 
     * Set the list of 'phoneEmailOFN' element items. This segment is to show the Channel (phone or email) the Offer Notification was sent to.
     * 
     * @param list
     */
    public void setPhoneEmailOFNList(
            List<PhoneAndEmailAddress128749SCUSPNRDataFeed132> list) {
        phoneEmailOFNList = list;
    }
}
