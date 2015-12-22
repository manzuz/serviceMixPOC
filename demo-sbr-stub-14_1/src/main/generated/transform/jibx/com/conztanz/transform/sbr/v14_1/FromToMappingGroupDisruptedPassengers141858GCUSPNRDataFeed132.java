
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FromToMappingGroup_disruptedPassengers_141858_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerInformation_74994_S_CUS_PNRDataFeed_132" name="passengerInformation"/>
 *     &lt;xs:element type="FromToMappingGroup_disruptedPassengers_passengerFromToMap_141859_G_CUS_PNRDataFeed_132" name="passengerFromToMap" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FromToMappingGroupDisruptedPassengers141858GCUSPNRDataFeed132
{
    private TravellerInformation74994SCUSPNRDataFeed132 passengerInformation;
    private List<FromToMappingGroupDisruptedPassengersPassengerFromToMap141859GCUSPNRDataFeed132> passengerFromToMapList = new ArrayList<FromToMappingGroupDisruptedPassengersPassengerFromToMap141859GCUSPNRDataFeed132>();

    /** 
     * Get the 'passengerInformation' element value.
     * 
     * @return value
     */
    public TravellerInformation74994SCUSPNRDataFeed132 getPassengerInformation() {
        return passengerInformation;
    }

    /** 
     * Set the 'passengerInformation' element value.
     * 
     * @param passengerInformation
     */
    public void setPassengerInformation(
            TravellerInformation74994SCUSPNRDataFeed132 passengerInformation) {
        this.passengerInformation = passengerInformation;
    }

    /** 
     * Get the list of 'passengerFromToMap' element items.
     * 
     * @return list
     */
    public List<FromToMappingGroupDisruptedPassengersPassengerFromToMap141859GCUSPNRDataFeed132> getPassengerFromToMapList() {
        return passengerFromToMapList;
    }

    /** 
     * Set the list of 'passengerFromToMap' element items.
     * 
     * @param list
     */
    public void setPassengerFromToMapList(
            List<FromToMappingGroupDisruptedPassengersPassengerFromToMap141859GCUSPNRDataFeed132> list) {
        passengerFromToMapList = list;
    }
}
