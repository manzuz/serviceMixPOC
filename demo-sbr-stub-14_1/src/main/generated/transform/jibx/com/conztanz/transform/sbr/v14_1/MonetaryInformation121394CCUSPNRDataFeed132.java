
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_121394_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeQualifier"/>
 *     &lt;xs:element type="xs:string" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation121394CCUSPNRDataFeed132
{
    private String typeQualifier;
    private String amount;
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
     * Get the 'amount' element value.
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
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
}
