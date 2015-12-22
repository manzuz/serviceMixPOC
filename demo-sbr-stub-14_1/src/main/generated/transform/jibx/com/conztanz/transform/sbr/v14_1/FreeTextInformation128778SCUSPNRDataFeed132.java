
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to convey the free text and associated language, encoding.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_128778_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_187633_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation128778SCUSPNRDataFeed132
{
    private FreeTextInformation187633CCUSPNRDataFeed132 freeTextDetails;
    private String freeText;

    /** 
     * Get the 'freeTextDetails' element value.
     * 
     * @return value
     */
    public FreeTextInformation187633CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value.
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation187633CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the 'freeText' element value. Free text and message sequence numbers of the remarks.
     * 
     * @return value
     */
    public String getFreeText() {
        return freeText;
    }

    /** 
     * Set the 'freeText' element value. Free text and message sequence numbers of the remarks.
     * 
     * @param freeText
     */
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }
}
