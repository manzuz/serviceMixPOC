
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_passengerDetails_137782_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceInformation_32300_S_CUS_PNRDataFeed_132" name="passengerAssociation"/>
 *     &lt;xs:element type="ActionDetails_10079_S_CUS_PNRDataFeed_132" name="perPaxProdKnowledge" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_13380_S_CUS_PNRDataFeed_132" name="dateOfBirthInfo" minOccurs="0"/>
 *     &lt;xs:element type="TravellerInformation_10089_S_CUS_PNRDataFeed_132" name="passengerFeatures" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="MiscellaneousRemarks_10082_S_CUS_PNRDataFeed_132" name="insureeRemark" minOccurs="0"/>
 *     &lt;xs:element type="PassengerDocumentDetails_10036_S_CUS_PNRDataFeed_132" name="travelerDocInfo" minOccurs="0"/>
 *     &lt;xs:element type="InsurancePolicy_10048_S_CUS_PNRDataFeed_132" name="policyDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_travelerValueDetails_137783_G_CUS_PNRDataFeed_1322" name="travelerValueDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_premiumPerTariffPerPax_137784_G_CUS_PNRDataFeed_1322" name="premiumPerTariffPerPax" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="TariffInformation_22057_S_CUS_PNRDataFeed_132" name="premiumPerpaxInfo" minOccurs="0"/>
 *     &lt;xs:element type="ReservationControlInformation_31804_S_CUS_PNRDataFeed_132" name="voucherNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsPassengerDetails137782GCUSPNRDataFeed1322
{
    private ReferenceInformation32300SCUSPNRDataFeed132 passengerAssociation;
    private List<ActionDetails10079SCUSPNRDataFeed132> perPaxProdKnowledgeList = new ArrayList<ActionDetails10079SCUSPNRDataFeed132>();
    private StructuredDateTimeInformation13380SCUSPNRDataFeed132 dateOfBirthInfo;
    private List<TravellerInformation10089SCUSPNRDataFeed132> passengerFeatureList = new ArrayList<TravellerInformation10089SCUSPNRDataFeed132>();
    private MiscellaneousRemarks10082SCUSPNRDataFeed132 insureeRemark;
    private PassengerDocumentDetails10036SCUSPNRDataFeed132 travelerDocInfo;
    private InsurancePolicy10048SCUSPNRDataFeed132 policyDetails;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsTravelerValueDetails137783GCUSPNRDataFeed1322 travelerValueDetails;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsPremiumPerTariffPerPax137784GCUSPNRDataFeed1322> premiumPerTariffPerPaxList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsPremiumPerTariffPerPax137784GCUSPNRDataFeed1322>();
    private TariffInformation22057SCUSPNRDataFeed132 premiumPerpaxInfo;
    private ReservationControlInformation31804SCUSPNRDataFeed132 voucherNumber;

    /** 
     * Get the 'passengerAssociation' element value. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR.
     * 
     * @return value
     */
    public ReferenceInformation32300SCUSPNRDataFeed132 getPassengerAssociation() {
        return passengerAssociation;
    }

    /** 
     * Set the 'passengerAssociation' element value. to specify to which passenger the insurance is associated: if omitted then it's for all the names in the PNR.
     * 
     * @param passengerAssociation
     */
    public void setPassengerAssociation(
            ReferenceInformation32300SCUSPNRDataFeed132 passengerAssociation) {
        this.passengerAssociation = passengerAssociation;
    }

    /** 
     * Get the list of 'perPaxProdKnowledge' element items. product knowledge indicator
     * 
     * @return list
     */
    public List<ActionDetails10079SCUSPNRDataFeed132> getPerPaxProdKnowledgeList() {
        return perPaxProdKnowledgeList;
    }

    /** 
     * Set the list of 'perPaxProdKnowledge' element items. product knowledge indicator
     * 
     * @param list
     */
    public void setPerPaxProdKnowledgeList(
            List<ActionDetails10079SCUSPNRDataFeed132> list) {
        perPaxProdKnowledgeList = list;
    }

    /** 
     * Get the 'dateOfBirthInfo' element value. To specify the birthdate of the insuree.
     * 
     * @return value
     */
    public StructuredDateTimeInformation13380SCUSPNRDataFeed132 getDateOfBirthInfo() {
        return dateOfBirthInfo;
    }

    /** 
     * Set the 'dateOfBirthInfo' element value. To specify the birthdate of the insuree.
     * 
     * @param dateOfBirthInfo
     */
    public void setDateOfBirthInfo(
            StructuredDateTimeInformation13380SCUSPNRDataFeed132 dateOfBirthInfo) {
        this.dateOfBirthInfo = dateOfBirthInfo;
    }

    /** 
     * Get the list of 'passengerFeatures' element items. to specify the name /age of the insuree
     * 
     * @return list
     */
    public List<TravellerInformation10089SCUSPNRDataFeed132> getPassengerFeatureList() {
        return passengerFeatureList;
    }

    /** 
     * Set the list of 'passengerFeatures' element items. to specify the name /age of the insuree
     * 
     * @param list
     */
    public void setPassengerFeatureList(
            List<TravellerInformation10089SCUSPNRDataFeed132> list) {
        passengerFeatureList = list;
    }

    /** 
     * Get the 'insureeRemark' element value. to specify a remark for the insuree
     * 
     * @return value
     */
    public MiscellaneousRemarks10082SCUSPNRDataFeed132 getInsureeRemark() {
        return insureeRemark;
    }

    /** 
     * Set the 'insureeRemark' element value. to specify a remark for the insuree
     * 
     * @param insureeRemark
     */
    public void setInsureeRemark(
            MiscellaneousRemarks10082SCUSPNRDataFeed132 insureeRemark) {
        this.insureeRemark = insureeRemark;
    }

    /** 
     * Get the 'travelerDocInfo' element value. To specify the details concerning the documentation and the age of the insuree.
     * 
     * @return value
     */
    public PassengerDocumentDetails10036SCUSPNRDataFeed132 getTravelerDocInfo() {
        return travelerDocInfo;
    }

    /** 
     * Set the 'travelerDocInfo' element value. To specify the details concerning the documentation and the age of the insuree.
     * 
     * @param travelerDocInfo
     */
    public void setTravelerDocInfo(
            PassengerDocumentDetails10036SCUSPNRDataFeed132 travelerDocInfo) {
        this.travelerDocInfo = travelerDocInfo;
    }

    /** 
     * Get the 'policyDetails' element value. fare discount code used per Pax
     * 
     * @return value
     */
    public InsurancePolicy10048SCUSPNRDataFeed132 getPolicyDetails() {
        return policyDetails;
    }

    /** 
     * Set the 'policyDetails' element value. fare discount code used per Pax
     * 
     * @param policyDetails
     */
    public void setPolicyDetails(
            InsurancePolicy10048SCUSPNRDataFeed132 policyDetails) {
        this.policyDetails = policyDetails;
    }

    /** 
     * Get the 'travelerValueDetails' element value. Details per insuree of the travel cost
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsTravelerValueDetails137783GCUSPNRDataFeed1322 getTravelerValueDetails() {
        return travelerValueDetails;
    }

    /** 
     * Set the 'travelerValueDetails' element value. Details per insuree of the travel cost
     * 
     * @param travelerValueDetails
     */
    public void setTravelerValueDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsTravelerValueDetails137783GCUSPNRDataFeed1322 travelerValueDetails) {
        this.travelerValueDetails = travelerValueDetails;
    }

    /** 
     * Get the list of 'premiumPerTariffPerPax' element items. to convey for each tariff code and passenger the premium for this tariff.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsPremiumPerTariffPerPax137784GCUSPNRDataFeed1322> getPremiumPerTariffPerPaxList() {
        return premiumPerTariffPerPaxList;
    }

    /** 
     * Set the list of 'premiumPerTariffPerPax' element items. to convey for each tariff code and passenger the premium for this tariff.
     * 
     * @param list
     */
    public void setPremiumPerTariffPerPaxList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsPremiumPerTariffPerPax137784GCUSPNRDataFeed1322> list) {
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

    /** 
     * Get the 'voucherNumber' element value. The Individual passenger reservation information
     * 
     * @return value
     */
    public ReservationControlInformation31804SCUSPNRDataFeed132 getVoucherNumber() {
        return voucherNumber;
    }

    /** 
     * Set the 'voucherNumber' element value. The Individual passenger reservation information
     * 
     * @param voucherNumber
     */
    public void setVoucherNumber(
            ReservationControlInformation31804SCUSPNRDataFeed132 voucherNumber) {
        this.voucherNumber = voucherNumber;
    }
}
