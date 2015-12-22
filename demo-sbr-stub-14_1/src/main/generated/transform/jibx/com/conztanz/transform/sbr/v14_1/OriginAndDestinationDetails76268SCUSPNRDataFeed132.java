
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey the origin and destination of a journey.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginAndDestinationDetails_76268_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="origin" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="destination" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginAndDestinationDetails76268SCUSPNRDataFeed132
{
    private String origin;
    private String destination;

    /** 
     * Get the 'origin' element value. Departure's city code:3 character ATA/IATA airport/city code
     * 
     * @return value
     */
    public String getOrigin() {
        return origin;
    }

    /** 
     * Set the 'origin' element value. Departure's city code:3 character ATA/IATA airport/city code
     * 
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /** 
     * Get the 'destination' element value. Arrival's city code:3 character ATA/IATA airport/city code
     * 
     * @return value
     */
    public String getDestination() {
        return destination;
    }

    /** 
     * Set the 'destination' element value. Arrival's city code:3 character ATA/IATA airport/city code
     * 
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
