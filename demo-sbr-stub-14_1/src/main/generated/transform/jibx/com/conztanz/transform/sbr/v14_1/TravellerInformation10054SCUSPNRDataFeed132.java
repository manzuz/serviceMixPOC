
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_10054_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_18003_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *     &lt;xs:element type="TravellerDetails_18004_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation10054SCUSPNRDataFeed132
{
    private TravellerSurnameInformation18003CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails18004CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value. to specify the last name and the type of person (if it's a nanny or a substitute)
     * 
     * @return value
     */
    public TravellerSurnameInformation18003CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. to specify the last name and the type of person (if it's a nanny or a substitute)
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation18003CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value. Only used to put the firstname
     * 
     * @return value
     */
    public TravellerDetails18004CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value. Only used to put the firstname
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails18004CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
