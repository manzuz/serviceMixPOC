
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details which qualify a fare
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareQualifierDetails_128802_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FareCategoryCodes_187669_C_CUS_PNRDataFeed_132" name="fareCategories" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FareQualifierDetails128802SCUSPNRDataFeed132
{
    private FareCategoryCodes187669CCUSPNRDataFeed132 fareCategories;

    /** 
     * Get the 'fareCategories' element value. Rate Code
     * 
     * @return value
     */
    public FareCategoryCodes187669CCUSPNRDataFeed132 getFareCategories() {
        return fareCategories;
    }

    /** 
     * Set the 'fareCategories' element value. Rate Code
     * 
     * @param fareCategories
     */
    public void setFareCategories(
            FareCategoryCodes187669CCUSPNRDataFeed132 fareCategories) {
        this.fareCategories = fareCategories;
    }
}
