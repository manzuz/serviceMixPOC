
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * PQR data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PqrData_139963_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemReferencesAndVersions_94069_S_CUS_PNRDataFeed_132" name="pricingRecordId"/>
 *     &lt;xs:element type="ReferenceInformation_79008_S_CUS_PNRDataFeed_132" name="passengerTattoos" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="DiscountInformation_94068_S_CUS_PNRDataFeed_132" name="ptcDiscountCode" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="ReferenceInformation_79009_S_CUS_PNRDataFeed_132" name="fareIds" minOccurs="0" maxOccurs="8"/>
 *     &lt;xs:element type="PqrData_documentDetailsGroup_139964_G_CUS_PNRDataFeed_132" name="documentDetailsGroup"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PqrData139963GCUSPNRDataFeed132
{
    private ItemReferencesAndVersions94069SCUSPNRDataFeed132 pricingRecordId;
    private List<ReferenceInformation79008SCUSPNRDataFeed132> passengerTattooList = new ArrayList<ReferenceInformation79008SCUSPNRDataFeed132>();
    private List<DiscountInformation94068SCUSPNRDataFeed132> ptcDiscountCodeList = new ArrayList<DiscountInformation94068SCUSPNRDataFeed132>();
    private List<ReferenceInformation79009SCUSPNRDataFeed132> fareIdList = new ArrayList<ReferenceInformation79009SCUSPNRDataFeed132>();
    private PqrDataDocumentDetailsGroup139964GCUSPNRDataFeed132 documentDetailsGroup;

    /** 
     * Get the 'pricingRecordId' element value. Tattoo/type of the pricing record
     * 
     * @return value
     */
    public ItemReferencesAndVersions94069SCUSPNRDataFeed132 getPricingRecordId() {
        return pricingRecordId;
    }

    /** 
     * Set the 'pricingRecordId' element value. Tattoo/type of the pricing record
     * 
     * @param pricingRecordId
     */
    public void setPricingRecordId(
            ItemReferencesAndVersions94069SCUSPNRDataFeed132 pricingRecordId) {
        this.pricingRecordId = pricingRecordId;
    }

    /** 
     * Get the list of 'passengerTattoos' element items. Tattoos of the passengers the document is linked to: - at max 1 for a TSM P - at max 99 for a TST
     * 
     * @return list
     */
    public List<ReferenceInformation79008SCUSPNRDataFeed132> getPassengerTattooList() {
        return passengerTattooList;
    }

    /** 
     * Set the list of 'passengerTattoos' element items. Tattoos of the passengers the document is linked to: - at max 1 for a TSM P - at max 99 for a TST
     * 
     * @param list
     */
    public void setPassengerTattooList(
            List<ReferenceInformation79008SCUSPNRDataFeed132> list) {
        passengerTattooList = list;
    }

    /** 
     * Get the list of 'ptcDiscountCode' element items. This segment conveys the pax associated discount and PTC codes given in the pricing input.
     * 
     * @return list
     */
    public List<DiscountInformation94068SCUSPNRDataFeed132> getPtcDiscountCodeList() {
        return ptcDiscountCodeList;
    }

    /** 
     * Set the list of 'ptcDiscountCode' element items. This segment conveys the pax associated discount and PTC codes given in the pricing input.
     * 
     * @param list
     */
    public void setPtcDiscountCodeList(
            List<DiscountInformation94068SCUSPNRDataFeed132> list) {
        ptcDiscountCodeList = list;
    }

    /** 
     * Get the list of 'fareIds' element items. Tattoos /types of fare elements linked to this Pricing record (FO, FM, FT, FP, FE, FD and FZ)
     * 
     * @return list
     */
    public List<ReferenceInformation79009SCUSPNRDataFeed132> getFareIdList() {
        return fareIdList;
    }

    /** 
     * Set the list of 'fareIds' element items. Tattoos /types of fare elements linked to this Pricing record (FO, FM, FT, FP, FE, FD and FZ)
     * 
     * @param list
     */
    public void setFareIdList(
            List<ReferenceInformation79009SCUSPNRDataFeed132> list) {
        fareIdList = list;
    }

    /** 
     * Get the 'documentDetailsGroup' element value. Document functional (product + pricing) details
     * 
     * @return value
     */
    public PqrDataDocumentDetailsGroup139964GCUSPNRDataFeed132 getDocumentDetailsGroup() {
        return documentDetailsGroup;
    }

    /** 
     * Set the 'documentDetailsGroup' element value. Document functional (product + pricing) details
     * 
     * @param documentDetailsGroup
     */
    public void setDocumentDetailsGroup(
            PqrDataDocumentDetailsGroup139964GCUSPNRDataFeed132 documentDetailsGroup) {
        this.documentDetailsGroup = documentDetailsGroup;
    }
}
