
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify a system
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetailsInfo_76098_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SystemDetails_117866_C_CUS_PNRDataFeed_132" name="deliveringSystem"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetailsInfo76098SCUSPNRDataFeed132
{
    private SystemDetails117866CCUSPNRDataFeed132 deliveringSystem;

    /** 
     * Get the 'deliveringSystem' element value. Information concerning the system that performed the sell
     * 
     * @return value
     */
    public SystemDetails117866CCUSPNRDataFeed132 getDeliveringSystem() {
        return deliveringSystem;
    }

    /** 
     * Set the 'deliveringSystem' element value. Information concerning the system that performed the sell
     * 
     * @param deliveringSystem
     */
    public void setDeliveringSystem(
            SystemDetails117866CCUSPNRDataFeed132 deliveringSystem) {
        this.deliveringSystem = deliveringSystem;
    }
}
