
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReaccommodationSegmentDescriptionGroup_passengerBookingsAndServices_139417_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelProductInformation_118078_S_CUS_PNRDataFeed_132" name="segmentInformation"/>
 *     &lt;xs:element type="CommercialAgreements_17659_S_CUS_PNRDataFeed_132" name="codeShareSegmentInformation" minOccurs="0"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_17940_S_CUS_PNRDataFeed_132" name="segmentIdentificationData" minOccurs="0"/>
 *     &lt;xs:element type="ElementManagementSegment_106214_S_CUS_PNRDataFeed_132" name="segmentReference" minOccurs="0"/>
 *     &lt;xs:element type="GroupDocumentNumber_136517_G_CUS_PNRDataFeed_132" name="segmentTicketData" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ReaccommodationSegmentDescriptionGroup_passengerBookingsAndServices_specialServiceRequestData_139418_G_CUS_PNRDataFeed_132" name="specialServiceRequestData" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServices139417GCUSPNRDataFeed132
{
    private TravelProductInformation118078SCUSPNRDataFeed132 segmentInformation;
    private CommercialAgreements17659SCUSPNRDataFeed132 codeShareSegmentInformation;
    private ItemReferencesAndVersions17940SCUSPNRDataFeed132 segmentIdentificationData;
    private ElementManagementSegment106214SCUSPNRDataFeed132 segmentReference;
    private List<GroupDocumentNumber136517GCUSPNRDataFeed132> segmentTicketDataList = new ArrayList<GroupDocumentNumber136517GCUSPNRDataFeed132>();
    private List<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServicesSpecialServiceRequestData139418GCUSPNRDataFeed132> specialServiceRequestDataList = new ArrayList<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServicesSpecialServiceRequestData139418GCUSPNRDataFeed132>();

    /** 
     * Get the 'segmentInformation' element value.
     * 
     * @return value
     */
    public TravelProductInformation118078SCUSPNRDataFeed132 getSegmentInformation() {
        return segmentInformation;
    }

    /** 
     * Set the 'segmentInformation' element value.
     * 
     * @param segmentInformation
     */
    public void setSegmentInformation(
            TravelProductInformation118078SCUSPNRDataFeed132 segmentInformation) {
        this.segmentInformation = segmentInformation;
    }

    /** 
     * Get the 'codeShareSegmentInformation' element value.
     * 
     * @return value
     */
    public CommercialAgreements17659SCUSPNRDataFeed132 getCodeShareSegmentInformation() {
        return codeShareSegmentInformation;
    }

    /** 
     * Set the 'codeShareSegmentInformation' element value.
     * 
     * @param codeShareSegmentInformation
     */
    public void setCodeShareSegmentInformation(
            CommercialAgreements17659SCUSPNRDataFeed132 codeShareSegmentInformation) {
        this.codeShareSegmentInformation = codeShareSegmentInformation;
    }

    /** 
     * Get the 'segmentIdentificationData' element value.
     * 
     * @return value
     */
    public ItemReferencesAndVersions17940SCUSPNRDataFeed132 getSegmentIdentificationData() {
        return segmentIdentificationData;
    }

    /** 
     * Set the 'segmentIdentificationData' element value.
     * 
     * @param segmentIdentificationData
     */
    public void setSegmentIdentificationData(
            ItemReferencesAndVersions17940SCUSPNRDataFeed132 segmentIdentificationData) {
        this.segmentIdentificationData = segmentIdentificationData;
    }

    /** 
     * Get the 'segmentReference' element value.
     * 
     * @return value
     */
    public ElementManagementSegment106214SCUSPNRDataFeed132 getSegmentReference() {
        return segmentReference;
    }

    /** 
     * Set the 'segmentReference' element value.
     * 
     * @param segmentReference
     */
    public void setSegmentReference(
            ElementManagementSegment106214SCUSPNRDataFeed132 segmentReference) {
        this.segmentReference = segmentReference;
    }

    /** 
     * Get the list of 'segmentTicketData' element items.
     * 
     * @return list
     */
    public List<GroupDocumentNumber136517GCUSPNRDataFeed132> getSegmentTicketDataList() {
        return segmentTicketDataList;
    }

    /** 
     * Set the list of 'segmentTicketData' element items.
     * 
     * @param list
     */
    public void setSegmentTicketDataList(
            List<GroupDocumentNumber136517GCUSPNRDataFeed132> list) {
        segmentTicketDataList = list;
    }

    /** 
     * Get the list of 'specialServiceRequestData' element items.
     * 
     * @return list
     */
    public List<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServicesSpecialServiceRequestData139418GCUSPNRDataFeed132> getSpecialServiceRequestDataList() {
        return specialServiceRequestDataList;
    }

    /** 
     * Set the list of 'specialServiceRequestData' element items.
     * 
     * @param list
     */
    public void setSpecialServiceRequestDataList(
            List<ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServicesSpecialServiceRequestData139418GCUSPNRDataFeed132> list) {
        specialServiceRequestDataList = list;
    }
}
