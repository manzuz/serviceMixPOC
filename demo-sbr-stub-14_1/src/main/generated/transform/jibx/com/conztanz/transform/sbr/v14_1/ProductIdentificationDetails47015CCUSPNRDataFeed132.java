
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Code, number or name to identify a specific product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_47015_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="flightNumber"/>
 *     &lt;xs:element type="xs:string" name="bookingClass"/>
 *     &lt;xs:element type="xs:string" name="operationalSuffix" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails47015CCUSPNRDataFeed132
{
    private BigDecimal flightNumber;
    private String bookingClass;
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
     * Get the 'bookingClass' element value.
     * 
     * @return value
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /** 
     * Set the 'bookingClass' element value.
     * 
     * @param bookingClass
     */
    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
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
