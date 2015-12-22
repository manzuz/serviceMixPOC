
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_baggageInfo_139958_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PassengerBaggageInformation_76084_S_CUS_PNRDataFeed_132" name="baggageDetail"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_76083_S_CUS_PNRDataFeed_132" name="baggageReference"/>
 *     &lt;xs:element type="StatusDetails_76085_S_CUS_PNRDataFeed_132" name="baggageIndicator"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_bag_139959_G_CUS_PNRDataFeed_1321" name="bag" minOccurs="0" maxOccurs="200"/>
 *     &lt;xs:element type="Ediresponsiblecustomer_95662_G_CUS_PNRDataFeed_132" name="responsibleCustomerDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterBaggageInfo139958GCUSPNRDataFeed1321
{
    private PassengerBaggageInformation76084SCUSPNRDataFeed132 baggageDetail;
    private ItemReferencesAndVersions76083SCUSPNRDataFeed132 baggageReference;
    private StatusDetails76085SCUSPNRDataFeed132 baggageIndicator;
    private List<StructuredBookingRecordImageTypeDataElementsMasterBag139959GCUSPNRDataFeed1321> bagList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterBag139959GCUSPNRDataFeed1321>();
    private Ediresponsiblecustomer95662GCUSPNRDataFeed132 responsibleCustomerDetails;

    /** 
     * Get the 'baggageDetail' element value. This is used to specify information on the baggage
     * 
     * @return value
     */
    public PassengerBaggageInformation76084SCUSPNRDataFeed132 getBaggageDetail() {
        return baggageDetail;
    }

    /** 
     * Set the 'baggageDetail' element value. This is used to specify information on the baggage
     * 
     * @param baggageDetail
     */
    public void setBaggageDetail(
            PassengerBaggageInformation76084SCUSPNRDataFeed132 baggageDetail) {
        this.baggageDetail = baggageDetail;
    }

    /** 
     * Get the 'baggageReference' element value. Baggage reference (unique identifier) of the bags group. referenceQualifier is set to "BR".
     * 
     * @return value
     */
    public ItemReferencesAndVersions76083SCUSPNRDataFeed132 getBaggageReference() {
        return baggageReference;
    }

    /** 
     * Set the 'baggageReference' element value. Baggage reference (unique identifier) of the bags group. referenceQualifier is set to "BR".
     * 
     * @param baggageReference
     */
    public void setBaggageReference(
            ItemReferencesAndVersions76083SCUSPNRDataFeed132 baggageReference) {
        this.baggageReference = baggageReference;
    }

    /** 
     * Get the 'baggageIndicator' element value. C656 (M) contains the baggage type, 'statusIndicator' containing: "STD" for standard "RU" for rush "CR" for crew
     * 
     * @return value
     */
    public StatusDetails76085SCUSPNRDataFeed132 getBaggageIndicator() {
        return baggageIndicator;
    }

    /** 
     * Set the 'baggageIndicator' element value. C656 (M) contains the baggage type, 'statusIndicator' containing: "STD" for standard "RU" for rush "CR" for crew
     * 
     * @param baggageIndicator
     */
    public void setBaggageIndicator(
            StatusDetails76085SCUSPNRDataFeed132 baggageIndicator) {
        this.baggageIndicator = baggageIndicator;
    }

    /** 
     * Get the list of 'bag' element items. Product delivery of bag info
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterBag139959GCUSPNRDataFeed1321> getBagList() {
        return bagList;
    }

    /** 
     * Set the list of 'bag' element items. Product delivery of bag info
     * 
     * @param list
     */
    public void setBagList(
            List<StructuredBookingRecordImageTypeDataElementsMasterBag139959GCUSPNRDataFeed1321> list) {
        bagList = list;
    }

    /** 
     * Get the 'responsibleCustomerDetails' element value. This group is used to convey information about the responsible customer: can either contain the name and uci (for a normal baggage) or only the name (in case of baggage rush or crew).
     * 
     * @return value
     */
    public Ediresponsiblecustomer95662GCUSPNRDataFeed132 getResponsibleCustomerDetails() {
        return responsibleCustomerDetails;
    }

    /** 
     * Set the 'responsibleCustomerDetails' element value. This group is used to convey information about the responsible customer: can either contain the name and uci (for a normal baggage) or only the name (in case of baggage rush or crew).
     * 
     * @param responsibleCustomerDetails
     */
    public void setResponsibleCustomerDetails(
            Ediresponsiblecustomer95662GCUSPNRDataFeed132 responsibleCustomerDetails) {
        this.responsibleCustomerDetails = responsibleCustomerDetails;
    }
}
