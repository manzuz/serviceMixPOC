
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_141060_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_204664_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_204664_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails" minOccurs="0" maxOccurs="19"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation141060SCUSPNRDataFeed132
{
    private MonetaryInformation204664CCUSPNRDataFeed132 monetaryDetails;
    private List<MonetaryInformation204664CCUSPNRDataFeed132> otherMonetaryDetailList = new ArrayList<MonetaryInformation204664CCUSPNRDataFeed132>();

    /** 
     * Get the 'monetaryDetails' element value.
     * 
     * @return value
     */
    public MonetaryInformation204664CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value.
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation204664CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the list of 'otherMonetaryDetails' element items.
     * 
     * @return list
     */
    public List<MonetaryInformation204664CCUSPNRDataFeed132> getOtherMonetaryDetailList() {
        return otherMonetaryDetailList;
    }

    /** 
     * Set the list of 'otherMonetaryDetails' element items.
     * 
     * @param list
     */
    public void setOtherMonetaryDetailList(
            List<MonetaryInformation204664CCUSPNRDataFeed132> list) {
        otherMonetaryDetailList = list;
    }
}
