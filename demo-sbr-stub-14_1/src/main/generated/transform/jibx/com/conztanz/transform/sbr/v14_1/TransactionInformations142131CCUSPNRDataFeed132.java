
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey details related to the transaction
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransactionInformations_142131_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="issueIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="transmissionControlNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransactionInformations142131CCUSPNRDataFeed132
{
    private String code;
    private String type;
    private String issueIndicator;
    private String transmissionControlNumber;

    /** 
     * Get the 'code' element value. Authorization message type  Eg 110: author according standard ISO8583 210: settlement according standard ISO858 ...
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Authorization message type  Eg 110: author according standard ISO8583 210: settlement according standard ISO858 ...
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'type' element value. Credit Card link used to perform authorization.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Credit Card link used to perform authorization.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'issueIndicator' element value. Process indicator (bulkIndicator): - bulk - superbulk - no bulk.
     * 
     * @return value
     */
    public String getIssueIndicator() {
        return issueIndicator;
    }

    /** 
     * Set the 'issueIndicator' element value. Process indicator (bulkIndicator): - bulk - superbulk - no bulk.
     * 
     * @param issueIndicator
     */
    public void setIssueIndicator(String issueIndicator) {
        this.issueIndicator = issueIndicator;
    }

    /** 
     * Get the 'transmissionControlNumber' element value. This is a message number that uniquely identifies a cardholder transaction.  According to the link this info can have various names:  - STAN number(Systems Trace Audit Number) - ISO8583 (VISA,Nedbank, Credit Mutuel...)  - Message number - APACS70 (Barclays,Euroline...)  ...   Official definition: This is a number assigned by the message initiator that uniquely identifies a cardholder transaction and all the message types (also known as system transactions) that it comprises, according to individual program rules. The trace number remains unchanged for all messages throughout the life of the transaction. For example, the same trace number is used in an authorization request and response, and in a subsequent reversal request and response, and in any advices of authorization or reversal.
     * 
     * @return value
     */
    public String getTransmissionControlNumber() {
        return transmissionControlNumber;
    }

    /** 
     * Set the 'transmissionControlNumber' element value. This is a message number that uniquely identifies a cardholder transaction.  According to the link this info can have various names:  - STAN number(Systems Trace Audit Number) - ISO8583 (VISA,Nedbank, Credit Mutuel...)  - Message number - APACS70 (Barclays,Euroline...)  ...   Official definition: This is a number assigned by the message initiator that uniquely identifies a cardholder transaction and all the message types (also known as system transactions) that it comprises, according to individual program rules. The trace number remains unchanged for all messages throughout the life of the transaction. For example, the same trace number is used in an authorization request and response, and in a subsequent reversal request and response, and in any advices of authorization or reversal.
     * 
     * @param transmissionControlNumber
     */
    public void setTransmissionControlNumber(String transmissionControlNumber) {
        this.transmissionControlNumber = transmissionControlNumber;
    }
}
