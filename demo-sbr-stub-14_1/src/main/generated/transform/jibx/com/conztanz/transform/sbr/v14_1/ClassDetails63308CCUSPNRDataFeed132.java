
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ClassDetails_63308_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="bookingClass" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ClassDetails63308CCUSPNRDataFeed132
{
    private String code;
    private String bookingClass;

    /** 
     * Get the 'code' element value. For the booking class code.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. For the booking class code.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
}
