
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler and personal details relating to the traveler
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_128683_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_187485_C_CUS_PNRDataFeed_132" name="paxDetails" minOccurs="0"/>
 *     &lt;xs:element type="TravellerDetails_187486_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation128683SCUSPNRDataFeed132
{
    private TravellerSurnameInformation187485CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails187486CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value. to specify the last name, age and gender.
     * 
     * @return value
     */
    public TravellerSurnameInformation187485CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. to specify the last name, age and gender.
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation187485CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value. to provide the first name
     * 
     * @return value
     */
    public TravellerDetails187486CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value. to provide the first name
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails187486CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
