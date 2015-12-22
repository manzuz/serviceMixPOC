
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify a traveler(s) and personal details relating to the traveler(s)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_6137_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_10304_C_CUS_PNRDataFeed_132" name="traveller" minOccurs="0"/>
 *     &lt;xs:element type="TravellerDetails_10302_C_CUS_PNRDataFeed_132" name="passenger" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation6137SCUSPNRDataFeed132
{
    private TravellerSurnameInformation10304CCUSPNRDataFeed132 traveller;
    private List<TravellerDetails10302CCUSPNRDataFeed132> passengerList = new ArrayList<TravellerDetails10302CCUSPNRDataFeed132>();

    /** 
     * Get the 'traveller' element value. Traveller surname details
     * 
     * @return value
     */
    public TravellerSurnameInformation10304CCUSPNRDataFeed132 getTraveller() {
        return traveller;
    }

    /** 
     * Set the 'traveller' element value. Traveller surname details
     * 
     * @param traveller
     */
    public void setTraveller(
            TravellerSurnameInformation10304CCUSPNRDataFeed132 traveller) {
        this.traveller = traveller;
    }

    /** 
     * Get the list of 'passenger' element items. - Occurrence one relates to the traveler. - Occurrence 2 relates only to an infant accompanying the traveler for whom only the given name is present.
     * 
     * @return list
     */
    public List<TravellerDetails10302CCUSPNRDataFeed132> getPassengerList() {
        return passengerList;
    }

    /** 
     * Set the list of 'passenger' element items. - Occurrence one relates to the traveler. - Occurrence 2 relates only to an infant accompanying the traveler for whom only the given name is present.
     * 
     * @param list
     */
    public void setPassengerList(
            List<TravellerDetails10302CCUSPNRDataFeed132> list) {
        passengerList = list;
    }
}
