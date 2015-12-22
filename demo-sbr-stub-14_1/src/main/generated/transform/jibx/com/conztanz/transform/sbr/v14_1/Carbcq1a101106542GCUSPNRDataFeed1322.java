
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Carbcq1a101_106542_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="VehicleInformation_87613_S_CUS_PNRDataFeed_132" name="vehicleInformation"/>
 *     &lt;xs:element type="FreeTextInformation_87612_S_CUS_PNRDataFeed_132" name="additionalInfo" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_87608_S_CUS_PNRDataFeed_132" name="voucherPrintAck" minOccurs="0"/>
 *     &lt;xs:element type="NonAirCompanyInformation_87598_S_CUS_PNRDataFeed_132" name="companyIdentification"/>
 *     &lt;xs:element type="PlaceLocationIdentification_87603_S_CUS_PNRDataFeed_132" name="locationInfo" maxOccurs="6"/>
 *     &lt;xs:element type="DeliveryAndCollection_106543_G_CUS_PNRDataFeed_1322" name="deliveryAndCollection" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredPeriodInformation_87609_S_CUS_PNRDataFeed_132" name="pickupDropoffTimes"/>
 *     &lt;xs:element type="ReservationControlInformation_87607_S_CUS_PNRDataFeed_132" name="cancelOrConfirmNbr" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_rateCodeGroup_106545_G_CUS_PNRDataFeed_1322" name="rateCodeGroup" minOccurs="0"/>
 *     &lt;xs:element type="FrequentTravellerIdentificationCode_87601_S_CUS_PNRDataFeed_132" name="fFlyerNbr" minOccurs="0"/>
 *     &lt;xs:element type="ConsumerReferenceInformation_87599_S_CUS_PNRDataFeed_132" name="customerInfo" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_87610_S_CUS_PNRDataFeed_132" name="rateInfo" minOccurs="0" maxOccurs="10"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_errorWarning_106544_G_CUS_PNRDataFeed_1322" name="errorWarning" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_rulesPoliciesGroup_106546_G_CUS_PNRDataFeed_1322" name="rulesPoliciesGroup" minOccurs="0"/>
 *     &lt;xs:element type="FormOfPayment_87600_S_CUS_PNRDataFeed_132" name="payment" minOccurs="0"/>
 *     &lt;xs:element type="BillableInformation_87596_S_CUS_PNRDataFeed_132" name="billingData" minOccurs="0"/>
 *     &lt;xs:element type="AdditionalBusinessSourceInformation_87592_S_CUS_PNRDataFeed_132" name="bookingSource" minOccurs="0"/>
 *     &lt;xs:element type="TourInformation_87594_S_CUS_PNRDataFeed_132" name="inclusiveTour" minOccurs="0"/>
 *     &lt;xs:element type="InteractiveFreeText_87602_S_CUS_PNRDataFeed_132" name="marketingInfo" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="MiscellaneousRemarks_87604_S_CUS_PNRDataFeed_132" name="supleInfo" minOccurs="0" maxOccurs="6"/>
 *     &lt;xs:element type="Quantity_87606_S_CUS_PNRDataFeed_132" name="estimatedDistance" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="Name_87605_S_CUS_PNRDataFeed_132" name="agentInformation" minOccurs="0"/>
 *     &lt;xs:element type="AgreementIdentification_87593_S_CUS_PNRDataFeed_132" name="trackingOpt" minOccurs="0"/>
 *     &lt;xs:element type="TicketNumberDetails_87611_S_CUS_PNRDataFeed_132" name="electronicVoucherNumber" minOccurs="0"/>
 *     &lt;xs:element type="CommunicationContact_87597_S_CUS_PNRDataFeed_132" name="customerEmail" minOccurs="0"/>
 *     &lt;xs:element type="Attribute_87595_S_CUS_PNRDataFeed_132" name="attribute"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Carbcq1a101106542GCUSPNRDataFeed1322
{
    private VehicleInformation87613SCUSPNRDataFeed132 vehicleInformation;
    private FreeTextInformation87612SCUSPNRDataFeed132 additionalInfo;
    private ReferenceInformation87608SCUSPNRDataFeed132 voucherPrintAck;
    private NonAirCompanyInformation87598SCUSPNRDataFeed132 companyIdentification;
    private List<PlaceLocationIdentification87603SCUSPNRDataFeed132> locationInfoList = new ArrayList<PlaceLocationIdentification87603SCUSPNRDataFeed132>();
    private List<DeliveryAndCollection106543GCUSPNRDataFeed1322> deliveryAndCollectionList = new ArrayList<DeliveryAndCollection106543GCUSPNRDataFeed1322>();
    private StructuredPeriodInformation87609SCUSPNRDataFeed132 pickupDropoffTimes;
    private List<ReservationControlInformation87607SCUSPNRDataFeed132> cancelOrConfirmNbrList = new ArrayList<ReservationControlInformation87607SCUSPNRDataFeed132>();
    private StructuredBookingRecordImageTypeOriginDestinationDetailsRateCodeGroup106545GCUSPNRDataFeed1322 rateCodeGroup;
    private FrequentTravellerIdentificationCode87601SCUSPNRDataFeed132 FFlyerNbr;
    private ConsumerReferenceInformation87599SCUSPNRDataFeed132 customerInfo;
    private List<TariffInformation87610SCUSPNRDataFeed132> rateInfoList = new ArrayList<TariffInformation87610SCUSPNRDataFeed132>();
    private StructuredBookingRecordImageTypeOriginDestinationDetailsErrorWarning106544GCUSPNRDataFeed1322 errorWarning;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsRulesPoliciesGroup106546GCUSPNRDataFeed1322 rulesPoliciesGroup;
    private FormOfPayment87600SCUSPNRDataFeed132 payment;
    private BillableInformation87596SCUSPNRDataFeed132 billingData;
    private AdditionalBusinessSourceInformation87592SCUSPNRDataFeed132 bookingSource;
    private TourInformation87594SCUSPNRDataFeed132 inclusiveTour;
    private List<InteractiveFreeText87602SCUSPNRDataFeed132> marketingInfoList = new ArrayList<InteractiveFreeText87602SCUSPNRDataFeed132>();
    private List<MiscellaneousRemarks87604SCUSPNRDataFeed132> supleInfoList = new ArrayList<MiscellaneousRemarks87604SCUSPNRDataFeed132>();
    private List<Quantity87606SCUSPNRDataFeed132> estimatedDistanceList = new ArrayList<Quantity87606SCUSPNRDataFeed132>();
    private Name87605SCUSPNRDataFeed132 agentInformation;
    private AgreementIdentification87593SCUSPNRDataFeed132 trackingOpt;
    private TicketNumberDetails87611SCUSPNRDataFeed132 electronicVoucherNumber;
    private CommunicationContact87597SCUSPNRDataFeed132 customerEmail;
    private Attribute87595SCUSPNRDataFeed132 attribute;

    /** 
     * Get the 'vehicleInformation' element value. Vehicle information - vehicle type (SIPP code), - vehicle special equipments - vehicle details
     * 
     * @return value
     */
    public VehicleInformation87613SCUSPNRDataFeed132 getVehicleInformation() {
        return vehicleInformation;
    }

    /** 
     * Set the 'vehicleInformation' element value. Vehicle information - vehicle type (SIPP code), - vehicle special equipments - vehicle details
     * 
     * @param vehicleInformation
     */
    public void setVehicleInformation(
            VehicleInformation87613SCUSPNRDataFeed132 vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    /** 
     * Get the 'additionalInfo' element value. Additional vehicle info
     * 
     * @return value
     */
    public FreeTextInformation87612SCUSPNRDataFeed132 getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'additionalInfo' element value. Additional vehicle info
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(
            FreeTextInformation87612SCUSPNRDataFeed132 additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'voucherPrintAck' element value. Voucher Print Acknowledgement.
     * 
     * @return value
     */
    public ReferenceInformation87608SCUSPNRDataFeed132 getVoucherPrintAck() {
        return voucherPrintAck;
    }

    /** 
     * Set the 'voucherPrintAck' element value. Voucher Print Acknowledgement.
     * 
     * @param voucherPrintAck
     */
    public void setVoucherPrintAck(
            ReferenceInformation87608SCUSPNRDataFeed132 voucherPrintAck) {
        this.voucherPrintAck = voucherPrintAck;
    }

    /** 
     * Get the 'companyIdentification' element value. CAR provider code
     * 
     * @return value
     */
    public NonAirCompanyInformation87598SCUSPNRDataFeed132 getCompanyIdentification() {
        return companyIdentification;
    }

    /** 
     * Set the 'companyIdentification' element value. CAR provider code
     * 
     * @param companyIdentification
     */
    public void setCompanyIdentification(
            NonAirCompanyInformation87598SCUSPNRDataFeed132 companyIdentification) {
        this.companyIdentification = companyIdentification;
    }

    /** 
     * Get the list of 'locationInfo' element items. Car AVL pickup and dropoff location parameters (for Amadeus and Provider locations). Used as well to transport the Collection and Delivery place information.
     * 
     * @return list
     */
    public List<PlaceLocationIdentification87603SCUSPNRDataFeed132> getLocationInfoList() {
        return locationInfoList;
    }

    /** 
     * Set the list of 'locationInfo' element items. Car AVL pickup and dropoff location parameters (for Amadeus and Provider locations). Used as well to transport the Collection and Delivery place information.
     * 
     * @param list
     */
    public void setLocationInfoList(
            List<PlaceLocationIdentification87603SCUSPNRDataFeed132> list) {
        locationInfoList = list;
    }

    /** 
     * Get the list of 'deliveryAndCollection' element items. This group is used to carry Delivery and Collection information in a structured way.  This group is exclusive with LOC segment which have 2 repetitions to carry unstructured Delivery and Collection information.
     * 
     * @return list
     */
    public List<DeliveryAndCollection106543GCUSPNRDataFeed1322> getDeliveryAndCollectionList() {
        return deliveryAndCollectionList;
    }

    /** 
     * Set the list of 'deliveryAndCollection' element items. This group is used to carry Delivery and Collection information in a structured way.  This group is exclusive with LOC segment which have 2 repetitions to carry unstructured Delivery and Collection information.
     * 
     * @param list
     */
    public void setDeliveryAndCollectionList(
            List<DeliveryAndCollection106543GCUSPNRDataFeed1322> list) {
        deliveryAndCollectionList = list;
    }

    /** 
     * Get the 'pickupDropoffTimes' element value. Pickup and dropoff dates and times.
     * 
     * @return value
     */
    public StructuredPeriodInformation87609SCUSPNRDataFeed132 getPickupDropoffTimes() {
        return pickupDropoffTimes;
    }

    /** 
     * Set the 'pickupDropoffTimes' element value. Pickup and dropoff dates and times.
     * 
     * @param pickupDropoffTimes
     */
    public void setPickupDropoffTimes(
            StructuredPeriodInformation87609SCUSPNRDataFeed132 pickupDropoffTimes) {
        this.pickupDropoffTimes = pickupDropoffTimes;
    }

    /** 
     * Get the list of 'cancelOrConfirmNbr' element items. Cancellation or Confirmation number.
     * 
     * @return list
     */
    public List<ReservationControlInformation87607SCUSPNRDataFeed132> getCancelOrConfirmNbrList() {
        return cancelOrConfirmNbrList;
    }

    /** 
     * Set the list of 'cancelOrConfirmNbr' element items. Cancellation or Confirmation number.
     * 
     * @param list
     */
    public void setCancelOrConfirmNbrList(
            List<ReservationControlInformation87607SCUSPNRDataFeed132> list) {
        cancelOrConfirmNbrList = list;
    }

    /** 
     * Get the 'rateCodeGroup' element value. Rate Code Information Group
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsRateCodeGroup106545GCUSPNRDataFeed1322 getRateCodeGroup() {
        return rateCodeGroup;
    }

    /** 
     * Set the 'rateCodeGroup' element value. Rate Code Information Group
     * 
     * @param rateCodeGroup
     */
    public void setRateCodeGroup(
            StructuredBookingRecordImageTypeOriginDestinationDetailsRateCodeGroup106545GCUSPNRDataFeed1322 rateCodeGroup) {
        this.rateCodeGroup = rateCodeGroup;
    }

    /** 
     * Get the 'fFlyerNbr' element value. Frequent flyer number.
     * 
     * @return value
     */
    public FrequentTravellerIdentificationCode87601SCUSPNRDataFeed132 getFFlyerNbr() {
        return FFlyerNbr;
    }

    /** 
     * Set the 'fFlyerNbr' element value. Frequent flyer number.
     * 
     * @param fFlyerNbr
     */
    public void setFFlyerNbr(
            FrequentTravellerIdentificationCode87601SCUSPNRDataFeed132 fFlyerNbr) {
        FFlyerNbr = fFlyerNbr;
    }

    /** 
     * Get the 'customerInfo' element value. Customer information ID and CD numbers
     * 
     * @return value
     */
    public ConsumerReferenceInformation87599SCUSPNRDataFeed132 getCustomerInfo() {
        return customerInfo;
    }

    /** 
     * Set the 'customerInfo' element value. Customer information ID and CD numbers
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(
            ConsumerReferenceInformation87599SCUSPNRDataFeed132 customerInfo) {
        this.customerInfo = customerInfo;
    }

    /** 
     * Get the list of 'rateInfo' element items. This segments is used to convey: 1)General Rate information (identifier, plan, category) and Unstructured RB/RQ/RG 2) Structured rate quoted (RQ) or guaranted (RG) 3) Structured base rate (RB) 4) Estimated total information 5) Drop amount data 6) Voucher coupon print references (VV) 7) Rate Override (RO) 8) Modification fee indicator 9) Cancellation fee indicator 10) prepayment
     * 
     * @return list
     */
    public List<TariffInformation87610SCUSPNRDataFeed132> getRateInfoList() {
        return rateInfoList;
    }

    /** 
     * Set the list of 'rateInfo' element items. This segments is used to convey: 1)General Rate information (identifier, plan, category) and Unstructured RB/RQ/RG 2) Structured rate quoted (RQ) or guaranted (RG) 3) Structured base rate (RB) 4) Estimated total information 5) Drop amount data 6) Voucher coupon print references (VV) 7) Rate Override (RO) 8) Modification fee indicator 9) Cancellation fee indicator 10) prepayment
     * 
     * @param list
     */
    public void setRateInfoList(
            List<TariffInformation87610SCUSPNRDataFeed132> list) {
        rateInfoList = list;
    }

    /** 
     * Get the 'errorWarning' element value. This group is used to convey the error or warning code for RTSVCC group
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsErrorWarning106544GCUSPNRDataFeed1322 getErrorWarning() {
        return errorWarning;
    }

    /** 
     * Set the 'errorWarning' element value. This group is used to convey the error or warning code for RTSVCC group
     * 
     * @param errorWarning
     */
    public void setErrorWarning(
            StructuredBookingRecordImageTypeOriginDestinationDetailsErrorWarning106544GCUSPNRDataFeed1322 errorWarning) {
        this.errorWarning = errorWarning;
    }

    /** 
     * Get the 'rulesPoliciesGroup' element value. RTSVCC group
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsRulesPoliciesGroup106546GCUSPNRDataFeed1322 getRulesPoliciesGroup() {
        return rulesPoliciesGroup;
    }

    /** 
     * Set the 'rulesPoliciesGroup' element value. RTSVCC group
     * 
     * @param rulesPoliciesGroup
     */
    public void setRulesPoliciesGroup(
            StructuredBookingRecordImageTypeOriginDestinationDetailsRulesPoliciesGroup106546GCUSPNRDataFeed1322 rulesPoliciesGroup) {
        this.rulesPoliciesGroup = rulesPoliciesGroup;
    }

    /** 
     * Get the 'payment' element value. - Form of payment (FP) - Form of guarantee (G)
     * 
     * @return value
     */
    public FormOfPayment87600SCUSPNRDataFeed132 getPayment() {
        return payment;
    }

    /** 
     * Set the 'payment' element value. - Form of payment (FP) - Form of guarantee (G)
     * 
     * @param payment
     */
    public void setPayment(FormOfPayment87600SCUSPNRDataFeed132 payment) {
        this.payment = payment;
    }

    /** 
     * Get the 'billingData' element value. - Billing reference number (contains conpany data to be built) - Billing mumber (number included in the billing) - Agency account
     * 
     * @return value
     */
    public BillableInformation87596SCUSPNRDataFeed132 getBillingData() {
        return billingData;
    }

    /** 
     * Set the 'billingData' element value. - Billing reference number (contains conpany data to be built) - Billing mumber (number included in the billing) - Agency account
     * 
     * @param billingData
     */
    public void setBillingData(
            BillableInformation87596SCUSPNRDataFeed132 billingData) {
        this.billingData = billingData;
    }

    /** 
     * Get the 'bookingSource' element value. The booking source
     * 
     * @return value
     */
    public AdditionalBusinessSourceInformation87592SCUSPNRDataFeed132 getBookingSource() {
        return bookingSource;
    }

    /** 
     * Set the 'bookingSource' element value. The booking source
     * 
     * @param bookingSource
     */
    public void setBookingSource(
            AdditionalBusinessSourceInformation87592SCUSPNRDataFeed132 bookingSource) {
        this.bookingSource = bookingSource;
    }

    /** 
     * Get the 'inclusiveTour' element value. Tour code
     * 
     * @return value
     */
    public TourInformation87594SCUSPNRDataFeed132 getInclusiveTour() {
        return inclusiveTour;
    }

    /** 
     * Set the 'inclusiveTour' element value. Tour code
     * 
     * @param inclusiveTour
     */
    public void setInclusiveTour(
            TourInformation87594SCUSPNRDataFeed132 inclusiveTour) {
        this.inclusiveTour = inclusiveTour;
    }

    /** 
     * Get the list of 'marketingInfo' element items. Contains: 1) up to 6 lines of marketing text sent by the car provider. 2) up to 3 lines of Other services messages (advertisments).
     * 
     * @return list
     */
    public List<InteractiveFreeText87602SCUSPNRDataFeed132> getMarketingInfoList() {
        return marketingInfoList;
    }

    /** 
     * Set the list of 'marketingInfo' element items. Contains: 1) up to 6 lines of marketing text sent by the car provider. 2) up to 3 lines of Other services messages (advertisments).
     * 
     * @param list
     */
    public void setMarketingInfoList(
            List<InteractiveFreeText87602SCUSPNRDataFeed132> list) {
        marketingInfoList = list;
    }

    /** 
     * Get the list of 'supleInfo' element items. This segment is used to convey the supplementary  informations (SI). e.g: "Customer arriving after agency closure hour. Car keys waiting at the hotel reception located next to the agency".
     * 
     * @return list
     */
    public List<MiscellaneousRemarks87604SCUSPNRDataFeed132> getSupleInfoList() {
        return supleInfoList;
    }

    /** 
     * Set the list of 'supleInfo' element items. This segment is used to convey the supplementary  informations (SI). e.g: "Customer arriving after agency closure hour. Car keys waiting at the hotel reception located next to the agency".
     * 
     * @param list
     */
    public void setSupleInfoList(
            List<MiscellaneousRemarks87604SCUSPNRDataFeed132> list) {
        supleInfoList = list;
    }

    /** 
     * Get the list of 'estimatedDistance' element items. This segment is used to convey distances.  1) Intercity distance. Distance between the Pickup and the Dropoff cities. Information returned by the Car provider for customer notification purpose.  2) Estimated distance Distance that is going to be runned during the rental period.
     * 
     * @return list
     */
    public List<Quantity87606SCUSPNRDataFeed132> getEstimatedDistanceList() {
        return estimatedDistanceList;
    }

    /** 
     * Set the list of 'estimatedDistance' element items. This segment is used to convey distances.  1) Intercity distance. Distance between the Pickup and the Dropoff cities. Information returned by the Car provider for customer notification purpose.  2) Estimated distance Distance that is going to be runned during the rental period.
     * 
     * @param list
     */
    public void setEstimatedDistanceList(
            List<Quantity87606SCUSPNRDataFeed132> list) {
        estimatedDistanceList = list;
    }

    /** 
     * Get the 'agentInformation' element value. Booking agent name
     * 
     * @return value
     */
    public Name87605SCUSPNRDataFeed132 getAgentInformation() {
        return agentInformation;
    }

    /** 
     * Set the 'agentInformation' element value. Booking agent name
     * 
     * @param agentInformation
     */
    public void setAgentInformation(Name87605SCUSPNRDataFeed132 agentInformation) {
        this.agentInformation = agentInformation;
    }

    /** 
     * Get the 'trackingOpt' element value. Tracking Option (TK)
     * 
     * @return value
     */
    public AgreementIdentification87593SCUSPNRDataFeed132 getTrackingOpt() {
        return trackingOpt;
    }

    /** 
     * Set the 'trackingOpt' element value. Tracking Option (TK)
     * 
     * @param trackingOpt
     */
    public void setTrackingOpt(
            AgreementIdentification87593SCUSPNRDataFeed132 trackingOpt) {
        this.trackingOpt = trackingOpt;
    }

    /** 
     * Get the 'electronicVoucherNumber' element value. Electronic Voucher Number
     * 
     * @return value
     */
    public TicketNumberDetails87611SCUSPNRDataFeed132 getElectronicVoucherNumber() {
        return electronicVoucherNumber;
    }

    /** 
     * Set the 'electronicVoucherNumber' element value. Electronic Voucher Number
     * 
     * @param electronicVoucherNumber
     */
    public void setElectronicVoucherNumber(
            TicketNumberDetails87611SCUSPNRDataFeed132 electronicVoucherNumber) {
        this.electronicVoucherNumber = electronicVoucherNumber;
    }

    /** 
     * Get the 'customerEmail' element value. E-mail
     * 
     * @return value
     */
    public CommunicationContact87597SCUSPNRDataFeed132 getCustomerEmail() {
        return customerEmail;
    }

    /** 
     * Set the 'customerEmail' element value. E-mail
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(
            CommunicationContact87597SCUSPNRDataFeed132 customerEmail) {
        this.customerEmail = customerEmail;
    }

    /** 
     * Get the 'attribute' element value. This mandatory segment marks the end of the CAR data group. It specifies also if the booking is leisure or not.
     * 
     * @return value
     */
    public Attribute87595SCUSPNRDataFeed132 getAttribute() {
        return attribute;
    }

    /** 
     * Set the 'attribute' element value. This mandatory segment marks the end of the CAR data group. It specifies also if the booking is leisure or not.
     * 
     * @param attribute
     */
    public void setAttribute(Attribute87595SCUSPNRDataFeed132 attribute) {
        this.attribute = attribute;
    }
}
