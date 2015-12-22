
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VehicleTypeOption_187591_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="vehicleTypeOwner" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="vehicleRentalPrefType" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VehicleTypeOption187591CCUSPNRDataFeed132
{
    private String vehicleTypeOwner;
    private List<String> vehicleRentalPrefTypeList = new ArrayList<String>();

    /** 
     * Get the 'vehicleTypeOwner' element value. This data element is used to convey the owner of the type code.  - ACR for ACRISS
     * 
     * @return value
     */
    public String getVehicleTypeOwner() {
        return vehicleTypeOwner;
    }

    /** 
     * Set the 'vehicleTypeOwner' element value. This data element is used to convey the owner of the type code.  - ACR for ACRISS
     * 
     * @param vehicleTypeOwner
     */
    public void setVehicleTypeOwner(String vehicleTypeOwner) {
        this.vehicleTypeOwner = vehicleTypeOwner;
    }

    /** 
     * Get the list of 'vehicleRentalPrefType' element items. This data element is used to convey the SIPP code(s) selection criteria.
     * 
     * @return list
     */
    public List<String> getVehicleRentalPrefTypeList() {
        return vehicleRentalPrefTypeList;
    }

    /** 
     * Set the list of 'vehicleRentalPrefType' element items. This data element is used to convey the SIPP code(s) selection criteria.
     * 
     * @param list
     */
    public void setVehicleRentalPrefTypeList(List<String> list) {
        vehicleRentalPrefTypeList = list;
    }
}
