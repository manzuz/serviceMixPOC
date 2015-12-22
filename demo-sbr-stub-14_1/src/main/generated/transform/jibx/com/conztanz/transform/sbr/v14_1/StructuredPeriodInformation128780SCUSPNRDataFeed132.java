
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey period in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredPeriodInformation_128780_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="timeMode" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187636_C_CUS_PNRDataFeed_132" name="beginDateTime" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187636_C_CUS_PNRDataFeed_132" name="endDateTime" minOccurs="0"/>
 *     &lt;xs:element type="Frequency_187637_C_CUS_PNRDataFeed_132" name="frequency" minOccurs="0"/>
 *     &lt;xs:element type="TimeZoneInformation_187638_C_CUS_PNRDataFeed_132" name="timeZoneInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredPeriodInformation128780SCUSPNRDataFeed132
{
    private String businessSemantic;
    private String timeMode;
    private StructuredDateTimeInformation187636CCUSPNRDataFeed132 beginDateTime;
    private StructuredDateTimeInformation187636CCUSPNRDataFeed132 endDateTime;
    private Frequency187637CCUSPNRDataFeed132 frequency;
    private TimeZoneInformation187638CCUSPNRDataFeed132 timeZoneInfo;

    /** 
     * Get the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - Impacted period - Departure date - Estimated arrival date and time
     * 
     * @return value
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /** 
     * Set the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - Impacted period - Departure date - Estimated arrival date and time
     * 
     * @param businessSemantic
     */
    public void setBusinessSemantic(String businessSemantic) {
        this.businessSemantic = businessSemantic;
    }

    /** 
     * Get the 'timeMode' element value. Indicate if the time is expressed in UTC or in local time mode ( Codes U and L ). In the last case, the time zone information can be provided in the composite C89K.
     * 
     * @return value
     */
    public String getTimeMode() {
        return timeMode;
    }

    /** 
     * Set the 'timeMode' element value. Indicate if the time is expressed in UTC or in local time mode ( Codes U and L ). In the last case, the time zone information can be provided in the composite C89K.
     * 
     * @param timeMode
     */
    public void setTimeMode(String timeMode) {
        this.timeMode = timeMode;
    }

    /** 
     * Get the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation187636CCUSPNRDataFeed132 getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(
            StructuredDateTimeInformation187636CCUSPNRDataFeed132 beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation187636CCUSPNRDataFeed132 getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(
            StructuredDateTimeInformation187636CCUSPNRDataFeed132 endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'frequency' element value. It is used with a period to give a restriction for days impacted. It permits for example to indicate on which days, a flight operates.
     * 
     * @return value
     */
    public Frequency187637CCUSPNRDataFeed132 getFrequency() {
        return frequency;
    }

    /** 
     * Set the 'frequency' element value. It is used with a period to give a restriction for days impacted. It permits for example to indicate on which days, a flight operates.
     * 
     * @param frequency
     */
    public void setFrequency(Frequency187637CCUSPNRDataFeed132 frequency) {
        this.frequency = frequency;
    }

    /** 
     * Get the 'timeZoneInfo' element value. Reference : IATA SSIM Appendix F If it is not provided, the time is considered to be given in UTC.
     * 
     * @return value
     */
    public TimeZoneInformation187638CCUSPNRDataFeed132 getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /** 
     * Set the 'timeZoneInfo' element value. Reference : IATA SSIM Appendix F If it is not provided, the time is considered to be given in UTC.
     * 
     * @param timeZoneInfo
     */
    public void setTimeZoneInfo(
            TimeZoneInformation187638CCUSPNRDataFeed132 timeZoneInfo) {
        this.timeZoneInfo = timeZoneInfo;
    }
}
