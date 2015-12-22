
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pasbcq1a044Group43_xsbDetails_pricingRouting_90297_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginAndDestinationDetails_70484_S_CUS_PNRDataFeed_132" name="pricingCities"/>
 *     &lt;xs:element type="TransportIdentifier_70488_S_CUS_PNRDataFeed_132" name="pricingCarrier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Pasbcq1a044Group43XsbDetailsPricingRouting90297GCUSPNRDataFeed132
{
    private OriginAndDestinationDetails70484SCUSPNRDataFeed132 pricingCities;
    private TransportIdentifier70488SCUSPNRDataFeed132 pricingCarrier;

    /** 
     * Get the 'pricingCities' element value. City from an city to of pricing routing.
     * 
     * @return value
     */
    public OriginAndDestinationDetails70484SCUSPNRDataFeed132 getPricingCities() {
        return pricingCities;
    }

    /** 
     * Set the 'pricingCities' element value. City from an city to of pricing routing.
     * 
     * @param pricingCities
     */
    public void setPricingCities(
            OriginAndDestinationDetails70484SCUSPNRDataFeed132 pricingCities) {
        this.pricingCities = pricingCities;
    }

    /** 
     * Get the 'pricingCarrier' element value. XSB pricing airline.
     * 
     * @return value
     */
    public TransportIdentifier70488SCUSPNRDataFeed132 getPricingCarrier() {
        return pricingCarrier;
    }

    /** 
     * Set the 'pricingCarrier' element value. XSB pricing airline.
     * 
     * @param pricingCarrier
     */
    public void setPricingCarrier(
            TransportIdentifier70488SCUSPNRDataFeed132 pricingCarrier) {
        this.pricingCarrier = pricingCarrier;
    }
}
