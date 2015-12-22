
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the free text
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_76104_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_117871_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation76104SCUSPNRDataFeed132
{
    private FreeTextInformation117871CCUSPNRDataFeed132 freeTextDetails;
    private String freeText;

    /** 
     * Get the 'freeTextDetails' element value. Characteristics of the blacklist category freetext
     * 
     * @return value
     */
    public FreeTextInformation117871CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. Characteristics of the blacklist category freetext
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation117871CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the 'freeText' element value. Text of the blacklist category
     * 
     * @return value
     */
    public String getFreeText() {
        return freeText;
    }

    /** 
     * Set the 'freeText' element value. Text of the blacklist category
     * 
     * @param freeText
     */
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }
}
