
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_79024_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductTypeDetails_121372_C_CUS_PNRDataFeed_132" name="flightTypeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation79024SCUSPNRDataFeed132
{
    private ProductTypeDetails121372CCUSPNRDataFeed132 flightTypeDetails;

    /** 
     * Get the 'flightTypeDetails' element value. TST Flight Connection Type: - X - O
     * 
     * @return value
     */
    public ProductTypeDetails121372CCUSPNRDataFeed132 getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /** 
     * Set the 'flightTypeDetails' element value. TST Flight Connection Type: - X - O
     * 
     * @param flightTypeDetails
     */
    public void setFlightTypeDetails(
            ProductTypeDetails121372CCUSPNRDataFeed132 flightTypeDetails) {
        this.flightTypeDetails = flightTypeDetails;
    }
}
