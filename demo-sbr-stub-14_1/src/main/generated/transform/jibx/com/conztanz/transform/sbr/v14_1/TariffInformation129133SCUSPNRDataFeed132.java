
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_129133_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_188166_C_CUS_PNRDataFeed_132" name="priceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation129133SCUSPNRDataFeed132
{
    private TariffInformation188166CCUSPNRDataFeed132 priceDetails;

    /** 
     * Get the 'priceDetails' element value.
     * 
     * @return value
     */
    public TariffInformation188166CCUSPNRDataFeed132 getPriceDetails() {
        return priceDetails;
    }

    /** 
     * Set the 'priceDetails' element value.
     * 
     * @param priceDetails
     */
    public void setPriceDetails(
            TariffInformation188166CCUSPNRDataFeed132 priceDetails) {
        this.priceDetails = priceDetails;
    }
}
