
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * credit card info
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreditCardInformation_142116_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="vendorCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="vendorCodeSubType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cardNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="securityId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="expiryDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="startDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="endDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="ccHolderName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="issuingBankName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cardCountryOfIssuance" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="issueNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="issuingBankLongName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="track1" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="track2" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="track3" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="pinCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="rawTrackData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CreditCardInformation142116CCUSPNRDataFeed132
{
    private String vendorCode;
    private String vendorCodeSubType;
    private String cardNumber;
    private String securityId;
    private String expiryDate;
    private String startDate;
    private String endDate;
    private String ccHolderName;
    private String issuingBankName;
    private String cardCountryOfIssuance;
    private BigDecimal issueNumber;
    private String issuingBankLongName;
    private String track1;
    private String track2;
    private String track3;
    private String pinCode;
    private String rawTrackData;

    /** 
     * Get the 'vendorCode' element value. Vendor code (VI,CA,AX.)
     * 
     * @return value
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /** 
     * Set the 'vendorCode' element value. Vendor code (VI,CA,AX.)
     * 
     * @param vendorCode
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /** 
     * Get the 'vendorCodeSubType' element value. may contain CC sub Types. eg: Maestro or Solo cards
     * 
     * @return value
     */
    public String getVendorCodeSubType() {
        return vendorCodeSubType;
    }

    /** 
     * Set the 'vendorCodeSubType' element value. may contain CC sub Types. eg: Maestro or Solo cards
     * 
     * @param vendorCodeSubType
     */
    public void setVendorCodeSubType(String vendorCodeSubType) {
        this.vendorCodeSubType = vendorCodeSubType;
    }

    /** 
     * Get the 'cardNumber' element value. Card number  Card number
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'cardNumber' element value. Card number  Card number
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'securityId' element value. Conveys the security ID of the Credit Card (CVV,CVV2), 3-4 digits stored on the back of the card
     * 
     * @return value
     */
    public String getSecurityId() {
        return securityId;
    }

    /** 
     * Set the 'securityId' element value. Conveys the security ID of the Credit Card (CVV,CVV2), 3-4 digits stored on the back of the card
     * 
     * @param securityId
     */
    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    /** 
     * Get the 'expiryDate' element value. Expiry date :  format    MMYY
     * 
     * @return value
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /** 
     * Set the 'expiryDate' element value. Expiry date :  format    MMYY
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /** 
     * Get the 'startDate' element value. This field indicates the date the Credit Card was issued. This data is present in case of (UK) maestro cards.
     * 
     * @return value
     */
    public String getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'startDate' element value. This field indicates the date the Credit Card was issued. This data is present in case of (UK) maestro cards.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'endDate' element value. This field indicates the date the Credit Card will not be valid anymore This data is present in case of (UK) maestro cards. May be different from the expiry date
     * 
     * @return value
     */
    public String getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'endDate' element value. This field indicates the date the Credit Card will not be valid anymore This data is present in case of (UK) maestro cards. May be different from the expiry date
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'ccHolderName' element value. Conveys Credit card holder's name, as written on the card
     * 
     * @return value
     */
    public String getCcHolderName() {
        return ccHolderName;
    }

    /** 
     * Set the 'ccHolderName' element value. Conveys Credit card holder's name, as written on the card
     * 
     * @param ccHolderName
     */
    public void setCcHolderName(String ccHolderName) {
        this.ccHolderName = ccHolderName;
    }

    /** 
     * Get the 'issuingBankName' element value. will contain the code of the bank that issued the credit card
     * 
     * @return value
     */
    public String getIssuingBankName() {
        return issuingBankName;
    }

    /** 
     * Set the 'issuingBankName' element value. will contain the code of the bank that issued the credit card
     * 
     * @param issuingBankName
     */
    public void setIssuingBankName(String issuingBankName) {
        this.issuingBankName = issuingBankName;
    }

    /** 
     * Get the 'cardCountryOfIssuance' element value. CC country of issuance details
     * 
     * @return value
     */
    public String getCardCountryOfIssuance() {
        return cardCountryOfIssuance;
    }

    /** 
     * Set the 'cardCountryOfIssuance' element value. CC country of issuance details
     * 
     * @param cardCountryOfIssuance
     */
    public void setCardCountryOfIssuance(String cardCountryOfIssuance) {
        this.cardCountryOfIssuance = cardCountryOfIssuance;
    }

    /** 
     * Get the 'issueNumber' element value. This is the Credit Card Issue number. This represents the number of time a card has been issued.  1 is for the first time then in case of card renewal or card loss this issue number will be increased Today this is applicable to maestro cards.
     * 
     * @return value
     */
    public BigDecimal getIssueNumber() {
        return issueNumber;
    }

    /** 
     * Set the 'issueNumber' element value. This is the Credit Card Issue number. This represents the number of time a card has been issued.  1 is for the first time then in case of card renewal or card loss this issue number will be increased Today this is applicable to maestro cards.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(BigDecimal issueNumber) {
        this.issueNumber = issueNumber;
    }

    /** 
     * Get the 'issuingBankLongName' element value. Will convey the full name of the institution that issued he credit card
     * 
     * @return value
     */
    public String getIssuingBankLongName() {
        return issuingBankLongName;
    }

    /** 
     * Set the 'issuingBankLongName' element value. Will convey the full name of the institution that issued he credit card
     * 
     * @param issuingBankLongName
     */
    public void setIssuingBankLongName(String issuingBankLongName) {
        this.issuingBankLongName = issuingBankLongName;
    }

    /** 
     * Get the 'track1' element value. Stores the CC track 1 information (base64 encoded)
     * 
     * @return value
     */
    public String getTrack1() {
        return track1;
    }

    /** 
     * Set the 'track1' element value. Stores the CC track 1 information (base64 encoded)
     * 
     * @param track1
     */
    public void setTrack1(String track1) {
        this.track1 = track1;
    }

    /** 
     * Get the 'track2' element value. Stores the CC track 2 information (base64 encoded)
     * 
     * @return value
     */
    public String getTrack2() {
        return track2;
    }

    /** 
     * Set the 'track2' element value. Stores the CC track 2 information (base64 encoded)
     * 
     * @param track2
     */
    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    /** 
     * Get the 'track3' element value. Stores the CC track 3 information (base64 encoded)
     * 
     * @return value
     */
    public String getTrack3() {
        return track3;
    }

    /** 
     * Set the 'track3' element value. Stores the CC track 3 information (base64 encoded)
     * 
     * @param track3
     */
    public void setTrack3(String track3) {
        this.track3 = track3;
    }

    /** 
     * Get the 'pinCode' element value. Stores the CC pin code information
     * 
     * @return value
     */
    public String getPinCode() {
        return pinCode;
    }

    /** 
     * Set the 'pinCode' element value. Stores the CC pin code information
     * 
     * @param pinCode
     */
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    /** 
     * Get the 'rawTrackData' element value. All the tracks of a swipe credit card are contained here as one block.
     * 
     * @return value
     */
    public String getRawTrackData() {
        return rawTrackData;
    }

    /** 
     * Set the 'rawTrackData' element value. All the tracks of a swipe credit card are contained here as one block.
     * 
     * @param rawTrackData
     */
    public void setRawTrackData(String rawTrackData) {
        this.rawTrackData = rawTrackData;
    }
}
