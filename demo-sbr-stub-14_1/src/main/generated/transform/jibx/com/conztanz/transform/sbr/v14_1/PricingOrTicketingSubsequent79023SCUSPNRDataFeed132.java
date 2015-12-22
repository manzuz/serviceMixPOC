
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey additional information related to a ticket
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingOrTicketingSubsequent_79023_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RateTariffClassInformation_121369_C_CUS_PNRDataFeed_132" name="fareBasisDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingOrTicketingSubsequent79023SCUSPNRDataFeed132
{
    private RateTariffClassInformation121369CCUSPNRDataFeed132 fareBasisDetails;

    /** 
     * Get the 'fareBasisDetails' element value. RATE OR TARIFF CLASS INFORMATION
     * 
     * @return value
     */
    public RateTariffClassInformation121369CCUSPNRDataFeed132 getFareBasisDetails() {
        return fareBasisDetails;
    }

    /** 
     * Set the 'fareBasisDetails' element value. RATE OR TARIFF CLASS INFORMATION
     * 
     * @param fareBasisDetails
     */
    public void setFareBasisDetails(
            RateTariffClassInformation121369CCUSPNRDataFeed132 fareBasisDetails) {
        this.fareBasisDetails = fareBasisDetails;
    }
}
