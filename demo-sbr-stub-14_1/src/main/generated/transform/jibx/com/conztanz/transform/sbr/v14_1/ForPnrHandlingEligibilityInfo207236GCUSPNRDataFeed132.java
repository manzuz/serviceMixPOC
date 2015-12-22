
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ForPnrHandling_eligibilityInfo_207236_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FlightDetailsQuery_94702_S_CUS_PNRDataFeed_132" name="flightDateInfo"/>
 *     &lt;xs:element type="ReferenceInformation_94706_S_CUS_PNRDataFeed_132" name="eligibleSegment"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ForPnrHandlingEligibilityInfo207236GCUSPNRDataFeed132
{
    private FlightDetailsQuery94702SCUSPNRDataFeed132 flightDateInfo;
    private ReferenceInformation94706SCUSPNRDataFeed132 eligibleSegment;

    /** 
     * Get the 'flightDateInfo' element value. Flight date identification
     * 
     * @return value
     */
    public FlightDetailsQuery94702SCUSPNRDataFeed132 getFlightDateInfo() {
        return flightDateInfo;
    }

    /** 
     * Set the 'flightDateInfo' element value. Flight date identification
     * 
     * @param flightDateInfo
     */
    public void setFlightDateInfo(
            FlightDetailsQuery94702SCUSPNRDataFeed132 flightDateInfo) {
        this.flightDateInfo = flightDateInfo;
    }

    /** 
     * Get the 'eligibleSegment' element value.
     * 
     * @return value
     */
    public ReferenceInformation94706SCUSPNRDataFeed132 getEligibleSegment() {
        return eligibleSegment;
    }

    /** 
     * Set the 'eligibleSegment' element value.
     * 
     * @param eligibleSegment
     */
    public void setEligibleSegment(
            ReferenceInformation94706SCUSPNRDataFeed132 eligibleSegment) {
        this.eligibleSegment = eligibleSegment;
    }
}
