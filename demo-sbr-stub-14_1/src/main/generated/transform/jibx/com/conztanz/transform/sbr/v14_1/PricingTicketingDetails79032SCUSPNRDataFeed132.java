
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey pricing and date information related to a ticket.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingTicketingDetails_79032_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PricingTicketingInformation_121387_C_CUS_PNRDataFeed_132" name="priceTicketDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingTicketingDetails79032SCUSPNRDataFeed132
{
    private PricingTicketingInformation121387CCUSPNRDataFeed132 priceTicketDetails;

    /** 
     * Get the 'priceTicketDetails' element value. Scheme Indicator (for TST NEGO)
     * 
     * @return value
     */
    public PricingTicketingInformation121387CCUSPNRDataFeed132 getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /** 
     * Set the 'priceTicketDetails' element value. Scheme Indicator (for TST NEGO)
     * 
     * @param priceTicketDetails
     */
    public void setPriceTicketDetails(
            PricingTicketingInformation121387CCUSPNRDataFeed132 priceTicketDetails) {
        this.priceTicketDetails = priceTicketDetails;
    }
}
