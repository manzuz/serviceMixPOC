
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a segment of an itinerary and related details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelItineraryInformation_76080_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="itemNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelItineraryInformation76080SCUSPNRDataFeed132
{
    private String itemNumber;

    /** 
     * Get the 'itemNumber' element value. The sequence number indentifying the position of a leg in a booking
     * 
     * @return value
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /** 
     * Set the 'itemNumber' element value. The sequence number indentifying the position of a leg in a booking
     * 
     * @param itemNumber
     */
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }
}
