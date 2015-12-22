
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_70483_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_109764_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_109764_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails" minOccurs="0" maxOccurs="19"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation70483SCUSPNRDataFeed132
{
    private MonetaryInformation109764CCUSPNRDataFeed132 monetaryDetails;
    private List<MonetaryInformation109764CCUSPNRDataFeed132> otherMonetaryDetailList = new ArrayList<MonetaryInformation109764CCUSPNRDataFeed132>();

    /** 
     * Get the 'monetaryDetails' element value. First Fare
     * 
     * @return value
     */
    public MonetaryInformation109764CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. First Fare
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation109764CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the list of 'otherMonetaryDetails' element items. Other Fare
     * 
     * @return list
     */
    public List<MonetaryInformation109764CCUSPNRDataFeed132> getOtherMonetaryDetailList() {
        return otherMonetaryDetailList;
    }

    /** 
     * Set the list of 'otherMonetaryDetails' element items. Other Fare
     * 
     * @param list
     */
    public void setOtherMonetaryDetailList(
            List<MonetaryInformation109764CCUSPNRDataFeed132> list) {
        otherMonetaryDetailList = list;
    }
}
