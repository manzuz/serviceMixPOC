
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey period in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredPeriodInformation_128769_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="timeMode" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187612_C_CUS_PNRDataFeed_132" name="beginDateTime" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187612_C_CUS_PNRDataFeed_132" name="endDateTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredPeriodInformation128769SCUSPNRDataFeed132
{
    private String businessSemantic;
    private String timeMode;
    private StructuredDateTimeInformation187612CCUSPNRDataFeed132 beginDateTime;
    private StructuredDateTimeInformation187612CCUSPNRDataFeed132 endDateTime;

    /** 
     * Get the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - BED Beginning and Ending dates - DDT Drop-off Date and Time - OCH Opening and Closing hours - PDA Pick-up and Drop-off Date and Time - PDT Pickup Date and Time - PKT Early and Late Pickup time - RTT Early and Late Return time
     * 
     * @return value
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /** 
     * Set the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - BED Beginning and Ending dates - DDT Drop-off Date and Time - OCH Opening and Closing hours - PDA Pick-up and Drop-off Date and Time - PDT Pickup Date and Time - PKT Early and Late Pickup time - RTT Early and Late Return time
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
    public StructuredDateTimeInformation187612CCUSPNRDataFeed132 getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(
            StructuredDateTimeInformation187612CCUSPNRDataFeed132 beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation187612CCUSPNRDataFeed132 getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(
            StructuredDateTimeInformation187612CCUSPNRDataFeed132 endDateTime) {
        this.endDateTime = endDateTime;
    }
}
