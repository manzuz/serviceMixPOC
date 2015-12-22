
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the rate or tariff categories and rate or tariff ranges.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateInformation_187652_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="category" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RateInformation187652CCUSPNRDataFeed132
{
    private String category;

    /** 
     * Get the 'category' element value. Category of the rate - 002 Inclusive - 006 Convention - 007 Corporate - 009 Government - 011 Package - 019 Association - 020 Business - 021 Consortium - 022 Credential - 023 Industry - 024 Standard - G General
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value. Category of the rate - 002 Inclusive - 006 Convention - 007 Corporate - 009 Government - 011 Package - 019 Association - 020 Business - 021 Consortium - 022 Credential - 023 Industry - 024 Standard - G General
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
