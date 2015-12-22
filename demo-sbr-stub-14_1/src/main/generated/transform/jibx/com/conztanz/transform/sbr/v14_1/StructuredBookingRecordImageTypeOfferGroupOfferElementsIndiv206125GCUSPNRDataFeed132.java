
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_offerElementsIndiv_206125_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_129494_S_CUS_PNRDataFeed_132" name="elementManagementData"/>
 *     &lt;xs:element type="ReferenceInformation_75336_S_CUS_PNRDataFeed_132" name="referenceForDataElement" minOccurs="0"/>
 *     &lt;xs:element type="SpecialRequirementsDetails_26749_S_CUS_PNRDataFeed_132" name="serviceRequest" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_69892_S_CUS_PNRDataFeed_132" name="ssrIndicator" minOccurs="0"/>
 *     &lt;xs:element type="ReservationSecurityInformation_104624_S_CUS_PNRDataFeed_132" name="ssrCreationInfo" minOccurs="0"/>
 *     &lt;xs:element type="LongFreeText_24804_S_CUS_PNRDataFeed_132" name="otherDataFreetext" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupOfferElementsIndiv206125GCUSPNRDataFeed132
{
    private ElementManagementSegment129494SCUSPNRDataFeed132 elementManagementData;
    private ReferenceInformation75336SCUSPNRDataFeed132 referenceForDataElement;
    private SpecialRequirementsDetails26749SCUSPNRDataFeed132 serviceRequest;
    private StatusDetails69892SCUSPNRDataFeed132 ssrIndicator;
    private ReservationSecurityInformation104624SCUSPNRDataFeed132 ssrCreationInfo;
    private List<LongFreeText24804SCUSPNRDataFeed132> otherDataFreetextList = new ArrayList<LongFreeText24804SCUSPNRDataFeed132>();

    /** 
     * Get the 'elementManagementData' element value.
     * 
     * @return value
     */
    public ElementManagementSegment129494SCUSPNRDataFeed132 getElementManagementData() {
        return elementManagementData;
    }

    /** 
     * Set the 'elementManagementData' element value.
     * 
     * @param elementManagementData
     */
    public void setElementManagementData(
            ElementManagementSegment129494SCUSPNRDataFeed132 elementManagementData) {
        this.elementManagementData = elementManagementData;
    }

    /** 
     * Get the 'referenceForDataElement' element value. provide specific reference identification
     * 
     * @return value
     */
    public ReferenceInformation75336SCUSPNRDataFeed132 getReferenceForDataElement() {
        return referenceForDataElement;
    }

    /** 
     * Set the 'referenceForDataElement' element value. provide specific reference identification
     * 
     * @param referenceForDataElement
     */
    public void setReferenceForDataElement(
            ReferenceInformation75336SCUSPNRDataFeed132 referenceForDataElement) {
        this.referenceForDataElement = referenceForDataElement;
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
     * Get the 'ssrIndicator' element value. Conveys the chargeable indicator status
     * 
     * @return value
     */
    public StatusDetails69892SCUSPNRDataFeed132 getSsrIndicator() {
        return ssrIndicator;
    }

    /** 
     * Set the 'ssrIndicator' element value. Conveys the chargeable indicator status
     * 
     * @param ssrIndicator
     */
    public void setSsrIndicator(
            StatusDetails69892SCUSPNRDataFeed132 ssrIndicator) {
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
}
