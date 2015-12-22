
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used To describe the FROM/TO mapping of a re-accommodation
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FromToMappingGroup_141857_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="BusinessProcessId_123355_S_CUS_PNRDataFeed_132" name="disruptionIdentification"/>
 *     &lt;xs:element type="FromToMappingGroup_disruptedPassengers_141858_G_CUS_PNRDataFeed_132" name="disruptedPassengers" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FromToMappingGroup141857GCUSPNRDataFeed132
{
    private BusinessProcessId123355SCUSPNRDataFeed132 disruptionIdentification;
    private List<FromToMappingGroupDisruptedPassengers141858GCUSPNRDataFeed132> disruptedPassengerList = new ArrayList<FromToMappingGroupDisruptedPassengers141858GCUSPNRDataFeed132>();

    /** 
     * Get the 'disruptionIdentification' element value.
     * 
     * @return value
     */
    public BusinessProcessId123355SCUSPNRDataFeed132 getDisruptionIdentification() {
        return disruptionIdentification;
    }

    /** 
     * Set the 'disruptionIdentification' element value.
     * 
     * @param disruptionIdentification
     */
    public void setDisruptionIdentification(
            BusinessProcessId123355SCUSPNRDataFeed132 disruptionIdentification) {
        this.disruptionIdentification = disruptionIdentification;
    }

    /** 
     * Get the list of 'disruptedPassengers' element items.
     * 
     * @return list
     */
    public List<FromToMappingGroupDisruptedPassengers141858GCUSPNRDataFeed132> getDisruptedPassengerList() {
        return disruptedPassengerList;
    }

    /** 
     * Set the list of 'disruptedPassengers' element items.
     * 
     * @param list
     */
    public void setDisruptedPassengerList(
            List<FromToMappingGroupDisruptedPassengers141858GCUSPNRDataFeed132> list) {
        disruptedPassengerList = list;
    }
}
