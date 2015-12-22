
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the baggage details, including number of bags and serial numbers.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerBaggageDetails_129119_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="BaggageDetails_188140_C_CUS_PNRDataFeed_132" name="baggageDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerBaggageDetails129119SCUSPNRDataFeed132
{
    private BaggageDetails188140CCUSPNRDataFeed132 baggageDetails;

    /** 
     * Get the 'baggageDetails' element value. convey bagagge details
     * 
     * @return value
     */
    public BaggageDetails188140CCUSPNRDataFeed132 getBaggageDetails() {
        return baggageDetails;
    }

    /** 
     * Set the 'baggageDetails' element value. convey bagagge details
     * 
     * @param baggageDetails
     */
    public void setBaggageDetails(
            BaggageDetails188140CCUSPNRDataFeed132 baggageDetails) {
        this.baggageDetails = baggageDetails;
    }
}
