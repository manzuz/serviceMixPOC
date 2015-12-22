
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code, number or name to identify a specific product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_122339_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="flightNumber"/>
 *     &lt;xs:element type="xs:string" name="bookingClass"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails122339CCUSPNRDataFeed132
{
    private String flightNumber;
    private String bookingClass;

    /** 
     * Get the 'flightNumber' element value. Number of the flight
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'flightNumber' element value. Number of the flight
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'bookingClass' element value. Booking class
     * 
     * @return value
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /** 
     * Set the 'bookingClass' element value. Booking class
     * 
     * @param bookingClass
     */
    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }
}
