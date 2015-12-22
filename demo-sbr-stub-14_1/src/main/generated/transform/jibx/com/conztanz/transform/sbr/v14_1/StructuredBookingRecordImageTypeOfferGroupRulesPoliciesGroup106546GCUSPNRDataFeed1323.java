
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_rulesPoliciesGroup_106546_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DummySegment_87618_S_CUS_PNRDataFeed_132" name="dummy1"/>
 *     &lt;xs:element type="SelectionDetails_87619_S_CUS_PNRDataFeed_132" name="sourceLevel" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_87612_S_CUS_PNRDataFeed_132" name="remarks" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_taxCovSurchargeGroup_106547_G_CUS_PNRDataFeed_1323" name="taxCovSurchargeGroup" minOccurs="0" maxOccurs="98"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_otherRulesGroup_106549_G_CUS_PNRDataFeed_1323" name="otherRulesGroup" minOccurs="0" maxOccurs="13"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_pickupDropoffLocation_106550_G_CUS_PNRDataFeed_1323" name="pickupDropoffLocation" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_specialEquipmentDetails_106551_G_CUS_PNRDataFeed_1323" name="specialEquipmentDetails" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupRulesPoliciesGroup106546GCUSPNRDataFeed1323
{
    private DummySegment87618SCUSPNRDataFeed132 dummy1;
    private SelectionDetails87619SCUSPNRDataFeed132 sourceLevel;
    private FreeTextInformation87612SCUSPNRDataFeed132 remarks;
    private List<StructuredBookingRecordImageTypeOfferGroupTaxCovSurchargeGroup106547GCUSPNRDataFeed1323> taxCovSurchargeGroupList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupTaxCovSurchargeGroup106547GCUSPNRDataFeed1323>();
    private List<StructuredBookingRecordImageTypeOfferGroupOtherRulesGroup106549GCUSPNRDataFeed1323> otherRulesGroupList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupOtherRulesGroup106549GCUSPNRDataFeed1323>();
    private List<StructuredBookingRecordImageTypeOfferGroupPickupDropoffLocation106550GCUSPNRDataFeed1323> pickupDropoffLocationList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupPickupDropoffLocation106550GCUSPNRDataFeed1323>();
    private List<StructuredBookingRecordImageTypeOfferGroupSpecialEquipmentDetails106551GCUSPNRDataFeed1323> specialEquipmentDetailList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupSpecialEquipmentDetails106551GCUSPNRDataFeed1323>();

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
    public List<StructuredBookingRecordImageTypeOfferGroupTaxCovSurchargeGroup106547GCUSPNRDataFeed1323> getTaxCovSurchargeGroupList() {
        return taxCovSurchargeGroupList;
    }

    /** 
     * Set the list of 'taxCovSurchargeGroup' element items. Tax, Coverage, Coupon or Surcharge group
     * 
     * @param list
     */
    public void setTaxCovSurchargeGroupList(
            List<StructuredBookingRecordImageTypeOfferGroupTaxCovSurchargeGroup106547GCUSPNRDataFeed1323> list) {
        taxCovSurchargeGroupList = list;
    }

    /** 
     * Get the list of 'otherRulesGroup' element items. Other rule information group: - Pickup Information (7) - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One way information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupOtherRulesGroup106549GCUSPNRDataFeed1323> getOtherRulesGroupList() {
        return otherRulesGroupList;
    }

    /** 
     * Set the list of 'otherRulesGroup' element items. Other rule information group: - Pickup Information (7) - Advance Payment Information - Policy Information - Deposit Information - Advance Booking Information - Guarantee Information - One way information
     * 
     * @param list
     */
    public void setOtherRulesGroupList(
            List<StructuredBookingRecordImageTypeOfferGroupOtherRulesGroup106549GCUSPNRDataFeed1323> list) {
        otherRulesGroupList = list;
    }

    /** 
     * Get the list of 'pickupDropoffLocation' element items. Pickup and Drop-off location information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupPickupDropoffLocation106550GCUSPNRDataFeed1323> getPickupDropoffLocationList() {
        return pickupDropoffLocationList;
    }

    /** 
     * Set the list of 'pickupDropoffLocation' element items. Pickup and Drop-off location information
     * 
     * @param list
     */
    public void setPickupDropoffLocationList(
            List<StructuredBookingRecordImageTypeOfferGroupPickupDropoffLocation106550GCUSPNRDataFeed1323> list) {
        pickupDropoffLocationList = list;
    }

    /** 
     * Get the list of 'specialEquipmentDetails' element items. Special equipment details: - option age range (RNG) - up to 5 periods tariffs + 1 main info (TFF) - 2 lines supplementary info
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupSpecialEquipmentDetails106551GCUSPNRDataFeed1323> getSpecialEquipmentDetailList() {
        return specialEquipmentDetailList;
    }

    /** 
     * Set the list of 'specialEquipmentDetails' element items. Special equipment details: - option age range (RNG) - up to 5 periods tariffs + 1 main info (TFF) - 2 lines supplementary info
     * 
     * @param list
     */
    public void setSpecialEquipmentDetailList(
            List<StructuredBookingRecordImageTypeOfferGroupSpecialEquipmentDetails106551GCUSPNRDataFeed1323> list) {
        specialEquipmentDetailList = list;
    }
}
