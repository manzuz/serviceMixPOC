
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the dates and times associated with a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDateTime_122341_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="departureDate"/>
 *     &lt;xs:element type="xs:string" name="departureTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrivalTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDateTime122341CCUSPNRDataFeed132
{
    private String departureDate;
    private String departureTime;
    private String arrivalTime;

    /** 
     * Get the 'departureDate' element value. Date of departure
     * 
     * @return value
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'departureDate' element value. Date of departure
     * 
     * @param departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /** 
     * Get the 'departureTime' element value. Departure Time
     * 
     * @return value
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /** 
     * Set the 'departureTime' element value. Departure Time
     * 
     * @param departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /** 
     * Get the 'arrivalTime' element value. Arrival Time
     * 
     * @return value
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /** 
     * Set the 'arrivalTime' element value. Arrival Time
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
