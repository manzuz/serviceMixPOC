
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information about a vehicle.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Vehicle_129134_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="category"/>
 *     &lt;xs:element type="VehicleInformation_188170_C_CUS_PNRDataFeed_132" name="vehicleDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Vehicle129134SCUSPNRDataFeed132
{
    private String category;
    private VehicleInformation188170CCUSPNRDataFeed132 vehicleDetails;

    /** 
     * Get the 'category' element value.
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value.
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** 
     * Get the 'vehicleDetails' element value.
     * 
     * @return value
     */
    public VehicleInformation188170CCUSPNRDataFeed132 getVehicleDetails() {
        return vehicleDetails;
    }

    /** 
     * Set the 'vehicleDetails' element value.
     * 
     * @param vehicleDetails
     */
    public void setVehicleDetails(
            VehicleInformation188170CCUSPNRDataFeed132 vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }
}
