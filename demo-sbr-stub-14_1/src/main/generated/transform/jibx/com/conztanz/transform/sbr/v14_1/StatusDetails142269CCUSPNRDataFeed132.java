
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a status, the action to be taken, and an additional qualification of the status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_142269_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="action" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails142269CCUSPNRDataFeed132
{
    private String indicator;
    private String action;

    /** 
     * Get the 'indicator' element value.
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value.
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'action' element value.
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'action' element value.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }
}
