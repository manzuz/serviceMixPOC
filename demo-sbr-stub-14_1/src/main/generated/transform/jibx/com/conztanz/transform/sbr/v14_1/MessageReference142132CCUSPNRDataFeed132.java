
package com.conztanz.transform.sbr.v14_1;

/** 
 * INFORMATION SPECIFIC TO VISA
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MessageReference_142132_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="retrievalReferenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="authorCharacteristicIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="authorResponseCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cardLevelResult" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="terminalType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MessageReference142132CCUSPNRDataFeed132
{
    private String retrievalReferenceNumber;
    private String authorCharacteristicIndicator;
    private String authorResponseCode;
    private String cardLevelResult;
    private String terminalType;

    /** 
     * Get the 'retrievalReferenceNumber' element value. This number is used to identify and track ALL messages related to a given cardholder transaction (author, retry, reversal ...). It is usually composed of: - the date when the message was formatted followed by - the message number   Field 37  Official definition of Retrieval Reference Number from ISO8583: Field 37 contains a number used with other key data elements to identify and track all messages related to a given cardholder transaction (referred to as a transaction set). It is usually assigned by the acquirer, but it may be assigned by a merchant or by an individual electronic terminal. V.I.P. will also generate the retrieval reference number for transactions it initiates. This field contains two parts. The first four digits are usually a yddd date (Julian date format). The date is defined to be the same day as the date in Field 7_Transmission Date and Time, of the original request. The last eight digits are a numeric transaction identification number. The value in field 37 can be based on the content of fields 7 and 11 in the original request or advice as shown in the recommendation below: . Positions 1_4: the yddd equivalent of the field 7 date . Positions 5_6: the hours from the time in field 7 . Positions 7_12: the value from field 11
     * 
     * @return value
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /** 
     * Set the 'retrievalReferenceNumber' element value. This number is used to identify and track ALL messages related to a given cardholder transaction (author, retry, reversal ...). It is usually composed of: - the date when the message was formatted followed by - the message number   Field 37  Official definition of Retrieval Reference Number from ISO8583: Field 37 contains a number used with other key data elements to identify and track all messages related to a given cardholder transaction (referred to as a transaction set). It is usually assigned by the acquirer, but it may be assigned by a merchant or by an individual electronic terminal. V.I.P. will also generate the retrieval reference number for transactions it initiates. This field contains two parts. The first four digits are usually a yddd date (Julian date format). The date is defined to be the same day as the date in Field 7_Transmission Date and Time, of the original request. The last eight digits are a numeric transaction identification number. The value in field 37 can be based on the content of fields 7 and 11 in the original request or advice as shown in the recommendation below: . Positions 1_4: the yddd equivalent of the field 7 date . Positions 5_6: the hours from the time in field 7 . Positions 7_12: the value from field 11
     * 
     * @param retrievalReferenceNumber
     */
    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    /** 
     * Get the 'authorCharacteristicIndicator' element value. Authorization characteristics indicator   Field 62.1 Possible values: A C E F K M S U V W R I P N T
     * 
     * @return value
     */
    public String getAuthorCharacteristicIndicator() {
        return authorCharacteristicIndicator;
    }

    /** 
     * Set the 'authorCharacteristicIndicator' element value. Authorization characteristics indicator   Field 62.1 Possible values: A C E F K M S U V W R I P N T
     * 
     * @param authorCharacteristicIndicator
     */
    public void setAuthorCharacteristicIndicator(
            String authorCharacteristicIndicator) {
        this.authorCharacteristicIndicator = authorCharacteristicIndicator;
    }

    /** 
     * Get the 'authorResponseCode' element value. Authorization response code   Field 39
     * 
     * @return value
     */
    public String getAuthorResponseCode() {
        return authorResponseCode;
    }

    /** 
     * Set the 'authorResponseCode' element value. Authorization response code   Field 39
     * 
     * @param authorResponseCode
     */
    public void setAuthorResponseCode(String authorResponseCode) {
        this.authorResponseCode = authorResponseCode;
    }

    /** 
     * Get the 'cardLevelResult' element value. Card Level Result (Product Identification value)  Field 62.23
     * 
     * @return value
     */
    public String getCardLevelResult() {
        return cardLevelResult;
    }

    /** 
     * Set the 'cardLevelResult' element value. Card Level Result (Product Identification value)  Field 62.23
     * 
     * @param cardLevelResult
     */
    public void setCardLevelResult(String cardLevelResult) {
        this.cardLevelResult = cardLevelResult;
    }

    /** 
     * Get the 'terminalType' element value. Additional POS Information - Terminal Type  Field 60.1 - Position 1  CAT (Cardholder-Activated Terminal indicator) or UAT (Unattended Acceptance Terminal)
     * 
     * @return value
     */
    public String getTerminalType() {
        return terminalType;
    }

    /** 
     * Set the 'terminalType' element value. Additional POS Information - Terminal Type  Field 60.1 - Position 1  CAT (Cardholder-Activated Terminal indicator) or UAT (Unattended Acceptance Terminal)
     * 
     * @param terminalType
     */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }
}
