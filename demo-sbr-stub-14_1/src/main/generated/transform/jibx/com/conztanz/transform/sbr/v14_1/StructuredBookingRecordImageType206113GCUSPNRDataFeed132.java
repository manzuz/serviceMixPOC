
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Maps the structure of a SBR
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_206113_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_28044_S_CUS_PNRDataFeed_132" name="amadeusId"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_pnrHeader_206114_G_CUS_PNRDataFeed_132" name="pnrHeader"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_axrInformation_206115_G_CUS_PNRDataFeed_132" name="axrInformation" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_travellerInfo_206131_G_CUS_PNRDataFeed_132" name="travellerInfo" minOccurs="0" maxOccurs="200"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_206116_G_CUS_PNRDataFeed_132" name="originDestinationDetails" minOccurs="0"/>
 *     &lt;xs:element type="SegmentGroupingInformation_24853_S_CUS_PNRDataFeed_132" name="segmentGroupingInfo" minOccurs="0" maxOccurs="199"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_206117_G_CUS_PNRDataFeed_132" name="dataElementsMaster" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_pricingRecordGroup_206129_G_CUS_PNRDataFeed_132" name="pricingRecordGroup" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_206122_G_CUS_PNRDataFeed_132" name="offerGroup" minOccurs="0" maxOccurs="50"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_groupProposal_207371_G_CUS_PNRDataFeed_132" name="groupProposal" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_informativePricing_206130_G_CUS_PNRDataFeed_132" name="informativePricing" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageType206113GCUSPNRDataFeed132
{
    private ReservationControlInformation28044SCUSPNRDataFeed132 amadeusId;
    private StructuredBookingRecordImageTypePnrHeader206114GCUSPNRDataFeed132 pnrHeader;
    private List<StructuredBookingRecordImageTypeAxrInformation206115GCUSPNRDataFeed132> axrInformationList = new ArrayList<StructuredBookingRecordImageTypeAxrInformation206115GCUSPNRDataFeed132>();
    private List<StructuredBookingRecordImageTypeTravellerInfo206131GCUSPNRDataFeed132> travellerInfoList = new ArrayList<StructuredBookingRecordImageTypeTravellerInfo206131GCUSPNRDataFeed132>();
    private StructuredBookingRecordImageTypeOriginDestinationDetails206116GCUSPNRDataFeed132 originDestinationDetails;
    private List<SegmentGroupingInformation24853SCUSPNRDataFeed132> segmentGroupingInfoList = new ArrayList<SegmentGroupingInformation24853SCUSPNRDataFeed132>();
    private StructuredBookingRecordImageTypeDataElementsMaster206117GCUSPNRDataFeed132 dataElementsMaster;
    private StructuredBookingRecordImageTypePricingRecordGroup206129GCUSPNRDataFeed132 pricingRecordGroup;
    private List<StructuredBookingRecordImageTypeOfferGroup206122GCUSPNRDataFeed132> offerGroupList = new ArrayList<StructuredBookingRecordImageTypeOfferGroup206122GCUSPNRDataFeed132>();
    private StructuredBookingRecordImageTypeGroupProposal207371GCUSPNRDataFeed132 groupProposal;
    private StructuredBookingRecordImageTypeInformativePricing206130GCUSPNRDataFeed132 informativePricing;

    /** 
     * Get the 'amadeusId' element value. Holds the Amadeus PNR record locator.
     * 
     * @return value
     */
    public ReservationControlInformation28044SCUSPNRDataFeed132 getAmadeusId() {
        return amadeusId;
    }

    /** 
     * Set the 'amadeusId' element value. Holds the Amadeus PNR record locator.
     * 
     * @param amadeusId
     */
    public void setAmadeusId(
            ReservationControlInformation28044SCUSPNRDataFeed132 amadeusId) {
        this.amadeusId = amadeusId;
    }

    /** 
     * Get the 'pnrHeader' element value. PNR header
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypePnrHeader206114GCUSPNRDataFeed132 getPnrHeader() {
        return pnrHeader;
    }

    /** 
     * Set the 'pnrHeader' element value. PNR header
     * 
     * @param pnrHeader
     */
    public void setPnrHeader(
            StructuredBookingRecordImageTypePnrHeader206114GCUSPNRDataFeed132 pnrHeader) {
        this.pnrHeader = pnrHeader;
    }

    /** 
     * Get the list of 'axrInformation' element items. Associated PNR information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeAxrInformation206115GCUSPNRDataFeed132> getAxrInformationList() {
        return axrInformationList;
    }

    /** 
     * Set the list of 'axrInformation' element items. Associated PNR information
     * 
     * @param list
     */
    public void setAxrInformationList(
            List<StructuredBookingRecordImageTypeAxrInformation206115GCUSPNRDataFeed132> list) {
        axrInformationList = list;
    }

    /** 
     * Get the list of 'travellerInfo' element items. Name elements
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeTravellerInfo206131GCUSPNRDataFeed132> getTravellerInfoList() {
        return travellerInfoList;
    }

    /** 
     * Set the list of 'travellerInfo' element items. Name elements
     * 
     * @param list
     */
    public void setTravellerInfoList(
            List<StructuredBookingRecordImageTypeTravellerInfo206131GCUSPNRDataFeed132> list) {
        travellerInfoList = list;
    }

    /** 
     * Get the 'originDestinationDetails' element value. Details about the itineraries
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetails206116GCUSPNRDataFeed132 getOriginDestinationDetails() {
        return originDestinationDetails;
    }

    /** 
     * Set the 'originDestinationDetails' element value. Details about the itineraries
     * 
     * @param originDestinationDetails
     */
    public void setOriginDestinationDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetails206116GCUSPNRDataFeed132 originDestinationDetails) {
        this.originDestinationDetails = originDestinationDetails;
    }

    /** 
     * Get the list of 'segmentGroupingInfo' element items. Segment marriages and connections
     * 
     * @return list
     */
    public List<SegmentGroupingInformation24853SCUSPNRDataFeed132> getSegmentGroupingInfoList() {
        return segmentGroupingInfoList;
    }

    /** 
     * Set the list of 'segmentGroupingInfo' element items. Segment marriages and connections
     * 
     * @param list
     */
    public void setSegmentGroupingInfoList(
            List<SegmentGroupingInformation24853SCUSPNRDataFeed132> list) {
        segmentGroupingInfoList = list;
    }

    /** 
     * Get the 'dataElementsMaster' element value. Data elements
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeDataElementsMaster206117GCUSPNRDataFeed132 getDataElementsMaster() {
        return dataElementsMaster;
    }

    /** 
     * Set the 'dataElementsMaster' element value. Data elements
     * 
     * @param dataElementsMaster
     */
    public void setDataElementsMaster(
            StructuredBookingRecordImageTypeDataElementsMaster206117GCUSPNRDataFeed132 dataElementsMaster) {
        this.dataElementsMaster = dataElementsMaster;
    }

    /** 
     * Get the 'pricingRecordGroup' element value. To convey TSTs and TSMs information
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypePricingRecordGroup206129GCUSPNRDataFeed132 getPricingRecordGroup() {
        return pricingRecordGroup;
    }

    /** 
     * Set the 'pricingRecordGroup' element value. To convey TSTs and TSMs information
     * 
     * @param pricingRecordGroup
     */
    public void setPricingRecordGroup(
            StructuredBookingRecordImageTypePricingRecordGroup206129GCUSPNRDataFeed132 pricingRecordGroup) {
        this.pricingRecordGroup = pricingRecordGroup;
    }

    /** 
     * Get the list of 'offerGroup' element items. contains Offer data
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroup206122GCUSPNRDataFeed132> getOfferGroupList() {
        return offerGroupList;
    }

    /** 
     * Set the list of 'offerGroup' element items. contains Offer data
     * 
     * @param list
     */
    public void setOfferGroupList(
            List<StructuredBookingRecordImageTypeOfferGroup206122GCUSPNRDataFeed132> list) {
        offerGroupList = list;
    }

    /** 
     * Get the 'groupProposal' element value.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeGroupProposal207371GCUSPNRDataFeed132 getGroupProposal() {
        return groupProposal;
    }

    /** 
     * Set the 'groupProposal' element value.
     * 
     * @param groupProposal
     */
    public void setGroupProposal(
            StructuredBookingRecordImageTypeGroupProposal207371GCUSPNRDataFeed132 groupProposal) {
        this.groupProposal = groupProposal;
    }

    /** 
     * Get the 'informativePricing' element value. This group is used to convey the Informative Pricing (when there is no TST in the PNR) to the Yield Watcher application. This Info Pricing is stored in a dedicated BFE.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeInformativePricing206130GCUSPNRDataFeed132 getInformativePricing() {
        return informativePricing;
    }

    /** 
     * Set the 'informativePricing' element value. This group is used to convey the Informative Pricing (when there is no TST in the PNR) to the Yield Watcher application. This Info Pricing is stored in a dedicated BFE.
     * 
     * @param informativePricing
     */
    public void setInformativePricing(
            StructuredBookingRecordImageTypeInformativePricing206130GCUSPNRDataFeed132 informativePricing) {
        this.informativePricing = informativePricing;
    }
}
