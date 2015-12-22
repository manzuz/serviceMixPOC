
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_76232_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic"/>
 *     &lt;xs:element type="xs:string" name="timeMode"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_118055_C_CUS_PNRDataFeed_132" name="dateTime"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation76232SCUSPNRDataFeed132
{
    private String businessSemantic;
    private String timeMode;
    private StructuredDateTimeInformation118055CCUSPNRDataFeed132 dateTime;

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
     * Get the 'dateTime' element value. Convey date and/or time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation118055CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Convey date and/or time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation118055CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }
}
