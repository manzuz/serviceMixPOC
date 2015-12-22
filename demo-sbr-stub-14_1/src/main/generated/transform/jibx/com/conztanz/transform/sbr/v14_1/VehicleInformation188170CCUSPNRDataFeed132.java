
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a vehicle by make or model and vehicle identification number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VehicleInformation_188170_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="makeAndModel" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VehicleInformation188170CCUSPNRDataFeed132
{
    private String makeAndModel;

    /** 
     * Get the 'makeAndModel' element value.
     * 
     * @return value
     */
    public String getMakeAndModel() {
        return makeAndModel;
    }

    /** 
     * Set the 'makeAndModel' element value.
     * 
     * @param makeAndModel
     */
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
}
