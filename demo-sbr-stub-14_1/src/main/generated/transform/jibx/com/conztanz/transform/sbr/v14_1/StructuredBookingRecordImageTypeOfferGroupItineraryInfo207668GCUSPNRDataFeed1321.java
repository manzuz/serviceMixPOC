
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_itineraryInfo_207668_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_129487_S_CUS_PNRDataFeed_132" name="elementManagementItinerary"/>
 *     &lt;xs:element type="ReferenceInformation_24862_S_CUS_PNRDataFeed_132" name="referenceForSegment" minOccurs="0"/>
 *     &lt;xs:element type="TravelProductInformation_182723_S_CUS_PNRDataFeed_132" name="travelProduct"/>
 *     &lt;xs:element type="DateAndTimeInformation_17649_S_CUS_PNRDataFeed_132" name="bookingCreationDate" minOccurs="0"/>
 *     &lt;xs:element type="RelatedProductInformation_76536_S_CUS_PNRDataFeed_132" name="originalStatusCode" minOccurs="0"/>
 *     &lt;xs:element type="ReservationControlInformation_29596_S_CUS_PNRDataFeed_132" name="negospaceId" minOccurs="0"/>
 *     &lt;xs:element type="BillingSegmentGroup_123112_G_CUS_PNRDataFeed_1323" name="billingSegmentInfo" minOccurs="0"/>
 *     &lt;xs:element type="MessageActionDetails_22987_S_CUS_PNRDataFeed_132" name="messageAction"/>
 *     &lt;xs:element type="ReservationControlInformation_22991_S_CUS_PNRDataFeed_132" name="itineraryReservationInfo" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="RelatedProductInformation_4795_S_CUS_PNRDataFeed_132" name="relatedProduct" minOccurs="0"/>
 *     &lt;xs:element type="AdditionalProductDetails_26744_S_CUS_PNRDataFeed_132" name="flightDetail" minOccurs="0"/>
 *     &lt;xs:element type="SelectionDetails_24911_S_CUS_PNRDataFeed_132" name="selectionDetails" minOccurs="0"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_27002_S_CUS_PNRDataFeed_132" name="confirmationNumber" minOccurs="0"/>
 *     &lt;xs:element type="LongFreeText_24804_S_CUS_PNRDataFeed_132" name="itineraryFreetext" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="InventoryData_60369_G_CUS_PNRDataFeed_132" name="inventoryData" minOccurs="0"/>
 *     &lt;xs:element type="OndGroup_181045_G_CUS_PNRDataFeed_132" name="yieldDataGroup" minOccurs="0"/>
 *     &lt;xs:element type="RevenueManagementData_33010_S_CUS_PNRDataFeed_132" name="overbookingData" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_94627_S_CUS_PNRDataFeed_132" name="ctdReplacementFlags" minOccurs="0"/>
 *     &lt;xs:element type="PricingOrTicketingSubsequent_169135_S_CUS_PNRDataFeed_132" name="reasonForIssuanceCode" minOccurs="0"/>
 *     &lt;xs:element type="OriginatorOfRequestDetails_169138_S_CUS_PNRDataFeed_132" name="bookingChannel" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_codeSharePartnerInfo_191450_G_CUS_PNRDataFeed_1323" name="codeSharePartnerInfo" minOccurs="0"/>
 *     &lt;xs:element type="PointOfSaleData_183102_G_CUS_PNRDataFeed_132" name="pointOfSellDetails" minOccurs="0"/>
 *     &lt;xs:element type="HotelGroup_183106_G_CUS_PNRDataFeed_1323" name="hotelReservationInfo" minOccurs="0"/>
 *     &lt;xs:element type="Carbcq1a101_106542_G_CUS_PNRDataFeed_1323" name="typicalCarData" minOccurs="0"/>
 *     &lt;xs:element type="TrainInformation_122960_G_CUS_PNRDataFeed_132" name="railInfo" minOccurs="0"/>
 *     &lt;xs:element type="Insbcq1a0711_137775_G_CUS_PNRDataFeed_1323" name="insuranceInfo" minOccurs="0"/>
 *     &lt;xs:element type="CruiseBusinessData_102221_G_CUS_PNRDataFeed_132" name="typicalCruiseData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupItineraryInfo207668GCUSPNRDataFeed1321
{
    private ElementManagementSegment129487SCUSPNRDataFeed132 elementManagementItinerary;
    private ReferenceInformation24862SCUSPNRDataFeed132 referenceForSegment;
    private TravelProductInformation182723SCUSPNRDataFeed132 travelProduct;
    private DateAndTimeInformation17649SCUSPNRDataFeed132 bookingCreationDate;
    private RelatedProductInformation76536SCUSPNRDataFeed132 originalStatusCode;
    private ReservationControlInformation29596SCUSPNRDataFeed132 negospaceId;
    private BillingSegmentGroup123112GCUSPNRDataFeed1323 billingSegmentInfo;
    private MessageActionDetails22987SCUSPNRDataFeed132 messageAction;
    private List<ReservationControlInformation22991SCUSPNRDataFeed132> itineraryReservationInfoList = new ArrayList<ReservationControlInformation22991SCUSPNRDataFeed132>();
    private RelatedProductInformation4795SCUSPNRDataFeed132 relatedProduct;
    private AdditionalProductDetails26744SCUSPNRDataFeed132 flightDetail;
    private SelectionDetails24911SCUSPNRDataFeed132 selectionDetails;
    private ItemReferencesAndVersions27002SCUSPNRDataFeed132 confirmationNumber;
    private List<LongFreeText24804SCUSPNRDataFeed132> itineraryFreetextList = new ArrayList<LongFreeText24804SCUSPNRDataFeed132>();
    private InventoryData60369GCUSPNRDataFeed132 inventoryData;
    private OndGroup181045GCUSPNRDataFeed132 yieldDataGroup;
    private RevenueManagementData33010SCUSPNRDataFeed132 overbookingData;
    private StatusDetails94627SCUSPNRDataFeed132 ctdReplacementFlags;
    private PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 reasonForIssuanceCode;
    private OriginatorOfRequestDetails169138SCUSPNRDataFeed132 bookingChannel;
    private StructuredBookingRecordImageTypeOfferGroupCodeSharePartnerInfo191450GCUSPNRDataFeed1323 codeSharePartnerInfo;
    private PointOfSaleData183102GCUSPNRDataFeed132 pointOfSellDetails;
    private HotelGroup183106GCUSPNRDataFeed1323 hotelReservationInfo;
    private Carbcq1a101106542GCUSPNRDataFeed1323 typicalCarData;
    private TrainInformation122960GCUSPNRDataFeed132 railInfo;
    private Insbcq1a0711137775GCUSPNRDataFeed1323 insuranceInfo;
    private CruiseBusinessData102221GCUSPNRDataFeed132 typicalCruiseData;

    /** 
     * Get the 'elementManagementItinerary' element value. PNR segments/elements references
     * 
     * @return value
     */
    public ElementManagementSegment129487SCUSPNRDataFeed132 getElementManagementItinerary() {
        return elementManagementItinerary;
    }

    /** 
     * Set the 'elementManagementItinerary' element value. PNR segments/elements references
     * 
     * @param elementManagementItinerary
     */
    public void setElementManagementItinerary(
            ElementManagementSegment129487SCUSPNRDataFeed132 elementManagementItinerary) {
        this.elementManagementItinerary = elementManagementItinerary;
    }

    /** 
     * Get the 'referenceForSegment' element value. Specific reference identification
     * 
     * @return value
     */
    public ReferenceInformation24862SCUSPNRDataFeed132 getReferenceForSegment() {
        return referenceForSegment;
    }

    /** 
     * Set the 'referenceForSegment' element value. Specific reference identification
     * 
     * @param referenceForSegment
     */
    public void setReferenceForSegment(
            ReferenceInformation24862SCUSPNRDataFeed132 referenceForSegment) {
        this.referenceForSegment = referenceForSegment;
    }

    /** 
     * Get the 'travelProduct' element value. Segment details
     * 
     * @return value
     */
    public TravelProductInformation182723SCUSPNRDataFeed132 getTravelProduct() {
        return travelProduct;
    }

    /** 
     * Set the 'travelProduct' element value. Segment details
     * 
     * @param travelProduct
     */
    public void setTravelProduct(
            TravelProductInformation182723SCUSPNRDataFeed132 travelProduct) {
        this.travelProduct = travelProduct;
    }

    /** 
     * Get the 'bookingCreationDate' element value. Booking creation date and time
     * 
     * @return value
     */
    public DateAndTimeInformation17649SCUSPNRDataFeed132 getBookingCreationDate() {
        return bookingCreationDate;
    }

    /** 
     * Set the 'bookingCreationDate' element value. Booking creation date and time
     * 
     * @param bookingCreationDate
     */
    public void setBookingCreationDate(
            DateAndTimeInformation17649SCUSPNRDataFeed132 bookingCreationDate) {
        this.bookingCreationDate = bookingCreationDate;
    }

    /** 
     * Get the 'originalStatusCode' element value. Transports the original status code and the previous status
     * 
     * @return value
     */
    public RelatedProductInformation76536SCUSPNRDataFeed132 getOriginalStatusCode() {
        return originalStatusCode;
    }

    /** 
     * Set the 'originalStatusCode' element value. Transports the original status code and the previous status
     * 
     * @param originalStatusCode
     */
    public void setOriginalStatusCode(
            RelatedProductInformation76536SCUSPNRDataFeed132 originalStatusCode) {
        this.originalStatusCode = originalStatusCode;
    }

    /** 
     * Get the 'negospaceId' element value. Contains: - the DBID
     * 
     * @return value
     */
    public ReservationControlInformation29596SCUSPNRDataFeed132 getNegospaceId() {
        return negospaceId;
    }

    /** 
     * Set the 'negospaceId' element value. Contains: - the DBID
     * 
     * @param negospaceId
     */
    public void setNegospaceId(
            ReservationControlInformation29596SCUSPNRDataFeed132 negospaceId) {
        this.negospaceId = negospaceId;
    }

    /** 
     * Get the 'billingSegmentInfo' element value. This group contains billing segment information
     * 
     * @return value
     */
    public BillingSegmentGroup123112GCUSPNRDataFeed1323 getBillingSegmentInfo() {
        return billingSegmentInfo;
    }

    /** 
     * Set the 'billingSegmentInfo' element value. This group contains billing segment information
     * 
     * @param billingSegmentInfo
     */
    public void setBillingSegmentInfo(
            BillingSegmentGroup123112GCUSPNRDataFeed1323 billingSegmentInfo) {
        this.billingSegmentInfo = billingSegmentInfo;
    }

    /** 
     * Get the 'messageAction' element value. Type of itinerary segment
     * 
     * @return value
     */
    public MessageActionDetails22987SCUSPNRDataFeed132 getMessageAction() {
        return messageAction;
    }

    /** 
     * Set the 'messageAction' element value. Type of itinerary segment
     * 
     * @param messageAction
     */
    public void setMessageAction(
            MessageActionDetails22987SCUSPNRDataFeed132 messageAction) {
        this.messageAction = messageAction;
    }

    /** 
     * Get the list of 'itineraryReservationInfo' element items. Specify a reference to a reservation
     * 
     * @return list
     */
    public List<ReservationControlInformation22991SCUSPNRDataFeed132> getItineraryReservationInfoList() {
        return itineraryReservationInfoList;
    }

    /** 
     * Set the list of 'itineraryReservationInfo' element items. Specify a reference to a reservation
     * 
     * @param list
     */
    public void setItineraryReservationInfoList(
            List<ReservationControlInformation22991SCUSPNRDataFeed132> list) {
        itineraryReservationInfoList = list;
    }

    /** 
     * Get the 'relatedProduct' element value. Quantity and status. Status code: Use defined code or an ATA/IATA defined action code (See AIRIMP 7.1.2/7.1.3/7.1.4/8.14.1 (as bilaterally agreed), SIPP 105.170.1.1).
     * 
     * @return value
     */
    public RelatedProductInformation4795SCUSPNRDataFeed132 getRelatedProduct() {
        return relatedProduct;
    }

    /** 
     * Set the 'relatedProduct' element value. Quantity and status. Status code: Use defined code or an ATA/IATA defined action code (See AIRIMP 7.1.2/7.1.3/7.1.4/8.14.1 (as bilaterally agreed), SIPP 105.170.1.1).
     * 
     * @param relatedProduct
     */
    public void setRelatedProduct(
            RelatedProductInformation4795SCUSPNRDataFeed132 relatedProduct) {
        this.relatedProduct = relatedProduct;
    }

    /** 
     * Get the 'flightDetail' element value. Additional information about a segment
     * 
     * @return value
     */
    public AdditionalProductDetails26744SCUSPNRDataFeed132 getFlightDetail() {
        return flightDetail;
    }

    /** 
     * Set the 'flightDetail' element value. Additional information about a segment
     * 
     * @param flightDetail
     */
    public void setFlightDetail(
            AdditionalProductDetails26744SCUSPNRDataFeed132 flightDetail) {
        this.flightDetail = flightDetail;
    }

    /** 
     * Get the 'selectionDetails' element value. Specify details for making a selection
     * 
     * @return value
     */
    public SelectionDetails24911SCUSPNRDataFeed132 getSelectionDetails() {
        return selectionDetails;
    }

    /** 
     * Set the 'selectionDetails' element value. Specify details for making a selection
     * 
     * @param selectionDetails
     */
    public void setSelectionDetails(
            SelectionDetails24911SCUSPNRDataFeed132 selectionDetails) {
        this.selectionDetails = selectionDetails;
    }

    /** 
     * Get the 'confirmationNumber' element value. Manual car confirmation number
     * 
     * @return value
     */
    public ItemReferencesAndVersions27002SCUSPNRDataFeed132 getConfirmationNumber() {
        return confirmationNumber;
    }

    /** 
     * Set the 'confirmationNumber' element value. Manual car confirmation number
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(
            ItemReferencesAndVersions27002SCUSPNRDataFeed132 confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    /** 
     * Get the list of 'itineraryFreetext' element items. Provides free form or coded long free text information
     * 
     * @return list
     */
    public List<LongFreeText24804SCUSPNRDataFeed132> getItineraryFreetextList() {
        return itineraryFreetextList;
    }

    /** 
     * Set the list of 'itineraryFreetext' element items. Provides free form or coded long free text information
     * 
     * @param list
     */
    public void setItineraryFreetextList(
            List<LongFreeText24804SCUSPNRDataFeed132> list) {
        itineraryFreetextList = list;
    }

    /** 
     * Get the 'inventoryData' element value. - Cabin Code - Sub Class number - POS (Country Code/System Code)
     * 
     * @return value
     */
    public InventoryData60369GCUSPNRDataFeed132 getInventoryData() {
        return inventoryData;
    }

    /** 
     * Set the 'inventoryData' element value. - Cabin Code - Sub Class number - POS (Country Code/System Code)
     * 
     * @param inventoryData
     */
    public void setInventoryData(
            InventoryData60369GCUSPNRDataFeed132 inventoryData) {
        this.inventoryData = inventoryData;
    }

    /** 
     * Get the 'yieldDataGroup' element value. contains Yield information
     * 
     * @return value
     */
    public OndGroup181045GCUSPNRDataFeed132 getYieldDataGroup() {
        return yieldDataGroup;
    }

    /** 
     * Set the 'yieldDataGroup' element value. contains Yield information
     * 
     * @param yieldDataGroup
     */
    public void setYieldDataGroup(
            OndGroup181045GCUSPNRDataFeed132 yieldDataGroup) {
        this.yieldDataGroup = yieldDataGroup;
    }

    /** 
     * Get the 'overbookingData' element value. - Overbooking or Oversale - + reason
     * 
     * @return value
     */
    public RevenueManagementData33010SCUSPNRDataFeed132 getOverbookingData() {
        return overbookingData;
    }

    /** 
     * Set the 'overbookingData' element value. - Overbooking or Oversale - + reason
     * 
     * @param overbookingData
     */
    public void setOverbookingData(
            RevenueManagementData33010SCUSPNRDataFeed132 overbookingData) {
        this.overbookingData = overbookingData;
    }

    /** 
     * Get the 'ctdReplacementFlags' element value. contains CTD indicator -Cascading indicator (Y/N) contains CBG indicator for SVC segment
     * 
     * @return value
     */
    public StatusDetails94627SCUSPNRDataFeed132 getCtdReplacementFlags() {
        return ctdReplacementFlags;
    }

    /** 
     * Set the 'ctdReplacementFlags' element value. contains CTD indicator -Cascading indicator (Y/N) contains CBG indicator for SVC segment
     * 
     * @param ctdReplacementFlags
     */
    public void setCtdReplacementFlags(
            StatusDetails94627SCUSPNRDataFeed132 ctdReplacementFlags) {
        this.ctdReplacementFlags = ctdReplacementFlags;
    }

    /** 
     * Get the 'reasonForIssuanceCode' element value. To convey RFIC/RFISC at SVC level
     * 
     * @return value
     */
    public PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 getReasonForIssuanceCode() {
        return reasonForIssuanceCode;
    }

    /** 
     * Set the 'reasonForIssuanceCode' element value. To convey RFIC/RFISC at SVC level
     * 
     * @param reasonForIssuanceCode
     */
    public void setReasonForIssuanceCode(
            PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 reasonForIssuanceCode) {
        this.reasonForIssuanceCode = reasonForIssuanceCode;
    }

    /** 
     * Get the 'bookingChannel' element value. To convey information about the channel responsible of the booking
     * 
     * @return value
     */
    public OriginatorOfRequestDetails169138SCUSPNRDataFeed132 getBookingChannel() {
        return bookingChannel;
    }

    /** 
     * Set the 'bookingChannel' element value. To convey information about the channel responsible of the booking
     * 
     * @param bookingChannel
     */
    public void setBookingChannel(
            OriginatorOfRequestDetails169138SCUSPNRDataFeed132 bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    /** 
     * Get the 'codeSharePartnerInfo' element value. Code Share partner information:  Codeshare data: - Codeshare flight - Codeshare agreement Inventory data: - Cabin code - Sub class number - POS (country code/system code) Yield details Overbooking data
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupCodeSharePartnerInfo191450GCUSPNRDataFeed1323 getCodeSharePartnerInfo() {
        return codeSharePartnerInfo;
    }

    /** 
     * Set the 'codeSharePartnerInfo' element value. Code Share partner information:  Codeshare data: - Codeshare flight - Codeshare agreement Inventory data: - Cabin code - Sub class number - POS (country code/system code) Yield details Overbooking data
     * 
     * @param codeSharePartnerInfo
     */
    public void setCodeSharePartnerInfo(
            StructuredBookingRecordImageTypeOfferGroupCodeSharePartnerInfo191450GCUSPNRDataFeed1323 codeSharePartnerInfo) {
        this.codeSharePartnerInfo = codeSharePartnerInfo;
    }

    /** 
     * Get the 'pointOfSellDetails' element value. Point of Sale information at segment level
     * 
     * @return value
     */
    public PointOfSaleData183102GCUSPNRDataFeed132 getPointOfSellDetails() {
        return pointOfSellDetails;
    }

    /** 
     * Set the 'pointOfSellDetails' element value. Point of Sale information at segment level
     * 
     * @param pointOfSellDetails
     */
    public void setPointOfSellDetails(
            PointOfSaleData183102GCUSPNRDataFeed132 pointOfSellDetails) {
        this.pointOfSellDetails = pointOfSellDetails;
    }

    /** 
     * Get the 'hotelReservationInfo' element value. Contains Hotel specific data
     * 
     * @return value
     */
    public HotelGroup183106GCUSPNRDataFeed1323 getHotelReservationInfo() {
        return hotelReservationInfo;
    }

    /** 
     * Set the 'hotelReservationInfo' element value. Contains Hotel specific data
     * 
     * @param hotelReservationInfo
     */
    public void setHotelReservationInfo(
            HotelGroup183106GCUSPNRDataFeed1323 hotelReservationInfo) {
        this.hotelReservationInfo = hotelReservationInfo;
    }

    /** 
     * Get the 'typicalCarData' element value. Car Sell Details
     * 
     * @return value
     */
    public Carbcq1a101106542GCUSPNRDataFeed1323 getTypicalCarData() {
        return typicalCarData;
    }

    /** 
     * Set the 'typicalCarData' element value. Car Sell Details
     * 
     * @param typicalCarData
     */
    public void setTypicalCarData(
            Carbcq1a101106542GCUSPNRDataFeed1323 typicalCarData) {
        this.typicalCarData = typicalCarData;
    }

    /** 
     * Get the 'railInfo' element value.
     * 
     * @return value
     */
    public TrainInformation122960GCUSPNRDataFeed132 getRailInfo() {
        return railInfo;
    }

    /** 
     * Set the 'railInfo' element value.
     * 
     * @param railInfo
     */
    public void setRailInfo(TrainInformation122960GCUSPNRDataFeed132 railInfo) {
        this.railInfo = railInfo;
    }

    /** 
     * Get the 'insuranceInfo' element value. contains all information of INS segment
     * 
     * @return value
     */
    public Insbcq1a0711137775GCUSPNRDataFeed1323 getInsuranceInfo() {
        return insuranceInfo;
    }

    /** 
     * Set the 'insuranceInfo' element value. contains all information of INS segment
     * 
     * @param insuranceInfo
     */
    public void setInsuranceInfo(
            Insbcq1a0711137775GCUSPNRDataFeed1323 insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }

    /** 
     * Get the 'typicalCruiseData' element value. This group contains all information of Cruise segment
     * 
     * @return value
     */
    public CruiseBusinessData102221GCUSPNRDataFeed132 getTypicalCruiseData() {
        return typicalCruiseData;
    }

    /** 
     * Set the 'typicalCruiseData' element value. This group contains all information of Cruise segment
     * 
     * @param typicalCruiseData
     */
    public void setTypicalCruiseData(
            CruiseBusinessData102221GCUSPNRDataFeed132 typicalCruiseData) {
        this.typicalCruiseData = typicalCruiseData;
    }
}
