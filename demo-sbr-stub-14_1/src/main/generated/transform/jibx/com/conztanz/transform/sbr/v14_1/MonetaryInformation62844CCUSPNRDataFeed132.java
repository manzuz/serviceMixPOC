
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * MONETARY INFORMATION
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_62844_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:decimal" name="amount"/>
 *     &lt;xs:element type="xs:string" name="currencyCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation62844CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal amount;
    private String currencyCode;

    /** 
     * Get the 'qualifier' element value. Monetary amount qualifier : - NP : Net Premium - PR : Premium - CV : Coverage - TV : Travel Value - SAV : Saving Amount
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Monetary amount qualifier : - NP : Net Premium - PR : Premium - CV : Coverage - TV : Travel Value - SAV : Saving Amount
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
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
     * Get the 'currencyCode' element value. Eg: USD,FRF,EUR...
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'currencyCode' element value. Eg: USD,FRF,EUR...
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
