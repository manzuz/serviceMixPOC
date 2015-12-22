
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_trackingDetails_139174_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TerminalLocation_76231_S_CUS_PNRDataFeed_132" name="lastTrackedLocation"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_76232_S_CUS_PNRDataFeed_132" name="lastTrackedDateTime"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterTrackingDetails139174GCUSPNRDataFeed1321
{
    private TerminalLocation76231SCUSPNRDataFeed132 lastTrackedLocation;
    private StructuredDateTimeInformation76232SCUSPNRDataFeed132 lastTrackedDateTime;

    /** 
     * Get the 'lastTrackedLocation' element value. Last tracked location
     * 
     * @return value
     */
    public TerminalLocation76231SCUSPNRDataFeed132 getLastTrackedLocation() {
        return lastTrackedLocation;
    }

    /** 
     * Set the 'lastTrackedLocation' element value. Last tracked location
     * 
     * @param lastTrackedLocation
     */
    public void setLastTrackedLocation(
            TerminalLocation76231SCUSPNRDataFeed132 lastTrackedLocation) {
        this.lastTrackedLocation = lastTrackedLocation;
    }

    /** 
     * Get the 'lastTrackedDateTime' element value. To specify the last tracked date and time information * businessSemantic = "TT" (transaction time) * timeMode = "LT" (Local Time ) * dateTime/year = Year * dateTime/month = Month * dateTime/day = Day * dateTime/hour = Hour * dateTime/minutes = Minutes * dateTime/seconds = Seconds
     * 
     * @return value
     */
    public StructuredDateTimeInformation76232SCUSPNRDataFeed132 getLastTrackedDateTime() {
        return lastTrackedDateTime;
    }

    /** 
     * Set the 'lastTrackedDateTime' element value. To specify the last tracked date and time information * businessSemantic = "TT" (transaction time) * timeMode = "LT" (Local Time ) * dateTime/year = Year * dateTime/month = Month * dateTime/day = Day * dateTime/hour = Hour * dateTime/minutes = Minutes * dateTime/seconds = Seconds
     * 
     * @param lastTrackedDateTime
     */
    public void setLastTrackedDateTime(
            StructuredDateTimeInformation76232SCUSPNRDataFeed132 lastTrackedDateTime) {
        this.lastTrackedDateTime = lastTrackedDateTime;
    }
}
