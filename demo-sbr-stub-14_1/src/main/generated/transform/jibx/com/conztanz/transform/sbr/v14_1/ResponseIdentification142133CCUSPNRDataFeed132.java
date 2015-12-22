
package com.conztanz.transform.sbr.v14_1;

/** 
 * RESPONSE IDENTIFICATION
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ResponseIdentification_142133_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="transacIdentifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="validationCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="banknetRefNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="banknetDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ResponseIdentification142133CCUSPNRDataFeed132
{
    private String transacIdentifier;
    private String validationCode;
    private String banknetRefNumber;
    private String banknetDate;

    /** 
     * Get the 'transacIdentifier' element value. Transaction identifier   Field 62.2  Official definition: Visa-generated identifier that is unique for each original transaction. The transaction identifier (TID) is a key element that links original authorization requests to subsequent messages, such as reversals.
     * 
     * @return value
     */
    public String getTransacIdentifier() {
        return transacIdentifier;
    }

    /** 
     * Set the 'transacIdentifier' element value. Transaction identifier   Field 62.2  Official definition: Visa-generated identifier that is unique for each original transaction. The transaction identifier (TID) is a key element that links original authorization requests to subsequent messages, such as reversals.
     * 
     * @param transacIdentifier
     */
    public void setTransacIdentifier(String transacIdentifier) {
        this.transacIdentifier = transacIdentifier;
    }

    /** 
     * Get the 'validationCode' element value. Validation code    Field 62.3
     * 
     * @return value
     */
    public String getValidationCode() {
        return validationCode;
    }

    /** 
     * Set the 'validationCode' element value. Validation code    Field 62.3
     * 
     * @param validationCode
     */
    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    /** 
     * Get the 'banknetRefNumber' element value. Gateway Transaction Identifier - Banknet reference number   Field 62.17 - Position 8-13
     * 
     * @return value
     */
    public String getBanknetRefNumber() {
        return banknetRefNumber;
    }

    /** 
     * Set the 'banknetRefNumber' element value. Gateway Transaction Identifier - Banknet reference number   Field 62.17 - Position 8-13
     * 
     * @param banknetRefNumber
     */
    public void setBanknetRefNumber(String banknetRefNumber) {
        this.banknetRefNumber = banknetRefNumber;
    }

    /** 
     * Get the 'banknetDate' element value. Gateway Transaction Identifier - Banknet date in mmdd format  Field 62.17 - Position 1-4
     * 
     * @return value
     */
    public String getBanknetDate() {
        return banknetDate;
    }

    /** 
     * Set the 'banknetDate' element value. Gateway Transaction Identifier - Banknet date in mmdd format  Field 62.17 - Position 1-4
     * 
     * @param banknetDate
     */
    public void setBanknetDate(String banknetDate) {
        this.banknetDate = banknetDate;
    }
}
