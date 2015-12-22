
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide date and time details relative to flight movements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateAndTimeInformation_26783_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DateAndTimeDetails_48326_C_CUS_PNRDataFeed_132" name="dateAndTimeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateAndTimeInformation26783SCUSPNRDataFeed132
{
    private DateAndTimeDetails48326CCUSPNRDataFeed132 dateAndTimeDetails;

    /** 
     * Get the 'dateAndTimeDetails' element value.
     * 
     * @return value
     */
    public DateAndTimeDetails48326CCUSPNRDataFeed132 getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /** 
     * Set the 'dateAndTimeDetails' element value.
     * 
     * @param dateAndTimeDetails
     */
    public void setDateAndTimeDetails(
            DateAndTimeDetails48326CCUSPNRDataFeed132 dateAndTimeDetails) {
        this.dateAndTimeDetails = dateAndTimeDetails;
    }
}
