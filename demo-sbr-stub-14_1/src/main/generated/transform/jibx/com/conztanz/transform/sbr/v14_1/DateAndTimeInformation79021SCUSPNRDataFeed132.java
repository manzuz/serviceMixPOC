
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide date and time details relative to flight movements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateAndTimeInformation_79021_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DateAndTimeDetails_121365_C_CUS_PNRDataFeed_132" name="dateAndTimeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateAndTimeInformation79021SCUSPNRDataFeed132
{
    private DateAndTimeDetails121365CCUSPNRDataFeed132 dateAndTimeDetails;

    /** 
     * Get the 'dateAndTimeDetails' element value. NVA, NVB
     * 
     * @return value
     */
    public DateAndTimeDetails121365CCUSPNRDataFeed132 getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /** 
     * Set the 'dateAndTimeDetails' element value. NVA, NVB
     * 
     * @param dateAndTimeDetails
     */
    public void setDateAndTimeDetails(
            DateAndTimeDetails121365CCUSPNRDataFeed132 dateAndTimeDetails) {
        this.dateAndTimeDetails = dateAndTimeDetails;
    }
}
