
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_travellerInfo_enhancedPassengerData_206133_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="EnhancedTravellerInformation_125805_S_CUS_PNRDataFeed_132" name="enhancedTravellerInformation"/>
 *     &lt;xs:element type="NumberOfUnits_91398_S_CUS_PNRDataFeed_132" name="groupCountersInEnhancedPaxData" minOccurs="0"/>
 *     &lt;xs:element type="DateAndTimeInformation_70169_S_CUS_PNRDataFeed_132" name="dateOfBirthInEnhancedPaxData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeTravellerInfoEnhancedPassengerData206133GCUSPNRDataFeed132
{
    private EnhancedTravellerInformation125805SCUSPNRDataFeed132 enhancedTravellerInformation;
    private NumberOfUnits91398SCUSPNRDataFeed132 groupCountersInEnhancedPaxData;
    private DateAndTimeInformation70169SCUSPNRDataFeed132 dateOfBirthInEnhancedPaxData;

    /** 
     * Get the 'enhancedTravellerInformation' element value. Specify traveler and personal details relating to a traveler.  Will be filled imperatively if name is UTF-8 encoded.
     * 
     * @return value
     */
    public EnhancedTravellerInformation125805SCUSPNRDataFeed132 getEnhancedTravellerInformation() {
        return enhancedTravellerInformation;
    }

    /** 
     * Set the 'enhancedTravellerInformation' element value. Specify traveler and personal details relating to a traveler.  Will be filled imperatively if name is UTF-8 encoded.
     * 
     * @param enhancedTravellerInformation
     */
    public void setEnhancedTravellerInformation(
            EnhancedTravellerInformation125805SCUSPNRDataFeed132 enhancedTravellerInformation) {
        this.enhancedTravellerInformation = enhancedTravellerInformation;
    }

    /** 
     * Get the 'groupCountersInEnhancedPaxData' element value. In case of group, contains the group counters (Booked, Canceled, Split)
     * 
     * @return value
     */
    public NumberOfUnits91398SCUSPNRDataFeed132 getGroupCountersInEnhancedPaxData() {
        return groupCountersInEnhancedPaxData;
    }

    /** 
     * Set the 'groupCountersInEnhancedPaxData' element value. In case of group, contains the group counters (Booked, Canceled, Split)
     * 
     * @param groupCountersInEnhancedPaxData
     */
    public void setGroupCountersInEnhancedPaxData(
            NumberOfUnits91398SCUSPNRDataFeed132 groupCountersInEnhancedPaxData) {
        this.groupCountersInEnhancedPaxData = groupCountersInEnhancedPaxData;
    }

    /** 
     * Get the 'dateOfBirthInEnhancedPaxData' element value. Inf/Child date of birth (DDMMYYYY). For instance 01122007
     * 
     * @return value
     */
    public DateAndTimeInformation70169SCUSPNRDataFeed132 getDateOfBirthInEnhancedPaxData() {
        return dateOfBirthInEnhancedPaxData;
    }

    /** 
     * Set the 'dateOfBirthInEnhancedPaxData' element value. Inf/Child date of birth (DDMMYYYY). For instance 01122007
     * 
     * @param dateOfBirthInEnhancedPaxData
     */
    public void setDateOfBirthInEnhancedPaxData(
            DateAndTimeInformation70169SCUSPNRDataFeed132 dateOfBirthInEnhancedPaxData) {
        this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
    }
}
