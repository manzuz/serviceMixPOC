
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_92068_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_138597_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_138597_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation92068SCUSPNRDataFeed132
{
    private MonetaryInformation138597CCUSPNRDataFeed132 monetaryDetails;
    private MonetaryInformation138597CCUSPNRDataFeed132 otherMonetaryDetails;

    /** 
     * Get the 'monetaryDetails' element value.
     * 
     * @return value
     */
    public MonetaryInformation138597CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value.
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation138597CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the 'otherMonetaryDetails' element value.
     * 
     * @return value
     */
    public MonetaryInformation138597CCUSPNRDataFeed132 getOtherMonetaryDetails() {
        return otherMonetaryDetails;
    }

    /** 
     * Set the 'otherMonetaryDetails' element value.
     * 
     * @param otherMonetaryDetails
     */
    public void setOtherMonetaryDetails(
            MonetaryInformation138597CCUSPNRDataFeed132 otherMonetaryDetails) {
        this.otherMonetaryDetails = otherMonetaryDetails;
    }
}
