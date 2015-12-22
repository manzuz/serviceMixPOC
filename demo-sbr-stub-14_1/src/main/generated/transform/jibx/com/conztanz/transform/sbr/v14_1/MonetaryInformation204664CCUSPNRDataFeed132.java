
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_204664_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeQualifier"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation204664CCUSPNRDataFeed132
{
    private String typeQualifier;
    private BigDecimal amount;
    private String currency;

    /** 
     * Get the 'typeQualifier' element value.
     * 
     * @return value
     */
    public String getTypeQualifier() {
        return typeQualifier;
    }

    /** 
     * Set the 'typeQualifier' element value.
     * 
     * @param typeQualifier
     */
    public void setTypeQualifier(String typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    /** 
     * Get the 'amount' element value. Amount
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Amount
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value. Currency
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. Currency
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
