
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the physical layout of a cabin class or cabin compartment of an aircraft.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinDetails_279_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CabinClassDesignation_15507_C_CUS_PNRDataFeed_132" name="cabinDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinDetails279SCUSPNRDataFeed132
{
    private CabinClassDesignation15507CCUSPNRDataFeed132 cabinDetails;

    /** 
     * Get the 'cabinDetails' element value. Describes details of the cabin in the flight
     * 
     * @return value
     */
    public CabinClassDesignation15507CCUSPNRDataFeed132 getCabinDetails() {
        return cabinDetails;
    }

    /** 
     * Set the 'cabinDetails' element value. Describes details of the cabin in the flight
     * 
     * @param cabinDetails
     */
    public void setCabinDetails(
            CabinClassDesignation15507CCUSPNRDataFeed132 cabinDetails) {
        this.cabinDetails = cabinDetails;
    }
}
