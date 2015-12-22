
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_206122_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OfferCharacteristics_92940_S_CUS_PNRDataFeed_132" name="offerCharacteristics"/>
 *     &lt;xs:element type="ElementManagementSegment_129489_S_CUS_PNRDataFeed_132" name="elementManagementOffer"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_sentIndicator_206128_G_CUS_PNRDataFeed_132" name="sentIndicator" minOccurs="0"/>
 *     &lt;xs:element type="Group000group2_110969_G_CUS_PNRDataFeed_132" name="posDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_originDestinationDetails_206126_G_CUS_PNRDataFeed_132" name="originDestinationDetails" minOccurs="0"/>
 *     &lt;xs:element type="SegmentGroupingInformation_24853_S_CUS_PNRDataFeed_132" name="segmentGroupingInfo" minOccurs="0" maxOccurs="199"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_offerElementMaster_206123_G_CUS_PNRDataFeed_132" name="offerElementMaster" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_pricingRecordGroup_206127_G_CUS_PNRDataFeed_132" name="pricingRecordGroup" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroup206122GCUSPNRDataFeed132
{
    private OfferCharacteristics92940SCUSPNRDataFeed132 offerCharacteristics;
    private ElementManagementSegment129489SCUSPNRDataFeed132 elementManagementOffer;
    private StructuredBookingRecordImageTypeOfferGroupSentIndicator206128GCUSPNRDataFeed132 sentIndicator;
    private Group000group2110969GCUSPNRDataFeed132 posDetails;
    private StructuredBookingRecordImageTypeOfferGroupOriginDestinationDetails206126GCUSPNRDataFeed132 originDestinationDetails;
    private List<SegmentGroupingInformation24853SCUSPNRDataFeed132> segmentGroupingInfoList = new ArrayList<SegmentGroupingInformation24853SCUSPNRDataFeed132>();
    private StructuredBookingRecordImageTypeOfferGroupOfferElementMaster206123GCUSPNRDataFeed132 offerElementMaster;
    private StructuredBookingRecordImageTypeOfferGroupPricingRecordGroup206127GCUSPNRDataFeed132 pricingRecordGroup;

    /** 
     * Get the 'offerCharacteristics' element value.
     * 
     * @return value
     */
    public OfferCharacteristics92940SCUSPNRDataFeed132 getOfferCharacteristics() {
        return offerCharacteristics;
    }

    /** 
     * Set the 'offerCharacteristics' element value.
     * 
     * @param offerCharacteristics
     */
    public void setOfferCharacteristics(
            OfferCharacteristics92940SCUSPNRDataFeed132 offerCharacteristics) {
        this.offerCharacteristics = offerCharacteristics;
    }

    /** 
     * Get the 'elementManagementOffer' element value. PNR segments/elements references
     * 
     * @return value
     */
    public ElementManagementSegment129489SCUSPNRDataFeed132 getElementManagementOffer() {
        return elementManagementOffer;
    }

    /** 
     * Set the 'elementManagementOffer' element value. PNR segments/elements references
     * 
     * @param elementManagementOffer
     */
    public void setElementManagementOffer(
            ElementManagementSegment129489SCUSPNRDataFeed132 elementManagementOffer) {
        this.elementManagementOffer = elementManagementOffer;
    }

    /** 
     * Get the 'sentIndicator' element value. Aim is to show the agent when precisely the offer was sent to client and through which channel.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupSentIndicator206128GCUSPNRDataFeed132 getSentIndicator() {
        return sentIndicator;
    }

    /** 
     * Set the 'sentIndicator' element value. Aim is to show the agent when precisely the offer was sent to client and through which channel.
     * 
     * @param sentIndicator
     */
    public void setSentIndicator(
            StructuredBookingRecordImageTypeOfferGroupSentIndicator206128GCUSPNRDataFeed132 sentIndicator) {
        this.sentIndicator = sentIndicator;
    }

    /** 
     * Get the 'posDetails' element value. Point of Sale Information at Offer level.
     * 
     * @return value
     */
    public Group000group2110969GCUSPNRDataFeed132 getPosDetails() {
        return posDetails;
    }

    /** 
     * Set the 'posDetails' element value. Point of Sale Information at Offer level.
     * 
     * @param posDetails
     */
    public void setPosDetails(Group000group2110969GCUSPNRDataFeed132 posDetails) {
        this.posDetails = posDetails;
    }

    /** 
     * Get the 'originDestinationDetails' element value. Details about the itineraries
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupOriginDestinationDetails206126GCUSPNRDataFeed132 getOriginDestinationDetails() {
        return originDestinationDetails;
    }

    /** 
     * Set the 'originDestinationDetails' element value. Details about the itineraries
     * 
     * @param originDestinationDetails
     */
    public void setOriginDestinationDetails(
            StructuredBookingRecordImageTypeOfferGroupOriginDestinationDetails206126GCUSPNRDataFeed132 originDestinationDetails) {
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
     * Get the 'offerElementMaster' element value. Used to carry all the Elements linked to an Offer.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupOfferElementMaster206123GCUSPNRDataFeed132 getOfferElementMaster() {
        return offerElementMaster;
    }

    /** 
     * Set the 'offerElementMaster' element value. Used to carry all the Elements linked to an Offer.
     * 
     * @param offerElementMaster
     */
    public void setOfferElementMaster(
            StructuredBookingRecordImageTypeOfferGroupOfferElementMaster206123GCUSPNRDataFeed132 offerElementMaster) {
        this.offerElementMaster = offerElementMaster;
    }

    /** 
     * Get the 'pricingRecordGroup' element value. To convey pricing records information
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOfferGroupPricingRecordGroup206127GCUSPNRDataFeed132 getPricingRecordGroup() {
        return pricingRecordGroup;
    }

    /** 
     * Set the 'pricingRecordGroup' element value. To convey pricing records information
     * 
     * @param pricingRecordGroup
     */
    public void setPricingRecordGroup(
            StructuredBookingRecordImageTypeOfferGroupPricingRecordGroup206127GCUSPNRDataFeed132 pricingRecordGroup) {
        this.pricingRecordGroup = pricingRecordGroup;
    }
}
