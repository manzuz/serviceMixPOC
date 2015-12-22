
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OverbookingDetails_57479_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="reason"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OverbookingDetails57479CCUSPNRDataFeed132
{
    private String type;
    private String reason;

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'reason' element value.
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'reason' element value.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
