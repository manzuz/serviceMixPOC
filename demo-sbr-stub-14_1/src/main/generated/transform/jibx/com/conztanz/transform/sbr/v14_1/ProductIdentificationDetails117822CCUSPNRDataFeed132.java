
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code, number or name to identify a specific product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_117822_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="flightNumber"/>
 *     &lt;xs:element type="xs:string" name="bookingClass" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="operationalSuffix" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails117822CCUSPNRDataFeed132
{
    private String flightNumber;
    private String bookingClass;
    private String operationalSuffix;

    /** 
     * Get the 'flightNumber' element value. the flight number of the booking
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'flightNumber' element value. the flight number of the booking
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'bookingClass' element value. The booking class of service
     * 
     * @return value
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /** 
     * Set the 'bookingClass' element value. The booking class of service
     * 
     * @param bookingClass
     */
    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    /** 
     * Get the 'operationalSuffix' element value. The operational suffix that can be appended to the flight number
     * 
     * @return value
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /** 
     * Set the 'operationalSuffix' element value. The operational suffix that can be appended to the flight number
     * 
     * @param operationalSuffix
     */
    public void setOperationalSuffix(String operationalSuffix) {
        this.operationalSuffix = operationalSuffix;
    }
}
