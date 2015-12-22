
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * will convey all data needed to prevent the fraud on the payment
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForFraudScreening_112601_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_94568_S_CUS_PNRDataFeed_132" name="fraudScreening"/>
 *     &lt;xs:element type="DeviceControlDetails_94564_S_CUS_PNRDataFeed_132" name="ipAdress" minOccurs="0"/>
 *     &lt;xs:element type="CommunicationContact_94563_S_CUS_PNRDataFeed_132" name="merchantURL" minOccurs="0"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_94565_S_CUS_PNRDataFeed_132" name="payerPhoneOrEmail" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="SystemDetailsInfo_94569_S_CUS_PNRDataFeed_132" name="shopperSession" minOccurs="0"/>
 *     &lt;xs:element type="TravellerInformation_94570_S_CUS_PNRDataFeed_132" name="payerName" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_94567_S_CUS_PNRDataFeed_132" name="payerDateOfBirth" minOccurs="0"/>
 *     &lt;xs:element type="Address_94562_S_CUS_PNRDataFeed_132" name="billingAddress" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_94566_S_CUS_PNRDataFeed_132" name="formOfIdDetails" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForFraudScreening112601GCUSPNRDataFeed132
{
    private StatusDetails94568SCUSPNRDataFeed132 fraudScreening;
    private DeviceControlDetails94564SCUSPNRDataFeed132 ipAdress;
    private CommunicationContact94563SCUSPNRDataFeed132 merchantURL;
    private List<PhoneAndEmailAddress94565SCUSPNRDataFeed132> payerPhoneOrEmailList = new ArrayList<PhoneAndEmailAddress94565SCUSPNRDataFeed132>();
    private SystemDetailsInfo94569SCUSPNRDataFeed132 shopperSession;
    private TravellerInformation94570SCUSPNRDataFeed132 payerName;
    private StructuredDateTimeInformation94567SCUSPNRDataFeed132 payerDateOfBirth;
    private Address94562SCUSPNRDataFeed132 billingAddress;
    private List<ReferenceInformation94566SCUSPNRDataFeed132> formOfIdDetailList = new ArrayList<ReferenceInformation94566SCUSPNRDataFeed132>();

    /** 
     * Get the 'fraudScreening' element value. This data element is used to indicate if risk management must be performed at authorization time: - Y means risk management data will be appended to author; - N means risk management data will not be appended;
     * 
     * @return value
     */
    public StatusDetails94568SCUSPNRDataFeed132 getFraudScreening() {
        return fraudScreening;
    }

    /** 
     * Set the 'fraudScreening' element value. This data element is used to indicate if risk management must be performed at authorization time: - Y means risk management data will be appended to author; - N means risk management data will not be appended;
     * 
     * @param fraudScreening
     */
    public void setFraudScreening(
            StatusDetails94568SCUSPNRDataFeed132 fraudScreening) {
        this.fraudScreening = fraudScreening;
    }

    /** 
     * Get the 'ipAdress' element value. this segment contains the IP address used in RMM (risk management module or fraud screening)
     * 
     * @return value
     */
    public DeviceControlDetails94564SCUSPNRDataFeed132 getIpAdress() {
        return ipAdress;
    }

    /** 
     * Set the 'ipAdress' element value. this segment contains the IP address used in RMM (risk management module or fraud screening)
     * 
     * @param ipAdress
     */
    public void setIpAdress(DeviceControlDetails94564SCUSPNRDataFeed132 ipAdress) {
        this.ipAdress = ipAdress;
    }

    /** 
     * Get the 'merchantURL' element value. Merchant's website URL.
     * 
     * @return value
     */
    public CommunicationContact94563SCUSPNRDataFeed132 getMerchantURL() {
        return merchantURL;
    }

    /** 
     * Set the 'merchantURL' element value. Merchant's website URL.
     * 
     * @param merchantURL
     */
    public void setMerchantURL(
            CommunicationContact94563SCUSPNRDataFeed132 merchantURL) {
        this.merchantURL = merchantURL;
    }

    /** 
     * Get the list of 'payerPhoneOrEmail' element items. will convey either the phone or the email adress of the payer
     * 
     * @return list
     */
    public List<PhoneAndEmailAddress94565SCUSPNRDataFeed132> getPayerPhoneOrEmailList() {
        return payerPhoneOrEmailList;
    }

    /** 
     * Set the list of 'payerPhoneOrEmail' element items. will convey either the phone or the email adress of the payer
     * 
     * @param list
     */
    public void setPayerPhoneOrEmailList(
            List<PhoneAndEmailAddress94565SCUSPNRDataFeed132> list) {
        payerPhoneOrEmailList = list;
    }

    /** 
     * Get the 'shopperSession' element value. this segment contains the shopper session used in RMM (risk management module)
     * 
     * @return value
     */
    public SystemDetailsInfo94569SCUSPNRDataFeed132 getShopperSession() {
        return shopperSession;
    }

    /** 
     * Set the 'shopperSession' element value. this segment contains the shopper session used in RMM (risk management module)
     * 
     * @param shopperSession
     */
    public void setShopperSession(
            SystemDetailsInfo94569SCUSPNRDataFeed132 shopperSession) {
        this.shopperSession = shopperSession;
    }

    /** 
     * Get the 'payerName' element value. conveys information about payer LastName (surName) and FirstName (givenName)
     * 
     * @return value
     */
    public TravellerInformation94570SCUSPNRDataFeed132 getPayerName() {
        return payerName;
    }

    /** 
     * Set the 'payerName' element value. conveys information about payer LastName (surName) and FirstName (givenName)
     * 
     * @param payerName
     */
    public void setPayerName(
            TravellerInformation94570SCUSPNRDataFeed132 payerName) {
        this.payerName = payerName;
    }

    /** 
     * Get the 'payerDateOfBirth' element value. stores the payer date of birth
     * 
     * @return value
     */
    public StructuredDateTimeInformation94567SCUSPNRDataFeed132 getPayerDateOfBirth() {
        return payerDateOfBirth;
    }

    /** 
     * Set the 'payerDateOfBirth' element value. stores the payer date of birth
     * 
     * @param payerDateOfBirth
     */
    public void setPayerDateOfBirth(
            StructuredDateTimeInformation94567SCUSPNRDataFeed132 payerDateOfBirth) {
        this.payerDateOfBirth = payerDateOfBirth;
    }

    /** 
     * Get the 'billingAddress' element value. Information about the billing address (can be extracted from the AB PNR element)
     * 
     * @return value
     */
    public Address94562SCUSPNRDataFeed132 getBillingAddress() {
        return billingAddress;
    }

    /** 
     * Set the 'billingAddress' element value. Information about the billing address (can be extracted from the AB PNR element)
     * 
     * @param billingAddress
     */
    public void setBillingAddress(Address94562SCUSPNRDataFeed132 billingAddress) {
        this.billingAddress = billingAddress;
    }

    /** 
     * Get the list of 'formOfIdDetails' element items. Used to store reference information on the payer for fraud screening purpose: social security number driving license information frequent flyer information
     * 
     * @return list
     */
    public List<ReferenceInformation94566SCUSPNRDataFeed132> getFormOfIdDetailList() {
        return formOfIdDetailList;
    }

    /** 
     * Set the list of 'formOfIdDetails' element items. Used to store reference information on the payer for fraud screening purpose: social security number driving license information frequent flyer information
     * 
     * @param list
     */
    public void setFormOfIdDetailList(
            List<ReferenceInformation94566SCUSPNRDataFeed132> list) {
        formOfIdDetailList = list;
    }
}
