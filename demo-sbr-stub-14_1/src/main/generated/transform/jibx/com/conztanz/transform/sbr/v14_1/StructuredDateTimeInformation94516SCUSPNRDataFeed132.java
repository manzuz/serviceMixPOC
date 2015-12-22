
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_94516_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="timeMode" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_142129_C_CUS_PNRDataFeed_132" name="dateTime"/>
 *     &lt;xs:element type="TimeZoneInformation_142130_C_CUS_PNRDataFeed_132" name="timeZoneInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation94516SCUSPNRDataFeed132
{
    private String businessSemantic;
    private String timeMode;
    private StructuredDateTimeInformation142129CCUSPNRDataFeed132 dateTime;
    private TimeZoneInformation142130CCUSPNRDataFeed132 timeZoneInfo;

    /** 
     * Get the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - LT : date and time corresponding to Authorization message built - T : date and time corresponding to Authorization message sent - AR : date and time corresponding to Authorization message receipt
     * 
     * @return value
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /** 
     * Set the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - LT : date and time corresponding to Authorization message built - T : date and time corresponding to Authorization message sent - AR : date and time corresponding to Authorization message receipt
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
     * Get the 'dateTime' element value. Convey date and/or time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation142129CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Convey date and/or time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation142129CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'timeZoneInfo' element value. Reference : IATA SSIM Appendix F If it is not provided, the time is considered to be given in UTC.
     * 
     * @return value
     */
    public TimeZoneInformation142130CCUSPNRDataFeed132 getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /** 
     * Set the 'timeZoneInfo' element value. Reference : IATA SSIM Appendix F If it is not provided, the time is considered to be given in UTC.
     * 
     * @param timeZoneInfo
     */
    public void setTimeZoneInfo(
            TimeZoneInformation142130CCUSPNRDataFeed132 timeZoneInfo) {
        this.timeZoneInfo = timeZoneInfo;
    }
}
