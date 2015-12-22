
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a status, the action to be taken, and an additional qualification of the status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_117853_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator"/>
 *     &lt;xs:element type="xs:string" name="action"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails117853CCUSPNRDataFeed132
{
    private String indicator;
    private String action;

    /** 
     * Get the 'indicator' element value. Baggage status type
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. Baggage status type
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'action' element value. the status itself
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'action' element value. the status itself
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }
}
