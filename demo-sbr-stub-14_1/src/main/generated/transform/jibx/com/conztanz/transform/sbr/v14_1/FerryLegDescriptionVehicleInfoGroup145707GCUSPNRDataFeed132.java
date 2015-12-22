
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryLegDescription_vehicleInfoGroup_145707_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Vehicle_129134_S_CUS_PNRDataFeed_132" name="vehicleInformation"/>
 *     &lt;xs:element type="NumberOfUnits_129132_S_CUS_PNRDataFeed_132" name="numberOfBicycles" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_129133_S_CUS_PNRDataFeed_132" name="vehicleRoutePrice" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryLegDescriptionVehicleInfoGroup145707GCUSPNRDataFeed132
{
    private Vehicle129134SCUSPNRDataFeed132 vehicleInformation;
    private NumberOfUnits129132SCUSPNRDataFeed132 numberOfBicycles;
    private TariffInformation129133SCUSPNRDataFeed132 vehicleRoutePrice;

    /** 
     * Get the 'vehicleInformation' element value. This segment conveys the description of a vehicle.
     * 
     * @return value
     */
    public Vehicle129134SCUSPNRDataFeed132 getVehicleInformation() {
        return vehicleInformation;
    }

    /** 
     * Set the 'vehicleInformation' element value. This segment conveys the description of a vehicle.
     * 
     * @param vehicleInformation
     */
    public void setVehicleInformation(
            Vehicle129134SCUSPNRDataFeed132 vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    /** 
     * Get the 'numberOfBicycles' element value. This segment is used to convey the number of bicycles associated to a ferry booking. Note: this segment is ignored if the vehicule description is not "bicycle".
     * 
     * @return value
     */
    public NumberOfUnits129132SCUSPNRDataFeed132 getNumberOfBicycles() {
        return numberOfBicycles;
    }

    /** 
     * Set the 'numberOfBicycles' element value. This segment is used to convey the number of bicycles associated to a ferry booking. Note: this segment is ignored if the vehicule description is not "bicycle".
     * 
     * @param numberOfBicycles
     */
    public void setNumberOfBicycles(
            NumberOfUnits129132SCUSPNRDataFeed132 numberOfBicycles) {
        this.numberOfBicycles = numberOfBicycles;
    }

    /** 
     * Get the 'vehicleRoutePrice' element value. This segment holds the price per vehicle.
     * 
     * @return value
     */
    public TariffInformation129133SCUSPNRDataFeed132 getVehicleRoutePrice() {
        return vehicleRoutePrice;
    }

    /** 
     * Set the 'vehicleRoutePrice' element value. This segment holds the price per vehicle.
     * 
     * @param vehicleRoutePrice
     */
    public void setVehicleRoutePrice(
            TariffInformation129133SCUSPNRDataFeed132 vehicleRoutePrice) {
        this.vehicleRoutePrice = vehicleRoutePrice;
    }
}
