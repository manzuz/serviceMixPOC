
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcessBaggageDetails_79022_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ExcessBaggageDetails_121367_C_CUS_PNRDataFeed_132" name="excessBaggageDetails" minOccurs="0"/>
 *     &lt;xs:element type="BaggageDetails_121368_C_CUS_PNRDataFeed_132" name="baggageDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExcessBaggageDetails79022SCUSPNRDataFeed132
{
    private ExcessBaggageDetails121367CCUSPNRDataFeed132 excessBaggageDetails;
    private BaggageDetails121368CCUSPNRDataFeed132 baggageDetails;

    /** 
     * Get the 'excessBaggageDetails' element value. Excess baggage charge
     * 
     * @return value
     */
    public ExcessBaggageDetails121367CCUSPNRDataFeed132 getExcessBaggageDetails() {
        return excessBaggageDetails;
    }

    /** 
     * Set the 'excessBaggageDetails' element value. Excess baggage charge
     * 
     * @param excessBaggageDetails
     */
    public void setExcessBaggageDetails(
            ExcessBaggageDetails121367CCUSPNRDataFeed132 excessBaggageDetails) {
        this.excessBaggageDetails = excessBaggageDetails;
    }

    /** 
     * Get the 'baggageDetails' element value. Excess baggage quantity
     * 
     * @return value
     */
    public BaggageDetails121368CCUSPNRDataFeed132 getBaggageDetails() {
        return baggageDetails;
    }

    /** 
     * Set the 'baggageDetails' element value. Excess baggage quantity
     * 
     * @param baggageDetails
     */
    public void setBaggageDetails(
            BaggageDetails121368CCUSPNRDataFeed132 baggageDetails) {
        this.baggageDetails = baggageDetails;
    }
}
