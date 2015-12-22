
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the rates or tariff details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_39533_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="amountType" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="totalAmount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation39533CCUSPNRDataFeed132
{
    private BigDecimal amount;
    private String currency;
    private String amountType;
    private BigDecimal totalAmount;

    /** 
     * Get the 'amount' element value. Net premium
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Net premium
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value. currency of the total price and net premium i.e in EUR/ USD
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. currency of the total price and net premium i.e in EUR/ USD
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'amountType' element value. general indicator
     * 
     * @return value
     */
    public String getAmountType() {
        return amountType;
    }

    /** 
     * Set the 'amountType' element value. general indicator
     * 
     * @param amountType
     */
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    /** 
     * Get the 'totalAmount' element value. Total amount of the insurance element.
     * 
     * @return value
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'totalAmount' element value. Total amount of the insurance element.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
