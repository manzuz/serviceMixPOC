
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey period in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredPeriodInformation_87628_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="timeMode" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_132956_C_CUS_PNRDataFeed_132" name="beginDateTime"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_132956_C_CUS_PNRDataFeed_132" name="endDateTime"/>
 *     &lt;xs:element type="Frequency_132920_C_CUS_PNRDataFeed_132" name="frequency"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredPeriodInformation87628SCUSPNRDataFeed132
{
    private String businessSemantic;
    private String timeMode;
    private StructuredDateTimeInformation132956CCUSPNRDataFeed132 beginDateTime;
    private StructuredDateTimeInformation132956CCUSPNRDataFeed132 endDateTime;
    private Frequency132920CCUSPNRDataFeed132 frequency;

    /** 
     * Get the 'businessSemantic' element value. DDT Drop-off Date and Time OCH Opening and Closing hours PDT Pickup Date and Time PKT Early and Late Pickup time RTT Early and Late Return time
     * 
     * @return value
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /** 
     * Set the 'businessSemantic' element value. DDT Drop-off Date and Time OCH Opening and Closing hours PDT Pickup Date and Time PKT Early and Late Pickup time RTT Early and Late Return time
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
    public StructuredDateTimeInformation132956CCUSPNRDataFeed132 getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(
            StructuredDateTimeInformation132956CCUSPNRDataFeed132 beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation132956CCUSPNRDataFeed132 getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(
            StructuredDateTimeInformation132956CCUSPNRDataFeed132 endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'frequency' element value. It is used with a period to give a restriction for days impacted. It permits for example to indicate on which days, a flight operates.
     * 
     * @return value
     */
    public Frequency132920CCUSPNRDataFeed132 getFrequency() {
        return frequency;
    }

    /** 
     * Set the 'frequency' element value. It is used with a period to give a restriction for days impacted. It permits for example to indicate on which days, a flight operates.
     * 
     * @param frequency
     */
    public void setFrequency(Frequency132920CCUSPNRDataFeed132 frequency) {
        this.frequency = frequency;
    }
}
