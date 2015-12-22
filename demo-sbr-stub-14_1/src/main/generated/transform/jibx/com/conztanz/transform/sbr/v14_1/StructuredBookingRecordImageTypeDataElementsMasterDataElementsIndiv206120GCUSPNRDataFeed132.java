
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_dataElementsIndiv_206120_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_129491_S_CUS_PNRDataFeed_132" name="elementManagementData"/>
 *     &lt;xs:element type="ReferenceInformation_24862_S_CUS_PNRDataFeed_132" name="referenceForDataElement" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_1689_S_CUS_PNRDataFeed_132" name="itineraryMonetaryInformation" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="IndividualPnrSecurityInformation_2053_S_CUS_PNRDataFeed_132" name="pnrSecurity" minOccurs="0"/>
 *     &lt;xs:element type="AccountingInformationElement_1653_S_CUS_PNRDataFeed_132" name="accounting" minOccurs="0"/>
 *     &lt;xs:element type="MiscellaneousRemarks_6011_S_CUS_PNRDataFeed_132" name="miscellaneousRemarks" minOccurs="0"/>
 *     &lt;xs:element type="SpecialRequirementsDetails_26749_S_CUS_PNRDataFeed_132" name="serviceRequest" minOccurs="0"/>
 *     &lt;xs:element type="FrequentTravellerInformation_25509_S_CUS_PNRDataFeed_132" name="frequentTravellerInfo" minOccurs="0"/>
 *     &lt;xs:element type="FrequentTravellerVerification_25415_S_CUS_PNRDataFeed_132" name="frequentTravellerVerif" minOccurs="0"/>
 *     &lt;xs:element type="TicketElement_6016_S_CUS_PNRDataFeed_132" name="ticketElement" minOccurs="0"/>
 *     &lt;xs:element type="DateAndTimeInformation_29597_S_CUS_PNRDataFeed_132" name="splitDate" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_referencedRecord_206121_G_CUS_PNRDataFeed_132" name="referencedRecord" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="OptionElement_54064_S_CUS_PNRDataFeed_132" name="queueOption" minOccurs="0"/>
 *     &lt;xs:element type="LongFreeText_24804_S_CUS_PNRDataFeed_132" name="otherDataFreetext" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredAddress_6015_S_CUS_PNRDataFeed_132" name="structuredAddress" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_182613_S_CUS_PNRDataFeed_132" name="ssrIndicator" minOccurs="0"/>
 *     &lt;xs:element type="ReservationSecurityInformation_104624_S_CUS_PNRDataFeed_132" name="ssrCreationInfo" minOccurs="0"/>
 *     &lt;xs:element type="PricingOrTicketingSubsequent_169135_S_CUS_PNRDataFeed_132" name="reasonForIssuanceCode" minOccurs="0"/>
 *     &lt;xs:element type="OriginatorOfRequestDetails_169138_S_CUS_PNRDataFeed_132" name="bookingChannel" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterDataElementsIndiv206120GCUSPNRDataFeed132
{
    private ElementManagementSegment129491SCUSPNRDataFeed132 elementManagementData;
    private ReferenceInformation24862SCUSPNRDataFeed132 referenceForDataElement;
    private List<MonetaryInformation1689SCUSPNRDataFeed132> itineraryMonetaryInformationList = new ArrayList<MonetaryInformation1689SCUSPNRDataFeed132>();
    private IndividualPnrSecurityInformation2053SCUSPNRDataFeed132 pnrSecurity;
    private AccountingInformationElement1653SCUSPNRDataFeed132 accounting;
    private MiscellaneousRemarks6011SCUSPNRDataFeed132 miscellaneousRemarks;
    private SpecialRequirementsDetails26749SCUSPNRDataFeed132 serviceRequest;
    private FrequentTravellerInformation25509SCUSPNRDataFeed132 frequentTravellerInfo;
    private FrequentTravellerVerification25415SCUSPNRDataFeed132 frequentTravellerVerif;
    private TicketElement6016SCUSPNRDataFeed132 ticketElement;
    private DateAndTimeInformation29597SCUSPNRDataFeed132 splitDate;
    private List<StructuredBookingRecordImageTypeDataElementsMasterReferencedRecord206121GCUSPNRDataFeed132> referencedRecordList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterReferencedRecord206121GCUSPNRDataFeed132>();
    private OptionElement54064SCUSPNRDataFeed132 queueOption;
    private List<LongFreeText24804SCUSPNRDataFeed132> otherDataFreetextList = new ArrayList<LongFreeText24804SCUSPNRDataFeed132>();
    private StructuredAddress6015SCUSPNRDataFeed132 structuredAddress;
    private StatusDetails182613SCUSPNRDataFeed132 ssrIndicator;
    private ReservationSecurityInformation104624SCUSPNRDataFeed132 ssrCreationInfo;
    private PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 reasonForIssuanceCode;
    private OriginatorOfRequestDetails169138SCUSPNRDataFeed132 bookingChannel;

    /** 
     * Get the 'elementManagementData' element value. Specify segments/elements references
     * 
     * @return value
     */
    public ElementManagementSegment129491SCUSPNRDataFeed132 getElementManagementData() {
        return elementManagementData;
    }

    /** 
     * Set the 'elementManagementData' element value. Specify segments/elements references
     * 
     * @param elementManagementData
     */
    public void setElementManagementData(
            ElementManagementSegment129491SCUSPNRDataFeed132 elementManagementData) {
        this.elementManagementData = elementManagementData;
    }

    /** 
     * Get the 'referenceForDataElement' element value. provide specific reference identification
     * 
     * @return value
     */
    public ReferenceInformation24862SCUSPNRDataFeed132 getReferenceForDataElement() {
        return referenceForDataElement;
    }

    /** 
     * Set the 'referenceForDataElement' element value. provide specific reference identification
     * 
     * @param referenceForDataElement
     */
    public void setReferenceForDataElement(
            ReferenceInformation24862SCUSPNRDataFeed132 referenceForDataElement) {
        this.referenceForDataElement = referenceForDataElement;
    }

    /** 
     * Get the list of 'itineraryMonetaryInformation' element items. Monetary information on the element
     * 
     * @return list
     */
    public List<MonetaryInformation1689SCUSPNRDataFeed132> getItineraryMonetaryInformationList() {
        return itineraryMonetaryInformationList;
    }

    /** 
     * Set the list of 'itineraryMonetaryInformation' element items. Monetary information on the element
     * 
     * @param list
     */
    public void setItineraryMonetaryInformationList(
            List<MonetaryInformation1689SCUSPNRDataFeed132> list) {
        itineraryMonetaryInformationList = list;
    }

    /** 
     * Get the 'pnrSecurity' element value. Amadeus PNR individual security element
     * 
     * @return value
     */
    public IndividualPnrSecurityInformation2053SCUSPNRDataFeed132 getPnrSecurity() {
        return pnrSecurity;
    }

    /** 
     * Set the 'pnrSecurity' element value. Amadeus PNR individual security element
     * 
     * @param pnrSecurity
     */
    public void setPnrSecurity(
            IndividualPnrSecurityInformation2053SCUSPNRDataFeed132 pnrSecurity) {
        this.pnrSecurity = pnrSecurity;
    }

    /** 
     * Get the 'accounting' element value. Amadeus accounting information
     * 
     * @return value
     */
    public AccountingInformationElement1653SCUSPNRDataFeed132 getAccounting() {
        return accounting;
    }

    /** 
     * Set the 'accounting' element value. Amadeus accounting information
     * 
     * @param accounting
     */
    public void setAccounting(
            AccountingInformationElement1653SCUSPNRDataFeed132 accounting) {
        this.accounting = accounting;
    }

    /** 
     * Get the 'miscellaneousRemarks' element value. Miscellaneous , confidential , quality control, invoice and corporate remarks
     * 
     * @return value
     */
    public MiscellaneousRemarks6011SCUSPNRDataFeed132 getMiscellaneousRemarks() {
        return miscellaneousRemarks;
    }

    /** 
     * Set the 'miscellaneousRemarks' element value. Miscellaneous , confidential , quality control, invoice and corporate remarks
     * 
     * @param miscellaneousRemarks
     */
    public void setMiscellaneousRemarks(
            MiscellaneousRemarks6011SCUSPNRDataFeed132 miscellaneousRemarks) {
        this.miscellaneousRemarks = miscellaneousRemarks;
    }

    /** 
     * Get the 'serviceRequest' element value. Special services request. Information relating to a traveler.
     * 
     * @return value
     */
    public SpecialRequirementsDetails26749SCUSPNRDataFeed132 getServiceRequest() {
        return serviceRequest;
    }

    /** 
     * Set the 'serviceRequest' element value. Special services request. Information relating to a traveler.
     * 
     * @param serviceRequest
     */
    public void setServiceRequest(
            SpecialRequirementsDetails26749SCUSPNRDataFeed132 serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    /** 
     * Get the 'frequentTravellerInfo' element value. specify frequent traveller information
     * 
     * @return value
     */
    public FrequentTravellerInformation25509SCUSPNRDataFeed132 getFrequentTravellerInfo() {
        return frequentTravellerInfo;
    }

    /** 
     * Set the 'frequentTravellerInfo' element value. specify frequent traveller information
     * 
     * @param frequentTravellerInfo
     */
    public void setFrequentTravellerInfo(
            FrequentTravellerInformation25509SCUSPNRDataFeed132 frequentTravellerInfo) {
        this.frequentTravellerInfo = frequentTravellerInfo;
    }

    /** 
     * Get the 'frequentTravellerVerif' element value. Convey extra information on frequent flyer (FTI) such as redemption/upgrade data
     * 
     * @return value
     */
    public FrequentTravellerVerification25415SCUSPNRDataFeed132 getFrequentTravellerVerif() {
        return frequentTravellerVerif;
    }

    /** 
     * Set the 'frequentTravellerVerif' element value. Convey extra information on frequent flyer (FTI) such as redemption/upgrade data
     * 
     * @param frequentTravellerVerif
     */
    public void setFrequentTravellerVerif(
            FrequentTravellerVerification25415SCUSPNRDataFeed132 frequentTravellerVerif) {
        this.frequentTravellerVerif = frequentTravellerVerif;
    }

    /** 
     * Get the 'ticketElement' element value. Amadeus PNR ticket element
     * 
     * @return value
     */
    public TicketElement6016SCUSPNRDataFeed132 getTicketElement() {
        return ticketElement;
    }

    /** 
     * Set the 'ticketElement' element value. Amadeus PNR ticket element
     * 
     * @param ticketElement
     */
    public void setTicketElement(
            TicketElement6016SCUSPNRDataFeed132 ticketElement) {
        this.ticketElement = ticketElement;
    }

    /** 
     * Get the 'splitDate' element value. Split date
     * 
     * @return value
     */
    public DateAndTimeInformation29597SCUSPNRDataFeed132 getSplitDate() {
        return splitDate;
    }

    /** 
     * Set the 'splitDate' element value. Split date
     * 
     * @param splitDate
     */
    public void setSplitDate(
            DateAndTimeInformation29597SCUSPNRDataFeed132 splitDate) {
        this.splitDate = splitDate;
    }

    /** 
     * Get the list of 'referencedRecord' element items. Reference records
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterReferencedRecord206121GCUSPNRDataFeed132> getReferencedRecordList() {
        return referencedRecordList;
    }

    /** 
     * Set the list of 'referencedRecord' element items. Reference records
     * 
     * @param list
     */
    public void setReferencedRecordList(
            List<StructuredBookingRecordImageTypeDataElementsMasterReferencedRecord206121GCUSPNRDataFeed132> list) {
        referencedRecordList = list;
    }

    /** 
     * Get the 'queueOption' element value. Amadeus PNR Option element
     * 
     * @return value
     */
    public OptionElement54064SCUSPNRDataFeed132 getQueueOption() {
        return queueOption;
    }

    /** 
     * Set the 'queueOption' element value. Amadeus PNR Option element
     * 
     * @param queueOption
     */
    public void setQueueOption(OptionElement54064SCUSPNRDataFeed132 queueOption) {
        this.queueOption = queueOption;
    }

    /** 
     * Get the list of 'otherDataFreetext' element items. Free form or coded long free text information
     * 
     * @return list
     */
    public List<LongFreeText24804SCUSPNRDataFeed132> getOtherDataFreetextList() {
        return otherDataFreetextList;
    }

    /** 
     * Set the list of 'otherDataFreetext' element items. Free form or coded long free text information
     * 
     * @param list
     */
    public void setOtherDataFreetextList(
            List<LongFreeText24804SCUSPNRDataFeed132> list) {
        otherDataFreetextList = list;
    }

    /** 
     * Get the 'structuredAddress' element value. Mapping method for structured addresses
     * 
     * @return value
     */
    public StructuredAddress6015SCUSPNRDataFeed132 getStructuredAddress() {
        return structuredAddress;
    }

    /** 
     * Set the 'structuredAddress' element value. Mapping method for structured addresses
     * 
     * @param structuredAddress
     */
    public void setStructuredAddress(
            StructuredAddress6015SCUSPNRDataFeed132 structuredAddress) {
        this.structuredAddress = structuredAddress;
    }

    /** 
     * Get the 'ssrIndicator' element value. To convey SSR indicators (Chargeable indicator, Pricing mode ...)
     * 
     * @return value
     */
    public StatusDetails182613SCUSPNRDataFeed132 getSsrIndicator() {
        return ssrIndicator;
    }

    /** 
     * Set the 'ssrIndicator' element value. To convey SSR indicators (Chargeable indicator, Pricing mode ...)
     * 
     * @param ssrIndicator
     */
    public void setSsrIndicator(
            StatusDetails182613SCUSPNRDataFeed132 ssrIndicator) {
        this.ssrIndicator = ssrIndicator;
    }

    /** 
     * Get the 'ssrCreationInfo' element value.
     * 
     * @return value
     */
    public ReservationSecurityInformation104624SCUSPNRDataFeed132 getSsrCreationInfo() {
        return ssrCreationInfo;
    }

    /** 
     * Set the 'ssrCreationInfo' element value.
     * 
     * @param ssrCreationInfo
     */
    public void setSsrCreationInfo(
            ReservationSecurityInformation104624SCUSPNRDataFeed132 ssrCreationInfo) {
        this.ssrCreationInfo = ssrCreationInfo;
    }

    /** 
     * Get the 'reasonForIssuanceCode' element value. to convey the RFIC/RFISC at SSR level
     * 
     * @return value
     */
    public PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 getReasonForIssuanceCode() {
        return reasonForIssuanceCode;
    }

    /** 
     * Set the 'reasonForIssuanceCode' element value. to convey the RFIC/RFISC at SSR level
     * 
     * @param reasonForIssuanceCode
     */
    public void setReasonForIssuanceCode(
            PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 reasonForIssuanceCode) {
        this.reasonForIssuanceCode = reasonForIssuanceCode;
    }

    /** 
     * Get the 'bookingChannel' element value. To convey information about the channel performing the booking
     * 
     * @return value
     */
    public OriginatorOfRequestDetails169138SCUSPNRDataFeed132 getBookingChannel() {
        return bookingChannel;
    }

    /** 
     * Set the 'bookingChannel' element value. To convey information about the channel performing the booking
     * 
     * @param bookingChannel
     */
    public void setBookingChannel(
            OriginatorOfRequestDetails169138SCUSPNRDataFeed132 bookingChannel) {
        this.bookingChannel = bookingChannel;
    }
}
