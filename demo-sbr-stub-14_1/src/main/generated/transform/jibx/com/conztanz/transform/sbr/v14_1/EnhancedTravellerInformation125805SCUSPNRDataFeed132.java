
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify traveler and personal details relating to one traveler having rich name and/or multiple names
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EnhancedTravellerInformation_125805_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerNameInfo_183799_C_CUS_PNRDataFeed_132" name="travellerNameInfo" minOccurs="0"/>
 *     &lt;xs:element type="TravellerNameDetails_183800_C_CUS_PNRDataFeed_132" name="otherPaxNamesDetails" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EnhancedTravellerInformation125805SCUSPNRDataFeed132
{
    private TravellerNameInfo183799CCUSPNRDataFeed132 travellerNameInfo;
    private List<TravellerNameDetails183800CCUSPNRDataFeed132> otherPaxNamesDetailList = new ArrayList<TravellerNameDetails183800CCUSPNRDataFeed132>();

    /** 
     * Get the 'travellerNameInfo' element value. Name attributes unique for one passenger.
     * 
     * @return value
     */
    public TravellerNameInfo183799CCUSPNRDataFeed132 getTravellerNameInfo() {
        return travellerNameInfo;
    }

    /** 
     * Set the 'travellerNameInfo' element value. Name attributes unique for one passenger.
     * 
     * @param travellerNameInfo
     */
    public void setTravellerNameInfo(
            TravellerNameInfo183799CCUSPNRDataFeed132 travellerNameInfo) {
        this.travellerNameInfo = travellerNameInfo;
    }

    /** 
     * Get the list of 'otherPaxNamesDetails' element items. 5 possible types of names, for 1 passenger.
     * 
     * @return list
     */
    public List<TravellerNameDetails183800CCUSPNRDataFeed132> getOtherPaxNamesDetailList() {
        return otherPaxNamesDetailList;
    }

    /** 
     * Set the list of 'otherPaxNamesDetails' element items. 5 possible types of names, for 1 passenger.
     * 
     * @param list
     */
    public void setOtherPaxNamesDetailList(
            List<TravellerNameDetails183800CCUSPNRDataFeed132> list) {
        otherPaxNamesDetailList = list;
    }
}
