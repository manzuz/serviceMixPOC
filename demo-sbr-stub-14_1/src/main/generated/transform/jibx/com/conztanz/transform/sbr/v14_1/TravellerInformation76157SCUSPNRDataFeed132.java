
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler and personal details relating to the traveler
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_76157_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_117948_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *     &lt;xs:element type="TravellerDetails_117949_C_CUS_PNRDataFeed_132" name="otherPaxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation76157SCUSPNRDataFeed132
{
    private TravellerSurnameInformation117948CCUSPNRDataFeed132 paxDetails;
    private TravellerDetails117949CCUSPNRDataFeed132 otherPaxDetails;

    /** 
     * Get the 'paxDetails' element value. Passenger details: - surname - type (infant,child or adult) - age - gender
     * 
     * @return value
     */
    public TravellerSurnameInformation117948CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. Passenger details: - surname - type (infant,child or adult) - age - gender
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation117948CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }

    /** 
     * Get the 'otherPaxDetails' element value. Other pax details
     * 
     * @return value
     */
    public TravellerDetails117949CCUSPNRDataFeed132 getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /** 
     * Set the 'otherPaxDetails' element value. Other pax details
     * 
     * @param otherPaxDetails
     */
    public void setOtherPaxDetails(
            TravellerDetails117949CCUSPNRDataFeed132 otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }
}
