
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify traveler and personal details relating to one traveler having rich name and/or multiple names
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EnhancedTravellerInformation_165081_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerNameInfo_233550_C_CUS_PNRDataFeed_132" name="travellerNameInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EnhancedTravellerInformation165081SCUSPNRDataFeed132
{
    private TravellerNameInfo233550CCUSPNRDataFeed132 travellerNameInfo;

    /** 
     * Get the 'travellerNameInfo' element value. Name attributes unique for one passenger.
     * 
     * @return value
     */
    public TravellerNameInfo233550CCUSPNRDataFeed132 getTravellerNameInfo() {
        return travellerNameInfo;
    }

    /** 
     * Set the 'travellerNameInfo' element value. Name attributes unique for one passenger.
     * 
     * @param travellerNameInfo
     */
    public void setTravellerNameInfo(
            TravellerNameInfo233550CCUSPNRDataFeed132 travellerNameInfo) {
        this.travellerNameInfo = travellerNameInfo;
    }
}
