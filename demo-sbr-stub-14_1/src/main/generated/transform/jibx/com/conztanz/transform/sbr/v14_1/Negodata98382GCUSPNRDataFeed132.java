
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Map TST Nego information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Negodata_98382_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PricingTicketingDetails_79032_S_CUS_PNRDataFeed_132" name="schemeIndicator"/>
 *     &lt;xs:element type="MonetaryInformation_79031_S_CUS_PNRDataFeed_132" name="negoSellingFare"/>
 *     &lt;xs:element type="MonetaryInformation_79031_S_CUS_PNRDataFeed_132" name="negoOtherFares" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="CommissionInformation_79030_S_CUS_PNRDataFeed_132" name="commissionInformation" minOccurs="0"/>
 *     &lt;xs:element type="TourInformation_79029_S_CUS_PNRDataFeed_132" name="tourInformation" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_79033_S_CUS_PNRDataFeed_132" name="negoReferences" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Negodata98382GCUSPNRDataFeed132
{
    private PricingTicketingDetails79032SCUSPNRDataFeed132 schemeIndicator;
    private MonetaryInformation79031SCUSPNRDataFeed132 negoSellingFare;
    private List<MonetaryInformation79031SCUSPNRDataFeed132> negoOtherFareList = new ArrayList<MonetaryInformation79031SCUSPNRDataFeed132>();
    private CommissionInformation79030SCUSPNRDataFeed132 commissionInformation;
    private TourInformation79029SCUSPNRDataFeed132 tourInformation;
    private List<ReferenceInformation79033SCUSPNRDataFeed132> negoReferenceList = new ArrayList<ReferenceInformation79033SCUSPNRDataFeed132>();

    /** 
     * Get the 'schemeIndicator' element value. Indicates the Incentive Scheme to apply for TST Nego. I : IT transaction B : BT transaction A : IT with NR flag C : BT with NR flag N : Net Remit transaction F : Flexible Commission
     * 
     * @return value
     */
    public PricingTicketingDetails79032SCUSPNRDataFeed132 getSchemeIndicator() {
        return schemeIndicator;
    }

    /** 
     * Set the 'schemeIndicator' element value. Indicates the Incentive Scheme to apply for TST Nego. I : IT transaction B : BT transaction A : IT with NR flag C : BT with NR flag N : Net Remit transaction F : Flexible Commission
     * 
     * @param schemeIndicator
     */
    public void setSchemeIndicator(
            PricingTicketingDetails79032SCUSPNRDataFeed132 schemeIndicator) {
        this.schemeIndicator = schemeIndicator;
    }

    /** 
     * Get the 'negoSellingFare' element value. TST Nego Selling Fare (S)
     * 
     * @return value
     */
    public MonetaryInformation79031SCUSPNRDataFeed132 getNegoSellingFare() {
        return negoSellingFare;
    }

    /** 
     * Set the 'negoSellingFare' element value. TST Nego Selling Fare (S)
     * 
     * @param negoSellingFare
     */
    public void setNegoSellingFare(
            MonetaryInformation79031SCUSPNRDataFeed132 negoSellingFare) {
        this.negoSellingFare = negoSellingFare;
    }

    /** 
     * Get the list of 'negoOtherFares' element items. TST Nego other fares: - Published Fare (P) - Net Negociated Fare (N)
     * 
     * @return list
     */
    public List<MonetaryInformation79031SCUSPNRDataFeed132> getNegoOtherFareList() {
        return negoOtherFareList;
    }

    /** 
     * Set the list of 'negoOtherFares' element items. TST Nego other fares: - Published Fare (P) - Net Negociated Fare (N)
     * 
     * @param list
     */
    public void setNegoOtherFareList(
            List<MonetaryInformation79031SCUSPNRDataFeed132> list) {
        negoOtherFareList = list;
    }

    /** 
     * Get the 'commissionInformation' element value. Commission Details 1rst Mandatory Composite: - Commission Value - Commission Indicator 2rst Conditional Composite: - Supplementary Commission Value - Supplementary Commission Indicator
     * 
     * @return value
     */
    public CommissionInformation79030SCUSPNRDataFeed132 getCommissionInformation() {
        return commissionInformation;
    }

    /** 
     * Set the 'commissionInformation' element value. Commission Details 1rst Mandatory Composite: - Commission Value - Commission Indicator 2rst Conditional Composite: - Supplementary Commission Value - Supplementary Commission Indicator
     * 
     * @param commissionInformation
     */
    public void setCommissionInformation(
            CommissionInformation79030SCUSPNRDataFeed132 commissionInformation) {
        this.commissionInformation = commissionInformation;
    }

    /** 
     * Get the 'tourInformation' element value. Tour Information: - Tour Code
     * 
     * @return value
     */
    public TourInformation79029SCUSPNRDataFeed132 getTourInformation() {
        return tourInformation;
    }

    /** 
     * Set the 'tourInformation' element value. Tour Information: - Tour Code
     * 
     * @param tourInformation
     */
    public void setTourInformation(
            TourInformation79029SCUSPNRDataFeed132 tourInformation) {
        this.tourInformation = tourInformation;
    }

    /** 
     * Get the list of 'negoReferences' element items. negoReferences: - C.A.R (CAR): contains a Commercial Agreement Reference related to the scheme indicator - Net Remit Scheme (NRS): Value code used for Remit Scheme
     * 
     * @return list
     */
    public List<ReferenceInformation79033SCUSPNRDataFeed132> getNegoReferenceList() {
        return negoReferenceList;
    }

    /** 
     * Set the list of 'negoReferences' element items. negoReferences: - C.A.R (CAR): contains a Commercial Agreement Reference related to the scheme indicator - Net Remit Scheme (NRS): Value code used for Remit Scheme
     * 
     * @param list
     */
    public void setNegoReferenceList(
            List<ReferenceInformation79033SCUSPNRDataFeed132> list) {
        negoReferenceList = list;
    }
}
