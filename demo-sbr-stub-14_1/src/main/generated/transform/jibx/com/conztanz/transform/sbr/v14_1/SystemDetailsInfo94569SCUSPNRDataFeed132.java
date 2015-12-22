
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify a system
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetailsInfo_94569_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="workstationId" minOccurs="0"/>
 *     &lt;xs:element type="SystemDetails_142191_C_CUS_PNRDataFeed_132" name="deliveringSystem" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetailsInfo94569SCUSPNRDataFeed132
{
    private String workstationId;
    private SystemDetails142191CCUSPNRDataFeed132 deliveringSystem;

    /** 
     * Get the 'workstationId' element value. LNIATA of the agent.
     * 
     * @return value
     */
    public String getWorkstationId() {
        return workstationId;
    }

    /** 
     * Set the 'workstationId' element value. LNIATA of the agent.
     * 
     * @param workstationId
     */
    public void setWorkstationId(String workstationId) {
        this.workstationId = workstationId;
    }

    /** 
     * Get the 'deliveringSystem' element value. System delivering the shopper session ID
     * 
     * @return value
     */
    public SystemDetails142191CCUSPNRDataFeed132 getDeliveringSystem() {
        return deliveringSystem;
    }

    /** 
     * Set the 'deliveringSystem' element value. System delivering the shopper session ID
     * 
     * @param deliveringSystem
     */
    public void setDeliveringSystem(
            SystemDetails142191CCUSPNRDataFeed132 deliveringSystem) {
        this.deliveringSystem = deliveringSystem;
    }
}
