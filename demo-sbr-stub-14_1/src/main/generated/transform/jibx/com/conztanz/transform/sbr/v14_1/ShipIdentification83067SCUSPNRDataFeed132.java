
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide details on the sailing ship
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ShipIdentification_83067_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ShipIdentification_126893_C_CUS_PNRDataFeed_132" name="shipDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ShipIdentification83067SCUSPNRDataFeed132
{
    private ShipIdentification126893CCUSPNRDataFeed132 shipDetails;

    /** 
     * Get the 'shipDetails' element value. Detailed information for the sailing ship.
     * 
     * @return value
     */
    public ShipIdentification126893CCUSPNRDataFeed132 getShipDetails() {
        return shipDetails;
    }

    /** 
     * Set the 'shipDetails' element value. Detailed information for the sailing ship.
     * 
     * @param shipDetails
     */
    public void setShipDetails(
            ShipIdentification126893CCUSPNRDataFeed132 shipDetails) {
        this.shipDetails = shipDetails;
    }
}
