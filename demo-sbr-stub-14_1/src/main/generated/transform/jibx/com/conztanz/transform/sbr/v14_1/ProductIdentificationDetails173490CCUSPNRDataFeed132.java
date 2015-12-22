
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Code, number or name to identify a specific product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_173490_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="flightNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="bookingClass" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="operationalSuffix" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="modifier" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails173490CCUSPNRDataFeed132
{
    private String flightNumber;
    private String bookingClass;
    private String operationalSuffix;
    private List<String> modifierList = new ArrayList<String>();

    /** 
     * Get the 'flightNumber' element value.
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'flightNumber' element value.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
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

    /** 
     * Get the list of 'modifier' element items.
     * 
     * @return list
     */
    public List<String> getModifierList() {
        return modifierList;
    }

    /** 
     * Set the list of 'modifier' element items.
     * 
     * @param list
     */
    public void setModifierList(List<String> list) {
        modifierList = list;
    }
}
