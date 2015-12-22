
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify a system
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetailsInfo_122303_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="workstationId" minOccurs="0"/>
 *     &lt;xs:element type="SystemDetails_178903_C_CUS_PNRDataFeed_132" name="deliveringSystem" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetailsInfo122303SCUSPNRDataFeed132
{
    private String workstationId;
    private SystemDetails178903CCUSPNRDataFeed132 deliveringSystem;

    /** 
     * Get the 'workstationId' element value. Workstation ID
     * 
     * @return value
     */
    public String getWorkstationId() {
        return workstationId;
    }

    /** 
     * Set the 'workstationId' element value. Workstation ID
     * 
     * @param workstationId
     */
    public void setWorkstationId(String workstationId) {
        this.workstationId = workstationId;
    }

    /** 
     * Get the 'deliveringSystem' element value.
     * 
     * @return value
     */
    public SystemDetails178903CCUSPNRDataFeed132 getDeliveringSystem() {
        return deliveringSystem;
    }

    /** 
     * Set the 'deliveringSystem' element value.
     * 
     * @param deliveringSystem
     */
    public void setDeliveringSystem(
            SystemDetails178903CCUSPNRDataFeed132 deliveringSystem) {
        this.deliveringSystem = deliveringSystem;
    }
}
