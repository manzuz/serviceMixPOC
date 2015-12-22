
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify control details for a device.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeviceControlDetails_94564_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="IdentificationNumber_142185_C_CUS_PNRDataFeed_132" name="deviceIdentification" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DeviceControlDetails94564SCUSPNRDataFeed132
{
    private IdentificationNumber142185CCUSPNRDataFeed132 deviceIdentification;

    /** 
     * Get the 'deviceIdentification' element value. Stores the identification of the device.
     * 
     * @return value
     */
    public IdentificationNumber142185CCUSPNRDataFeed132 getDeviceIdentification() {
        return deviceIdentification;
    }

    /** 
     * Set the 'deviceIdentification' element value. Stores the identification of the device.
     * 
     * @param deviceIdentification
     */
    public void setDeviceIdentification(
            IdentificationNumber142185CCUSPNRDataFeed132 deviceIdentification) {
        this.deviceIdentification = deviceIdentification;
    }
}
