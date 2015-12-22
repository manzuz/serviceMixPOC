
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_94557_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_142178_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_142178_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails" minOccurs="0" maxOccurs="7"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation94557SCUSPNRDataFeed132
{
    private MonetaryInformation142178CCUSPNRDataFeed132 monetaryDetails;
    private List<MonetaryInformation142178CCUSPNRDataFeed132> otherMonetaryDetailList = new ArrayList<MonetaryInformation142178CCUSPNRDataFeed132>();

    /** 
     * Get the 'monetaryDetails' element value. Contains the currencies and the various amounts
     * 
     * @return value
     */
    public MonetaryInformation142178CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. Contains the currencies and the various amounts
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation142178CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the list of 'otherMonetaryDetails' element items.
     * 
     * @return list
     */
    public List<MonetaryInformation142178CCUSPNRDataFeed132> getOtherMonetaryDetailList() {
        return otherMonetaryDetailList;
    }

    /** 
     * Set the list of 'otherMonetaryDetails' element items.
     * 
     * @param list
     */
    public void setOtherMonetaryDetailList(
            List<MonetaryInformation142178CCUSPNRDataFeed132> list) {
        otherMonetaryDetailList = list;
    }
}
