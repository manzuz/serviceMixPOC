
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_128779_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187634_C_CUS_PNRDataFeed_132" name="dateTime" minOccurs="0"/>
 *     &lt;xs:element type="TimeZoneInformation_187635_C_CUS_PNRDataFeed_132" name="timeZoneInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation128779SCUSPNRDataFeed132
{
    private String businessSemantic;
    private StructuredDateTimeInformation187634CCUSPNRDataFeed132 dateTime;
    private TimeZoneInformation187635CCUSPNRDataFeed132 timeZoneInfo;

    /** 
     * Get the 'businessSemantic' element value.
     * 
     * @return value
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /** 
     * Set the 'businessSemantic' element value.
     * 
     * @param businessSemantic
     */
    public void setBusinessSemantic(String businessSemantic) {
        this.businessSemantic = businessSemantic;
    }

    /** 
     * Get the 'dateTime' element value. Convey date and/or time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation187634CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Convey date and/or time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation187634CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'timeZoneInfo' element value. Reference : IATA SSIM Appendix F If it is not provided, the time is considered to be given in UTC.
     * 
     * @return value
     */
    public TimeZoneInformation187635CCUSPNRDataFeed132 getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /** 
     * Set the 'timeZoneInfo' element value. Reference : IATA SSIM Appendix F If it is not provided, the time is considered to be given in UTC.
     * 
     * @param timeZoneInfo
     */
    public void setTimeZoneInfo(
            TimeZoneInformation187635CCUSPNRDataFeed132 timeZoneInfo) {
        this.timeZoneInfo = timeZoneInfo;
    }
}
