
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_83036_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_126847_C_CUS_PNRDataFeed_132" name="priceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation83036SCUSPNRDataFeed132
{
    private TariffInformation126847CCUSPNRDataFeed132 priceDetails;

    /** 
     * Get the 'priceDetails' element value. This composite gives details about the monetary amounts and their usage.
     * 
     * @return value
     */
    public TariffInformation126847CCUSPNRDataFeed132 getPriceDetails() {
        return priceDetails;
    }

    /** 
     * Set the 'priceDetails' element value. This composite gives details about the monetary amounts and their usage.
     * 
     * @param priceDetails
     */
    public void setPriceDetails(
            TariffInformation126847CCUSPNRDataFeed132 priceDetails) {
        this.priceDetails = priceDetails;
    }
}
