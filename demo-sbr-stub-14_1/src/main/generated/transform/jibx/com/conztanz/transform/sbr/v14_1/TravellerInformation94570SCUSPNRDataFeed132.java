
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler and personal details relating to the traveler
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_94570_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_142192_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *     &lt;xs:element type="TravellerDetails_142193_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation94570SCUSPNRDataFeed132
{
    private TravellerSurnameInformation142192CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails142193CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value. will convey the name of the credit card holder
     * 
     * @return value
     */
    public TravellerSurnameInformation142192CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. will convey the name of the credit card holder
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation142192CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value. will convey the CC holder first name
     * 
     * @return value
     */
    public TravellerDetails142193CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value. will convey the CC holder first name
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails142193CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
