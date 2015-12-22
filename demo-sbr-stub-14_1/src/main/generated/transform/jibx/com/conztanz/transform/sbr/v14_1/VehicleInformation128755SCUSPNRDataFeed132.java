
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * This segment is used to convey the vehicle information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VehicleInformation_128755_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="VehicleTypeOption_187591_C_CUS_PNRDataFeed_132" name="vehicleCharacteristic" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="vehSpecialEquipment" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="QuantityDetails_187593_C_CUS_PNRDataFeed_132" name="vehicleInfo" minOccurs="0" maxOccurs="20"/>
 *     &lt;xs:element type="FreeTextInformation_187592_C_CUS_PNRDataFeed_132" name="freeTextDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="carModel" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VehicleInformation128755SCUSPNRDataFeed132
{
    private VehicleTypeOption187591CCUSPNRDataFeed132 vehicleCharacteristic;
    private List<String> vehSpecialEquipmentList = new ArrayList<String>();
    private List<QuantityDetails187593CCUSPNRDataFeed132> vehicleInfoList = new ArrayList<QuantityDetails187593CCUSPNRDataFeed132>();
    private FreeTextInformation187592CCUSPNRDataFeed132 freeTextDetails;
    private String carModel;

    /** 
     * Get the 'vehicleCharacteristic' element value. This composite is used to convey the vehicle type.
     * 
     * @return value
     */
    public VehicleTypeOption187591CCUSPNRDataFeed132 getVehicleCharacteristic() {
        return vehicleCharacteristic;
    }

    /** 
     * Set the 'vehicleCharacteristic' element value. This composite is used to convey the vehicle type.
     * 
     * @param vehicleCharacteristic
     */
    public void setVehicleCharacteristic(
            VehicleTypeOption187591CCUSPNRDataFeed132 vehicleCharacteristic) {
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
    public List<QuantityDetails187593CCUSPNRDataFeed132> getVehicleInfoList() {
        return vehicleInfoList;
    }

    /** 
     * Set the list of 'vehicleInfo' element items. To indicate vehicle details: -Number of doors -Number of seats -Max Number of doors -Max Number of seats -Number of bags -Volume of the boots
     * 
     * @param list
     */
    public void setVehicleInfoList(
            List<QuantityDetails187593CCUSPNRDataFeed132> list) {
        vehicleInfoList = list;
    }

    /** 
     * Get the 'freeTextDetails' element value. Free Text
     * 
     * @return value
     */
    public FreeTextInformation187592CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. Free Text
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation187592CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the 'carModel' element value. Description or example of Car Make Model.
     * 
     * @return value
     */
    public String getCarModel() {
        return carModel;
    }

    /** 
     * Set the 'carModel' element value. Description or example of Car Make Model.
     * 
     * @param carModel
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
