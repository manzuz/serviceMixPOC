
package com.conztanz.transform.sbr.v14_1;

/** 
 * To reference a segment cabin
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SegmentCabinIdentification_42205_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cabinCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SegmentCabinIdentification42205SCUSPNRDataFeed132
{
    private String cabinCode;

    /** 
     * Get the 'cabinCode' element value. Cabin class designator
     * 
     * @return value
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /** 
     * Set the 'cabinCode' element value. Cabin class designator
     * 
     * @param cabinCode
     */
    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }
}
