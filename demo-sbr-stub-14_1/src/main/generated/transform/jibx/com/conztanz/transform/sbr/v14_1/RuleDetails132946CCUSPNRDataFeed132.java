
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To indicate the coded rule, a number and it's              relation to the rule, a start day of service, a              monetary amount associated to the rule, and              additional information associated with the rule
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleDetails_132946_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="quantityUnit" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="daysOfOperation" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleDetails132946CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal quantity;
    private String quantityUnit;
    private String qualifier;
    private String daysOfOperation;
    private BigDecimal amount;
    private String currency;

    /** 
     * Get the 'type' element value. Coded rule type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Coded rule type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'quantity' element value. quantity (if applicable)
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value. quantity (if applicable)
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'quantityUnit' element value. DAY for Day HOR for Hour (if applicable)
     * 
     * @return value
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /** 
     * Set the 'quantityUnit' element value. DAY for Day HOR for Hour (if applicable)
     * 
     * @param quantityUnit
     */
    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    /** 
     * Get the 'qualifier' element value. Deposit Information: - BRE Before Rental - AFT After Booking Pickup Information - MAX Maximum Days Rental - MIN Minimum Days Rental One Way Information: - 009 for One Way Allowed - 005 for One Way not Allowed - 006 for Restricted One Way Allowed
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Deposit Information: - BRE Before Rental - AFT After Booking Pickup Information - MAX Maximum Days Rental - MIN Minimum Days Rental One Way Information: - 009 for One Way Allowed - 005 for One Way not Allowed - 006 for Restricted One Way Allowed
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'daysOfOperation' element value. Day of the week (Monday=1, Sunday=7)
     * 
     * @return value
     */
    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    /** 
     * Set the 'daysOfOperation' element value. Day of the week (Monday=1, Sunday=7)
     * 
     * @param daysOfOperation
     */
    public void setDaysOfOperation(String daysOfOperation) {
        this.daysOfOperation = daysOfOperation;
    }

    /** 
     * Get the 'amount' element value. Rule amount (if applicable)
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Rule amount (if applicable)
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value. Rule currency amount (if applicable)
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. Rule currency amount (if applicable)
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
