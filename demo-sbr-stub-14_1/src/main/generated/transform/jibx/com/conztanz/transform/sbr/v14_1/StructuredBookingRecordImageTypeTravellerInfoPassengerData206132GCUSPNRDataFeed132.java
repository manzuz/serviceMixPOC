
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_travellerInfo_passengerData_206132_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerInformation_6137_S_CUS_PNRDataFeed_132" name="travellerInformation"/>
 *     &lt;xs:element type="NumberOfUnits_91398_S_CUS_PNRDataFeed_132" name="groupCounters" minOccurs="0"/>
 *     &lt;xs:element type="DateAndTimeInformation_70169_S_CUS_PNRDataFeed_132" name="dateOfBirth" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeTravellerInfoPassengerData206132GCUSPNRDataFeed132
{
    private TravellerInformation6137SCUSPNRDataFeed132 travellerInformation;
    private NumberOfUnits91398SCUSPNRDataFeed132 groupCounters;
    private DateAndTimeInformation70169SCUSPNRDataFeed132 dateOfBirth;

    /** 
     * Get the 'travellerInformation' element value. Specify traveler and personal details related to a traveler
     * 
     * @return value
     */
    public TravellerInformation6137SCUSPNRDataFeed132 getTravellerInformation() {
        return travellerInformation;
    }

    /** 
     * Set the 'travellerInformation' element value. Specify traveler and personal details related to a traveler
     * 
     * @param travellerInformation
     */
    public void setTravellerInformation(
            TravellerInformation6137SCUSPNRDataFeed132 travellerInformation) {
        this.travellerInformation = travellerInformation;
    }

    /** 
     * Get the 'groupCounters' element value. In case of group, contains the group counters (Booked, Canceled, Split)
     * 
     * @return value
     */
    public NumberOfUnits91398SCUSPNRDataFeed132 getGroupCounters() {
        return groupCounters;
    }

    /** 
     * Set the 'groupCounters' element value. In case of group, contains the group counters (Booked, Canceled, Split)
     * 
     * @param groupCounters
     */
    public void setGroupCounters(
            NumberOfUnits91398SCUSPNRDataFeed132 groupCounters) {
        this.groupCounters = groupCounters;
    }

    /** 
     * Get the 'dateOfBirth' element value. Inf/Child date of birth (DDMMYYYY). For instance 01122007
     * 
     * @return value
     */
    public DateAndTimeInformation70169SCUSPNRDataFeed132 getDateOfBirth() {
        return dateOfBirth;
    }

    /** 
     * Set the 'dateOfBirth' element value. Inf/Child date of birth (DDMMYYYY). For instance 01122007
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(
            DateAndTimeInformation70169SCUSPNRDataFeed132 dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
