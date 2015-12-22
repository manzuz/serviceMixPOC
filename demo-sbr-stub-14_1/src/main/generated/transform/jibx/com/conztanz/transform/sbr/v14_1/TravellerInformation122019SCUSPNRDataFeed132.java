
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_122019_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_91631_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *     &lt;xs:element type="TravellerDetails_91632_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation122019SCUSPNRDataFeed132
{
    private TravellerSurnameInformation91631CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails91632CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value.
     * 
     * @return value
     */
    public TravellerSurnameInformation91631CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value.
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation91631CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value.
     * 
     * @return value
     */
    public TravellerDetails91632CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value.
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails91632CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
