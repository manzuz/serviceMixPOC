
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify a range.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RangeDetails_165523_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rangeQualifier" minOccurs="0"/>
 *     &lt;xs:element type="Range_234145_C_CUS_PNRDataFeed_132" name="rangeDetails" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RangeDetails165523SCUSPNRDataFeed132
{
    private String rangeQualifier;
    private List<Range234145CCUSPNRDataFeed132> rangeDetailList = new ArrayList<Range234145CCUSPNRDataFeed132>();

    /** 
     * Get the 'rangeQualifier' element value. rangeQualifier
     * 
     * @return value
     */
    public String getRangeQualifier() {
        return rangeQualifier;
    }

    /** 
     * Set the 'rangeQualifier' element value. rangeQualifier
     * 
     * @param rangeQualifier
     */
    public void setRangeQualifier(String rangeQualifier) {
        this.rangeQualifier = rangeQualifier;
    }

    /** 
     * Get the list of 'rangeDetails' element items. rangeDetails
     * 
     * @return list
     */
    public List<Range234145CCUSPNRDataFeed132> getRangeDetailList() {
        return rangeDetailList;
    }

    /** 
     * Set the list of 'rangeDetails' element items. rangeDetails
     * 
     * @param list
     */
    public void setRangeDetailList(List<Range234145CCUSPNRDataFeed132> list) {
        rangeDetailList = list;
    }
}
