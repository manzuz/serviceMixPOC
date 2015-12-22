
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_79037_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_121394_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation79037SCUSPNRDataFeed132
{
    private MonetaryInformation121394CCUSPNRDataFeed132 monetaryDetails;

    /** 
     * Get the 'monetaryDetails' element value.
     * 
     * @return value
     */
    public MonetaryInformation121394CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value.
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation121394CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }
}
