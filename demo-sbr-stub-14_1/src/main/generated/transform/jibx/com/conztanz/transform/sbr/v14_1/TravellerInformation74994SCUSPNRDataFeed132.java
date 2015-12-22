
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_74994_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_116430_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *     &lt;xs:element type="TravellerDetails_116431_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation74994SCUSPNRDataFeed132
{
    private TravellerSurnameInformation116430CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails116431CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value. Traveller information
     * 
     * @return value
     */
    public TravellerSurnameInformation116430CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. Traveller information
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation116430CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value. otehr pax details
     * 
     * @return value
     */
    public TravellerDetails116431CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value. otehr pax details
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails116431CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
