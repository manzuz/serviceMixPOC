
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide date and time details relative to flight movements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateAndTimeDetails_48326_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="date"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateAndTimeDetails48326CCUSPNRDataFeed132
{
    private String date;

    /** 
     * Get the 'date' element value.
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' element value.
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
}
