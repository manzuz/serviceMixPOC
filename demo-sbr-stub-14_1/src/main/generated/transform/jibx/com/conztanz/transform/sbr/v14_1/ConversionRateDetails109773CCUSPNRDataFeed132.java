
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the conversion rate and the monetary amount.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConversionRateDetails_109773_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="pricingAmount" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="convertedValueAmount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConversionRateDetails109773CCUSPNRDataFeed132
{
    private String currency;
    private BigDecimal pricingAmount;
    private BigDecimal convertedValueAmount;

    /** 
     * Get the 'currency' element value. Banker rate currency.
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. Banker rate currency.
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'pricingAmount' element value. Banker amount 1.
     * 
     * @return value
     */
    public BigDecimal getPricingAmount() {
        return pricingAmount;
    }

    /** 
     * Set the 'pricingAmount' element value. Banker amount 1.
     * 
     * @param pricingAmount
     */
    public void setPricingAmount(BigDecimal pricingAmount) {
        this.pricingAmount = pricingAmount;
    }

    /** 
     * Get the 'convertedValueAmount' element value. Banker amount 2.
     * 
     * @return value
     */
    public BigDecimal getConvertedValueAmount() {
        return convertedValueAmount;
    }

    /** 
     * Set the 'convertedValueAmount' element value. Banker amount 2.
     * 
     * @param convertedValueAmount
     */
    public void setConvertedValueAmount(BigDecimal convertedValueAmount) {
        this.convertedValueAmount = convertedValueAmount;
    }
}
