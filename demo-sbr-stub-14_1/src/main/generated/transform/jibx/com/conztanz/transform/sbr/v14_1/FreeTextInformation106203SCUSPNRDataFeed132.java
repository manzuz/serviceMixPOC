
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to convey the free text and associated language, encoding.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_106203_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_157764_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation106203SCUSPNRDataFeed132
{
    private FreeTextInformation157764CCUSPNRDataFeed132 freeTextDetails;
    private String freeText;

    /** 
     * Get the 'freeTextDetails' element value. error details
     * 
     * @return value
     */
    public FreeTextInformation157764CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. error details
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation157764CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the 'freeText' element value. 1-50 chars name
     * 
     * @return value
     */
    public String getFreeText() {
        return freeText;
    }

    /** 
     * Set the 'freeText' element value. 1-50 chars name
     * 
     * @param freeText
     */
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }
}
