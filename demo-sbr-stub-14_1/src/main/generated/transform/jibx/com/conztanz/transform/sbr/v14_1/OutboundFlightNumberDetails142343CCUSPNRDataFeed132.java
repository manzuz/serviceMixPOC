
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the flight number and operational suffix of the outbound flight.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OutboundFlightNumberDetails_142343_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="flightNumber"/>
 *     &lt;xs:element type="xs:string" name="operationalSuffix" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OutboundFlightNumberDetails142343CCUSPNRDataFeed132
{
    private BigDecimal flightNumber;
    private String operationalSuffix;

    /** 
     * Get the 'flightNumber' element value.
     * 
     * @return value
     */
    public BigDecimal getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'flightNumber' element value.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(BigDecimal flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'operationalSuffix' element value.
     * 
     * @return value
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /** 
     * Set the 'operationalSuffix' element value.
     * 
     * @param operationalSuffix
     */
    public void setOperationalSuffix(String operationalSuffix) {
        this.operationalSuffix = operationalSuffix;
    }
}
