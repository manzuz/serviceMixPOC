
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_118484_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeQualifier"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation118484CCUSPNRDataFeed132
{
    private String typeQualifier;
    private BigDecimal amount;

    /** 
     * Get the 'typeQualifier' element value. Yield type
     * 
     * @return value
     */
    public String getTypeQualifier() {
        return typeQualifier;
    }

    /** 
     * Set the 'typeQualifier' element value. Yield type
     * 
     * @param typeQualifier
     */
    public void setTypeQualifier(String typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    /** 
     * Get the 'amount' element value. Amount of the Yield
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Amount of the Yield
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
