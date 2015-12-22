
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler and personal details relating to the traveler
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_76095_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_117858_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation76095SCUSPNRDataFeed132
{
    private TravellerSurnameInformation117858CCUSPNRDataFeed132 paxDetails;

    /** 
     * Get the 'paxDetails' element value. Traveller Surname Information
     * 
     * @return value
     */
    public TravellerSurnameInformation117858CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. Traveller Surname Information
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation117858CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }
}
