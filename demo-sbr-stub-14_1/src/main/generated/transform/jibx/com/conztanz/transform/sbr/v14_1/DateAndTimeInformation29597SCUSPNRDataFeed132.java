
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide date and time details relative to flight movements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateAndTimeInformation_29597_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DateAndTimeDetails_52417_C_CUS_PNRDataFeed_132" name="dateAndTimeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateAndTimeInformation29597SCUSPNRDataFeed132
{
    private DateAndTimeDetails52417CCUSPNRDataFeed132 dateAndTimeDetails;

    /** 
     * Get the 'dateAndTimeDetails' element value. date details
     * 
     * @return value
     */
    public DateAndTimeDetails52417CCUSPNRDataFeed132 getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /** 
     * Set the 'dateAndTimeDetails' element value. date details
     * 
     * @param dateAndTimeDetails
     */
    public void setDateAndTimeDetails(
            DateAndTimeDetails52417CCUSPNRDataFeed132 dateAndTimeDetails) {
        this.dateAndTimeDetails = dateAndTimeDetails;
    }
}
