
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify traveller/personal details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerInformation_165520_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerDetails_234142_C_CUS_PNRDataFeed_132" name="traveller" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerInformation165520SCUSPNRDataFeed132
{
    private TravellerDetails234142CCUSPNRDataFeed132 traveller;

    /** 
     * Get the 'traveller' element value. traveller
     * 
     * @return value
     */
    public TravellerDetails234142CCUSPNRDataFeed132 getTraveller() {
        return traveller;
    }

    /** 
     * Set the 'traveller' element value. traveller
     * 
     * @param traveller
     */
    public void setTraveller(TravellerDetails234142CCUSPNRDataFeed132 traveller) {
        this.traveller = traveller;
    }
}
