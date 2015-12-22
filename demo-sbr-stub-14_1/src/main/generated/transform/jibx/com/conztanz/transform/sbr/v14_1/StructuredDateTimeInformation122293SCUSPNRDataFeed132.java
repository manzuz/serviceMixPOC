
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_122293_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="timeMode" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_178895_C_CUS_PNRDataFeed_132" name="dateTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation122293SCUSPNRDataFeed132
{
    private String timeMode;
    private StructuredDateTimeInformation178895CCUSPNRDataFeed132 dateTime;

    /** 
     * Get the 'timeMode' element value. Indicate if the time is expressed in UTC or in local time mode ( Codes ZT and LT ).
     * 
     * @return value
     */
    public String getTimeMode() {
        return timeMode;
    }

    /** 
     * Set the 'timeMode' element value. Indicate if the time is expressed in UTC or in local time mode ( Codes ZT and LT ).
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
    public StructuredDateTimeInformation178895CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Convey date and/or time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation178895CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }
}
