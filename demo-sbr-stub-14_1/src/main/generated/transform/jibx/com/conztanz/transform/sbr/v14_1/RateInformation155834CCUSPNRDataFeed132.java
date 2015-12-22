
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the rate or tariff categories and rate or tariff ranges.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateInformation_155834_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="category" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RateInformation155834CCUSPNRDataFeed132
{
    private String category;

    /** 
     * Get the 'category' element value. Original vendor channel code
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value. Original vendor channel code
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
