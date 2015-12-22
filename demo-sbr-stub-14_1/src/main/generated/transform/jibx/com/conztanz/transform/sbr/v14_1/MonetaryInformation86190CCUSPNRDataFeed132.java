
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_86190_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeQualifier"/>
 *     &lt;xs:element type="xs:string" name="amount"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation86190CCUSPNRDataFeed132
{
    private String typeQualifier;
    private String amount;

    /** 
     * Get the 'typeQualifier' element value. Precision concerning the amount: - VA : VAT Amount - VR : VAT Rate
     * 
     * @return value
     */
    public String getTypeQualifier() {
        return typeQualifier;
    }

    /** 
     * Set the 'typeQualifier' element value. Precision concerning the amount: - VA : VAT Amount - VR : VAT Rate
     * 
     * @param typeQualifier
     */
    public void setTypeQualifier(String typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    /** 
     * Get the 'amount' element value. Convey the VAT rate or amount
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Convey the VAT rate or amount
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
