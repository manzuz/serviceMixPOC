
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the coupon number, status, value, and other related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_173488_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cpnNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnStatus" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnAmount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnExchangeMedia" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="settlementAuthorization" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="voluntaryIndic" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnPreviousStatus" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnSequenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnReferenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cpnInConnectionWithQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation173488CCUSPNRDataFeed132
{
    private String cpnNumber;
    private String cpnStatus;
    private String cpnAmount;
    private String cpnExchangeMedia;
    private String settlementAuthorization;
    private String voluntaryIndic;
    private String cpnPreviousStatus;
    private String cpnSequenceNumber;
    private String cpnReferenceNumber;
    private String cpnInConnectionWithQualifier;

    /** 
     * Get the 'cpnNumber' element value.
     * 
     * @return value
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /** 
     * Set the 'cpnNumber' element value.
     * 
     * @param cpnNumber
     */
    public void setCpnNumber(String cpnNumber) {
        this.cpnNumber = cpnNumber;
    }

    /** 
     * Get the 'cpnStatus' element value.
     * 
     * @return value
     */
    public String getCpnStatus() {
        return cpnStatus;
    }

    /** 
     * Set the 'cpnStatus' element value.
     * 
     * @param cpnStatus
     */
    public void setCpnStatus(String cpnStatus) {
        this.cpnStatus = cpnStatus;
    }

    /** 
     * Get the 'cpnAmount' element value.
     * 
     * @return value
     */
    public String getCpnAmount() {
        return cpnAmount;
    }

    /** 
     * Set the 'cpnAmount' element value.
     * 
     * @param cpnAmount
     */
    public void setCpnAmount(String cpnAmount) {
        this.cpnAmount = cpnAmount;
    }

    /** 
     * Get the 'cpnExchangeMedia' element value.
     * 
     * @return value
     */
    public String getCpnExchangeMedia() {
        return cpnExchangeMedia;
    }

    /** 
     * Set the 'cpnExchangeMedia' element value.
     * 
     * @param cpnExchangeMedia
     */
    public void setCpnExchangeMedia(String cpnExchangeMedia) {
        this.cpnExchangeMedia = cpnExchangeMedia;
    }

    /** 
     * Get the 'settlementAuthorization' element value.
     * 
     * @return value
     */
    public String getSettlementAuthorization() {
        return settlementAuthorization;
    }

    /** 
     * Set the 'settlementAuthorization' element value.
     * 
     * @param settlementAuthorization
     */
    public void setSettlementAuthorization(String settlementAuthorization) {
        this.settlementAuthorization = settlementAuthorization;
    }

    /** 
     * Get the 'voluntaryIndic' element value.
     * 
     * @return value
     */
    public String getVoluntaryIndic() {
        return voluntaryIndic;
    }

    /** 
     * Set the 'voluntaryIndic' element value.
     * 
     * @param voluntaryIndic
     */
    public void setVoluntaryIndic(String voluntaryIndic) {
        this.voluntaryIndic = voluntaryIndic;
    }

    /** 
     * Get the 'cpnPreviousStatus' element value.
     * 
     * @return value
     */
    public String getCpnPreviousStatus() {
        return cpnPreviousStatus;
    }

    /** 
     * Set the 'cpnPreviousStatus' element value.
     * 
     * @param cpnPreviousStatus
     */
    public void setCpnPreviousStatus(String cpnPreviousStatus) {
        this.cpnPreviousStatus = cpnPreviousStatus;
    }

    /** 
     * Get the 'cpnSequenceNumber' element value.
     * 
     * @return value
     */
    public String getCpnSequenceNumber() {
        return cpnSequenceNumber;
    }

    /** 
     * Set the 'cpnSequenceNumber' element value.
     * 
     * @param cpnSequenceNumber
     */
    public void setCpnSequenceNumber(String cpnSequenceNumber) {
        this.cpnSequenceNumber = cpnSequenceNumber;
    }

    /** 
     * Get the 'cpnReferenceNumber' element value.
     * 
     * @return value
     */
    public String getCpnReferenceNumber() {
        return cpnReferenceNumber;
    }

    /** 
     * Set the 'cpnReferenceNumber' element value.
     * 
     * @param cpnReferenceNumber
     */
    public void setCpnReferenceNumber(String cpnReferenceNumber) {
        this.cpnReferenceNumber = cpnReferenceNumber;
    }

    /** 
     * Get the 'cpnInConnectionWithQualifier' element value.
     * 
     * @return value
     */
    public String getCpnInConnectionWithQualifier() {
        return cpnInConnectionWithQualifier;
    }

    /** 
     * Set the 'cpnInConnectionWithQualifier' element value.
     * 
     * @param cpnInConnectionWithQualifier
     */
    public void setCpnInConnectionWithQualifier(
            String cpnInConnectionWithQualifier) {
        this.cpnInConnectionWithQualifier = cpnInConnectionWithQualifier;
    }
}
