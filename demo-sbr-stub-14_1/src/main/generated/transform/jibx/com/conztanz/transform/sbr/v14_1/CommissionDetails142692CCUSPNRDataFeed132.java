
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the commission conditions, amount, currency, party paying and any related free text.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionDetails_142692_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="rate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionDetails142692CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal amount;
    private String currency;
    private BigDecimal rate;

    /** 
     * Get the 'type' element value. Commission type : 'NEW' --) New commission 'OLD' --) Old Commission 'XLP' --) Commission on cancellation Penalty 'FMA' --) Airline Commission A 'FMB' --) Airline Commission B
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Commission type : 'NEW' --) New commission 'OLD' --) Old Commission 'XLP' --) Commission on cancellation Penalty 'FMA' --) Airline Commission A 'FMB' --) Airline Commission B
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'amount' element value. Commission amount
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Commission amount
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value.
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value.
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'rate' element value. Commission percentage
     * 
     * @return value
     */
    public BigDecimal getRate() {
        return rate;
    }

    /** 
     * Set the 'rate' element value. Commission percentage
     * 
     * @param rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
