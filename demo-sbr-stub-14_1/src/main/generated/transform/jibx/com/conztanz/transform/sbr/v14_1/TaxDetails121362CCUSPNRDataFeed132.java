
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a rate, type of tax, and currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_121362_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rate"/>
 *     &lt;xs:element type="xs:string" name="countryCode"/>
 *     &lt;xs:element type="xs:string" name="currencyCode"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails121362CCUSPNRDataFeed132
{
    private String rate;
    private String countryCode;
    private String currencyCode;
    private String type;

    /** 
     * Get the 'rate' element value. Tax amount
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'rate' element value. Tax amount
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'countryCode' element value. ISO tax code
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. ISO tax code
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'currencyCode' element value. Currency code
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'currencyCode' element value. Currency code
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'type' element value. Nature tax code
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Nature tax code
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
