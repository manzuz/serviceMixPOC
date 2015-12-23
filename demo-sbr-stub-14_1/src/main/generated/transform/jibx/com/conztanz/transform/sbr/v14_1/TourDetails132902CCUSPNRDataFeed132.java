
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide details of a tour by code, name of the tour provider, length, number of stops, room occupancy and number of rooms.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TourDetails_132902_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="tourCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TourDetails132902CCUSPNRDataFeed132
{
    private String tourCode;

    /** 
     * Get the 'tourCode' element value. Inclusive tour number
     * 
     * @return value
     */
    public String getTourCode() {
        return tourCode;
    }

    /** 
     * Set the 'tourCode' element value. Inclusive tour number
     * 
     * @param tourCode
     */
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }
}