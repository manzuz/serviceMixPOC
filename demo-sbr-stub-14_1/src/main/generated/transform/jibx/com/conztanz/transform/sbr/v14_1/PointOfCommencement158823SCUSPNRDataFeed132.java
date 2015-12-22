
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the point of commencement
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PointOfCommencement_158823_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="location"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PointOfCommencement158823SCUSPNRDataFeed132
{
    private String location;

    /** 
     * Get the 'location' element value. Country code of the POC
     * 
     * @return value
     */
    public String getLocation() {
        return location;
    }

    /** 
     * Set the 'location' element value. Country code of the POC
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
