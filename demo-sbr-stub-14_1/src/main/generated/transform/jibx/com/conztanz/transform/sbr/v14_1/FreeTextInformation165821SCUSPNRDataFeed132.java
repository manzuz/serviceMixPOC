
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to convey the free text and associated language, encoding.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_165821_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_234566_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation165821SCUSPNRDataFeed132
{
    private FreeTextInformation234566CCUSPNRDataFeed132 freeTextDetails;
    private String freeText;

    /** 
     * Get the 'freeTextDetails' element value. freeTextDetails
     * 
     * @return value
     */
    public FreeTextInformation234566CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. freeTextDetails
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation234566CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the 'freeText' element value. L#2a:Free Flow / M / Oryginal Issued free flow information  L#2b:Free Flow / M / Issued in exchange for free flow information / Note: Free flow information to be printed in the issued in exchange box on the ticket Used for special cases such as tickets issued against requisitions etc   L#4: Free Flow / M / Issued in exchange for free flow information / Must  start with the letter  L#5: Free Flow / M / Issued in exchange for free flow information
     * 
     * @return value
     */
    public String getFreeText() {
        return freeText;
    }

    /** 
     * Set the 'freeText' element value. L#2a:Free Flow / M / Oryginal Issued free flow information  L#2b:Free Flow / M / Issued in exchange for free flow information / Note: Free flow information to be printed in the issued in exchange box on the ticket Used for special cases such as tickets issued against requisitions etc   L#4: Free Flow / M / Issued in exchange for free flow information / Must  start with the letter  L#5: Free Flow / M / Issued in exchange for free flow information
     * 
     * @param freeText
     */
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }
}
