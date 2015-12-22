
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the types of rates.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateTypes_83030_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rateCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RateTypes83030SCUSPNRDataFeed132
{
    private String rateCode;

    /** 
     * Get the 'rateCode' element value. This element holds the rate code that applies to the Ferry booking.
     * 
     * @return value
     */
    public String getRateCode() {
        return rateCode;
    }

    /** 
     * Set the 'rateCode' element value. This element holds the rate code that applies to the Ferry booking.
     * 
     * @param rateCode
     */
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }
}
