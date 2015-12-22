
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details which qualify a fare
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareQualifierDetails_87617_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FareCategoryCodes_132936_C_CUS_PNRDataFeed_132" name="fareCategories"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FareQualifierDetails87617SCUSPNRDataFeed132
{
    private FareCategoryCodes132936CCUSPNRDataFeed132 fareCategories;

    /** 
     * Get the 'fareCategories' element value. Rate Code Information
     * 
     * @return value
     */
    public FareCategoryCodes132936CCUSPNRDataFeed132 getFareCategories() {
        return fareCategories;
    }

    /** 
     * Set the 'fareCategories' element value. Rate Code Information
     * 
     * @param fareCategories
     */
    public void setFareCategories(
            FareCategoryCodes132936CCUSPNRDataFeed132 fareCategories) {
        this.fareCategories = fareCategories;
    }
}
