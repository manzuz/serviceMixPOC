
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey the origin and destination of a journey.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginAndDestinationDetails_79034_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="origin"/>
 *     &lt;xs:element type="xs:string" name="destination"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginAndDestinationDetails79034SCUSPNRDataFeed132
{
    private String origin;
    private String destination;

    /** 
     * Get the 'origin' element value.
     * 
     * @return value
     */
    public String getOrigin() {
        return origin;
    }

    /** 
     * Set the 'origin' element value.
     * 
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /** 
     * Get the 'destination' element value.
     * 
     * @return value
     */
    public String getDestination() {
        return destination;
    }

    /** 
     * Set the 'destination' element value.
     * 
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
