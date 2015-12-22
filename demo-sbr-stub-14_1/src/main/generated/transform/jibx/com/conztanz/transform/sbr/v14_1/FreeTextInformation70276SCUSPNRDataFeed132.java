
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the free text
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_70276_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_109524_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation70276SCUSPNRDataFeed132
{
    private FreeTextInformation109524CCUSPNRDataFeed132 freeTextDetails;
    private String freeText;

    /** 
     * Get the 'freeTextDetails' element value. freeTextDetails
     * 
     * @return value
     */
    public FreeTextInformation109524CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. freeTextDetails
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation109524CCUSPNRDataFeed132 freeTextDetails) {
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
