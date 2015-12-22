
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify country and related information, i.e. date and time of summer or winter time transition and related time variation, currency and language(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CountryInformation_76527_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="countryCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CountryInformation76527SCUSPNRDataFeed132
{
    private String countryCode;

    /** 
     * Get the 'countryCode' element value. Country code
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. Country code
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
