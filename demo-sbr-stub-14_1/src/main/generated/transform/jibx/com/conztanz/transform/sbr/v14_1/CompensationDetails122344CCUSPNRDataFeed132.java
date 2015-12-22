
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To convey Compensation details for a Customer
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompensationDetails_122344_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="form" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freeText" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompensationDetails122344CCUSPNRDataFeed132
{
    private String type;
    private String form;
    private BigDecimal amount;
    private String currency;
    private String freeText;

    /** 
     * Get the 'type' element value. Type of the compensation, ie voluntary or involuntary
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Type of the compensation, ie voluntary or involuntary
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'form' element value. Form of the payment of the compensation
     * 
     * @return value
     */
    public String getForm() {
        return form;
    }

    /** 
     * Set the 'form' element value. Form of the payment of the compensation
     * 
     * @param form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /** 
     * Get the 'amount' element value. Amount of the compensation
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Amount of the compensation
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value. Currency used for the compensation.
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. Currency used for the compensation.
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'freeText' element value. Any comment related to the compensation
     * 
     * @return value
     */
    public String getFreeText() {
        return freeText;
    }

    /** 
     * Set the 'freeText' element value. Any comment related to the compensation
     * 
     * @param freeText
     */
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }
}
