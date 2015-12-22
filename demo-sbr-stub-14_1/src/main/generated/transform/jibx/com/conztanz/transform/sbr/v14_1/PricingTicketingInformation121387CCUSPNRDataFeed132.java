
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify indicators related to pricing and ticketing.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingTicketingInformation_121387_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicators"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingTicketingInformation121387CCUSPNRDataFeed132
{
    private String indicators;

    /** 
     * Get the 'indicators' element value. Scheme Indicator (for TST NEGO)
     * 
     * @return value
     */
    public String getIndicators() {
        return indicators;
    }

    /** 
     * Set the 'indicators' element value. Scheme Indicator (for TST NEGO)
     * 
     * @param indicators
     */
    public void setIndicators(String indicators) {
        this.indicators = indicators;
    }
}
