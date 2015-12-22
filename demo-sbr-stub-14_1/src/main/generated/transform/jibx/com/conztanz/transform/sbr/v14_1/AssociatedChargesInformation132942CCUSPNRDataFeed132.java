
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Identification of the additional charges that are associated to a product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AssociatedChargesInformation_132942_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberInParty" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="periodType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="comment" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AssociatedChargesInformation132942CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal amount;
    private String description;
    private BigDecimal numberInParty;
    private String periodType;
    private String currency;
    private String comment;

    /** 
     * Get the 'type' element value. - 045 Tax - 108 Surchage - COV Coverage - CPN Coupon
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. - 045 Tax - 108 Surchage - COV Coverage - CPN Coupon
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'amount' element value. Policy amount (coupon amount)
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Policy amount (coupon amount)
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'description' element value. Qualifier: The possible values are: - IES included in Estimated Total - IBR included in Base Rate - OPT Optional - MAN Mandatory - NBR Not Included in Base Rate - ITX Policy amount Includes Tax - NTX Policy amount Not Includes Tax
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Qualifier: The possible values are: - IES included in Estimated Total - IBR included in Base Rate - OPT Optional - MAN Mandatory - NBR Not Included in Base Rate - ITX Policy amount Includes Tax - NTX Policy amount Not Includes Tax
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'numberInParty' element value. Maximum days
     * 
     * @return value
     */
    public BigDecimal getNumberInParty() {
        return numberInParty;
    }

    /** 
     * Set the 'numberInParty' element value. Maximum days
     * 
     * @param numberInParty
     */
    public void setNumberInParty(BigDecimal numberInParty) {
        this.numberInParty = numberInParty;
    }

    /** 
     * Get the 'periodType' element value. 001 per day 002 per week 003 per month 004 per rental 012 tax percentage 013 no coupon value available
     * 
     * @return value
     */
    public String getPeriodType() {
        return periodType;
    }

    /** 
     * Set the 'periodType' element value. 001 per day 002 per week 003 per month 004 per rental 012 tax percentage 013 no coupon value available
     * 
     * @param periodType
     */
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    /** 
     * Get the 'currency' element value. Policy amount currency
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. Policy amount currency
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'comment' element value. Policy name
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'comment' element value. Policy name
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
