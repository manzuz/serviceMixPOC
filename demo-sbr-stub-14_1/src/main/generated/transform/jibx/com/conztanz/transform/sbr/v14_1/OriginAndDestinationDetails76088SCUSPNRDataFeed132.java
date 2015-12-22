
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey the origin and destination of a journey
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginAndDestinationDetails_76088_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="origin" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="destination" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginAndDestinationDetails76088SCUSPNRDataFeed132
{
    private String origin;
    private String destination;

    /** 
     * Get the 'origin' element value. Airport/city code of  Origin In a Client request message, a non-blank ODI is used in an air sell request to advise that the following segments (TVL etc...) are connected. There is a maximum of 6 TVLs following a non-blank ODI.
     * 
     * @return value
     */
    public String getOrigin() {
        return origin;
    }

    /** 
     * Set the 'origin' element value. Airport/city code of  Origin In a Client request message, a non-blank ODI is used in an air sell request to advise that the following segments (TVL etc...) are connected. There is a maximum of 6 TVLs following a non-blank ODI.
     * 
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /** 
     * Get the 'destination' element value. Airport/city code of  Destination
     * 
     * @return value
     */
    public String getDestination() {
        return destination;
    }

    /** 
     * Set the 'destination' element value. Airport/city code of  Destination
     * 
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
