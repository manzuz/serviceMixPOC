
package com.conztanz.transform.sbr.v14_1;

/** 
 * a collection of Award elements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Awards_95009_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Award_142693_C_CUS_PNRDataFeed_132" name="award"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Awards95009SCUSPNRDataFeed132
{
    private Award142693CCUSPNRDataFeed132 award;

    /** 
     * Get the 'award' element value. provides detailed information regarding each award program used by this hotel.
     * 
     * @return value
     */
    public Award142693CCUSPNRDataFeed132 getAward() {
        return award;
    }

    /** 
     * Set the 'award' element value. provides detailed information regarding each award program used by this hotel.
     * 
     * @param award
     */
    public void setAward(Award142693CCUSPNRDataFeed132 award) {
        this.award = award;
    }
}
