
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify additional characteristics of a product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductTypeDetails_47016_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="flightIndicator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductTypeDetails47016CCUSPNRDataFeed132
{
    private String flightIndicator;

    /** 
     * Get the 'flightIndicator' element value.
     * 
     * @return value
     */
    public String getFlightIndicator() {
        return flightIndicator;
    }

    /** 
     * Set the 'flightIndicator' element value.
     * 
     * @param flightIndicator
     */
    public void setFlightIndicator(String flightIndicator) {
        this.flightIndicator = flightIndicator;
    }
}
