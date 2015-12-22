
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a rate, type of tax, and currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_121395_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currencyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails121395CCUSPNRDataFeed132
{
    private String rate;
    private String countryCode;
    private String currencyCode;
    private String type;

    /** 
     * Get the 'rate' element value.
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'rate' element value.
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'countryCode' element value.
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'currencyCode' element value.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'currencyCode' element value.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
