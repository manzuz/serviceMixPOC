
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_83066_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredDateTimeInformation_126892_C_CUS_PNRDataFeed_132" name="dateTime"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation83066SCUSPNRDataFeed132
{
    private StructuredDateTimeInformation126892CCUSPNRDataFeed132 dateTime;

    /** 
     * Get the 'dateTime' element value. Convey date and/or time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation126892CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Convey date and/or time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation126892CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }
}
