
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_79031_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_121384_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation79031SCUSPNRDataFeed132
{
    private MonetaryInformation121384CCUSPNRDataFeed132 monetaryDetails;

    /** 
     * Get the 'monetaryDetails' element value. Details of the monetaty amount
     * 
     * @return value
     */
    public MonetaryInformation121384CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. Details of the monetaty amount
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation121384CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }
}