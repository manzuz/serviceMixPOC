
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Insbcq1a0711_137775_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProductDetails_20773_S_CUS_PNRDataFeed_132" name="providerProductDetails"/>
 *     &lt;xs:element type="CompanyInformation_71102_S_CUS_PNRDataFeed_132" name="providerDetails" minOccurs="0"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_32303_S_CUS_PNRDataFeed_132" name="providerPhoneContact" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_21770_S_CUS_PNRDataFeed_132" name="infoLines" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="TravellerInformation_122019_S_CUS_PNRDataFeed_132" name="substiteName" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="MonetaryInformation_10816_S_CUS_PNRDataFeed_132" name="extraPremium" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_productSection_137776_G_CUS_PNRDataFeed_1322" name="productSection" minOccurs="0" maxOccurs="48"/>
 *     &lt;xs:element type="TariffInformation_22057_S_CUS_PNRDataFeed_132" name="planCostInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_planTypeDetails_137777_G_CUS_PNRDataFeed_1322" name="planTypeDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_contactDetails_137778_G_CUS_PNRDataFeed_1322" name="contactDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_subscriberAddressSection_137779_G_CUS_PNRDataFeed_1322" name="subscriberAddressSection" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_coverageDetails_137780_G_CUS_PNRDataFeed_1322" name="coverageDetails" minOccurs="0"/>
 *     &lt;xs:element type="CommissionInformation_31104_S_CUS_PNRDataFeed_132" name="comissionAmount" minOccurs="0"/>
 *     &lt;xs:element type="ReservationControlInformation_10076_S_CUS_PNRDataFeed_132" name="confirmationNumber" minOccurs="0"/>
 *     &lt;xs:element type="ActionDetails_10079_S_CUS_PNRDataFeed_132" name="productKnowledge" minOccurs="0" maxOccurs="20"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_passengerDetails_137782_G_CUS_PNRDataFeed_1322" name="passengerDetails" minOccurs="0" maxOccurs="198"/>
 *     &lt;xs:element type="DocumentInformationDetails_11509_S_CUS_PNRDataFeed_132" name="printInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Insbcq1a0711137775GCUSPNRDataFeed1322
{
    private InsuranceProductDetails20773SCUSPNRDataFeed132 providerProductDetails;
    private CompanyInformation71102SCUSPNRDataFeed132 providerDetails;
    private PhoneAndEmailAddress32303SCUSPNRDataFeed132 providerPhoneContact;
    private List<FreeTextInformation21770SCUSPNRDataFeed132> infoLineList = new ArrayList<FreeTextInformation21770SCUSPNRDataFeed132>();
    private List<TravellerInformation122019SCUSPNRDataFeed132> substiteNameList = new ArrayList<TravellerInformation122019SCUSPNRDataFeed132>();
    private MonetaryInformation10816SCUSPNRDataFeed132 extraPremium;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection137776GCUSPNRDataFeed1322> productSectionList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection137776GCUSPNRDataFeed1322>();
    private TariffInformation22057SCUSPNRDataFeed132 planCostInfo;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails137777GCUSPNRDataFeed1322 planTypeDetails;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails137778GCUSPNRDataFeed1322 contactDetails;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection137779GCUSPNRDataFeed1322 subscriberAddressSection;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsCoverageDetails137780GCUSPNRDataFeed1322 coverageDetails;
    private CommissionInformation31104SCUSPNRDataFeed132 comissionAmount;
    private ReservationControlInformation10076SCUSPNRDataFeed132 confirmationNumber;
    private List<ActionDetails10079SCUSPNRDataFeed132> productKnowledgeList = new ArrayList<ActionDetails10079SCUSPNRDataFeed132>();
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails137782GCUSPNRDataFeed1322> passengerDetailList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails137782GCUSPNRDataFeed1322>();
    private DocumentInformationDetails11509SCUSPNRDataFeed132 printInformation;

    /** 
     * Get the 'providerProductDetails' element value. To convey the provider code and country. Can be empty in case preferences have been set up.
     * 
     * @return value
     */
    public InsuranceProductDetails20773SCUSPNRDataFeed132 getProviderProductDetails() {
        return providerProductDetails;
    }

    /** 
     * Set the 'providerProductDetails' element value. To convey the provider code and country. Can be empty in case preferences have been set up.
     * 
     * @param providerProductDetails
     */
    public void setProviderProductDetails(
            InsuranceProductDetails20773SCUSPNRDataFeed132 providerProductDetails) {
        this.providerProductDetails = providerProductDetails;
    }

    /** 
     * Get the 'providerDetails' element value. This segment is used to convey company name
     * 
     * @return value
     */
    public CompanyInformation71102SCUSPNRDataFeed132 getProviderDetails() {
        return providerDetails;
    }

    /** 
     * Set the 'providerDetails' element value. This segment is used to convey company name
     * 
     * @param providerDetails
     */
    public void setProviderDetails(
            CompanyInformation71102SCUSPNRDataFeed132 providerDetails) {
        this.providerDetails = providerDetails;
    }

    /** 
     * Get the 'providerPhoneContact' element value. provider phone contact
     * 
     * @return value
     */
    public PhoneAndEmailAddress32303SCUSPNRDataFeed132 getProviderPhoneContact() {
        return providerPhoneContact;
    }

    /** 
     * Set the 'providerPhoneContact' element value. provider phone contact
     * 
     * @param providerPhoneContact
     */
    public void setProviderPhoneContact(
            PhoneAndEmailAddress32303SCUSPNRDataFeed132 providerPhoneContact) {
        this.providerPhoneContact = providerPhoneContact;
    }

    /** 
     * Get the list of 'infoLines' element items. Marketing Lines (MKT) used by ticketing and provider contact lines (CTC).
     * 
     * @return list
     */
    public List<FreeTextInformation21770SCUSPNRDataFeed132> getInfoLineList() {
        return infoLineList;
    }

    /** 
     * Set the list of 'infoLines' element items. Marketing Lines (MKT) used by ticketing and provider contact lines (CTC).
     * 
     * @param list
     */
    public void setInfoLineList(
            List<FreeTextInformation21770SCUSPNRDataFeed132> list) {
        infoLineList = list;
    }

    /** 
     * Get the list of 'substiteName' element items. Provides details about the substitute name or the nanny name.
     * 
     * @return list
     */
    public List<TravellerInformation122019SCUSPNRDataFeed132> getSubstiteNameList() {
        return substiteNameList;
    }

    /** 
     * Set the list of 'substiteName' element items. Provides details about the substitute name or the nanny name.
     * 
     * @param list
     */
    public void setSubstiteNameList(
            List<TravellerInformation122019SCUSPNRDataFeed132> list) {
        substiteNameList = list;
    }

    /** 
     * Get the 'extraPremium' element value. Amount that is added to the total premium in case an extrareference is specified.
     * 
     * @return value
     */
    public MonetaryInformation10816SCUSPNRDataFeed132 getExtraPremium() {
        return extraPremium;
    }

    /** 
     * Set the 'extraPremium' element value. Amount that is added to the total premium in case an extrareference is specified.
     * 
     * @param extraPremium
     */
    public void setExtraPremium(
            MonetaryInformation10816SCUSPNRDataFeed132 extraPremium) {
        this.extraPremium = extraPremium;
    }

    /** 
     * Get the list of 'productSection' element items. To convey the products and it's directly related data.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection137776GCUSPNRDataFeed1322> getProductSectionList() {
        return productSectionList;
    }

    /** 
     * Set the list of 'productSection' element items. To convey the products and it's directly related data.
     * 
     * @param list
     */
    public void setProductSectionList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection137776GCUSPNRDataFeed1322> list) {
        productSectionList = list;
    }

    /** 
     * Get the 'planCostInfo' element value. contains the different amounts (net premium/taxes/total premium)
     * 
     * @return value
     */
    public TariffInformation22057SCUSPNRDataFeed132 getPlanCostInfo() {
        return planCostInfo;
    }

    /** 
     * Set the 'planCostInfo' element value. contains the different amounts (net premium/taxes/total premium)
     * 
     * @param planCostInfo
     */
    public void setPlanCostInfo(
            TariffInformation22057SCUSPNRDataFeed132 planCostInfo) {
        this.planCostInfo = planCostInfo;
    }

    /** 
     * Get the 'planTypeDetails' element value. Provides details about the type of plan beeing booked.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails137777GCUSPNRDataFeed1322 getPlanTypeDetails() {
        return planTypeDetails;
    }

    /** 
     * Set the 'planTypeDetails' element value. Provides details about the type of plan beeing booked.
     * 
     * @param planTypeDetails
     */
    public void setPlanTypeDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails137777GCUSPNRDataFeed1322 planTypeDetails) {
        this.planTypeDetails = planTypeDetails;
    }

    /** 
     * Get the 'contactDetails' element value. To specify remarks and an emergency contact (phone or name)
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails137778GCUSPNRDataFeed1322 getContactDetails() {
        return contactDetails;
    }

    /** 
     * Set the 'contactDetails' element value. To specify remarks and an emergency contact (phone or name)
     * 
     * @param contactDetails
     */
    public void setContactDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails137778GCUSPNRDataFeed1322 contactDetails) {
        this.contactDetails = contactDetails;
    }

    /** 
     * Get the 'subscriberAddressSection' element value. To specify the address of the subscriber.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection137779GCUSPNRDataFeed1322 getSubscriberAddressSection() {
        return subscriberAddressSection;
    }

    /** 
     * Set the 'subscriberAddressSection' element value. To specify the address of the subscriber.
     * 
     * @param subscriberAddressSection
     */
    public void setSubscriberAddressSection(
            StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection137779GCUSPNRDataFeed1322 subscriberAddressSection) {
        this.subscriberAddressSection = subscriberAddressSection;
    }

    /** 
     * Get the 'coverageDetails' element value. This is used to convey the different coverages and it's values.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsCoverageDetails137780GCUSPNRDataFeed1322 getCoverageDetails() {
        return coverageDetails;
    }

    /** 
     * Set the 'coverageDetails' element value. This is used to convey the different coverages and it's values.
     * 
     * @param coverageDetails
     */
    public void setCoverageDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsCoverageDetails137780GCUSPNRDataFeed1322 coverageDetails) {
        this.coverageDetails = coverageDetails;
    }

    /** 
     * Get the 'comissionAmount' element value. to specify a commission.
     * 
     * @return value
     */
    public CommissionInformation31104SCUSPNRDataFeed132 getComissionAmount() {
        return comissionAmount;
    }

    /** 
     * Set the 'comissionAmount' element value. to specify a commission.
     * 
     * @param comissionAmount
     */
    public void setComissionAmount(
            CommissionInformation31104SCUSPNRDataFeed132 comissionAmount) {
        this.comissionAmount = comissionAmount;
    }

    /** 
     * Get the 'confirmationNumber' element value. To specify a number which means that the insurance is in a confirmed status.
     * 
     * @return value
     */
    public ReservationControlInformation10076SCUSPNRDataFeed132 getConfirmationNumber() {
        return confirmationNumber;
    }

    /** 
     * Set the 'confirmationNumber' element value. To specify a number which means that the insurance is in a confirmed status.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(
            ReservationControlInformation10076SCUSPNRDataFeed132 confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    /** 
     * Get the list of 'productKnowledge' element items. Used to specify the necesary data for pricing
     * 
     * @return list
     */
    public List<ActionDetails10079SCUSPNRDataFeed132> getProductKnowledgeList() {
        return productKnowledgeList;
    }

    /** 
     * Set the list of 'productKnowledge' element items. Used to specify the necesary data for pricing
     * 
     * @param list
     */
    public void setProductKnowledgeList(
            List<ActionDetails10079SCUSPNRDataFeed132> list) {
        productKnowledgeList = list;
    }

    /** 
     * Get the list of 'passengerDetails' element items. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR. The repetition factor is 198 because we can have 99 passengers in a PNR each of them an infant.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails137782GCUSPNRDataFeed1322> getPassengerDetailList() {
        return passengerDetailList;
    }

    /** 
     * Set the list of 'passengerDetails' element items. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR. The repetition factor is 198 because we can have 99 passengers in a PNR each of them an infant.
     * 
     * @param list
     */
    public void setPassengerDetailList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails137782GCUSPNRDataFeed1322> list) {
        passengerDetailList = list;
    }

    /** 
     * Get the 'printInformation' element value. To convey information if the document has been printed or not.
     * 
     * @return value
     */
    public DocumentInformationDetails11509SCUSPNRDataFeed132 getPrintInformation() {
        return printInformation;
    }

    /** 
     * Set the 'printInformation' element value. To convey information if the document has been printed or not.
     * 
     * @param printInformation
     */
    public void setPrintInformation(
            DocumentInformationDetails11509SCUSPNRDataFeed132 printInformation) {
        this.printInformation = printInformation;
    }
}
