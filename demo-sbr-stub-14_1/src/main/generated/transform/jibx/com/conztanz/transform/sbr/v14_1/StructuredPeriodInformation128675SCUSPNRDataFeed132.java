
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey period in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredPeriodInformation_128675_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredDateTimeInformation_187475_C_CUS_PNRDataFeed_132" name="beginDateTime" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187475_C_CUS_PNRDataFeed_132" name="endDateTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredPeriodInformation128675SCUSPNRDataFeed132
{
    private StructuredDateTimeInformation187475CCUSPNRDataFeed132 beginDateTime;
    private StructuredDateTimeInformation187475CCUSPNRDataFeed132 endDateTime;

    /** 
     * Get the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation187475CCUSPNRDataFeed132 getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(
            StructuredDateTimeInformation187475CCUSPNRDataFeed132 beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation187475CCUSPNRDataFeed132 getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(
            StructuredDateTimeInformation187475CCUSPNRDataFeed132 endDateTime) {
        this.endDateTime = endDateTime;
    }
}
