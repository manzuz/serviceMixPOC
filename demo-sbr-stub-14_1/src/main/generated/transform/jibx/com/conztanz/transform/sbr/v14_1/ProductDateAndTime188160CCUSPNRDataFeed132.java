
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify first the beginning date and time followed by the ending date and time associated with a product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDateAndTime_188160_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="departureDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="departureTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrivalDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrivalTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDateAndTime188160CCUSPNRDataFeed132
{
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;

    /** 
     * Get the 'departureDate' element value.
     * 
     * @return value
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'departureDate' element value.
     * 
     * @param departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /** 
     * Get the 'departureTime' element value.
     * 
     * @return value
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /** 
     * Set the 'departureTime' element value.
     * 
     * @param departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /** 
     * Get the 'arrivalDate' element value.
     * 
     * @return value
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /** 
     * Set the 'arrivalDate' element value.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /** 
     * Get the 'arrivalTime' element value.
     * 
     * @return value
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /** 
     * Set the 'arrivalTime' element value.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
