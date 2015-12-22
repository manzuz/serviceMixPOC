
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * This segment is used to convey the vehicle information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VehicleInformation_87613_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="VehicleTypeOption_132927_C_CUS_PNRDataFeed_132" name="vehicleCharacteristic"/>
 *     &lt;xs:element type="xs:string" name="vehSpecialEquipment" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="QuantityDetails_132928_C_CUS_PNRDataFeed_132" name="vehicleInfo" minOccurs="0" maxOccurs="6"/>
 *     &lt;xs:element type="FreeTextInformation_132926_C_CUS_PNRDataFeed_132" name="freeTextDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="carModel" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VehicleInformation87613SCUSPNRDataFeed132
{
    private VehicleTypeOption132927CCUSPNRDataFeed132 vehicleCharacteristic;
    private List<String> vehSpecialEquipmentList = new ArrayList<String>();
    private List<QuantityDetails132928CCUSPNRDataFeed132> vehicleInfoList = new ArrayList<QuantityDetails132928CCUSPNRDataFeed132>();
    private FreeTextInformation132926CCUSPNRDataFeed132 freeTextDetails;
    private String carModel;

    /** 
     * Get the 'vehicleCharacteristic' element value. This composite is used to convey the vehicle type
     * 
     * @return value
     */
    public VehicleTypeOption132927CCUSPNRDataFeed132 getVehicleCharacteristic() {
        return vehicleCharacteristic;
    }

    /** 
     * Set the 'vehicleCharacteristic' element value. This composite is used to convey the vehicle type
     * 
     * @param vehicleCharacteristic
     */
    public void setVehicleCharacteristic(
            VehicleTypeOption132927CCUSPNRDataFeed132 vehicleCharacteristic) {
        this.vehicleCharacteristic = vehicleCharacteristic;
    }

    /** 
     * Get the list of 'vehSpecialEquipment' element items. This data element is used to convey the equipment codes.
     * 
     * @return list
     */
    public List<String> getVehSpecialEquipmentList() {
        return vehSpecialEquipmentList;
    }

    /** 
     * Set the list of 'vehSpecialEquipment' element items. This data element is used to convey the equipment codes.
     * 
     * @param list
     */
    public void setVehSpecialEquipmentList(List<String> list) {
        vehSpecialEquipmentList = list;
    }

    /** 
     * Get the list of 'vehicleInfo' element items. To indicate vehicle details: -Number of doors -Number of seats -Max Number of doors -Max Number of seats -Number of bags -Volume of the boots
     * 
     * @return list
     */
    public List<QuantityDetails132928CCUSPNRDataFeed132> getVehicleInfoList() {
        return vehicleInfoList;
    }

    /** 
     * Set the list of 'vehicleInfo' element items. To indicate vehicle details: -Number of doors -Number of seats -Max Number of doors -Max Number of seats -Number of bags -Volume of the boots
     * 
     * @param list
     */
    public void setVehicleInfoList(
            List<QuantityDetails132928CCUSPNRDataFeed132> list) {
        vehicleInfoList = list;
    }

    /** 
     * Get the 'freeTextDetails' element value. Free text type
     * 
     * @return value
     */
    public FreeTextInformation132926CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. Free text type
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation132926CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the 'carModel' element value. Description or Example of the Car
     * 
     * @return value
     */
    public String getCarModel() {
        return carModel;
    }

    /** 
     * Set the 'carModel' element value. Description or Example of the Car
     * 
     * @param carModel
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
