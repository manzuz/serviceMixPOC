
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReaccommodationSegmentDescriptionGroup_passengerBookingsAndServices_specialServiceRequestData_139418_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttribute_118041_S_CUS_PNRDataFeed_132" name="codedAttributeType"/>
 *     &lt;xs:element type="SpecialRequirementsDetails_122100_S_CUS_PNRDataFeed_132" name="specialServiceRequest"/>
 *     &lt;xs:element type="ElementManagementSegment_106214_S_CUS_PNRDataFeed_132" name="specialServiceRequestReference" minOccurs="0"/>
 *     &lt;xs:element type="PricingOrTicketingSubsequent_123364_S_CUS_PNRDataFeed_132" name="reasonForIssuance" minOccurs="0"/>
 *     &lt;xs:element type="GroupDocumentNumber_136517_G_CUS_PNRDataFeed_132" name="specialServiceRequestTktData" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ErrorGroup_124880_G_CUS_PNRDataFeed_132" name="specialServiceRequestError" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReaccommodationSegmentDescriptionGroupPassengerBookingsAndServicesSpecialServiceRequestData139418GCUSPNRDataFeed132
{
    private CodedAttribute118041SCUSPNRDataFeed132 codedAttributeType;
    private SpecialRequirementsDetails122100SCUSPNRDataFeed132 specialServiceRequest;
    private ElementManagementSegment106214SCUSPNRDataFeed132 specialServiceRequestReference;
    private PricingOrTicketingSubsequent123364SCUSPNRDataFeed132 reasonForIssuance;
    private List<GroupDocumentNumber136517GCUSPNRDataFeed132> specialServiceRequestTktDataList = new ArrayList<GroupDocumentNumber136517GCUSPNRDataFeed132>();
    private ErrorGroup124880GCUSPNRDataFeed132 specialServiceRequestError;

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
     * Get the 'specialServiceRequest' element value.
     * 
     * @return value
     */
    public SpecialRequirementsDetails122100SCUSPNRDataFeed132 getSpecialServiceRequest() {
        return specialServiceRequest;
    }

    /** 
     * Set the 'specialServiceRequest' element value.
     * 
     * @param specialServiceRequest
     */
    public void setSpecialServiceRequest(
            SpecialRequirementsDetails122100SCUSPNRDataFeed132 specialServiceRequest) {
        this.specialServiceRequest = specialServiceRequest;
    }

    /** 
     * Get the 'specialServiceRequestReference' element value.
     * 
     * @return value
     */
    public ElementManagementSegment106214SCUSPNRDataFeed132 getSpecialServiceRequestReference() {
        return specialServiceRequestReference;
    }

    /** 
     * Set the 'specialServiceRequestReference' element value.
     * 
     * @param specialServiceRequestReference
     */
    public void setSpecialServiceRequestReference(
            ElementManagementSegment106214SCUSPNRDataFeed132 specialServiceRequestReference) {
        this.specialServiceRequestReference = specialServiceRequestReference;
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
     * Get the list of 'specialServiceRequestTktData' element items.
     * 
     * @return list
     */
    public List<GroupDocumentNumber136517GCUSPNRDataFeed132> getSpecialServiceRequestTktDataList() {
        return specialServiceRequestTktDataList;
    }

    /** 
     * Set the list of 'specialServiceRequestTktData' element items.
     * 
     * @param list
     */
    public void setSpecialServiceRequestTktDataList(
            List<GroupDocumentNumber136517GCUSPNRDataFeed132> list) {
        specialServiceRequestTktDataList = list;
    }

    /** 
     * Get the 'specialServiceRequestError' element value.
     * 
     * @return value
     */
    public ErrorGroup124880GCUSPNRDataFeed132 getSpecialServiceRequestError() {
        return specialServiceRequestError;
    }

    /** 
     * Set the 'specialServiceRequestError' element value.
     * 
     * @param specialServiceRequestError
     */
    public void setSpecialServiceRequestError(
            ErrorGroup124880GCUSPNRDataFeed132 specialServiceRequestError) {
        this.specialServiceRequestError = specialServiceRequestError;
    }
}
