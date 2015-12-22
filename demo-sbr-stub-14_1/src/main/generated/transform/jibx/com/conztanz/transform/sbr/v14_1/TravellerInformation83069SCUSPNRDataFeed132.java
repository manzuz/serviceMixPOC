
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_83069_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_126897_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *     &lt;xs:element type="TravellerDetails_126898_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation83069SCUSPNRDataFeed132
{
    private TravellerSurnameInformation126897CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails126898CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value. Passenger last name details.
     * 
     * @return value
     */
    public TravellerSurnameInformation126897CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. Passenger last name details.
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation126897CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value. Passnger first name details.
     * 
     * @return value
     */
    public TravellerDetails126898CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value. Passnger first name details.
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails126898CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
