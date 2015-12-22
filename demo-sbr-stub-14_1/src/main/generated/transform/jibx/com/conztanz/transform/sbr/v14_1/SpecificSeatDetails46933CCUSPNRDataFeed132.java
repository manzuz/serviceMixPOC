
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of specific seats on a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificSeatDetails_46933_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seat" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificSeatDetails46933CCUSPNRDataFeed132
{
    private String seat;

    /** 
     * Get the 'seat' element value. This is the PAX type of the seat.
     * 
     * @return value
     */
    public String getSeat() {
        return seat;
    }

    /** 
     * Set the 'seat' element value. This is the PAX type of the seat.
     * 
     * @param seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
