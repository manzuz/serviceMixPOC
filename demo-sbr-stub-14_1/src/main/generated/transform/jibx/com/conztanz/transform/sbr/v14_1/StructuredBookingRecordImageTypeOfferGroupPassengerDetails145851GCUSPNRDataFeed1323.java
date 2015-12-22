
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_passengerDetails_145851_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceInformation_128681_S_CUS_PNRDataFeed_132" name="passengerAssociation"/>
 *     &lt;xs:element type="ActionDetails_128656_S_CUS_PNRDataFeed_132" name="perPaxProdKnowledge" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128682_S_CUS_PNRDataFeed_132" name="dateOfBirthInfo" minOccurs="0"/>
 *     &lt;xs:element type="TravellerInformation_128683_S_CUS_PNRDataFeed_132" name="passengerFeatures" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="MiscellaneousRemarks_128679_S_CUS_PNRDataFeed_132" name="insureeRemark" minOccurs="0"/>
 *     &lt;xs:element type="PassengerDocumentDetails_128680_S_CUS_PNRDataFeed_132" name="travelerDocInfo" minOccurs="0"/>
 *     &lt;xs:element type="InsurancePolicy_128673_S_CUS_PNRDataFeed_132" name="policyDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_travelerValueDetails_145852_G_CUS_PNRDataFeed_1323" name="travelerValueDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_premiumPerTariffPerPax_145853_G_CUS_PNRDataFeed_1323" name="premiumPerTariffPerPax" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="TariffInformation_22057_S_CUS_PNRDataFeed_132" name="premiumPerpaxInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupPassengerDetails145851GCUSPNRDataFeed1323
{
    private ReferenceInformation128681SCUSPNRDataFeed132 passengerAssociation;
    private List<ActionDetails128656SCUSPNRDataFeed132> perPaxProdKnowledgeList = new ArrayList<ActionDetails128656SCUSPNRDataFeed132>();
    private StructuredDateTimeInformation128682SCUSPNRDataFeed132 dateOfBirthInfo;
    private List<TravellerInformation128683SCUSPNRDataFeed132> passengerFeatureList = new ArrayList<TravellerInformation128683SCUSPNRDataFeed132>();
    private MiscellaneousRemarks128679SCUSPNRDataFeed132 insureeRemark;
    private PassengerDocumentDetails128680SCUSPNRDataFeed132 travelerDocInfo;
    private InsurancePolicy128673SCUSPNRDataFeed132 policyDetails;
    private StructuredBookingRecordImageTypeOfferGroupTravelerValueDetails145852GCUSPNRDataFeed1323 travelerValueDetails;
    private List<StructuredBookingRecordImageTypeOfferGroupPremiumPerTariffPerPax145853GCUSPNRDataFeed1323> premiumPerTariffPerPaxList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupPremiumPerTariffPerPax145853GCUSPNRDataFeed1323>();
    private TariffInformation22057SCUSPNRDataFeed132 premiumPerpaxInfo;

    /** 
     * Get the 'passengerAssociation' element value. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR.
     * 
     * @return value
     */
    public ReferenceInformation128681SCUSPNRDataFeed132 getPassengerAssociation() {
        return passengerAssociation;
    }

    /** 
     * Set the 'passengerAssociation' element value. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR.
     * 
     * @param passengerAssociation
     */
    public void setPassengerAssociation(
            ReferenceInformation128681SCUSPNRDataFeed132 passengerAssociation) {
        this.passengerAssociation = passengerAssociation;
    }

    /** 
     * Get the list of 'perPaxProdKnowledge' element items. product knowledge indicator
     * 
     * @return list
     */
    public List<ActionDetails128656SCUSPNRDataFeed132> getPerPaxProdKnowledgeList() {
        return perPaxProdKnowledgeList;
    }

    /** 
     * Set the list of 'perPaxProdKnowledge' element items. product knowledge indicator
     * 
     * @param list
     */
    public void setPerPaxProdKnowledgeList(
            List<ActionDetails128656SCUSPNRDataFeed132> list) {
        perPaxProdKnowledgeList = list;
    }

    /** 
     * Get the 'dateOfBirthInfo' element value. To specify the birthdate of the insuree.
     * 
     * @return value
     */
    public StructuredDateTimeInformation128682SCUSPNRDataFeed132 getDateOfBirthInfo() {
        return dateOfBirthInfo;
    }

    /** 
     * Set the 'dateOfBirthInfo' element value. To specify the birthdate of the insuree.
     * 
     * @param dateOfBirthInfo
     */
    public void setDateOfBirthInfo(
            StructuredDateTimeInformation128682SCUSPNRDataFeed132 dateOfBirthInfo) {
        this.dateOfBirthInfo = dateOfBirthInfo;
    }

    /** 
     * Get the list of 'passengerFeatures' element items. to specify the name /age of the insuree
     * 
     * @return list
     */
    public List<TravellerInformation128683SCUSPNRDataFeed132> getPassengerFeatureList() {
        return passengerFeatureList;
    }

    /** 
     * Set the list of 'passengerFeatures' element items. to specify the name /age of the insuree
     * 
     * @param list
     */
    public void setPassengerFeatureList(
            List<TravellerInformation128683SCUSPNRDataFeed132> list) {
        passengerFeatureList = list;
    }

    /** 
     * Get the 'insureeRemark' element value. to specify a remark for the insuree
     * 
     * @return value
     */
    public MiscellaneousRemarks128679SCUSPNRDataFeed132 getInsureeRemark() {
        return insureeRemark;
    }

    /** 
     * Set the 'insureeRemark' element value. to specify a remark for the insuree
     * 
     * @param insureeRemark
     */
    public void setInsureeRemark(
            MiscellaneousRemarks128679SCUSPNRDataFeed132 insureeRemark) {
        this.insureeRemark = insureeRemark;
    }

    /** 
     * Get the 'travelerDocInfo' element value. To specify the details concerning the documentation and the age of the insuree.
     * 
     * @return value
     */
    public PassengerDocumentDetails128680SCUSPNRDataFeed132 getTravelerDocInfo() {
        return travelerDocInfo;
    }

    /** 
     * Set the 'travelerDocInfo' element value. To specify the details concerning the documentation and the age of the insuree.
     * 
     * @param travelerDocInfo
     */
    public void setTravelerDocInfo(
            PassengerDocumentDetails128680SCUSPNRDataFeed132 travelerDocInfo) {
        this.travelerDocInfo = travelerDocInfo;
    }

    /** 
     * Get the 'policyDetails' element value. fare discount code used per Pax
     * 
     * @return value
     */
    public InsurancePolicy128673SCUSPNRDataFeed132 getPolicyDetails() {
        return policyDetails;
    }

    /** 
     * Set the 'policyDetails' element value. fare discount code used per Pax
     * 
     * @param policyDetails
     */
    public void setPolicyDetails(
            InsurancePolicy128673SCUSPNRDataFeed132 policyDetails) {
        this.policyDetails = policyDetails;
    }

    /** 
     * Get the 'travelerValueDetails' element value. Details per insuree of the travel cost
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupTravelerValueDetails145852GCUSPNRDataFeed1323 getTravelerValueDetails() {
        return travelerValueDetails;
    }

    /** 
     * Set the 'travelerValueDetails' element value. Details per insuree of the travel cost
     * 
     * @param travelerValueDetails
     */
    public void setTravelerValueDetails(
            StructuredBookingRecordImageTypeOfferGroupTravelerValueDetails145852GCUSPNRDataFeed1323 travelerValueDetails) {
        this.travelerValueDetails = travelerValueDetails;
    }

    /** 
     * Get the list of 'premiumPerTariffPerPax' element items. to convey for each tariff code and passenger the premium for this tariff.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupPremiumPerTariffPerPax145853GCUSPNRDataFeed1323> getPremiumPerTariffPerPaxList() {
        return premiumPerTariffPerPaxList;
    }

    /** 
     * Set the list of 'premiumPerTariffPerPax' element items. to convey for each tariff code and passenger the premium for this tariff.
     * 
     * @param list
     */
    public void setPremiumPerTariffPerPaxList(
            List<StructuredBookingRecordImageTypeOfferGroupPremiumPerTariffPerPax145853GCUSPNRDataFeed1323> list) {
        premiumPerTariffPerPaxList = list;
    }

    /** 
     * Get the 'premiumPerpaxInfo' element value. To convey the premium perpax
     * 
     * @return value
     */
    public TariffInformation22057SCUSPNRDataFeed132 getPremiumPerpaxInfo() {
        return premiumPerpaxInfo;
    }

    /** 
     * Set the 'premiumPerpaxInfo' element value. To convey the premium perpax
     * 
     * @param premiumPerpaxInfo
     */
    public void setPremiumPerpaxInfo(
            TariffInformation22057SCUSPNRDataFeed132 premiumPerpaxInfo) {
        this.premiumPerpaxInfo = premiumPerpaxInfo;
    }
}
