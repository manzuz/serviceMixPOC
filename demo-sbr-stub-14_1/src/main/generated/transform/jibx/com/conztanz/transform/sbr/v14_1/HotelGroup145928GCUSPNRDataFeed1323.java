
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelGroup_145928_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelProperty_129118_S_CUS_PNRDataFeed_132" name="hotelPropertyInfo"/>
 *     &lt;xs:element type="ProductIdentification_95635_S_CUS_PNRDataFeed_132" name="pricingIndicator" minOccurs="0"/>
 *     &lt;xs:element type="NonAirCompanyInformation_36728_S_CUS_PNRDataFeed_132" name="companyIdentification" minOccurs="0"/>
 *     &lt;xs:element type="HotelProductInformation_95637_S_CUS_PNRDataFeed_132" name="amenities" minOccurs="0"/>
 *     &lt;xs:element type="StructuredPeriodInformation_36738_S_CUS_PNRDataFeed_132" name="requestedDates"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_roomRateDetails_145929_G_CUS_PNRDataFeed_1323" name="roomRateDetails" minOccurs="0"/>
 *     &lt;xs:element type="ReservationControlInformation_36736_S_CUS_PNRDataFeed_132" name="cancelOrConfirmNbr" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="UserIdentification_36741_S_CUS_PNRDataFeed_132" name="bookingSource" minOccurs="0"/>
 *     &lt;xs:element type="BillableInformation_36726_S_CUS_PNRDataFeed_132" name="billableInfo" minOccurs="0"/>
 *     &lt;xs:element type="ConsumerReferenceInformation_36729_S_CUS_PNRDataFeed_132" name="customerInfo" minOccurs="0"/>
 *     &lt;xs:element type="FrequentTravellerIdentificationCode_36731_S_CUS_PNRDataFeed_132" name="frequentTravellerInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_guaranteeOrDeposit_145931_G_CUS_PNRDataFeed_1323" name="guaranteeOrDeposit" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_36740_S_CUS_PNRDataFeed_132" name="specialOptions" minOccurs="0" maxOccurs="20"/>
 *     &lt;xs:element type="MiscellaneousRemarks_36733_S_CUS_PNRDataFeed_132" name="textOptions" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="Awards_95009_S_CUS_PNRDataFeed_132" name="hotelRating" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="CommissionInformation_95008_S_CUS_PNRDataFeed_132" name="commissionInfo" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_36734_S_CUS_PNRDataFeed_132" name="savingAmountInfo" minOccurs="0"/>
 *     &lt;xs:element type="ContactInformation_36727_S_CUS_PNRDataFeed_132" name="writtenConfirmationContact" minOccurs="0"/>
 *     &lt;xs:element type="Address_129172_S_CUS_PNRDataFeed_132" name="hotelAddress" minOccurs="0"/>
 *     &lt;xs:element type="NameAndAddress_36735_S_CUS_PNRDataFeed_132" name="writtenConfirmationInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_arrivalFlightDetails_145930_G_CUS_PNRDataFeed_1323" name="arrivalFlightDetails" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_95218_S_CUS_PNRDataFeed_132" name="bookingIndicators" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelGroup145928GCUSPNRDataFeed1323
{
    private HotelProperty129118SCUSPNRDataFeed132 hotelPropertyInfo;
    private ProductIdentification95635SCUSPNRDataFeed132 pricingIndicator;
    private NonAirCompanyInformation36728SCUSPNRDataFeed132 companyIdentification;
    private HotelProductInformation95637SCUSPNRDataFeed132 amenities;
    private StructuredPeriodInformation36738SCUSPNRDataFeed132 requestedDates;
    private StructuredBookingRecordImageTypeOfferGroupRoomRateDetails145929GCUSPNRDataFeed1323 roomRateDetails;
    private List<ReservationControlInformation36736SCUSPNRDataFeed132> cancelOrConfirmNbrList = new ArrayList<ReservationControlInformation36736SCUSPNRDataFeed132>();
    private UserIdentification36741SCUSPNRDataFeed132 bookingSource;
    private BillableInformation36726SCUSPNRDataFeed132 billableInfo;
    private ConsumerReferenceInformation36729SCUSPNRDataFeed132 customerInfo;
    private FrequentTravellerIdentificationCode36731SCUSPNRDataFeed132 frequentTravellerInfo;
    private StructuredBookingRecordImageTypeOfferGroupGuaranteeOrDeposit145931GCUSPNRDataFeed1323 guaranteeOrDeposit;
    private List<FreeTextInformation36740SCUSPNRDataFeed132> specialOptionList = new ArrayList<FreeTextInformation36740SCUSPNRDataFeed132>();
    private List<MiscellaneousRemarks36733SCUSPNRDataFeed132> textOptionList = new ArrayList<MiscellaneousRemarks36733SCUSPNRDataFeed132>();
    private List<Awards95009SCUSPNRDataFeed132> hotelRatingList = new ArrayList<Awards95009SCUSPNRDataFeed132>();
    private CommissionInformation95008SCUSPNRDataFeed132 commissionInfo;
    private MonetaryInformation36734SCUSPNRDataFeed132 savingAmountInfo;
    private ContactInformation36727SCUSPNRDataFeed132 writtenConfirmationContact;
    private Address129172SCUSPNRDataFeed132 hotelAddress;
    private NameAndAddress36735SCUSPNRDataFeed132 writtenConfirmationInfo;
    private StructuredBookingRecordImageTypeOfferGroupArrivalFlightDetails145930GCUSPNRDataFeed1323 arrivalFlightDetails;
    private StatusDetails95218SCUSPNRDataFeed132 bookingIndicators;

    /** 
     * Get the 'hotelPropertyInfo' element value. This segment is used to convey the hotel property information.
     * 
     * @return value
     */
    public HotelProperty129118SCUSPNRDataFeed132 getHotelPropertyInfo() {
        return hotelPropertyInfo;
    }

    /** 
     * Set the 'hotelPropertyInfo' element value. This segment is used to convey the hotel property information.
     * 
     * @param hotelPropertyInfo
     */
    public void setHotelPropertyInfo(
            HotelProperty129118SCUSPNRDataFeed132 hotelPropertyInfo) {
        this.hotelPropertyInfo = hotelPropertyInfo;
    }

    /** 
     * Get the 'pricingIndicator' element value. This segment conveys pricing information : - Policy indicator Possible values : D Deposit policy indicator G Guarantee policy indicator H Hold time policy indicator  - Breakfast indicator Possible values : B Breakfast included E Breakfast excluded U Breakfast inclusion unknown
     * 
     * @return value
     */
    public ProductIdentification95635SCUSPNRDataFeed132 getPricingIndicator() {
        return pricingIndicator;
    }

    /** 
     * Set the 'pricingIndicator' element value. This segment conveys pricing information : - Policy indicator Possible values : D Deposit policy indicator G Guarantee policy indicator H Hold time policy indicator  - Breakfast indicator Possible values : B Breakfast included E Breakfast excluded U Breakfast inclusion unknown
     * 
     * @param pricingIndicator
     */
    public void setPricingIndicator(
            ProductIdentification95635SCUSPNRDataFeed132 pricingIndicator) {
        this.pricingIndicator = pricingIndicator;
    }

    /** 
     * Get the 'companyIdentification' element value. This segment is used to convey the hotel chain code and name.
     * 
     * @return value
     */
    public NonAirCompanyInformation36728SCUSPNRDataFeed132 getCompanyIdentification() {
        return companyIdentification;
    }

    /** 
     * Set the 'companyIdentification' element value. This segment is used to convey the hotel chain code and name.
     * 
     * @param companyIdentification
     */
    public void setCompanyIdentification(
            NonAirCompanyInformation36728SCUSPNRDataFeed132 companyIdentification) {
        this.companyIdentification = companyIdentification;
    }

    /** 
     * Get the 'amenities' element value. This segment conveys a list of main amenities available at the hotel
     * 
     * @return value
     */
    public HotelProductInformation95637SCUSPNRDataFeed132 getAmenities() {
        return amenities;
    }

    /** 
     * Set the 'amenities' element value. This segment conveys a list of main amenities available at the hotel
     * 
     * @param amenities
     */
    public void setAmenities(
            HotelProductInformation95637SCUSPNRDataFeed132 amenities) {
        this.amenities = amenities;
    }

    /** 
     * Get the 'requestedDates' element value. This segment is used to convey the dates.
     * 
     * @return value
     */
    public StructuredPeriodInformation36738SCUSPNRDataFeed132 getRequestedDates() {
        return requestedDates;
    }

    /** 
     * Set the 'requestedDates' element value. This segment is used to convey the dates.
     * 
     * @param requestedDates
     */
    public void setRequestedDates(
            StructuredPeriodInformation36738SCUSPNRDataFeed132 requestedDates) {
        this.requestedDates = requestedDates;
    }

    /** 
     * Get the 'roomRateDetails' element value. This group is used to convey the room /rate details.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupRoomRateDetails145929GCUSPNRDataFeed1323 getRoomRateDetails() {
        return roomRateDetails;
    }

    /** 
     * Set the 'roomRateDetails' element value. This group is used to convey the room /rate details.
     * 
     * @param roomRateDetails
     */
    public void setRoomRateDetails(
            StructuredBookingRecordImageTypeOfferGroupRoomRateDetails145929GCUSPNRDataFeed1323 roomRateDetails) {
        this.roomRateDetails = roomRateDetails;
    }

    /** 
     * Get the list of 'cancelOrConfirmNbr' element items. This segment is used to convey the confirmation number or the cancellation number. control type (9958) is: - 2 for Confirmation reference - X for cancellation reference
     * 
     * @return list
     */
    public List<ReservationControlInformation36736SCUSPNRDataFeed132> getCancelOrConfirmNbrList() {
        return cancelOrConfirmNbrList;
    }

    /** 
     * Set the list of 'cancelOrConfirmNbr' element items. This segment is used to convey the confirmation number or the cancellation number. control type (9958) is: - 2 for Confirmation reference - X for cancellation reference
     * 
     * @param list
     */
    public void setCancelOrConfirmNbrList(
            List<ReservationControlInformation36736SCUSPNRDataFeed132> list) {
        cancelOrConfirmNbrList = list;
    }

    /** 
     * Get the 'bookingSource' element value. This segment is used to convey the booking source.
     * 
     * @return value
     */
    public UserIdentification36741SCUSPNRDataFeed132 getBookingSource() {
        return bookingSource;
    }

    /** 
     * Set the 'bookingSource' element value. This segment is used to convey the booking source.
     * 
     * @param bookingSource
     */
    public void setBookingSource(
            UserIdentification36741SCUSPNRDataFeed132 bookingSource) {
        this.bookingSource = bookingSource;
    }

    /** 
     * Get the 'billableInfo' element value. This segment is used to convey the billable information
     * 
     * @return value
     */
    public BillableInformation36726SCUSPNRDataFeed132 getBillableInfo() {
        return billableInfo;
    }

    /** 
     * Set the 'billableInfo' element value. This segment is used to convey the billable information
     * 
     * @param billableInfo
     */
    public void setBillableInfo(
            BillableInformation36726SCUSPNRDataFeed132 billableInfo) {
        this.billableInfo = billableInfo;
    }

    /** 
     * Get the 'customerInfo' element value. This segment is used to convey the customer reference number
     * 
     * @return value
     */
    public ConsumerReferenceInformation36729SCUSPNRDataFeed132 getCustomerInfo() {
        return customerInfo;
    }

    /** 
     * Set the 'customerInfo' element value. This segment is used to convey the customer reference number
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(
            ConsumerReferenceInformation36729SCUSPNRDataFeed132 customerInfo) {
        this.customerInfo = customerInfo;
    }

    /** 
     * Get the 'frequentTravellerInfo' element value. This segment is used to convey the frequent traveler number.
     * 
     * @return value
     */
    public FrequentTravellerIdentificationCode36731SCUSPNRDataFeed132 getFrequentTravellerInfo() {
        return frequentTravellerInfo;
    }

    /** 
     * Set the 'frequentTravellerInfo' element value. This segment is used to convey the frequent traveler number.
     * 
     * @param frequentTravellerInfo
     */
    public void setFrequentTravellerInfo(
            FrequentTravellerIdentificationCode36731SCUSPNRDataFeed132 frequentTravellerInfo) {
        this.frequentTravellerInfo = frequentTravellerInfo;
    }

    /** 
     * Get the 'guaranteeOrDeposit' element value. This group is used for the guarantee or the deposit
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupGuaranteeOrDeposit145931GCUSPNRDataFeed1323 getGuaranteeOrDeposit() {
        return guaranteeOrDeposit;
    }

    /** 
     * Set the 'guaranteeOrDeposit' element value. This group is used for the guarantee or the deposit
     * 
     * @param guaranteeOrDeposit
     */
    public void setGuaranteeOrDeposit(
            StructuredBookingRecordImageTypeOfferGroupGuaranteeOrDeposit145931GCUSPNRDataFeed1323 guaranteeOrDeposit) {
        this.guaranteeOrDeposit = guaranteeOrDeposit;
    }

    /** 
     * Get the list of 'specialOptions' element items. This segment conveys RTSVCH and some special options.
     * 
     * @return list
     */
    public List<FreeTextInformation36740SCUSPNRDataFeed132> getSpecialOptionList() {
        return specialOptionList;
    }

    /** 
     * Set the list of 'specialOptions' element items. This segment conveys RTSVCH and some special options.
     * 
     * @param list
     */
    public void setSpecialOptionList(
            List<FreeTextInformation36740SCUSPNRDataFeed132> list) {
        specialOptionList = list;
    }

    /** 
     * Get the list of 'textOptions' element items. This segment is used to convey additional information which are entered by the agent and stored on the hotel booking.
     * 
     * @return list
     */
    public List<MiscellaneousRemarks36733SCUSPNRDataFeed132> getTextOptionList() {
        return textOptionList;
    }

    /** 
     * Set the list of 'textOptions' element items. This segment is used to convey additional information which are entered by the agent and stored on the hotel booking.
     * 
     * @param list
     */
    public void setTextOptionList(
            List<MiscellaneousRemarks36733SCUSPNRDataFeed132> list) {
        textOptionList = list;
    }

    /** 
     * Get the list of 'hotelRating' element items. This segment conveys the rating of the hotel.
     * 
     * @return list
     */
    public List<Awards95009SCUSPNRDataFeed132> getHotelRatingList() {
        return hotelRatingList;
    }

    /** 
     * Set the list of 'hotelRating' element items. This segment conveys the rating of the hotel.
     * 
     * @param list
     */
    public void setHotelRatingList(List<Awards95009SCUSPNRDataFeed132> list) {
        hotelRatingList = list;
    }

    /** 
     * Get the 'commissionInfo' element value. This segment is used to convey the commission information
     * 
     * @return value
     */
    public CommissionInformation95008SCUSPNRDataFeed132 getCommissionInfo() {
        return commissionInfo;
    }

    /** 
     * Set the 'commissionInfo' element value. This segment is used to convey the commission information
     * 
     * @param commissionInfo
     */
    public void setCommissionInfo(
            CommissionInformation95008SCUSPNRDataFeed132 commissionInfo) {
        this.commissionInfo = commissionInfo;
    }

    /** 
     * Get the 'savingAmountInfo' element value. This segment is used to convey the saving amount/percentage information.
     * 
     * @return value
     */
    public MonetaryInformation36734SCUSPNRDataFeed132 getSavingAmountInfo() {
        return savingAmountInfo;
    }

    /** 
     * Set the 'savingAmountInfo' element value. This segment is used to convey the saving amount/percentage information.
     * 
     * @param savingAmountInfo
     */
    public void setSavingAmountInfo(
            MonetaryInformation36734SCUSPNRDataFeed132 savingAmountInfo) {
        this.savingAmountInfo = savingAmountInfo;
    }

    /** 
     * Get the 'writtenConfirmationContact' element value. This segment is used to convey the fax or the E-Mail to receive the written confirmation
     * 
     * @return value
     */
    public ContactInformation36727SCUSPNRDataFeed132 getWrittenConfirmationContact() {
        return writtenConfirmationContact;
    }

    /** 
     * Set the 'writtenConfirmationContact' element value. This segment is used to convey the fax or the E-Mail to receive the written confirmation
     * 
     * @param writtenConfirmationContact
     */
    public void setWrittenConfirmationContact(
            ContactInformation36727SCUSPNRDataFeed132 writtenConfirmationContact) {
        this.writtenConfirmationContact = writtenConfirmationContact;
    }

    /** 
     * Get the 'hotelAddress' element value. This segment conveys the hotel address
     * 
     * @return value
     */
    public Address129172SCUSPNRDataFeed132 getHotelAddress() {
        return hotelAddress;
    }

    /** 
     * Set the 'hotelAddress' element value. This segment conveys the hotel address
     * 
     * @param hotelAddress
     */
    public void setHotelAddress(Address129172SCUSPNRDataFeed132 hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    /** 
     * Get the 'writtenConfirmationInfo' element value. This segment is used to convey the name and address of the party to receive the written confirmation
     * 
     * @return value
     */
    public NameAndAddress36735SCUSPNRDataFeed132 getWrittenConfirmationInfo() {
        return writtenConfirmationInfo;
    }

    /** 
     * Set the 'writtenConfirmationInfo' element value. This segment is used to convey the name and address of the party to receive the written confirmation
     * 
     * @param writtenConfirmationInfo
     */
    public void setWrittenConfirmationInfo(
            NameAndAddress36735SCUSPNRDataFeed132 writtenConfirmationInfo) {
        this.writtenConfirmationInfo = writtenConfirmationInfo;
    }

    /** 
     * Get the 'arrivalFlightDetails' element value. This group is used to convey the Arrival Flight Details
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupArrivalFlightDetails145930GCUSPNRDataFeed1323 getArrivalFlightDetails() {
        return arrivalFlightDetails;
    }

    /** 
     * Set the 'arrivalFlightDetails' element value. This group is used to convey the Arrival Flight Details
     * 
     * @param arrivalFlightDetails
     */
    public void setArrivalFlightDetails(
            StructuredBookingRecordImageTypeOfferGroupArrivalFlightDetails145930GCUSPNRDataFeed1323 arrivalFlightDetails) {
        this.arrivalFlightDetails = arrivalFlightDetails;
    }

    /** 
     * Get the 'bookingIndicators' element value. This segment conveys diverse booking indicators.
     * 
     * @return value
     */
    public StatusDetails95218SCUSPNRDataFeed132 getBookingIndicators() {
        return bookingIndicators;
    }

    /** 
     * Set the 'bookingIndicators' element value. This segment conveys diverse booking indicators.
     * 
     * @param bookingIndicators
     */
    public void setBookingIndicators(
            StatusDetails95218SCUSPNRDataFeed132 bookingIndicators) {
        this.bookingIndicators = bookingIndicators;
    }
}
