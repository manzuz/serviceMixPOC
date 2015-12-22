
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the airline company and an associated airline company.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OutboundCarrierDetails_142342_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="marketingCarrier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OutboundCarrierDetails142342CCUSPNRDataFeed132
{
    private String marketingCarrier;

    /** 
     * Get the 'marketingCarrier' element value.
     * 
     * @return value
     */
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    /** 
     * Set the 'marketingCarrier' element value.
     * 
     * @param marketingCarrier
     */
    public void setMarketingCarrier(String marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }
}
