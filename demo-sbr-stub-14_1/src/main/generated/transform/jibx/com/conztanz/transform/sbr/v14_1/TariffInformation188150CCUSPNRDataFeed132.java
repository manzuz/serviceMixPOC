
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the rates or tariff details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_188150_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="priceAmount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currencyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="priceQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation188150CCUSPNRDataFeed132
{
    private BigDecimal priceAmount;
    private String currencyCode;
    private String priceQualifier;

    /** 
     * Get the 'priceAmount' element value.
     * 
     * @return value
     */
    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    /** 
     * Set the 'priceAmount' element value.
     * 
     * @param priceAmount
     */
    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
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
     * Get the 'priceQualifier' element value.
     * 
     * @return value
     */
    public String getPriceQualifier() {
        return priceQualifier;
    }

    /** 
     * Set the 'priceQualifier' element value.
     * 
     * @param priceQualifier
     */
    public void setPriceQualifier(String priceQualifier) {
        this.priceQualifier = priceQualifier;
    }
}
