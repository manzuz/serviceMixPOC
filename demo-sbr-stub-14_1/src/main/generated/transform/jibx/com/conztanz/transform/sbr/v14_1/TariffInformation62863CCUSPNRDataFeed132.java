
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the rates or tariff details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_62863_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rateType" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="ratePlanIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="amountType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="rateChangeIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="firstDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation62863CCUSPNRDataFeed132
{
    private String rateType;
    private BigDecimal amount;
    private String currency;
    private String ratePlanIndicator;
    private String amountType;
    private String rateChangeIndicator;
    private String firstDate;

    /** 
     * Get the 'rateType' element value. A unique rate product identifier.
     * 
     * @return value
     */
    public String getRateType() {
        return rateType;
    }

    /** 
     * Set the 'rateType' element value. A unique rate product identifier.
     * 
     * @param rateType
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    /** 
     * Get the 'amount' element value. This field is used to convey the amount.
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. This field is used to convey the amount.
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value. This field is used to convey the currency
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. This field is used to convey the currency
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'ratePlanIndicator' element value. This data element is used to convey the rate plan (Daily or total indicator).
     * 
     * @return value
     */
    public String getRatePlanIndicator() {
        return ratePlanIndicator;
    }

    /** 
     * Set the 'ratePlanIndicator' element value. This data element is used to convey the rate plan (Daily or total indicator).
     * 
     * @param ratePlanIndicator
     */
    public void setRatePlanIndicator(String ratePlanIndicator) {
        this.ratePlanIndicator = ratePlanIndicator;
    }

    /** 
     * Get the 'amountType' element value. This data element is used to convey the rate amount type.
     * 
     * @return value
     */
    public String getAmountType() {
        return amountType;
    }

    /** 
     * Set the 'amountType' element value. This data element is used to convey the rate amount type.
     * 
     * @param amountType
     */
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    /** 
     * Get the 'rateChangeIndicator' element value. This data element is used to specify the fact that a rate change occurs during the period of the stay. If the is a change the value is * (for YES)
     * 
     * @return value
     */
    public String getRateChangeIndicator() {
        return rateChangeIndicator;
    }

    /** 
     * Set the 'rateChangeIndicator' element value. This data element is used to specify the fact that a rate change occurs during the period of the stay. If the is a change the value is * (for YES)
     * 
     * @param rateChangeIndicator
     */
    public void setRateChangeIndicator(String rateChangeIndicator) {
        this.rateChangeIndicator = rateChangeIndicator;
    }

    /** 
     * Get the 'firstDate' element value. contains the First Date information
     * 
     * @return value
     */
    public String getFirstDate() {
        return firstDate;
    }

    /** 
     * Set the 'firstDate' element value. contains the First Date information
     * 
     * @param firstDate
     */
    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }
}
