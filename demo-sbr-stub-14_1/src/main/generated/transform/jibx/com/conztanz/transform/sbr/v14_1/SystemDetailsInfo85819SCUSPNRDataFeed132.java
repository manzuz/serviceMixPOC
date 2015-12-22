
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify a system
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetailsInfo_85819_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SystemDetails_130392_C_CUS_PNRDataFeed_132" name="deliveringSystem"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetailsInfo85819SCUSPNRDataFeed132
{
    private SystemDetails130392CCUSPNRDataFeed132 deliveringSystem;

    /** 
     * Get the 'deliveringSystem' element value.
     * 
     * @return value
     */
    public SystemDetails130392CCUSPNRDataFeed132 getDeliveringSystem() {
        return deliveringSystem;
    }

    /** 
     * Set the 'deliveringSystem' element value.
     * 
     * @param deliveringSystem
     */
    public void setDeliveringSystem(
            SystemDetails130392CCUSPNRDataFeed132 deliveringSystem) {
        this.deliveringSystem = deliveringSystem;
    }
}
