
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a traveler and personal details relating to the traveler
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_122780_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_179445_C_CUS_PNRDataFeed_132" name="paxDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation122780SCUSPNRDataFeed132
{
    private TravellerSurnameInformation179445CCUSPNRDataFeed132 paxDetails;

    /** 
     * Get the 'paxDetails' element value. passenger type code
     * 
     * @return value
     */
    public TravellerSurnameInformation179445CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. passenger type code
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation179445CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }
}
