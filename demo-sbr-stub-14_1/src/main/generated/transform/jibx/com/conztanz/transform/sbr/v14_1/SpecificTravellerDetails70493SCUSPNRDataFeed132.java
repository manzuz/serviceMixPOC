
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify additional details about a particular traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificTravellerDetails_70493_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecificTravellerDetails_109774_C_CUS_PNRDataFeed_132" name="travellerDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificTravellerDetails70493SCUSPNRDataFeed132
{
    private SpecificTravellerDetails109774CCUSPNRDataFeed132 travellerDetails;

    /** 
     * Get the 'travellerDetails' element value. Conveys the passenger's number and name.
     * 
     * @return value
     */
    public SpecificTravellerDetails109774CCUSPNRDataFeed132 getTravellerDetails() {
        return travellerDetails;
    }

    /** 
     * Set the 'travellerDetails' element value. Conveys the passenger's number and name.
     * 
     * @param travellerDetails
     */
    public void setTravellerDetails(
            SpecificTravellerDetails109774CCUSPNRDataFeed132 travellerDetails) {
        this.travellerDetails = travellerDetails;
    }
}
