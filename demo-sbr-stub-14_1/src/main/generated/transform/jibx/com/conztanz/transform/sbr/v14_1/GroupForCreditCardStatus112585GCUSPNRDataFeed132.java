
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * will convey all the detailed payment status related to credit Card
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForCreditCardStatus_112585_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecificVisaLinkCreditCardInformation_94518_S_CUS_PNRDataFeed_132" name="authorisationSupplementaryData"/>
 *     &lt;xs:element type="GenericAuthorisationResult_94515_S_CUS_PNRDataFeed_132" name="approvalDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_94516_S_CUS_PNRDataFeed_132" name="localDateTime" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="TransactionInformationForTicketing_94517_S_CUS_PNRDataFeed_132" name="authorisationInformation" minOccurs="0"/>
 *     &lt;xs:element type="GroupForCreditCardStatus_browserData_112589_G_CUS_PNRDataFeed_132" name="browserData" minOccurs="0"/>
 *     &lt;xs:element type="GroupForThreeDomainSecureData_112587_G_CUS_PNRDataFeed_132" name="tdsInformation" minOccurs="0"/>
 *     &lt;xs:element type="Attribute_94514_S_CUS_PNRDataFeed_132" name="cardSupplementaryData" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="ErrorGroup_112586_G_CUS_PNRDataFeed_132" name="transactionStatus" minOccurs="0" maxOccurs="7"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForCreditCardStatus112585GCUSPNRDataFeed132
{
    private SpecificVisaLinkCreditCardInformation94518SCUSPNRDataFeed132 authorisationSupplementaryData;
    private GenericAuthorisationResult94515SCUSPNRDataFeed132 approvalDetails;
    private List<StructuredDateTimeInformation94516SCUSPNRDataFeed132> localDateTimeList = new ArrayList<StructuredDateTimeInformation94516SCUSPNRDataFeed132>();
    private TransactionInformationForTicketing94517SCUSPNRDataFeed132 authorisationInformation;
    private GroupForCreditCardStatusBrowserData112589GCUSPNRDataFeed132 browserData;
    private GroupForThreeDomainSecureData112587GCUSPNRDataFeed132 tdsInformation;
    private List<Attribute94514SCUSPNRDataFeed132> cardSupplementaryDataList = new ArrayList<Attribute94514SCUSPNRDataFeed132>();
    private List<ErrorGroup112586GCUSPNRDataFeed132> transactionStatuList = new ArrayList<ErrorGroup112586GCUSPNRDataFeed132>();

    /** 
     * Get the 'authorisationSupplementaryData' element value. This segment is used to store specific data of links following ISO8583 standard.
     * 
     * @return value
     */
    public SpecificVisaLinkCreditCardInformation94518SCUSPNRDataFeed132 getAuthorisationSupplementaryData() {
        return authorisationSupplementaryData;
    }

    /** 
     * Set the 'authorisationSupplementaryData' element value. This segment is used to store specific data of links following ISO8583 standard.
     * 
     * @param authorisationSupplementaryData
     */
    public void setAuthorisationSupplementaryData(
            SpecificVisaLinkCreditCardInformation94518SCUSPNRDataFeed132 authorisationSupplementaryData) {
        this.authorisationSupplementaryData = authorisationSupplementaryData;
    }

    /** 
     * Get the 'approvalDetails' element value. will convey the approval code/source
     * 
     * @return value
     */
    public GenericAuthorisationResult94515SCUSPNRDataFeed132 getApprovalDetails() {
        return approvalDetails;
    }

    /** 
     * Set the 'approvalDetails' element value. will convey the approval code/source
     * 
     * @param approvalDetails
     */
    public void setApprovalDetails(
            GenericAuthorisationResult94515SCUSPNRDataFeed132 approvalDetails) {
        this.approvalDetails = approvalDetails;
    }

    /** 
     * Get the list of 'localDateTime' element items. This segment conveys date and time information.  You can specify the time mode used (GMT, UTC or Local)and what for it refers.  - Transmission date and time This contains the date and time the request was submitted to the link (Visa, Nedbank...field 7). GMT can be used.  - Local transaction date and time Date and time when Amadeus builds the authorization message (local according to the point of sale)(Visa, Nedbank...field 12/13)  - Transaction receipt date and time date and time when amadeus receives the authorization message.
     * 
     * @return list
     */
    public List<StructuredDateTimeInformation94516SCUSPNRDataFeed132> getLocalDateTimeList() {
        return localDateTimeList;
    }

    /** 
     * Set the list of 'localDateTime' element items. This segment conveys date and time information.  You can specify the time mode used (GMT, UTC or Local)and what for it refers.  - Transmission date and time This contains the date and time the request was submitted to the link (Visa, Nedbank...field 7). GMT can be used.  - Local transaction date and time Date and time when Amadeus builds the authorization message (local according to the point of sale)(Visa, Nedbank...field 12/13)  - Transaction receipt date and time date and time when amadeus receives the authorization message.
     * 
     * @param list
     */
    public void setLocalDateTimeList(
            List<StructuredDateTimeInformation94516SCUSPNRDataFeed132> list) {
        localDateTimeList = list;
    }

    /** 
     * Get the 'authorisationInformation' element value. Transaction Information: - type of authorization message submit for the given FOP - bulk, superbulk, no bulk process - STAN number (identifying a pair of Credit Card authorization request/response).
     * 
     * @return value
     */
    public TransactionInformationForTicketing94517SCUSPNRDataFeed132 getAuthorisationInformation() {
        return authorisationInformation;
    }

    /** 
     * Set the 'authorisationInformation' element value. Transaction Information: - type of authorization message submit for the given FOP - bulk, superbulk, no bulk process - STAN number (identifying a pair of Credit Card authorization request/response).
     * 
     * @param authorisationInformation
     */
    public void setAuthorisationInformation(
            TransactionInformationForTicketing94517SCUSPNRDataFeed132 authorisationInformation) {
        this.authorisationInformation = authorisationInformation;
    }

    /** 
     * Get the 'browserData' element value. This group contains all data about the customer's browser.
     * 
     * @return value
     */
    public GroupForCreditCardStatusBrowserData112589GCUSPNRDataFeed132 getBrowserData() {
        return browserData;
    }

    /** 
     * Set the 'browserData' element value. This group contains all data about the customer's browser.
     * 
     * @param browserData
     */
    public void setBrowserData(
            GroupForCreditCardStatusBrowserData112589GCUSPNRDataFeed132 browserData) {
        this.browserData = browserData;
    }

    /** 
     * Get the 'tdsInformation' element value. this group will convey all the 3DS related data
     * 
     * @return value
     */
    public GroupForThreeDomainSecureData112587GCUSPNRDataFeed132 getTdsInformation() {
        return tdsInformation;
    }

    /** 
     * Set the 'tdsInformation' element value. this group will convey all the 3DS related data
     * 
     * @param tdsInformation
     */
    public void setTdsInformation(
            GroupForThreeDomainSecureData112587GCUSPNRDataFeed132 tdsInformation) {
        this.tdsInformation = tdsInformation;
    }

    /** 
     * Get the list of 'cardSupplementaryData' element items. This will allow the transmission of credit card data.
     * 
     * @return list
     */
    public List<Attribute94514SCUSPNRDataFeed132> getCardSupplementaryDataList() {
        return cardSupplementaryDataList;
    }

    /** 
     * Set the list of 'cardSupplementaryData' element items. This will allow the transmission of credit card data.
     * 
     * @param list
     */
    public void setCardSupplementaryDataList(
            List<Attribute94514SCUSPNRDataFeed132> list) {
        cardSupplementaryDataList = list;
    }

    /** 
     * Get the list of 'transactionStatus' element items. will convey the various sub status that can be associated to a credit card payment CVV, AVS, AUT, ATN....
     * 
     * @return list
     */
    public List<ErrorGroup112586GCUSPNRDataFeed132> getTransactionStatuList() {
        return transactionStatuList;
    }

    /** 
     * Set the list of 'transactionStatus' element items. will convey the various sub status that can be associated to a credit card payment CVV, AVS, AUT, ATN....
     * 
     * @param list
     */
    public void setTransactionStatuList(
            List<ErrorGroup112586GCUSPNRDataFeed132> list) {
        transactionStatuList = list;
    }
}
