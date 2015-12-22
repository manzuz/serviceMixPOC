
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_129125_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_188150_C_CUS_PNRDataFeed_132" name="priceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation129125SCUSPNRDataFeed132
{
    private TariffInformation188150CCUSPNRDataFeed132 priceDetails;

    /** 
     * Get the 'priceDetails' element value.
     * 
     * @return value
     */
    public TariffInformation188150CCUSPNRDataFeed132 getPriceDetails() {
        return priceDetails;
    }

    /** 
     * Set the 'priceDetails' element value.
     * 
     * @param priceDetails
     */
    public void setPriceDetails(
            TariffInformation188150CCUSPNRDataFeed132 priceDetails) {
        this.priceDetails = priceDetails;
    }
}
