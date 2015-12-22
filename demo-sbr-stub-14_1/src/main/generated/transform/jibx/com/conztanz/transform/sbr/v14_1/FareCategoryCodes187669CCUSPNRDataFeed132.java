
package com.conztanz.transform.sbr.v14_1;

/** 
 * To designate non-system specific combinations of fare types.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareCategoryCodes_187669_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="fareType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FareCategoryCodes187669CCUSPNRDataFeed132
{
    private String fareType;

    /** 
     * Get the 'fareType' element value. Rate Code value. (Code set list not used)
     * 
     * @return value
     */
    public String getFareType() {
        return fareType;
    }

    /** 
     * Set the 'fareType' element value. Rate Code value. (Code set list not used)
     * 
     * @param fareType
     */
    public void setFareType(String fareType) {
        this.fareType = fareType;
    }
}
