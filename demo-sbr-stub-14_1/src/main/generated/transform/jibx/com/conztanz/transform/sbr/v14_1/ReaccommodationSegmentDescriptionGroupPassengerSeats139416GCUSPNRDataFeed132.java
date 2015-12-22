
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReaccommodationSegmentDescriptionGroup_passengerSeats_139416_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_28144_S_CUS_PNRDataFeed_132" name="ancillaryServicesIndicator"/>
 *     &lt;xs:element type="CodedAttribute_118041_S_CUS_PNRDataFeed_132" name="codedAttributeType"/>
 *     &lt;xs:element type="SpecialRequirementsDetails_122100_S_CUS_PNRDataFeed_132" name="seatInformation"/>
 *     &lt;xs:element type="ElementManagementSegment_106214_S_CUS_PNRDataFeed_132" name="seattReference" minOccurs="0"/>
 *     &lt;xs:element type="PricingOrTicketingSubsequent_123364_S_CUS_PNRDataFeed_132" name="reasonForIssuance" minOccurs="0"/>
 *     &lt;xs:element type="GroupDocumentNumber_136517_G_CUS_PNRDataFeed_132" name="seattTicketData" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ErrorGroup_124880_G_CUS_PNRDataFeed_132" name="seatError" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReaccommodationSegmentDescriptionGroupPassengerSeats139416GCUSPNRDataFeed132
{
    private StatusDetails28144SCUSPNRDataFeed132 ancillaryServicesIndicator;
    private CodedAttribute118041SCUSPNRDataFeed132 codedAttributeType;
    private SpecialRequirementsDetails122100SCUSPNRDataFeed132 seatInformation;
    private ElementManagementSegment106214SCUSPNRDataFeed132 seattReference;
    private PricingOrTicketingSubsequent123364SCUSPNRDataFeed132 reasonForIssuance;
    private List<GroupDocumentNumber136517GCUSPNRDataFeed132> seattTicketDataList = new ArrayList<GroupDocumentNumber136517GCUSPNRDataFeed132>();
    private ErrorGroup124880GCUSPNRDataFeed132 seatError;

    /** 
     * Get the 'ancillaryServicesIndicator' element value.
     * 
     * @return value
     */
    public StatusDetails28144SCUSPNRDataFeed132 getAncillaryServicesIndicator() {
        return ancillaryServicesIndicator;
    }

    /** 
     * Set the 'ancillaryServicesIndicator' element value.
     * 
     * @param ancillaryServicesIndicator
     */
    public void setAncillaryServicesIndicator(
            StatusDetails28144SCUSPNRDataFeed132 ancillaryServicesIndicator) {
        this.ancillaryServicesIndicator = ancillaryServicesIndicator;
    }

    /** 
     * Get the 'codedAttributeType' element value.
     * 
     * @return value
     */
    public CodedAttribute118041SCUSPNRDataFeed132 getCodedAttributeType() {
        return codedAttributeType;
    }

    /** 
     * Set the 'codedAttributeType' element value.
     * 
     * @param codedAttributeType
     */
    public void setCodedAttributeType(
            CodedAttribute118041SCUSPNRDataFeed132 codedAttributeType) {
        this.codedAttributeType = codedAttributeType;
    }

    /** 
     * Get the 'seatInformation' element value.
     * 
     * @return value
     */
    public SpecialRequirementsDetails122100SCUSPNRDataFeed132 getSeatInformation() {
        return seatInformation;
    }

    /** 
     * Set the 'seatInformation' element value.
     * 
     * @param seatInformation
     */
    public void setSeatInformation(
            SpecialRequirementsDetails122100SCUSPNRDataFeed132 seatInformation) {
        this.seatInformation = seatInformation;
    }

    /** 
     * Get the 'seattReference' element value.
     * 
     * @return value
     */
    public ElementManagementSegment106214SCUSPNRDataFeed132 getSeattReference() {
        return seattReference;
    }

    /** 
     * Set the 'seattReference' element value.
     * 
     * @param seattReference
     */
    public void setSeattReference(
            ElementManagementSegment106214SCUSPNRDataFeed132 seattReference) {
        this.seattReference = seattReference;
    }

    /** 
     * Get the 'reasonForIssuance' element value.
     * 
     * @return value
     */
    public PricingOrTicketingSubsequent123364SCUSPNRDataFeed132 getReasonForIssuance() {
        return reasonForIssuance;
    }

    /** 
     * Set the 'reasonForIssuance' element value.
     * 
     * @param reasonForIssuance
     */
    public void setReasonForIssuance(
            PricingOrTicketingSubsequent123364SCUSPNRDataFeed132 reasonForIssuance) {
        this.reasonForIssuance = reasonForIssuance;
    }

    /** 
     * Get the list of 'seattTicketData' element items.
     * 
     * @return list
     */
    public List<GroupDocumentNumber136517GCUSPNRDataFeed132> getSeattTicketDataList() {
        return seattTicketDataList;
    }

    /** 
     * Set the list of 'seattTicketData' element items.
     * 
     * @param list
     */
    public void setSeattTicketDataList(
            List<GroupDocumentNumber136517GCUSPNRDataFeed132> list) {
        seattTicketDataList = list;
    }

    /** 
     * Get the 'seatError' element value.
     * 
     * @return value
     */
    public ErrorGroup124880GCUSPNRDataFeed132 getSeatError() {
        return seatError;
    }

    /** 
     * Set the 'seatError' element value.
     * 
     * @param seatError
     */
    public void setSeatError(ErrorGroup124880GCUSPNRDataFeed132 seatError) {
        this.seatError = seatError;
    }
}
