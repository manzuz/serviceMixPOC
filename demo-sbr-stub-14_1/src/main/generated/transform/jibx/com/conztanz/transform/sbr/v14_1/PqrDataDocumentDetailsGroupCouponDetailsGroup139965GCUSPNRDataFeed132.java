
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PqrData_documentDetailsGroup_couponDetailsGroup_139965_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceInformation_79009_S_CUS_PNRDataFeed_132" name="productId"/>
 *     &lt;xs:element type="Attribute_79011_S_CUS_PNRDataFeed_132" name="rfisc" minOccurs="0"/>
 *     &lt;xs:element type="CompanyInformation_79020_S_CUS_PNRDataFeed_132" name="feeOwner" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_79012_S_CUS_PNRDataFeed_132" name="couponValue" minOccurs="0"/>
 *     &lt;xs:element type="InConnectionWith_98380_G_CUS_PNRDataFeed_132" name="icw" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="StatusDetails_79015_S_CUS_PNRDataFeed_132" name="couponFlags" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="FreeTextInformation_79018_S_CUS_PNRDataFeed_132" name="presentToAtAndRemarks" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="TravelProductInformation_79024_S_CUS_PNRDataFeed_132" name="flightConnectionType" minOccurs="0"/>
 *     &lt;xs:element type="PricingOrTicketingSubsequent_79023_S_CUS_PNRDataFeed_132" name="fareQualifier" minOccurs="0"/>
 *     &lt;xs:element type="DateAndTimeInformation_79021_S_CUS_PNRDataFeed_132" name="validityDates" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="ExcessBaggageDetails_79022_S_CUS_PNRDataFeed_132" name="baggageInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PqrDataDocumentDetailsGroupCouponDetailsGroup139965GCUSPNRDataFeed132
{
    private ReferenceInformation79009SCUSPNRDataFeed132 productId;
    private Attribute79011SCUSPNRDataFeed132 rfisc;
    private CompanyInformation79020SCUSPNRDataFeed132 feeOwner;
    private MonetaryInformation79012SCUSPNRDataFeed132 couponValue;
    private List<InConnectionWith98380GCUSPNRDataFeed132> icwList = new ArrayList<InConnectionWith98380GCUSPNRDataFeed132>();
    private List<StatusDetails79015SCUSPNRDataFeed132> couponFlagList = new ArrayList<StatusDetails79015SCUSPNRDataFeed132>();
    private List<FreeTextInformation79018SCUSPNRDataFeed132> presentToAtAndRemarkList = new ArrayList<FreeTextInformation79018SCUSPNRDataFeed132>();
    private TravelProductInformation79024SCUSPNRDataFeed132 flightConnectionType;
    private PricingOrTicketingSubsequent79023SCUSPNRDataFeed132 fareQualifier;
    private List<DateAndTimeInformation79021SCUSPNRDataFeed132> validityDateList = new ArrayList<DateAndTimeInformation79021SCUSPNRDataFeed132>();
    private ExcessBaggageDetails79022SCUSPNRDataFeed132 baggageInformation;

    /** 
     * Get the 'productId' element value. Tattoo + type of the product identifying the coupon.
     * 
     * @return value
     */
    public ReferenceInformation79009SCUSPNRDataFeed132 getProductId() {
        return productId;
    }

    /** 
     * Set the 'productId' element value. Tattoo + type of the product identifying the coupon.
     * 
     * @param productId
     */
    public void setProductId(
            ReferenceInformation79009SCUSPNRDataFeed132 productId) {
        this.productId = productId;
    }

    /** 
     * Get the 'rfisc' element value. The Reason For Issuance Subcode (RFISC) and its description
     * 
     * @return value
     */
    public Attribute79011SCUSPNRDataFeed132 getRfisc() {
        return rfisc;
    }

    /** 
     * Set the 'rfisc' element value. The Reason For Issuance Subcode (RFISC) and its description
     * 
     * @param rfisc
     */
    public void setRfisc(Attribute79011SCUSPNRDataFeed132 rfisc) {
        this.rfisc = rfisc;
    }

    /** 
     * Get the 'feeOwner' element value. Fee owner
     * 
     * @return value
     */
    public CompanyInformation79020SCUSPNRDataFeed132 getFeeOwner() {
        return feeOwner;
    }

    /** 
     * Set the 'feeOwner' element value. Fee owner
     * 
     * @param feeOwner
     */
    public void setFeeOwner(CompanyInformation79020SCUSPNRDataFeed132 feeOwner) {
        this.feeOwner = feeOwner;
    }

    /** 
     * Get the 'couponValue' element value. Value of the coupon
     * 
     * @return value
     */
    public MonetaryInformation79012SCUSPNRDataFeed132 getCouponValue() {
        return couponValue;
    }

    /** 
     * Set the 'couponValue' element value. Value of the coupon
     * 
     * @param couponValue
     */
    public void setCouponValue(
            MonetaryInformation79012SCUSPNRDataFeed132 couponValue) {
        this.couponValue = couponValue;
    }

    /** 
     * Get the list of 'icw' element items. In Connection With document/coupon number
     * 
     * @return list
     */
    public List<InConnectionWith98380GCUSPNRDataFeed132> getIcwList() {
        return icwList;
    }

    /** 
     * Set the list of 'icw' element items. In Connection With document/coupon number
     * 
     * @param list
     */
    public void setIcwList(List<InConnectionWith98380GCUSPNRDataFeed132> list) {
        icwList = list;
    }

    /** 
     * Get the list of 'couponFlags' element items. - Consumed at issuance indicator (CMI) - Non-refundable indicator (NRF)  - Non-exchangeable indicator (NEX) - Non-interlineable indicator (NIL)
     * 
     * @return list
     */
    public List<StatusDetails79015SCUSPNRDataFeed132> getCouponFlagList() {
        return couponFlagList;
    }

    /** 
     * Set the list of 'couponFlags' element items. - Consumed at issuance indicator (CMI) - Non-refundable indicator (NRF)  - Non-exchangeable indicator (NEX) - Non-interlineable indicator (NIL)
     * 
     * @param list
     */
    public void setCouponFlagList(
            List<StatusDetails79015SCUSPNRDataFeed132> list) {
        couponFlagList = list;
    }

    /** 
     * Get the list of 'presentToAtAndRemarks' element items. - Present To (PRT) - Present At (PRA) - Service remarks (RMK)
     * 
     * @return list
     */
    public List<FreeTextInformation79018SCUSPNRDataFeed132> getPresentToAtAndRemarkList() {
        return presentToAtAndRemarkList;
    }

    /** 
     * Set the list of 'presentToAtAndRemarks' element items. - Present To (PRT) - Present At (PRA) - Service remarks (RMK)
     * 
     * @param list
     */
    public void setPresentToAtAndRemarkList(
            List<FreeTextInformation79018SCUSPNRDataFeed132> list) {
        presentToAtAndRemarkList = list;
    }

    /** 
     * Get the 'flightConnectionType' element value. Flight Connection Type: - X: Connection Point - O: ARUNK
     * 
     * @return value
     */
    public TravelProductInformation79024SCUSPNRDataFeed132 getFlightConnectionType() {
        return flightConnectionType;
    }

    /** 
     * Set the 'flightConnectionType' element value. Flight Connection Type: - X: Connection Point - O: ARUNK
     * 
     * @param flightConnectionType
     */
    public void setFlightConnectionType(
            TravelProductInformation79024SCUSPNRDataFeed132 flightConnectionType) {
        this.flightConnectionType = flightConnectionType;
    }

    /** 
     * Get the 'fareQualifier' element value. Fare basis details
     * 
     * @return value
     */
    public PricingOrTicketingSubsequent79023SCUSPNRDataFeed132 getFareQualifier() {
        return fareQualifier;
    }

    /** 
     * Set the 'fareQualifier' element value. Fare basis details
     * 
     * @param fareQualifier
     */
    public void setFareQualifier(
            PricingOrTicketingSubsequent79023SCUSPNRDataFeed132 fareQualifier) {
        this.fareQualifier = fareQualifier;
    }

    /** 
     * Get the list of 'validityDates' element items. Validity dates: - Not Valid After (A) - Not Valid Before (B)
     * 
     * @return list
     */
    public List<DateAndTimeInformation79021SCUSPNRDataFeed132> getValidityDateList() {
        return validityDateList;
    }

    /** 
     * Set the list of 'validityDates' element items. Validity dates: - Not Valid After (A) - Not Valid Before (B)
     * 
     * @param list
     */
    public void setValidityDateList(
            List<DateAndTimeInformation79021SCUSPNRDataFeed132> list) {
        validityDateList = list;
    }

    /** 
     * Get the 'baggageInformation' element value. Excess Baggage data
     * 
     * @return value
     */
    public ExcessBaggageDetails79022SCUSPNRDataFeed132 getBaggageInformation() {
        return baggageInformation;
    }

    /** 
     * Set the 'baggageInformation' element value. Excess Baggage data
     * 
     * @param baggageInformation
     */
    public void setBaggageInformation(
            ExcessBaggageDetails79022SCUSPNRDataFeed132 baggageInformation) {
        this.baggageInformation = baggageInformation;
    }
}
