
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Insbcq1a1211_145844_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProductDetails_129160_S_CUS_PNRDataFeed_132" name="insuranceProductDetailsType"/>
 *     &lt;xs:element type="PhoneAndEmailAddress_128662_S_CUS_PNRDataFeed_132" name="providerPhoneContact" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_128665_S_CUS_PNRDataFeed_132" name="infoLines" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="TravellerInformation_128664_S_CUS_PNRDataFeed_132" name="substiteName" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="MonetaryInformation_128661_S_CUS_PNRDataFeed_132" name="extraPremium" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_productSection_145845_G_CUS_PNRDataFeed_1322" name="productSection" minOccurs="0" maxOccurs="48"/>
 *     &lt;xs:element type="TariffInformation_22057_S_CUS_PNRDataFeed_132" name="planCostInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_planTypeDetails_145846_G_CUS_PNRDataFeed_1322" name="planTypeDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_contactDetails_145847_G_CUS_PNRDataFeed_1322" name="contactDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_subscriberAddressSection_145848_G_CUS_PNRDataFeed_1322" name="subscriberAddressSection" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_coverageDetails_145849_G_CUS_PNRDataFeed_1322" name="coverageDetails" minOccurs="0"/>
 *     &lt;xs:element type="CommissionInformation_128657_S_CUS_PNRDataFeed_132" name="comissionAmount" minOccurs="0"/>
 *     &lt;xs:element type="ActionDetails_128656_S_CUS_PNRDataFeed_132" name="productKnowledge" minOccurs="0" maxOccurs="20"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_passengerDetails_145851_G_CUS_PNRDataFeed_1322" name="passengerDetails" minOccurs="0" maxOccurs="198"/>
 *     &lt;xs:element type="DocumentInformationDetails_128659_S_CUS_PNRDataFeed_132" name="printInformation" minOccurs="0"/>
 *     &lt;xs:element type="LongFreeText_128687_S_CUS_PNRDataFeed_132" name="longFreeTextType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Insbcq1a1211145844GCUSPNRDataFeed1322
{
    private InsuranceProductDetails129160SCUSPNRDataFeed132 insuranceProductDetailsType;
    private PhoneAndEmailAddress128662SCUSPNRDataFeed132 providerPhoneContact;
    private List<FreeTextInformation128665SCUSPNRDataFeed132> infoLineList = new ArrayList<FreeTextInformation128665SCUSPNRDataFeed132>();
    private List<TravellerInformation128664SCUSPNRDataFeed132> substiteNameList = new ArrayList<TravellerInformation128664SCUSPNRDataFeed132>();
    private MonetaryInformation128661SCUSPNRDataFeed132 extraPremium;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection145845GCUSPNRDataFeed1322> productSectionList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection145845GCUSPNRDataFeed1322>();
    private TariffInformation22057SCUSPNRDataFeed132 planCostInfo;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails145846GCUSPNRDataFeed1322 planTypeDetails;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails145847GCUSPNRDataFeed1322 contactDetails;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection145848GCUSPNRDataFeed1322 subscriberAddressSection;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsCoverageDetails145849GCUSPNRDataFeed1322 coverageDetails;
    private CommissionInformation128657SCUSPNRDataFeed132 comissionAmount;
    private List<ActionDetails128656SCUSPNRDataFeed132> productKnowledgeList = new ArrayList<ActionDetails128656SCUSPNRDataFeed132>();
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails145851GCUSPNRDataFeed1322> passengerDetailList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails145851GCUSPNRDataFeed1322>();
    private DocumentInformationDetails128659SCUSPNRDataFeed132 printInformation;
    private LongFreeText128687SCUSPNRDataFeed132 longFreeTextType;

    /** 
     * Get the 'insuranceProductDetailsType' element value.
     * 
     * @return value
     */
    public InsuranceProductDetails129160SCUSPNRDataFeed132 getInsuranceProductDetailsType() {
        return insuranceProductDetailsType;
    }

    /** 
     * Set the 'insuranceProductDetailsType' element value.
     * 
     * @param insuranceProductDetailsType
     */
    public void setInsuranceProductDetailsType(
            InsuranceProductDetails129160SCUSPNRDataFeed132 insuranceProductDetailsType) {
        this.insuranceProductDetailsType = insuranceProductDetailsType;
    }

    /** 
     * Get the 'providerPhoneContact' element value. provider phone contact
     * 
     * @return value
     */
    public PhoneAndEmailAddress128662SCUSPNRDataFeed132 getProviderPhoneContact() {
        return providerPhoneContact;
    }

    /** 
     * Set the 'providerPhoneContact' element value. provider phone contact
     * 
     * @param providerPhoneContact
     */
    public void setProviderPhoneContact(
            PhoneAndEmailAddress128662SCUSPNRDataFeed132 providerPhoneContact) {
        this.providerPhoneContact = providerPhoneContact;
    }

    /** 
     * Get the list of 'infoLines' element items. Marketing Lines (MKT) used by ticketing and provider contact lines (CTC).
     * 
     * @return list
     */
    public List<FreeTextInformation128665SCUSPNRDataFeed132> getInfoLineList() {
        return infoLineList;
    }

    /** 
     * Set the list of 'infoLines' element items. Marketing Lines (MKT) used by ticketing and provider contact lines (CTC).
     * 
     * @param list
     */
    public void setInfoLineList(
            List<FreeTextInformation128665SCUSPNRDataFeed132> list) {
        infoLineList = list;
    }

    /** 
     * Get the list of 'substiteName' element items. provides details about the substitute name or the nanny name.
     * 
     * @return list
     */
    public List<TravellerInformation128664SCUSPNRDataFeed132> getSubstiteNameList() {
        return substiteNameList;
    }

    /** 
     * Set the list of 'substiteName' element items. provides details about the substitute name or the nanny name.
     * 
     * @param list
     */
    public void setSubstiteNameList(
            List<TravellerInformation128664SCUSPNRDataFeed132> list) {
        substiteNameList = list;
    }

    /** 
     * Get the 'extraPremium' element value. Amount that is added to the total premium in case an extrareference is specified.
     * 
     * @return value
     */
    public MonetaryInformation128661SCUSPNRDataFeed132 getExtraPremium() {
        return extraPremium;
    }

    /** 
     * Set the 'extraPremium' element value. Amount that is added to the total premium in case an extrareference is specified.
     * 
     * @param extraPremium
     */
    public void setExtraPremium(
            MonetaryInformation128661SCUSPNRDataFeed132 extraPremium) {
        this.extraPremium = extraPremium;
    }

    /** 
     * Get the list of 'productSection' element items. To convey the products and it's directly related data.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection145845GCUSPNRDataFeed1322> getProductSectionList() {
        return productSectionList;
    }

    /** 
     * Set the list of 'productSection' element items. To convey the products and it's directly related data.
     * 
     * @param list
     */
    public void setProductSectionList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection145845GCUSPNRDataFeed1322> list) {
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
    public StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails145846GCUSPNRDataFeed1322 getPlanTypeDetails() {
        return planTypeDetails;
    }

    /** 
     * Set the 'planTypeDetails' element value. Provides details about the type of plan beeing booked.
     * 
     * @param planTypeDetails
     */
    public void setPlanTypeDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsPlanTypeDetails145846GCUSPNRDataFeed1322 planTypeDetails) {
        this.planTypeDetails = planTypeDetails;
    }

    /** 
     * Get the 'contactDetails' element value. To specify remarks and an emergency contact (phone or name)
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails145847GCUSPNRDataFeed1322 getContactDetails() {
        return contactDetails;
    }

    /** 
     * Set the 'contactDetails' element value. To specify remarks and an emergency contact (phone or name)
     * 
     * @param contactDetails
     */
    public void setContactDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsContactDetails145847GCUSPNRDataFeed1322 contactDetails) {
        this.contactDetails = contactDetails;
    }

    /** 
     * Get the 'subscriberAddressSection' element value. To specify the address of the subscriber.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection145848GCUSPNRDataFeed1322 getSubscriberAddressSection() {
        return subscriberAddressSection;
    }

    /** 
     * Set the 'subscriberAddressSection' element value. To specify the address of the subscriber.
     * 
     * @param subscriberAddressSection
     */
    public void setSubscriberAddressSection(
            StructuredBookingRecordImageTypeOriginDestinationDetailsSubscriberAddressSection145848GCUSPNRDataFeed1322 subscriberAddressSection) {
        this.subscriberAddressSection = subscriberAddressSection;
    }

    /** 
     * Get the 'coverageDetails' element value. This is used to convey the different coverages and it's values.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsCoverageDetails145849GCUSPNRDataFeed1322 getCoverageDetails() {
        return coverageDetails;
    }

    /** 
     * Set the 'coverageDetails' element value. This is used to convey the different coverages and it's values.
     * 
     * @param coverageDetails
     */
    public void setCoverageDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsCoverageDetails145849GCUSPNRDataFeed1322 coverageDetails) {
        this.coverageDetails = coverageDetails;
    }

    /** 
     * Get the 'comissionAmount' element value. to specify a commission.
     * 
     * @return value
     */
    public CommissionInformation128657SCUSPNRDataFeed132 getComissionAmount() {
        return comissionAmount;
    }

    /** 
     * Set the 'comissionAmount' element value. to specify a commission.
     * 
     * @param comissionAmount
     */
    public void setComissionAmount(
            CommissionInformation128657SCUSPNRDataFeed132 comissionAmount) {
        this.comissionAmount = comissionAmount;
    }

    /** 
     * Get the list of 'productKnowledge' element items. Used to specify the necesary data for pricing
     * 
     * @return list
     */
    public List<ActionDetails128656SCUSPNRDataFeed132> getProductKnowledgeList() {
        return productKnowledgeList;
    }

    /** 
     * Set the list of 'productKnowledge' element items. Used to specify the necesary data for pricing
     * 
     * @param list
     */
    public void setProductKnowledgeList(
            List<ActionDetails128656SCUSPNRDataFeed132> list) {
        productKnowledgeList = list;
    }

    /** 
     * Get the list of 'passengerDetails' element items. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR. The repetition factor is 198 because we can have 99 passengers in a PNR each of them an infant.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails145851GCUSPNRDataFeed1322> getPassengerDetailList() {
        return passengerDetailList;
    }

    /** 
     * Set the list of 'passengerDetails' element items. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR. The repetition factor is 198 because we can have 99 passengers in a PNR each of them an infant.
     * 
     * @param list
     */
    public void setPassengerDetailList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails145851GCUSPNRDataFeed1322> list) {
        passengerDetailList = list;
    }

    /** 
     * Get the 'printInformation' element value. To convey information if the document has been printed or not.
     * 
     * @return value
     */
    public DocumentInformationDetails128659SCUSPNRDataFeed132 getPrintInformation() {
        return printInformation;
    }

    /** 
     * Set the 'printInformation' element value. To convey information if the document has been printed or not.
     * 
     * @param printInformation
     */
    public void setPrintInformation(
            DocumentInformationDetails128659SCUSPNRDataFeed132 printInformation) {
        this.printInformation = printInformation;
    }

    /** 
     * Get the 'longFreeTextType' element value.
     * 
     * @return value
     */
    public LongFreeText128687SCUSPNRDataFeed132 getLongFreeTextType() {
        return longFreeTextType;
    }

    /** 
     * Set the 'longFreeTextType' element value.
     * 
     * @param longFreeTextType
     */
    public void setLongFreeTextType(
            LongFreeText128687SCUSPNRDataFeed132 longFreeTextType) {
        this.longFreeTextType = longFreeTextType;
    }
}
