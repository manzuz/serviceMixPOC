
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PqrData_documentDetailsGroup_139964_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_79012_S_CUS_PNRDataFeed_132" name="totalFare"/>
 *     &lt;xs:element type="MonetaryInformation_79012_S_CUS_PNRDataFeed_132" name="otherFares" minOccurs="0" maxOccurs="7"/>
 *     &lt;xs:element type="TaxDetails_79017_S_CUS_PNRDataFeed_132" name="taxInformation" minOccurs="0" maxOccurs="198"/>
 *     &lt;xs:element type="PricingTicketingDetails_79013_S_CUS_PNRDataFeed_132" name="issueIdentifier"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_79034_S_CUS_PNRDataFeed_132" name="originDestination" minOccurs="0"/>
 *     &lt;xs:element type="Attribute_79011_S_CUS_PNRDataFeed_132" name="rfics" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="StatusDetails_79015_S_CUS_PNRDataFeed_132" name="manualIndicator"/>
 *     &lt;xs:element type="StatusDetails_120706_S_CUS_PNRDataFeed_132" name="flags" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="CodedAttribute_79010_S_CUS_PNRDataFeed_132" name="generalIndicators" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="FreeTextInformation_124048_S_CUS_PNRDataFeed_132" name="fareCalcRemarks" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="UserIdentification_79019_S_CUS_PNRDataFeed_132" name="officeInformation"/>
 *     &lt;xs:element type="Negodata_98382_G_CUS_PNRDataFeed_132" name="negoDetails" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_79014_S_CUS_PNRDataFeed_132" name="creationDate"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_79014_S_CUS_PNRDataFeed_132" name="otherDates" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="Atcdata_98381_G_CUS_PNRDataFeed_132" name="atcFares" minOccurs="0"/>
 *     &lt;xs:element type="ObFeesGroup_98670_G_CUS_PNRDataFeed_132" name="airlineServiceFeeGroup" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="PqrData_documentDetailsGroup_couponDetailsGroup_139965_G_CUS_PNRDataFeed_132" name="couponDetailsGroup" maxOccurs="28"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PqrDataDocumentDetailsGroup139964GCUSPNRDataFeed132
{
    private MonetaryInformation79012SCUSPNRDataFeed132 totalFare;
    private List<MonetaryInformation79012SCUSPNRDataFeed132> otherFareList = new ArrayList<MonetaryInformation79012SCUSPNRDataFeed132>();
    private List<TaxDetails79017SCUSPNRDataFeed132> taxInformationList = new ArrayList<TaxDetails79017SCUSPNRDataFeed132>();
    private PricingTicketingDetails79013SCUSPNRDataFeed132 issueIdentifier;
    private OriginAndDestinationDetails79034SCUSPNRDataFeed132 originDestination;
    private List<Attribute79011SCUSPNRDataFeed132> rficList = new ArrayList<Attribute79011SCUSPNRDataFeed132>();
    private StatusDetails79015SCUSPNRDataFeed132 manualIndicator;
    private List<StatusDetails120706SCUSPNRDataFeed132> flagList = new ArrayList<StatusDetails120706SCUSPNRDataFeed132>();
    private List<CodedAttribute79010SCUSPNRDataFeed132> generalIndicatorList = new ArrayList<CodedAttribute79010SCUSPNRDataFeed132>();
    private List<FreeTextInformation124048SCUSPNRDataFeed132> fareCalcRemarkList = new ArrayList<FreeTextInformation124048SCUSPNRDataFeed132>();
    private UserIdentification79019SCUSPNRDataFeed132 officeInformation;
    private Negodata98382GCUSPNRDataFeed132 negoDetails;
    private StructuredDateTimeInformation79014SCUSPNRDataFeed132 creationDate;
    private List<StructuredDateTimeInformation79014SCUSPNRDataFeed132> otherDateList = new ArrayList<StructuredDateTimeInformation79014SCUSPNRDataFeed132>();
    private Atcdata98381GCUSPNRDataFeed132 atcFares;
    private List<ObFeesGroup98670GCUSPNRDataFeed132> airlineServiceFeeGroupList = new ArrayList<ObFeesGroup98670GCUSPNRDataFeed132>();
    private List<PqrDataDocumentDetailsGroupCouponDetailsGroup139965GCUSPNRDataFeed132> couponDetailsGroupList = new ArrayList<PqrDataDocumentDetailsGroupCouponDetailsGroup139965GCUSPNRDataFeed132>();

    /** 
     * Get the 'totalFare' element value. Document Total Fare (T)
     * 
     * @return value
     */
    public MonetaryInformation79012SCUSPNRDataFeed132 getTotalFare() {
        return totalFare;
    }

    /** 
     * Set the 'totalFare' element value. Document Total Fare (T)
     * 
     * @param totalFare
     */
    public void setTotalFare(
            MonetaryInformation79012SCUSPNRDataFeed132 totalFare) {
        this.totalFare = totalFare;
    }

    /** 
     * Get the list of 'otherFares' element items. Document General Fares + Banker Rates:  FOR TSM: - Base fare (B) - Net fare (H) - Equivalent amount (E) - Refundable amount (N) - Exchange value fare (X) - Banker Exchange Rate  (D1)  FOR TST: (General Fares) - Base fare + issue identifier (F/R/I/Y/U/W) - Net fare (H) - Equivalent amount (E) - Grand Total (GT) - Banker Selling Rate 1 (D1) - Banker Selling Rate 2 (D2)
     * 
     * @return list
     */
    public List<MonetaryInformation79012SCUSPNRDataFeed132> getOtherFareList() {
        return otherFareList;
    }

    /** 
     * Set the list of 'otherFares' element items. Document General Fares + Banker Rates:  FOR TSM: - Base fare (B) - Net fare (H) - Equivalent amount (E) - Refundable amount (N) - Exchange value fare (X) - Banker Exchange Rate  (D1)  FOR TST: (General Fares) - Base fare + issue identifier (F/R/I/Y/U/W) - Net fare (H) - Equivalent amount (E) - Grand Total (GT) - Banker Selling Rate 1 (D1) - Banker Selling Rate 2 (D2)
     * 
     * @param list
     */
    public void setOtherFareList(
            List<MonetaryInformation79012SCUSPNRDataFeed132> list) {
        otherFareList = list;
    }

    /** 
     * Get the list of 'taxInformation' element items. Details of taxes:  - old/new/refundable (O/X/R) taxes indicator - currency - tax amount - iso tax code - nature tax code We can have 198 taxes maximum: - 99 old and new - + 99 refundable
     * 
     * @return list
     */
    public List<TaxDetails79017SCUSPNRDataFeed132> getTaxInformationList() {
        return taxInformationList;
    }

    /** 
     * Set the list of 'taxInformation' element items. Details of taxes:  - old/new/refundable (O/X/R) taxes indicator - currency - tax amount - iso tax code - nature tax code We can have 198 taxes maximum: - 99 old and new - + 99 refundable
     * 
     * @param list
     */
    public void setTaxInformationList(
            List<TaxDetails79017SCUSPNRDataFeed132> list) {
        taxInformationList = list;
    }

    /** 
     * Get the 'issueIdentifier' element value. Pricing Record Issue Identifier: F First issue I First issue IT R Re-issue U First issue BT W Re-issue BT Y Re-issue IT
     * 
     * @return value
     */
    public PricingTicketingDetails79013SCUSPNRDataFeed132 getIssueIdentifier() {
        return issueIdentifier;
    }

    /** 
     * Set the 'issueIdentifier' element value. Pricing Record Issue Identifier: F First issue I First issue IT R Re-issue U First issue BT W Re-issue BT Y Re-issue IT
     * 
     * @param issueIdentifier
     */
    public void setIssueIdentifier(
            PricingTicketingDetails79013SCUSPNRDataFeed132 issueIdentifier) {
        this.issueIdentifier = issueIdentifier;
    }

    /** 
     * Get the 'originDestination' element value. originDestination
     * 
     * @return value
     */
    public OriginAndDestinationDetails79034SCUSPNRDataFeed132 getOriginDestination() {
        return originDestination;
    }

    /** 
     * Set the 'originDestination' element value. originDestination
     * 
     * @param originDestination
     */
    public void setOriginDestination(
            OriginAndDestinationDetails79034SCUSPNRDataFeed132 originDestination) {
        this.originDestination = originDestination;
    }

    /** 
     * Get the list of 'rfics' element items. Reason For Issuance Codes (RFIC) and their descriptions: - electronic RFIC [qualifier=E] - Paper MCO RFIC [qualifier=P] - IATA RFIC (for eMCO) [qualifier=I]
     * 
     * @return list
     */
    public List<Attribute79011SCUSPNRDataFeed132> getRficList() {
        return rficList;
    }

    /** 
     * Set the list of 'rfics' element items. Reason For Issuance Codes (RFIC) and their descriptions: - electronic RFIC [qualifier=E] - Paper MCO RFIC [qualifier=P] - IATA RFIC (for eMCO) [qualifier=I]
     * 
     * @param list
     */
    public void setRficList(List<Attribute79011SCUSPNRDataFeed132> list) {
        rficList = list;
    }

    /** 
     * Get the 'manualIndicator' element value. Manual indicator (MAN): 0: automatic 1: manual
     * 
     * @return value
     */
    public StatusDetails79015SCUSPNRDataFeed132 getManualIndicator() {
        return manualIndicator;
    }

    /** 
     * Set the 'manualIndicator' element value. Manual indicator (MAN): 0: automatic 1: manual
     * 
     * @param manualIndicator
     */
    public void setManualIndicator(
            StatusDetails79015SCUSPNRDataFeed132 manualIndicator) {
        this.manualIndicator = manualIndicator;
    }

    /** 
     * Get the list of 'flags' element items. - Change flag (CHF) - TSM issued indicator (ISD) - Confidential indicator (CNF) - Miles override indicator (MOV) - Negotiated fare indicator (NEG) - Issuance Required (IRQ)  Defined by a boolean: 1: Yes 0: False
     * 
     * @return list
     */
    public List<StatusDetails120706SCUSPNRDataFeed132> getFlagList() {
        return flagList;
    }

    /** 
     * Set the list of 'flags' element items. - Change flag (CHF) - TSM issued indicator (ISD) - Confidential indicator (CNF) - Miles override indicator (MOV) - Negotiated fare indicator (NEG) - Issuance Required (IRQ)  Defined by a boolean: 1: Yes 0: False
     * 
     * @param list
     */
    public void setFlagList(List<StatusDetails120706SCUSPNRDataFeed132> list) {
        flagList = list;
    }

    /** 
     * Get the list of 'generalIndicators' element items. - EMD type (key=EMD): standalone (S) or associated (A) - FCPI (key = FCP) - FCRI (key = FCR) USED ONLY FOR TST: - FCMI (key = FCM) - Ticket Type (key=TT): paper ("P") or electronic ("E")
     * 
     * @return list
     */
    public List<CodedAttribute79010SCUSPNRDataFeed132> getGeneralIndicatorList() {
        return generalIndicatorList;
    }

    /** 
     * Set the list of 'generalIndicators' element items. - EMD type (key=EMD): standalone (S) or associated (A) - FCPI (key = FCP) - FCRI (key = FCR) USED ONLY FOR TST: - FCMI (key = FCM) - Ticket Type (key=TT): paper ("P") or electronic ("E")
     * 
     * @param list
     */
    public void setGeneralIndicatorList(
            List<CodedAttribute79010SCUSPNRDataFeed132> list) {
        generalIndicatorList = list;
    }

    /** 
     * Get the list of 'fareCalcRemarks' element items. FOR TSM: - Document remarks (RMK) - Reason for waiving (RFW) - Fare calc (FCL) FOR TST: - Payment restrictions (PAY) - Fare calc (FCL)
     * 
     * @return list
     */
    public List<FreeTextInformation124048SCUSPNRDataFeed132> getFareCalcRemarkList() {
        return fareCalcRemarkList;
    }

    /** 
     * Set the list of 'fareCalcRemarks' element items. FOR TSM: - Document remarks (RMK) - Reason for waiving (RFW) - Fare calc (FCL) FOR TST: - Payment restrictions (PAY) - Fare calc (FCL)
     * 
     * @param list
     */
    public void setFareCalcRemarkList(
            List<FreeTextInformation124048SCUSPNRDataFeed132> list) {
        fareCalcRemarkList = list;
    }

    /** 
     * Get the 'officeInformation' element value. Office Information about the creator of the document: - agent sign - office name - office AMID (FOR TST ONLY)
     * 
     * @return value
     */
    public UserIdentification79019SCUSPNRDataFeed132 getOfficeInformation() {
        return officeInformation;
    }

    /** 
     * Set the 'officeInformation' element value. Office Information about the creator of the document: - agent sign - office name - office AMID (FOR TST ONLY)
     * 
     * @param officeInformation
     */
    public void setOfficeInformation(
            UserIdentification79019SCUSPNRDataFeed132 officeInformation) {
        this.officeInformation = officeInformation;
    }

    /** 
     * Get the 'negoDetails' element value. Groups Tst Nego Information: - Nego Fares (Selling, Published, Net Negociated Fare) - Scheme Indicator (A, B, C, F, I, N) - Commission Details  - Supplementary Commission Details - Tour Code - Commercial Agreement Reference - Value Code
     * 
     * @return value
     */
    public Negodata98382GCUSPNRDataFeed132 getNegoDetails() {
        return negoDetails;
    }

    /** 
     * Set the 'negoDetails' element value. Groups Tst Nego Information: - Nego Fares (Selling, Published, Net Negociated Fare) - Scheme Indicator (A, B, C, F, I, N) - Commission Details  - Supplementary Commission Details - Tour Code - Commercial Agreement Reference - Value Code
     * 
     * @param negoDetails
     */
    public void setNegoDetails(Negodata98382GCUSPNRDataFeed132 negoDetails) {
        this.negoDetails = negoDetails;
    }

    /** 
     * Get the 'creationDate' element value. Document creation date
     * 
     * @return value
     */
    public StructuredDateTimeInformation79014SCUSPNRDataFeed132 getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'creationDate' element value. Document creation date
     * 
     * @param creationDate
     */
    public void setCreationDate(
            StructuredDateTimeInformation79014SCUSPNRDataFeed132 creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the list of 'otherDates' element items. Document Additional dates (FOR TST): - pricing date (PD) - last ticketing date (LT)
     * 
     * @return list
     */
    public List<StructuredDateTimeInformation79014SCUSPNRDataFeed132> getOtherDateList() {
        return otherDateList;
    }

    /** 
     * Set the list of 'otherDates' element items. Document Additional dates (FOR TST): - pricing date (PD) - last ticketing date (LT)
     * 
     * @param list
     */
    public void setOtherDateList(
            List<StructuredDateTimeInformation79014SCUSPNRDataFeed132> list) {
        otherDateList = list;
    }

    /** 
     * Get the 'atcFares' element value. ATC Info from TQR record: - Total Additional Collection (TAC)  - Base Fare Balance (BEQ) - New Base Fare (BNF) - Old Base Fare (IBA) - Penalty (DPI) - Grand Total (GT) - Residual Value (RES) - TST Additional Collection (TST) - Tax Balance (BTA) - Ticket Difference (BTO)
     * 
     * @return value
     */
    public Atcdata98381GCUSPNRDataFeed132 getAtcFares() {
        return atcFares;
    }

    /** 
     * Set the 'atcFares' element value. ATC Info from TQR record: - Total Additional Collection (TAC)  - Base Fare Balance (BEQ) - New Base Fare (BNF) - Old Base Fare (IBA) - Penalty (DPI) - Grand Total (GT) - Residual Value (RES) - TST Additional Collection (TST) - Tax Balance (BTA) - Ticket Difference (BTO)
     * 
     * @param atcFares
     */
    public void setAtcFares(Atcdata98381GCUSPNRDataFeed132 atcFares) {
        this.atcFares = atcFares;
    }

    /** 
     * Get the list of 'airlineServiceFeeGroup' element items. OB fees Group
     * 
     * @return list
     */
    public List<ObFeesGroup98670GCUSPNRDataFeed132> getAirlineServiceFeeGroupList() {
        return airlineServiceFeeGroupList;
    }

    /** 
     * Set the list of 'airlineServiceFeeGroup' element items. OB fees Group
     * 
     * @param list
     */
    public void setAirlineServiceFeeGroupList(
            List<ObFeesGroup98670GCUSPNRDataFeed132> list) {
        airlineServiceFeeGroupList = list;
    }

    /** 
     * Get the list of 'couponDetailsGroup' element items. Coupons of the Document
     * 
     * @return list
     */
    public List<PqrDataDocumentDetailsGroupCouponDetailsGroup139965GCUSPNRDataFeed132> getCouponDetailsGroupList() {
        return couponDetailsGroupList;
    }

    /** 
     * Set the list of 'couponDetailsGroup' element items. Coupons of the Document
     * 
     * @param list
     */
    public void setCouponDetailsGroupList(
            List<PqrDataDocumentDetailsGroupCouponDetailsGroup139965GCUSPNRDataFeed132> list) {
        couponDetailsGroupList = list;
    }
}
