
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide details which restrict traffic.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrafficRestrictionDetails_83035_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TrafficRestrictionDetails_126846_C_CUS_PNRDataFeed_132" name="restrictionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrafficRestrictionDetails83035SCUSPNRDataFeed132
{
    private TrafficRestrictionDetails126846CCUSPNRDataFeed132 restrictionDetails;

    /** 
     * Get the 'restrictionDetails' element value. restriction details
     * 
     * @return value
     */
    public TrafficRestrictionDetails126846CCUSPNRDataFeed132 getRestrictionDetails() {
        return restrictionDetails;
    }

    /** 
     * Set the 'restrictionDetails' element value. restriction details
     * 
     * @param restrictionDetails
     */
    public void setRestrictionDetails(
            TrafficRestrictionDetails126846CCUSPNRDataFeed132 restrictionDetails) {
        this.restrictionDetails = restrictionDetails;
    }
}
