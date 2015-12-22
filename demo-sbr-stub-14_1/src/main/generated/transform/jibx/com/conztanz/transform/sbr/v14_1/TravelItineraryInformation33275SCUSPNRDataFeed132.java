
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a segment of an itinerary and related details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelItineraryInformation_33275_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="movementType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelItineraryInformation33275SCUSPNRDataFeed132
{
    private String movementType;

    /** 
     * Get the 'movementType' element value. direction of travel indicator (outward, return, single)
     * 
     * @return value
     */
    public String getMovementType() {
        return movementType;
    }

    /** 
     * Set the 'movementType' element value. direction of travel indicator (outward, return, single)
     * 
     * @param movementType
     */
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
}
