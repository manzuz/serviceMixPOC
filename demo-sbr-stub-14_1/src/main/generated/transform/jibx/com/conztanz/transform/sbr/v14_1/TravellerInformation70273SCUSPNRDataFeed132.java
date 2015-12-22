
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a PAX information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_70273_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerSurnameInformation_109519_C_CUS_PNRDataFeed_132" name="paxDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation70273SCUSPNRDataFeed132
{
    private TravellerSurnameInformation109519CCUSPNRDataFeed132 paxDetails;

    /** 
     * Get the 'paxDetails' element value. Detail if the discount is adult only or infant only
     * 
     * @return value
     */
    public TravellerSurnameInformation109519CCUSPNRDataFeed132 getPaxDetails() {
        return paxDetails;
    }

    /** 
     * Set the 'paxDetails' element value. Detail if the discount is adult only or infant only
     * 
     * @param paxDetails
     */
    public void setPaxDetails(
            TravellerSurnameInformation109519CCUSPNRDataFeed132 paxDetails) {
        this.paxDetails = paxDetails;
    }
}
