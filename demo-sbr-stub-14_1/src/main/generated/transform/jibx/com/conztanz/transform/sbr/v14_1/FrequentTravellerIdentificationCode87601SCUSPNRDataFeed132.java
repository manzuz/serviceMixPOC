
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify frequent traveler information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerIdentificationCode_87601_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FrequentTravellerIdentification_132909_C_CUS_PNRDataFeed_132" name="airlineFrequentTraveler"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerIdentificationCode87601SCUSPNRDataFeed132
{
    private FrequentTravellerIdentification132909CCUSPNRDataFeed132 airlineFrequentTraveler;

    /** 
     * Get the 'airlineFrequentTraveler' element value. Frequent Traveller Info
     * 
     * @return value
     */
    public FrequentTravellerIdentification132909CCUSPNRDataFeed132 getAirlineFrequentTraveler() {
        return airlineFrequentTraveler;
    }

    /** 
     * Set the 'airlineFrequentTraveler' element value. Frequent Traveller Info
     * 
     * @param airlineFrequentTraveler
     */
    public void setAirlineFrequentTraveler(
            FrequentTravellerIdentification132909CCUSPNRDataFeed132 airlineFrequentTraveler) {
        this.airlineFrequentTraveler = airlineFrequentTraveler;
    }
}
