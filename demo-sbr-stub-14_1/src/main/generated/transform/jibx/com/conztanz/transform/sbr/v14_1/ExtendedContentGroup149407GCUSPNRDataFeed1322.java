
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedContentGroup_149407_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="GroupDelimiter_129774_S_CUS_PNRDataFeed_132" name="easyContentIdentification"/>
 *     &lt;xs:element type="CompanyInformation_130639_S_CUS_PNRDataFeed_132" name="providerDetails"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_129758_S_CUS_PNRDataFeed_132" name="creationDate"/>
 *     &lt;xs:element type="ReferenceInformation_129701_S_CUS_PNRDataFeed_132" name="paxRef" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_129703_S_CUS_PNRDataFeed_132" name="associationReference" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_128778_S_CUS_PNRDataFeed_132" name="productDescription" minOccurs="0"/>
 *     &lt;xs:element type="RelatedProductInformation_128492_S_CUS_PNRDataFeed_132" name="quantityStatus" minOccurs="0"/>
 *     &lt;xs:element type="ReservationControlInformation_128485_S_CUS_PNRDataFeed_132" name="confirmOrCancelNbr" minOccurs="0"/>
 *     &lt;xs:element type="SelectionDetails_128504_S_CUS_PNRDataFeed_132" name="bookingChannel" minOccurs="0"/>
 *     &lt;xs:element type="AirExtendedContent_149391_G_CUS_PNRDataFeed_1322" name="airInfos" minOccurs="0"/>
 *     &lt;xs:element type="EcRail_147333_G_CUS_PNRDataFeed_1322" name="railInfos" minOccurs="0"/>
 *     &lt;xs:element type="ExtendedEvents_145716_G_CUS_PNRDataFeed_1322" name="eventInfos" minOccurs="0"/>
 *     &lt;xs:element type="HotelGroup_145928_G_CUS_PNRDataFeed_1322" name="hotelInfos" minOccurs="0"/>
 *     &lt;xs:element type="ExtendedTaxi_145935_G_CUS_PNRDataFeed_1322" name="taxiInfos" minOccurs="0"/>
 *     &lt;xs:element type="Insbcq1a1211_145844_G_CUS_PNRDataFeed_1322" name="insuranceInfos" minOccurs="0"/>
 *     &lt;xs:element type="ExtendedContentFerryLegDescription_145842_G_CUS_PNRDataFeed_132" name="ferryInfos" minOccurs="0"/>
 *     &lt;xs:element type="DummySegment_129229_S_CUS_PNRDataFeed_132" name="marker"/>
 *     &lt;xs:element type="CarEasyContentInformation_147046_G_CUS_PNRDataFeed_1322" name="carInfos" minOccurs="0"/>
 *     &lt;xs:element type="CruiseExtendedContent_145859_G_CUS_PNRDataFeed_132" name="cruiseInfos" minOccurs="0"/>
 *     &lt;xs:element type="ExtendedGoodsAndDocuments_145718_G_CUS_PNRDataFeed_1322" name="docsGoodiesMisInfos" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedContentGroup149407GCUSPNRDataFeed1322
{
    private GroupDelimiter129774SCUSPNRDataFeed132 easyContentIdentification;
    private CompanyInformation130639SCUSPNRDataFeed132 providerDetails;
    private StructuredDateTimeInformation129758SCUSPNRDataFeed132 creationDate;
    private ReferenceInformation129701SCUSPNRDataFeed132 paxRef;
    private ReferenceInformation129703SCUSPNRDataFeed132 associationReference;
    private FreeTextInformation128778SCUSPNRDataFeed132 productDescription;
    private RelatedProductInformation128492SCUSPNRDataFeed132 quantityStatus;
    private ReservationControlInformation128485SCUSPNRDataFeed132 confirmOrCancelNbr;
    private SelectionDetails128504SCUSPNRDataFeed132 bookingChannel;
    private AirExtendedContent149391GCUSPNRDataFeed1322 airInfos;
    private EcRail147333GCUSPNRDataFeed1322 railInfos;
    private ExtendedEvents145716GCUSPNRDataFeed1322 eventInfos;
    private HotelGroup145928GCUSPNRDataFeed1322 hotelInfos;
    private ExtendedTaxi145935GCUSPNRDataFeed1322 taxiInfos;
    private Insbcq1a1211145844GCUSPNRDataFeed1322 insuranceInfos;
    private ExtendedContentFerryLegDescription145842GCUSPNRDataFeed132 ferryInfos;
    private DummySegment129229SCUSPNRDataFeed132 marker;
    private CarEasyContentInformation147046GCUSPNRDataFeed1322 carInfos;
    private CruiseExtendedContent145859GCUSPNRDataFeed132 cruiseInfos;
    private ExtendedGoodsAndDocuments145718GCUSPNRDataFeed1322 docsGoodiesMisInfos;

    /** 
     * Get the 'easyContentIdentification' element value. Segment used to specify the type of EC product, the tatoo type and tattoo number of the EC. It also specifies if the EC was manually created or automatically generated from PNR elements.
     * 
     * @return value
     */
    public GroupDelimiter129774SCUSPNRDataFeed132 getEasyContentIdentification() {
        return easyContentIdentification;
    }

    /** 
     * Set the 'easyContentIdentification' element value. Segment used to specify the type of EC product, the tatoo type and tattoo number of the EC. It also specifies if the EC was manually created or automatically generated from PNR elements.
     * 
     * @param easyContentIdentification
     */
    public void setEasyContentIdentification(
            GroupDelimiter129774SCUSPNRDataFeed132 easyContentIdentification) {
        this.easyContentIdentification = easyContentIdentification;
    }

    /** 
     * Get the 'providerDetails' element value. Specify provider information: name, code, profile reference.
     * 
     * @return value
     */
    public CompanyInformation130639SCUSPNRDataFeed132 getProviderDetails() {
        return providerDetails;
    }

    /** 
     * Set the 'providerDetails' element value. Specify provider information: name, code, profile reference.
     * 
     * @param providerDetails
     */
    public void setProviderDetails(
            CompanyInformation130639SCUSPNRDataFeed132 providerDetails) {
        this.providerDetails = providerDetails;
    }

    /** 
     * Get the 'creationDate' element value. Specify the creation date of the EC in Amadeus system.
     * 
     * @return value
     */
    public StructuredDateTimeInformation129758SCUSPNRDataFeed132 getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'creationDate' element value. Specify the creation date of the EC in Amadeus system.
     * 
     * @param creationDate
     */
    public void setCreationDate(
            StructuredDateTimeInformation129758SCUSPNRDataFeed132 creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the 'paxRef' element value. Used to associate EC to a passenger of the PNR.
     * 
     * @return value
     */
    public ReferenceInformation129701SCUSPNRDataFeed132 getPaxRef() {
        return paxRef;
    }

    /** 
     * Set the 'paxRef' element value. Used to associate EC to a passenger of the PNR.
     * 
     * @param paxRef
     */
    public void setPaxRef(ReferenceInformation129701SCUSPNRDataFeed132 paxRef) {
        this.paxRef = paxRef;
    }

    /** 
     * Get the 'associationReference' element value. Used to associate EC to PNR elements:       - Manual Auxiliary segments       - Remarks       - MIS segments       - Ghost segments
     * 
     * @return value
     */
    public ReferenceInformation129703SCUSPNRDataFeed132 getAssociationReference() {
        return associationReference;
    }

    /** 
     * Set the 'associationReference' element value. Used to associate EC to PNR elements:       - Manual Auxiliary segments       - Remarks       - MIS segments       - Ghost segments
     * 
     * @param associationReference
     */
    public void setAssociationReference(
            ReferenceInformation129703SCUSPNRDataFeed132 associationReference) {
        this.associationReference = associationReference;
    }

    /** 
     * Get the 'productDescription' element value. Provide description of the EC
     * 
     * @return value
     */
    public FreeTextInformation128778SCUSPNRDataFeed132 getProductDescription() {
        return productDescription;
    }

    /** 
     * Set the 'productDescription' element value. Provide description of the EC
     * 
     * @param productDescription
     */
    public void setProductDescription(
            FreeTextInformation128778SCUSPNRDataFeed132 productDescription) {
        this.productDescription = productDescription;
    }

    /** 
     * Get the 'quantityStatus' element value. Provide information about the number in party or the product quantity.
     * 
     * @return value
     */
    public RelatedProductInformation128492SCUSPNRDataFeed132 getQuantityStatus() {
        return quantityStatus;
    }

    /** 
     * Set the 'quantityStatus' element value. Provide information about the number in party or the product quantity.
     * 
     * @param quantityStatus
     */
    public void setQuantityStatus(
            RelatedProductInformation128492SCUSPNRDataFeed132 quantityStatus) {
        this.quantityStatus = quantityStatus;
    }

    /** 
     * Get the 'confirmOrCancelNbr' element value. Specify Confirmation Number and/or Cancellation Number
     * 
     * @return value
     */
    public ReservationControlInformation128485SCUSPNRDataFeed132 getConfirmOrCancelNbr() {
        return confirmOrCancelNbr;
    }

    /** 
     * Set the 'confirmOrCancelNbr' element value. Specify Confirmation Number and/or Cancellation Number
     * 
     * @param confirmOrCancelNbr
     */
    public void setConfirmOrCancelNbr(
            ReservationControlInformation128485SCUSPNRDataFeed132 confirmOrCancelNbr) {
        this.confirmOrCancelNbr = confirmOrCancelNbr;
    }

    /** 
     * Get the 'bookingChannel' element value. To specify the booking channel
     * 
     * @return value
     */
    public SelectionDetails128504SCUSPNRDataFeed132 getBookingChannel() {
        return bookingChannel;
    }

    /** 
     * Set the 'bookingChannel' element value. To specify the booking channel
     * 
     * @param bookingChannel
     */
    public void setBookingChannel(
            SelectionDetails128504SCUSPNRDataFeed132 bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    /** 
     * Get the 'airInfos' element value. EC Air details
     * 
     * @return value
     */
    public AirExtendedContent149391GCUSPNRDataFeed1322 getAirInfos() {
        return airInfos;
    }

    /** 
     * Set the 'airInfos' element value. EC Air details
     * 
     * @param airInfos
     */
    public void setAirInfos(AirExtendedContent149391GCUSPNRDataFeed1322 airInfos) {
        this.airInfos = airInfos;
    }

    /** 
     * Get the 'railInfos' element value. EC rail details
     * 
     * @return value
     */
    public EcRail147333GCUSPNRDataFeed1322 getRailInfos() {
        return railInfos;
    }

    /** 
     * Set the 'railInfos' element value. EC rail details
     * 
     * @param railInfos
     */
    public void setRailInfos(EcRail147333GCUSPNRDataFeed1322 railInfos) {
        this.railInfos = railInfos;
    }

    /** 
     * Get the 'eventInfos' element value. This group is used for following EC product types: - Tickets - Courses - Visits
     * 
     * @return value
     */
    public ExtendedEvents145716GCUSPNRDataFeed1322 getEventInfos() {
        return eventInfos;
    }

    /** 
     * Set the 'eventInfos' element value. This group is used for following EC product types: - Tickets - Courses - Visits
     * 
     * @param eventInfos
     */
    public void setEventInfos(ExtendedEvents145716GCUSPNRDataFeed1322 eventInfos) {
        this.eventInfos = eventInfos;
    }

    /** 
     * Get the 'hotelInfos' element value. EC Hotel details
     * 
     * @return value
     */
    public HotelGroup145928GCUSPNRDataFeed1322 getHotelInfos() {
        return hotelInfos;
    }

    /** 
     * Set the 'hotelInfos' element value. EC Hotel details
     * 
     * @param hotelInfos
     */
    public void setHotelInfos(HotelGroup145928GCUSPNRDataFeed1322 hotelInfos) {
        this.hotelInfos = hotelInfos;
    }

    /** 
     * Get the 'taxiInfos' element value. EC Taxi details
     * 
     * @return value
     */
    public ExtendedTaxi145935GCUSPNRDataFeed1322 getTaxiInfos() {
        return taxiInfos;
    }

    /** 
     * Set the 'taxiInfos' element value. EC Taxi details
     * 
     * @param taxiInfos
     */
    public void setTaxiInfos(ExtendedTaxi145935GCUSPNRDataFeed1322 taxiInfos) {
        this.taxiInfos = taxiInfos;
    }

    /** 
     * Get the 'insuranceInfos' element value. EC Insurance details
     * 
     * @return value
     */
    public Insbcq1a1211145844GCUSPNRDataFeed1322 getInsuranceInfos() {
        return insuranceInfos;
    }

    /** 
     * Set the 'insuranceInfos' element value. EC Insurance details
     * 
     * @param insuranceInfos
     */
    public void setInsuranceInfos(
            Insbcq1a1211145844GCUSPNRDataFeed1322 insuranceInfos) {
        this.insuranceInfos = insuranceInfos;
    }

    /** 
     * Get the 'ferryInfos' element value. EC Ferry details
     * 
     * @return value
     */
    public ExtendedContentFerryLegDescription145842GCUSPNRDataFeed132 getFerryInfos() {
        return ferryInfos;
    }

    /** 
     * Set the 'ferryInfos' element value. EC Ferry details
     * 
     * @param ferryInfos
     */
    public void setFerryInfos(
            ExtendedContentFerryLegDescription145842GCUSPNRDataFeed132 ferryInfos) {
        this.ferryInfos = ferryInfos;
    }

    /** 
     * Get the 'marker' element value. Marker used to avoid ambiguity.
     * 
     * @return value
     */
    public DummySegment129229SCUSPNRDataFeed132 getMarker() {
        return marker;
    }

    /** 
     * Set the 'marker' element value. Marker used to avoid ambiguity.
     * 
     * @param marker
     */
    public void setMarker(DummySegment129229SCUSPNRDataFeed132 marker) {
        this.marker = marker;
    }

    /** 
     * Get the 'carInfos' element value. EC Car details
     * 
     * @return value
     */
    public CarEasyContentInformation147046GCUSPNRDataFeed1322 getCarInfos() {
        return carInfos;
    }

    /** 
     * Set the 'carInfos' element value. EC Car details
     * 
     * @param carInfos
     */
    public void setCarInfos(
            CarEasyContentInformation147046GCUSPNRDataFeed1322 carInfos) {
        this.carInfos = carInfos;
    }

    /** 
     * Get the 'cruiseInfos' element value. EC Cruise Details
     * 
     * @return value
     */
    public CruiseExtendedContent145859GCUSPNRDataFeed132 getCruiseInfos() {
        return cruiseInfos;
    }

    /** 
     * Set the 'cruiseInfos' element value. EC Cruise Details
     * 
     * @param cruiseInfos
     */
    public void setCruiseInfos(
            CruiseExtendedContent145859GCUSPNRDataFeed132 cruiseInfos) {
        this.cruiseInfos = cruiseInfos;
    }

    /** 
     * Get the 'docsGoodiesMisInfos' element value. This group is used for following EC product types: - Vaccine - Guide - Goodies - Book - Brochure - Visa - Restaurant - Food  - Miscellaneous
     * 
     * @return value
     */
    public ExtendedGoodsAndDocuments145718GCUSPNRDataFeed1322 getDocsGoodiesMisInfos() {
        return docsGoodiesMisInfos;
    }

    /** 
     * Set the 'docsGoodiesMisInfos' element value. This group is used for following EC product types: - Vaccine - Guide - Goodies - Book - Brochure - Visa - Restaurant - Food  - Miscellaneous
     * 
     * @param docsGoodiesMisInfos
     */
    public void setDocsGoodiesMisInfos(
            ExtendedGoodsAndDocuments145718GCUSPNRDataFeed1322 docsGoodiesMisInfos) {
        this.docsGoodiesMisInfos = docsGoodiesMisInfos;
    }
}
