
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a cabin
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinIdentification_187535_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cabinNbr"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinIdentification187535CCUSPNRDataFeed132
{
    private String cabinNbr;

    /** 
     * Get the 'cabinNbr' element value.
     * 
     * @return value
     */
    public String getCabinNbr() {
        return cabinNbr;
    }

    /** 
     * Set the 'cabinNbr' element value.
     * 
     * @param cabinNbr
     */
    public void setCabinNbr(String cabinNbr) {
        this.cabinNbr = cabinNbr;
    }
}
