
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey period in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredPeriodInformation_128716_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredDateTimeInformation_187528_C_CUS_PNRDataFeed_132" name="beginDateTime"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_187528_C_CUS_PNRDataFeed_132" name="endDateTime"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredPeriodInformation128716SCUSPNRDataFeed132
{
    private StructuredDateTimeInformation187528CCUSPNRDataFeed132 beginDateTime;
    private StructuredDateTimeInformation187528CCUSPNRDataFeed132 endDateTime;

    /** 
     * Get the 'beginDateTime' element value. Convey the departure date/time of the sailing
     * 
     * @return value
     */
    public StructuredDateTimeInformation187528CCUSPNRDataFeed132 getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'beginDateTime' element value. Convey the departure date/time of the sailing
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(
            StructuredDateTimeInformation187528CCUSPNRDataFeed132 beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'endDateTime' element value. Convey the arrival date/time of the sailing
     * 
     * @return value
     */
    public StructuredDateTimeInformation187528CCUSPNRDataFeed132 getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'endDateTime' element value. Convey the arrival date/time of the sailing
     * 
     * @param endDateTime
     */
    public void setEndDateTime(
            StructuredDateTimeInformation187528CCUSPNRDataFeed132 endDateTime) {
        this.endDateTime = endDateTime;
    }
}
