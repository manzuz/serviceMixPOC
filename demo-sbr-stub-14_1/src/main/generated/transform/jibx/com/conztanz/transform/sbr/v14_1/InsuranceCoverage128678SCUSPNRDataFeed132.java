
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * coverage conditions
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InsuranceCoverage_128678_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="coverageIndicator" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InsuranceCoverage128678SCUSPNRDataFeed132
{
    private List<String> coverageIndicatorList = new ArrayList<String>();

    /** 
     * Get the list of 'coverageIndicator' element items. Indicate type of amount (eg. Medical Coverage, Trip Value, etc)
     * 
     * @return list
     */
    public List<String> getCoverageIndicatorList() {
        return coverageIndicatorList;
    }

    /** 
     * Set the list of 'coverageIndicator' element items. Indicate type of amount (eg. Medical Coverage, Trip Value, etc)
     * 
     * @param list
     */
    public void setCoverageIndicatorList(List<String> list) {
        coverageIndicatorList = list;
    }
}
