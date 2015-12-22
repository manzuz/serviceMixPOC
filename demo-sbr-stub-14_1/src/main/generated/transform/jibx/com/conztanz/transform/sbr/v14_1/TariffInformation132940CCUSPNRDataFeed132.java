
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the rates or tariff details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_132940_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rateChangeIndicator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation132940CCUSPNRDataFeed132
{
    private String rateChangeIndicator;

    /** 
     * Get the 'rateChangeIndicator' element value. CNV for converted Rate
     * 
     * @return value
     */
    public String getRateChangeIndicator() {
        return rateChangeIndicator;
    }

    /** 
     * Set the 'rateChangeIndicator' element value. CNV for converted Rate
     * 
     * @param rateChangeIndicator
     */
    public void setRateChangeIndicator(String rateChangeIndicator) {
        this.rateChangeIndicator = rateChangeIndicator;
    }
}
