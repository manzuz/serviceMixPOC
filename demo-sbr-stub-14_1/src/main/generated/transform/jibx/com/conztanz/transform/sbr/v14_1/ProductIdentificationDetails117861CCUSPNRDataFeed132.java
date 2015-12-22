
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code, number or name to identify a specific product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_117861_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="flightNumber"/>
 *     &lt;xs:element type="xs:string" name="operationalSuffix" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails117861CCUSPNRDataFeed132
{
    private String flightNumber;
    private String operationalSuffix;

    /** 
     * Get the 'flightNumber' element value. onward flight number
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'flightNumber' element value. onward flight number
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'operationalSuffix' element value. onward flight suffix
     * 
     * @return value
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /** 
     * Set the 'operationalSuffix' element value. onward flight suffix
     * 
     * @param operationalSuffix
     */
    public void setOperationalSuffix(String operationalSuffix) {
        this.operationalSuffix = operationalSuffix;
    }
}
