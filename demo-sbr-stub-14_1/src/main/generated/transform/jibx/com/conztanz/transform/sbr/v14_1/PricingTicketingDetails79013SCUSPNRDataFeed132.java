
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey pricing and date information related to a ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingTicketingDetails_79013_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PricingTicketingInformation_121354_C_CUS_PNRDataFeed_132" name="priceTicketDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="priceTariffType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingTicketingDetails79013SCUSPNRDataFeed132
{
    private PricingTicketingInformation121354CCUSPNRDataFeed132 priceTicketDetails;
    private String priceTariffType;

    /** 
     * Get the 'priceTicketDetails' element value. international indicator
     * 
     * @return value
     */
    public PricingTicketingInformation121354CCUSPNRDataFeed132 getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /** 
     * Set the 'priceTicketDetails' element value. international indicator
     * 
     * @param priceTicketDetails
     */
    public void setPriceTicketDetails(
            PricingTicketingInformation121354CCUSPNRDataFeed132 priceTicketDetails) {
        this.priceTicketDetails = priceTicketDetails;
    }

    /** 
     * Get the 'priceTariffType' element value. Issue indicator (F, R , IT..)
     * 
     * @return value
     */
    public String getPriceTariffType() {
        return priceTariffType;
    }

    /** 
     * Set the 'priceTariffType' element value. Issue indicator (F, R , IT..)
     * 
     * @param priceTariffType
     */
    public void setPriceTariffType(String priceTariffType) {
        this.priceTariffType = priceTariffType;
    }
}
