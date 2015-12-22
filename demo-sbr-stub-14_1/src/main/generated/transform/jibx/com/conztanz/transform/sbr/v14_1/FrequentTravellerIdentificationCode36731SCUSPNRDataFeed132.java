
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify frequent traveler information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerIdentificationCode_36731_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FrequentTravellerIdentification_62840_C_CUS_PNRDataFeed_132" name="airlineFrequentTraveler"/>
 *     &lt;xs:element type="FrequentTravellerIdentification_62841_C_CUS_PNRDataFeed_132" name="allianceFrequentTraveler" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerIdentificationCode36731SCUSPNRDataFeed132
{
    private FrequentTravellerIdentification62840CCUSPNRDataFeed132 airlineFrequentTraveler;
    private FrequentTravellerIdentification62841CCUSPNRDataFeed132 allianceFrequentTraveler;

    /** 
     * Get the 'airlineFrequentTraveler' element value. Airline Frequent Traveller Info
     * 
     * @return value
     */
    public FrequentTravellerIdentification62840CCUSPNRDataFeed132 getAirlineFrequentTraveler() {
        return airlineFrequentTraveler;
    }

    /** 
     * Set the 'airlineFrequentTraveler' element value. Airline Frequent Traveller Info
     * 
     * @param airlineFrequentTraveler
     */
    public void setAirlineFrequentTraveler(
            FrequentTravellerIdentification62840CCUSPNRDataFeed132 airlineFrequentTraveler) {
        this.airlineFrequentTraveler = airlineFrequentTraveler;
    }

    /** 
     * Get the 'allianceFrequentTraveler' element value. Alliance Frequent Traveller Info
     * 
     * @return value
     */
    public FrequentTravellerIdentification62841CCUSPNRDataFeed132 getAllianceFrequentTraveler() {
        return allianceFrequentTraveler;
    }

    /** 
     * Set the 'allianceFrequentTraveler' element value. Alliance Frequent Traveller Info
     * 
     * @param allianceFrequentTraveler
     */
    public void setAllianceFrequentTraveler(
            FrequentTravellerIdentification62841CCUSPNRDataFeed132 allianceFrequentTraveler) {
        this.allianceFrequentTraveler = allianceFrequentTraveler;
    }
}
