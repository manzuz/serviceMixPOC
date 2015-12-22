
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_10816_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_17849_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_17849_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation10816SCUSPNRDataFeed132
{
    private MonetaryInformation17849CCUSPNRDataFeed132 monetaryDetails;
    private MonetaryInformation17849CCUSPNRDataFeed132 otherMonetaryDetails;

    /** 
     * Get the 'monetaryDetails' element value. Total Trip value in a given currency
     * 
     * @return value
     */
    public MonetaryInformation17849CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. Total Trip value in a given currency
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation17849CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the 'otherMonetaryDetails' element value. Base Trip value in a given currency
     * 
     * @return value
     */
    public MonetaryInformation17849CCUSPNRDataFeed132 getOtherMonetaryDetails() {
        return otherMonetaryDetails;
    }

    /** 
     * Set the 'otherMonetaryDetails' element value. Base Trip value in a given currency
     * 
     * @param otherMonetaryDetails
     */
    public void setOtherMonetaryDetails(
            MonetaryInformation17849CCUSPNRDataFeed132 otherMonetaryDetails) {
        this.otherMonetaryDetails = otherMonetaryDetails;
    }
}
