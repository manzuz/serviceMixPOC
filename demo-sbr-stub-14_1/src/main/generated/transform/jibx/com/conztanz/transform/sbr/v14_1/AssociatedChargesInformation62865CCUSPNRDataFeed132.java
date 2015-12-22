
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Identification of the additional charges that are associated to a product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AssociatedChargesInformation_62865_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberInParty" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="comment" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AssociatedChargesInformation62865CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal amount;
    private String description;
    private BigDecimal numberInParty;
    private String currency;
    private String comment;

    /** 
     * Get the 'type' element value. This data element is used to identify the type of charge entered in the other fields.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. This data element is used to identify the type of charge entered in the other fields.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'amount' element value. This data element is used to convey the amount of the supplementary charge.
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. This data element is used to convey the amount of the supplementary charge.
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'description' element value. To qualify the amount, can be - UNL (for unlimited mileage) when used for free mileage - 3 (for included in base rate) - 4 (for not included in base rate)
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. To qualify the amount, can be - UNL (for unlimited mileage) when used for free mileage - 3 (for included in base rate) - 4 (for not included in base rate)
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'numberInParty' element value. This data element is used to specify the number of charge needed.
     * 
     * @return value
     */
    public BigDecimal getNumberInParty() {
        return numberInParty;
    }

    /** 
     * Set the 'numberInParty' element value. This data element is used to specify the number of charge needed.
     * 
     * @param numberInParty
     */
    public void setNumberInParty(BigDecimal numberInParty) {
        this.numberInParty = numberInParty;
    }

    /** 
     * Get the 'currency' element value. This data element is used to convey the currency
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. This data element is used to convey the currency
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'comment' element value. This data element is used to convey the voucher text (in case of voucher).
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'comment' element value. This data element is used to convey the voucher text (in case of voucher).
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
