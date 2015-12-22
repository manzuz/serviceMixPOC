
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a status, the action to be taken, and an additional qualification of the status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_177001_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator"/>
 *     &lt;xs:element type="xs:string" name="action"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails177001CCUSPNRDataFeed132
{
    private String indicator;
    private String action;

    /** 
     * Get the 'indicator' element value. Status indicator
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. Status indicator
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'action' element value. Boolean: 1: Yes 0: False
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'action' element value. Boolean: 1: Yes 0: False
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }
}
