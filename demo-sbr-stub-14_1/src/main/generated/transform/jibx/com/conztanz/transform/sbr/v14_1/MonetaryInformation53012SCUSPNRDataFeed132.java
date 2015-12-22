
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_53012_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_86190_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_86190_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation53012SCUSPNRDataFeed132
{
    private MonetaryInformation86190CCUSPNRDataFeed132 monetaryDetails;
    private MonetaryInformation86190CCUSPNRDataFeed132 otherMonetaryDetails;

    /** 
     * Get the 'monetaryDetails' element value. VAT amount
     * 
     * @return value
     */
    public MonetaryInformation86190CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. VAT amount
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation86190CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the 'otherMonetaryDetails' element value. VAT rate
     * 
     * @return value
     */
    public MonetaryInformation86190CCUSPNRDataFeed132 getOtherMonetaryDetails() {
        return otherMonetaryDetails;
    }

    /** 
     * Set the 'otherMonetaryDetails' element value. VAT rate
     * 
     * @param otherMonetaryDetails
     */
    public void setOtherMonetaryDetails(
            MonetaryInformation86190CCUSPNRDataFeed132 otherMonetaryDetails) {
        this.otherMonetaryDetails = otherMonetaryDetails;
    }
}
