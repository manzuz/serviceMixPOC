
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey monetary amounts, rates and percentages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_76537_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_118484_C_CUS_PNRDataFeed_132" name="monetaryDetails"/>
 *     &lt;xs:element type="MonetaryInformation_118484_C_CUS_PNRDataFeed_132" name="otherMonetaryDetails" minOccurs="0" maxOccurs="4"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation76537SCUSPNRDataFeed132
{
    private MonetaryInformation118484CCUSPNRDataFeed132 monetaryDetails;
    private List<MonetaryInformation118484CCUSPNRDataFeed132> otherMonetaryDetailList = new ArrayList<MonetaryInformation118484CCUSPNRDataFeed132>();

    /** 
     * Get the 'monetaryDetails' element value. Yield info
     * 
     * @return value
     */
    public MonetaryInformation118484CCUSPNRDataFeed132 getMonetaryDetails() {
        return monetaryDetails;
    }

    /** 
     * Set the 'monetaryDetails' element value. Yield info
     * 
     * @param monetaryDetails
     */
    public void setMonetaryDetails(
            MonetaryInformation118484CCUSPNRDataFeed132 monetaryDetails) {
        this.monetaryDetails = monetaryDetails;
    }

    /** 
     * Get the list of 'otherMonetaryDetails' element items.
     * 
     * @return list
     */
    public List<MonetaryInformation118484CCUSPNRDataFeed132> getOtherMonetaryDetailList() {
        return otherMonetaryDetailList;
    }

    /** 
     * Set the list of 'otherMonetaryDetails' element items.
     * 
     * @param list
     */
    public void setOtherMonetaryDetailList(
            List<MonetaryInformation118484CCUSPNRDataFeed132> list) {
        otherMonetaryDetailList = list;
    }
}
