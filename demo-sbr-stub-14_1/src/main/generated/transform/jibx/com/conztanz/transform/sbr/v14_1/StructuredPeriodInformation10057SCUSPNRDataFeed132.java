
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey period in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredPeriodInformation_10057_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredDateTimeInformation_17997_C_CUS_PNRDataFeed_132" name="beginDateTime" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_17997_C_CUS_PNRDataFeed_132" name="endDateTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredPeriodInformation10057SCUSPNRDataFeed132
{
    private StructuredDateTimeInformation17997CCUSPNRDataFeed132 beginDateTime;
    private StructuredDateTimeInformation17997CCUSPNRDataFeed132 endDateTime;

    /** 
     * Get the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation17997CCUSPNRDataFeed132 getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'beginDateTime' element value. Convey the begin date/time of a period.
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(
            StructuredDateTimeInformation17997CCUSPNRDataFeed132 beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @return value
     */
    public StructuredDateTimeInformation17997CCUSPNRDataFeed132 getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'endDateTime' element value. Convey the end date/time of a period.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(
            StructuredDateTimeInformation17997CCUSPNRDataFeed132 endDateTime) {
        this.endDateTime = endDateTime;
    }
}
