
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey miscDocument structured group
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pasbcq1a044Group43_90293_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MiscellaneousDocument_70482_S_CUS_PNRDataFeed_132" name="commonMd"/>
 *     &lt;xs:element type="ReferenceInformation_70486_S_CUS_PNRDataFeed_132" name="elemTattoo"/>
 *     &lt;xs:element type="UserIdentification_70490_S_CUS_PNRDataFeed_132" name="userInfo" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttribute_70481_S_CUS_PNRDataFeed_132" name="elementDescription" minOccurs="0" maxOccurs="10"/>
 *     &lt;xs:element type="PricingTicketingSubsequent_70485_S_CUS_PNRDataFeed_132" name="mdInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_70487_S_CUS_PNRDataFeed_132" name="creationDate" minOccurs="0"/>
 *     &lt;xs:element type="TransportIdentifier_70488_S_CUS_PNRDataFeed_132" name="validatingCarrier" minOccurs="0"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_70484_S_CUS_PNRDataFeed_132" name="issuancePlace" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_70483_S_CUS_PNRDataFeed_132" name="mdFares" minOccurs="0"/>
 *     &lt;xs:element type="TaxDetails_70489_S_CUS_PNRDataFeed_132" name="mdTaxes" minOccurs="0" maxOccurs="60"/>
 *     &lt;xs:element type="Pasbcq1a044Group43_mcoDetails_90294_G_CUS_PNRDataFeed_132" name="mcoDetails" minOccurs="0"/>
 *     &lt;xs:element type="Pasbcq1a044Group43_svcDetails_90295_G_CUS_PNRDataFeed_132" name="svcDetails" minOccurs="0"/>
 *     &lt;xs:element type="Pasbcq1a044Group43_xsbDetails_90296_G_CUS_PNRDataFeed_132" name="xsbDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Pasbcq1a044Group4390293GCUSPNRDataFeed132
{
    private MiscellaneousDocument70482SCUSPNRDataFeed132 commonMd;
    private ReferenceInformation70486SCUSPNRDataFeed132 elemTattoo;
    private UserIdentification70490SCUSPNRDataFeed132 userInfo;
    private List<CodedAttribute70481SCUSPNRDataFeed132> elementDescriptionList = new ArrayList<CodedAttribute70481SCUSPNRDataFeed132>();
    private PricingTicketingSubsequent70485SCUSPNRDataFeed132 mdInfo;
    private StructuredDateTimeInformation70487SCUSPNRDataFeed132 creationDate;
    private TransportIdentifier70488SCUSPNRDataFeed132 validatingCarrier;
    private OriginAndDestinationDetails70484SCUSPNRDataFeed132 issuancePlace;
    private MonetaryInformation70483SCUSPNRDataFeed132 mdFares;
    private List<TaxDetails70489SCUSPNRDataFeed132> mdTaxeList = new ArrayList<TaxDetails70489SCUSPNRDataFeed132>();
    private Pasbcq1a044Group43McoDetails90294GCUSPNRDataFeed132 mcoDetails;
    private Pasbcq1a044Group43SvcDetails90295GCUSPNRDataFeed132 svcDetails;
    private Pasbcq1a044Group43XsbDetails90296GCUSPNRDataFeed132 xsbDetails;

    /** 
     * Get the 'commonMd' element value. Common Miscellaneous Document Data
     * 
     * @return value
     */
    public MiscellaneousDocument70482SCUSPNRDataFeed132 getCommonMd() {
        return commonMd;
    }

    /** 
     * Set the 'commonMd' element value. Common Miscellaneous Document Data
     * 
     * @param commonMd
     */
    public void setCommonMd(
            MiscellaneousDocument70482SCUSPNRDataFeed132 commonMd) {
        this.commonMd = commonMd;
    }

    /** 
     * Get the 'elemTattoo' element value. Conveys the links of the MD/TSM.
     * 
     * @return value
     */
    public ReferenceInformation70486SCUSPNRDataFeed132 getElemTattoo() {
        return elemTattoo;
    }

    /** 
     * Set the 'elemTattoo' element value. Conveys the links of the MD/TSM.
     * 
     * @param elemTattoo
     */
    public void setElemTattoo(
            ReferenceInformation70486SCUSPNRDataFeed132 elemTattoo) {
        this.elemTattoo = elemTattoo;
    }

    /** 
     * Get the 'userInfo' element value. MD user info: -Office name -Agent Id
     * 
     * @return value
     */
    public UserIdentification70490SCUSPNRDataFeed132 getUserInfo() {
        return userInfo;
    }

    /** 
     * Set the 'userInfo' element value. MD user info: -Office name -Agent Id
     * 
     * @param userInfo
     */
    public void setUserInfo(UserIdentification70490SCUSPNRDataFeed132 userInfo) {
        this.userInfo = userInfo;
    }

    /** 
     * Get the list of 'elementDescription' element items. Contains the accounting data and the type of service's description.
     * 
     * @return list
     */
    public List<CodedAttribute70481SCUSPNRDataFeed132> getElementDescriptionList() {
        return elementDescriptionList;
    }

    /** 
     * Set the list of 'elementDescription' element items. Contains the accounting data and the type of service's description.
     * 
     * @param list
     */
    public void setElementDescriptionList(
            List<CodedAttribute70481SCUSPNRDataFeed132> list) {
        elementDescriptionList = list;
    }

    /** 
     * Get the 'mdInfo' element value. Two types of info here: -MD number -MD type
     * 
     * @return value
     */
    public PricingTicketingSubsequent70485SCUSPNRDataFeed132 getMdInfo() {
        return mdInfo;
    }

    /** 
     * Set the 'mdInfo' element value. Two types of info here: -MD number -MD type
     * 
     * @param mdInfo
     */
    public void setMdInfo(
            PricingTicketingSubsequent70485SCUSPNRDataFeed132 mdInfo) {
        this.mdInfo = mdInfo;
    }

    /** 
     * Get the 'creationDate' element value. Creation date of MD element.
     * 
     * @return value
     */
    public StructuredDateTimeInformation70487SCUSPNRDataFeed132 getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'creationDate' element value. Creation date of MD element.
     * 
     * @param creationDate
     */
    public void setCreationDate(
            StructuredDateTimeInformation70487SCUSPNRDataFeed132 creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the 'validatingCarrier' element value. MD validating carrier.
     * 
     * @return value
     */
    public TransportIdentifier70488SCUSPNRDataFeed132 getValidatingCarrier() {
        return validatingCarrier;
    }

    /** 
     * Set the 'validatingCarrier' element value. MD validating carrier.
     * 
     * @param validatingCarrier
     */
    public void setValidatingCarrier(
            TransportIdentifier70488SCUSPNRDataFeed132 validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    /** 
     * Get the 'issuancePlace' element value. MD place of issuance.
     * 
     * @return value
     */
    public OriginAndDestinationDetails70484SCUSPNRDataFeed132 getIssuancePlace() {
        return issuancePlace;
    }

    /** 
     * Set the 'issuancePlace' element value. MD place of issuance.
     * 
     * @param issuancePlace
     */
    public void setIssuancePlace(
            OriginAndDestinationDetails70484SCUSPNRDataFeed132 issuancePlace) {
        this.issuancePlace = issuancePlace;
    }

    /** 
     * Get the 'mdFares' element value. MD common fares including: -Base fare -Equivalent fare -Total fare
     * 
     * @return value
     */
    public MonetaryInformation70483SCUSPNRDataFeed132 getMdFares() {
        return mdFares;
    }

    /** 
     * Set the 'mdFares' element value. MD common fares including: -Base fare -Equivalent fare -Total fare
     * 
     * @param mdFares
     */
    public void setMdFares(MonetaryInformation70483SCUSPNRDataFeed132 mdFares) {
        this.mdFares = mdFares;
    }

    /** 
     * Get the list of 'mdTaxes' element items. MD common taxes up to 32 (16 new + 16 refundables).
     * 
     * @return list
     */
    public List<TaxDetails70489SCUSPNRDataFeed132> getMdTaxeList() {
        return mdTaxeList;
    }

    /** 
     * Set the list of 'mdTaxes' element items. MD common taxes up to 32 (16 new + 16 refundables).
     * 
     * @param list
     */
    public void setMdTaxeList(List<TaxDetails70489SCUSPNRDataFeed132> list) {
        mdTaxeList = list;
    }

    /** 
     * Get the 'mcoDetails' element value. Conveys the MCO details.
     * 
     * @return value
     */
    public Pasbcq1a044Group43McoDetails90294GCUSPNRDataFeed132 getMcoDetails() {
        return mcoDetails;
    }

    /** 
     * Set the 'mcoDetails' element value. Conveys the MCO details.
     * 
     * @param mcoDetails
     */
    public void setMcoDetails(
            Pasbcq1a044Group43McoDetails90294GCUSPNRDataFeed132 mcoDetails) {
        this.mcoDetails = mcoDetails;
    }

    /** 
     * Get the 'svcDetails' element value. Conveys the SVC details.
     * 
     * @return value
     */
    public Pasbcq1a044Group43SvcDetails90295GCUSPNRDataFeed132 getSvcDetails() {
        return svcDetails;
    }

    /** 
     * Set the 'svcDetails' element value. Conveys the SVC details.
     * 
     * @param svcDetails
     */
    public void setSvcDetails(
            Pasbcq1a044Group43SvcDetails90295GCUSPNRDataFeed132 svcDetails) {
        this.svcDetails = svcDetails;
    }

    /** 
     * Get the 'xsbDetails' element value. Conveys the XSB details.
     * 
     * @return value
     */
    public Pasbcq1a044Group43XsbDetails90296GCUSPNRDataFeed132 getXsbDetails() {
        return xsbDetails;
    }

    /** 
     * Set the 'xsbDetails' element value. Conveys the XSB details.
     * 
     * @param xsbDetails
     */
    public void setXsbDetails(
            Pasbcq1a044Group43XsbDetails90296GCUSPNRDataFeed132 xsbDetails) {
        this.xsbDetails = xsbDetails;
    }
}
