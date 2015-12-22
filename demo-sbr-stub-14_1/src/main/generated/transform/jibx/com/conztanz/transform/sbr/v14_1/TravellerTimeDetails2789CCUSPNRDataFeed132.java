
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerTimeDetails_2789_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="checkinTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerTimeDetails2789CCUSPNRDataFeed132
{
    private String checkinTime;

    /** 
     * Get the 'checkinTime' element value. 1. Air segment: Check in time: Format is HHMM
     * 
     * @return value
     */
    public String getCheckinTime() {
        return checkinTime;
    }

    /** 
     * Set the 'checkinTime' element value. 1. Air segment: Check in time: Format is HHMM
     * 
     * @param checkinTime
     */
    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }
}
