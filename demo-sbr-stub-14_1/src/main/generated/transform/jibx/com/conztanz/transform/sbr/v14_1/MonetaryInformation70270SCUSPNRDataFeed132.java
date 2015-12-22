
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_70270_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_109515_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation70270SCUSPNRDataFeed132
{
    private MonetaryInformation109515CCUSPNRDataFeed132 monetaryDetails;

    /** 
     * Get the 'monetaryDetails' element value. monetary amounts for the refund
     * 
     * @return value
     */
    public MonetaryInformation109515CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. monetary amounts for the refund
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation109515CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }
}
