
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_pnrHeader_206114_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PnrTechnicalData_30050_S_CUS_PNRDataFeed_132" name="technicalData"/>
 *     &lt;xs:element type="ReservationControlInformation_72884_S_CUS_PNRDataFeed_132" name="reservationInfo" maxOccurs="10"/>
 *     &lt;xs:element type="ReservationSecurityInformation_42200_S_CUS_PNRDataFeed_132" name="securityInformation" maxOccurs="2"/>
 *     &lt;xs:element type="RelatedProductInformation_101070_S_CUS_PNRDataFeed_132" name="relatedProduct"/>
 *     &lt;xs:element type="CreditLineInformation_85024_S_CUS_PNRDataFeed_132" name="creditLine"/>
 *     &lt;xs:element type="LongFreeText_24804_S_CUS_PNRDataFeed_132" name="tagLine" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttribute_72920_S_CUS_PNRDataFeed_132" name="sbrAttributes" minOccurs="0"/>
 *     &lt;xs:element type="Group000group2_138356_G_CUS_PNRDataFeed_132" name="sbrPosDetails" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="BillingHeaderGroup_99125_G_CUS_PNRDataFeed_1321" name="billingHeaderInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypePnrHeader206114GCUSPNRDataFeed132
{
    private PnrTechnicalData30050SCUSPNRDataFeed132 technicalData;
    private List<ReservationControlInformation72884SCUSPNRDataFeed132> reservationInfoList = new ArrayList<ReservationControlInformation72884SCUSPNRDataFeed132>();
    private List<ReservationSecurityInformation42200SCUSPNRDataFeed132> securityInformationList = new ArrayList<ReservationSecurityInformation42200SCUSPNRDataFeed132>();
    private RelatedProductInformation101070SCUSPNRDataFeed132 relatedProduct;
    private CreditLineInformation85024SCUSPNRDataFeed132 creditLine;
    private LongFreeText24804SCUSPNRDataFeed132 tagLine;
    private CodedAttribute72920SCUSPNRDataFeed132 sbrAttributes;
    private List<Group000group2138356GCUSPNRDataFeed132> sbrPosDetailList = new ArrayList<Group000group2138356GCUSPNRDataFeed132>();
    private BillingHeaderGroup99125GCUSPNRDataFeed1321 billingHeaderInfo;

    /** 
     * Get the 'technicalData' element value. Purge date, envelope number, last published env nb (per PNR, per client).
     * 
     * @return value
     */
    public PnrTechnicalData30050SCUSPNRDataFeed132 getTechnicalData() {
        return technicalData;
    }

    /** 
     * Set the 'technicalData' element value. Purge date, envelope number, last published env nb (per PNR, per client).
     * 
     * @param technicalData
     */
    public void setTechnicalData(
            PnrTechnicalData30050SCUSPNRDataFeed132 technicalData) {
        this.technicalData = technicalData;
    }

    /** 
     * Get the list of 'reservationInfo' element items. Reference to a reservation
     * 
     * @return list
     */
    public List<ReservationControlInformation72884SCUSPNRDataFeed132> getReservationInfoList() {
        return reservationInfoList;
    }

    /** 
     * Set the list of 'reservationInfo' element items. Reference to a reservation
     * 
     * @param list
     */
    public void setReservationInfoList(
            List<ReservationControlInformation72884SCUSPNRDataFeed132> list) {
        reservationInfoList = list;
    }

    /** 
     * Get the list of 'securityInformation' element items. -Amadeus PNR record locator security information for different PNR elements -Provides Booking originator informations
     * 
     * @return list
     */
    public List<ReservationSecurityInformation42200SCUSPNRDataFeed132> getSecurityInformationList() {
        return securityInformationList;
    }

    /** 
     * Set the list of 'securityInformation' element items. -Amadeus PNR record locator security information for different PNR elements -Provides Booking originator informations
     * 
     * @param list
     */
    public void setSecurityInformationList(
            List<ReservationSecurityInformation42200SCUSPNRDataFeed132> list) {
        securityInformationList = list;
    }

    /** 
     * Get the 'relatedProduct' element value. Number of passengers in the PNR
     * 
     * @return value
     */
    public RelatedProductInformation101070SCUSPNRDataFeed132 getRelatedProduct() {
        return relatedProduct;
    }

    /** 
     * Set the 'relatedProduct' element value. Number of passengers in the PNR
     * 
     * @param relatedProduct
     */
    public void setRelatedProduct(
            RelatedProductInformation101070SCUSPNRDataFeed132 relatedProduct) {
        this.relatedProduct = relatedProduct;
    }

    /** 
     * Get the 'creditLine' element value. Details about the agent that last modified the PNR, RF line
     * 
     * @return value
     */
    public CreditLineInformation85024SCUSPNRDataFeed132 getCreditLine() {
        return creditLine;
    }

    /** 
     * Set the 'creditLine' element value. Details about the agent that last modified the PNR, RF line
     * 
     * @param creditLine
     */
    public void setCreditLine(
            CreditLineInformation85024SCUSPNRDataFeed132 creditLine) {
        this.creditLine = creditLine;
    }

    /** 
     * Get the 'tagLine' element value. Tag line
     * 
     * @return value
     */
    public LongFreeText24804SCUSPNRDataFeed132 getTagLine() {
        return tagLine;
    }

    /** 
     * Set the 'tagLine' element value. Tag line
     * 
     * @param tagLine
     */
    public void setTagLine(LongFreeText24804SCUSPNRDataFeed132 tagLine) {
        this.tagLine = tagLine;
    }

    /** 
     * Get the 'sbrAttributes' element value. This contains the global attributes of the PNR. (eg. STAFF, NON-COMMERCIAL, ...)
     * 
     * @return value
     */
    public CodedAttribute72920SCUSPNRDataFeed132 getSbrAttributes() {
        return sbrAttributes;
    }

    /** 
     * Set the 'sbrAttributes' element value. This contains the global attributes of the PNR. (eg. STAFF, NON-COMMERCIAL, ...)
     * 
     * @param sbrAttributes
     */
    public void setSbrAttributes(
            CodedAttribute72920SCUSPNRDataFeed132 sbrAttributes) {
        this.sbrAttributes = sbrAttributes;
    }

    /** 
     * Get the list of 'sbrPosDetails' element items. Conveys Point of Sale information (including Workstation ID for DCS updates, LSS userID and organization of the agent).  First repetition : creator Second repetition : owner Third repetition : last updator
     * 
     * @return list
     */
    public List<Group000group2138356GCUSPNRDataFeed132> getSbrPosDetailList() {
        return sbrPosDetailList;
    }

    /** 
     * Set the list of 'sbrPosDetails' element items. Conveys Point of Sale information (including Workstation ID for DCS updates, LSS userID and organization of the agent).  First repetition : creator Second repetition : owner Third repetition : last updator
     * 
     * @param list
     */
    public void setSbrPosDetailList(
            List<Group000group2138356GCUSPNRDataFeed132> list) {
        sbrPosDetailList = list;
    }

    /** 
     * Get the 'billingHeaderInfo' element value. This group contains billing header  information
     * 
     * @return value
     */
    public BillingHeaderGroup99125GCUSPNRDataFeed1321 getBillingHeaderInfo() {
        return billingHeaderInfo;
    }

    /** 
     * Set the 'billingHeaderInfo' element value. This group contains billing header  information
     * 
     * @param billingHeaderInfo
     */
    public void setBillingHeaderInfo(
            BillingHeaderGroup99125GCUSPNRDataFeed1321 billingHeaderInfo) {
        this.billingHeaderInfo = billingHeaderInfo;
    }
}
