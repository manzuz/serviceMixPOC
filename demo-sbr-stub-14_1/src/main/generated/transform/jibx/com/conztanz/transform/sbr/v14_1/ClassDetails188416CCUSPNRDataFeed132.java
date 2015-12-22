
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ClassDetails_188416_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="bookingClass" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberOfSeats" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ClassDetails188416CCUSPNRDataFeed132
{
    private String code;
    private String bookingClass;
    private BigDecimal numberOfSeats;

    /** 
     * Get the 'code' element value. Class Group : A-First Class, Seat B-Second Class, Seat C-First Class, Berth D-Second Class, Berth F-Binded Seat V-First Class, Sleeping-car W-Second Class, Sleeping-car
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Class Group : A-First Class, Seat B-Second Class, Seat C-First Class, Berth D-Second Class, Berth F-Binded Seat V-First Class, Sleeping-car W-Second Class, Sleeping-car
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'bookingClass' element value. Rail class code.
     * 
     * @return value
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /** 
     * Set the 'bookingClass' element value. Rail class code.
     * 
     * @param bookingClass
     */
    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    /** 
     * Get the 'numberOfSeats' element value. Number of Free Seats
     * 
     * @return value
     */
    public BigDecimal getNumberOfSeats() {
        return numberOfSeats;
    }

    /** 
     * Set the 'numberOfSeats' element value. Number of Free Seats
     * 
     * @param numberOfSeats
     */
    public void setNumberOfSeats(BigDecimal numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
