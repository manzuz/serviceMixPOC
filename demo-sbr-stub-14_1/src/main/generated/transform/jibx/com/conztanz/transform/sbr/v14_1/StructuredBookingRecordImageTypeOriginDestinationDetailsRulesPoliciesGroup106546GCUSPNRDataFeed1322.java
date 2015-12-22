
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_rulesPoliciesGroup_106546_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DummySegment_87618_S_CUS_PNRDataFeed_132" name="dummy1"/>
 *     &lt;xs:element type="SelectionDetails_87619_S_CUS_PNRDataFeed_132" name="sourceLevel" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_87612_S_CUS_PNRDataFeed_132" name="remarks" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_taxCovSurchargeGroup_106547_G_CUS_PNRDataFeed_1322" name="taxCovSurchargeGroup" minOccurs="0" maxOccurs="98"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_otherRulesGroup_106549_G_CUS_PNRDataFeed_1322" name="otherRulesGroup" minOccurs="0" maxOccurs="13"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_pickupDropoffLocation_106550_G_CUS_PNRDataFeed_1322" name="pickupDropoffLocation" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_specialEquipmentDetails_106551_G_CUS_PNRDataFeed_1322" name="specialEquipmentDetails" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsRulesPoliciesGroup106546GCUSPNRDataFeed1322
{
    private DummySegment87618SCUSPNRDataFeed132 dummy1;
    private SelectionDetails87619SCUSPNRDataFeed132 sourceLevel;
    private FreeTextInformation87612SCUSPNRDataFeed132 remarks;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsTaxCovSurchargeGroup106547GCUSPNRDataFeed1322> taxCovSurchargeGroupList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsTaxCovSurchargeGroup106547GCUSPNRDataFeed1322>();
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsOtherRulesGroup106549GCUSPNRDataFeed1322> otherRulesGroupList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsOtherRulesGroup106549GCUSPNRDataFeed1322>();
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocation106550GCUSPNRDataFeed1322> pickupDropoffLocationList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocation106550GCUSPNRDataFeed1322>();
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsSpecialEquipmentDetails106551GCUSPNRDataFeed1322> specialEquipmentDetailList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsSpecialEquipmentDetails106551GCUSPNRDataFeed1322>();

    /** 
     * Get the 'dummy1' element value. Dummy segment to mark the beginning of the group
     * 
     * @return value
     */
    public DummySegment87618SCUSPNRDataFeed132 getDummy1() {
        return dummy1;
    }

    /** 
     * Set the 'dummy1' element value. Dummy segment to mark the beginning of the group
     * 
     * @param dummy1
     */
    public void setDummy1(DummySegment87618SCUSPNRDataFeed132 dummy1) {
        this.dummy1 = dummy1;
    }

    /** 
     * Get the 'sourceLevel' element value. Present only if information is linked to a seamless availability
     * 
     * @return value
     */
    public SelectionDetails87619SCUSPNRDataFeed132 getSourceLevel() {
        return sourceLevel;
    }

    /** 
     * Set the 'sourceLevel' element value. Present only if information is linked to a seamless availability
     * 
     * @param sourceLevel
     */
    public void setSourceLevel(
            SelectionDetails87619SCUSPNRDataFeed132 sourceLevel) {
        this.sourceLevel = sourceLevel;
    }

    /** 
     * Get the 'remarks' element value. Used to convey remarks corresponding to rule information.
     * 
     * @return value
     */
    public FreeTextInformation87612SCUSPNRDataFeed132 getRemarks() {
        return remarks;
    }

    /** 
     * Set the 'remarks' element value. Used to convey remarks corresponding to rule information.
     * 
     * @param remarks
     */
    public void setRemarks(FreeTextInformation87612SCUSPNRDataFeed132 remarks) {
        this.remarks = remarks;
    }

    /** 
     * Get the list of 'taxCovSurchargeGroup' element items. Tax, Coverage, Coupon or Surcharge group
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsTaxCovSurchargeGroup106547GCUSPNRDataFeed1322> getTaxCovSurchargeGroupList() {
        return taxCovSurchargeGroupList;
    }

    /** 
     * Set the list of 'taxCovSurchargeGroup' element items. Tax, Coverage, Coupon or Surcharge group
     * 
     * @param list
     */
    public void setTaxCovSurchargeGroupList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsTaxCovSurchargeGroup106547GCUSPNRDataFeed1322> list) {
        taxCovSurchargeGroupList = list;
    }

    /** 
     * Get the list of 'otherRulesGroup' element items. Other rule information group: - Pickup Information (7) - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One way information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsOtherRulesGroup106549GCUSPNRDataFeed1322> getOtherRulesGroupList() {
        return otherRulesGroupList;
    }

    /** 
     * Set the list of 'otherRulesGroup' element items. Other rule information group: - Pickup Information (7) - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One way information
     * 
     * @param list
     */
    public void setOtherRulesGroupList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsOtherRulesGroup106549GCUSPNRDataFeed1322> list) {
        otherRulesGroupList = list;
    }

    /** 
     * Get the list of 'pickupDropoffLocation' element items. Pickup and Drop-off location information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocation106550GCUSPNRDataFeed1322> getPickupDropoffLocationList() {
        return pickupDropoffLocationList;
    }

    /** 
     * Set the list of 'pickupDropoffLocation' element items. Pickup and Drop-off location information
     * 
     * @param list
     */
    public void setPickupDropoffLocationList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocation106550GCUSPNRDataFeed1322> list) {
        pickupDropoffLocationList = list;
    }

    /** 
     * Get the list of 'specialEquipmentDetails' element items. Special equipment details: - option age range (RNG) - up to 5 periods tariffs + 1 main info (TFF) - 2 lines supplementary info
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsSpecialEquipmentDetails106551GCUSPNRDataFeed1322> getSpecialEquipmentDetailList() {
        return specialEquipmentDetailList;
    }

    /** 
     * Set the list of 'specialEquipmentDetails' element items. Special equipment details: - option age range (RNG) - up to 5 periods tariffs + 1 main info (TFF) - 2 lines supplementary info
     * 
     * @param list
     */
    public void setSpecialEquipmentDetailList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsSpecialEquipmentDetails106551GCUSPNRDataFeed1322> list) {
        specialEquipmentDetailList = list;
    }
}
