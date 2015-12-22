
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a status, the action to be taken, and an additional qualification of the status.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_50209_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails50209CCUSPNRDataFeed132
{
    private String indicator;

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
}
