
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencingDetails_132918_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="value" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencingDetails132918CCUSPNRDataFeed132
{
    private String type;
    private String value;

    /** 
     * Get the 'type' element value. Reference qualifier Amadeus codes :  OT for Other element(non name, non segment) Tatoo   PT for Passenger Tatoo   ST for Segment Tatoo   SS for Segment Tatoo+SubTatoo
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Reference qualifier Amadeus codes :  OT for Other element(non name, non segment) Tatoo   PT for Passenger Tatoo   ST for Segment Tatoo   SS for Segment Tatoo+SubTatoo
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'value' element value. Reference number Number attributed by the Server to reference the PNR segment/element Limited to the time the PNR is worked (First retrieve - End of Transaction)
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. Reference number Number attributed by the Server to reference the PNR segment/element Limited to the time the PNR is worked (First retrieve - End of Transaction)
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
