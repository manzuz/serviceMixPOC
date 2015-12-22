
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the segment marriages and connections
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SegmentGroupingInformation_24853_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="groupingCode"/>
 *     &lt;xs:element type="ReferenceDetails_45494_C_CUS_PNRDataFeed_132" name="marriageDetail" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SegmentGroupingInformation24853SCUSPNRDataFeed132
{
    private String groupingCode;
    private List<ReferenceDetails45494CCUSPNRDataFeed132> marriageDetailList = new ArrayList<ReferenceDetails45494CCUSPNRDataFeed132>();

    /** 
     * Get the 'groupingCode' element value. Type of segment grouping:  Mxx for Marriage (see codeset)  CNX for Connection
     * 
     * @return value
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    /** 
     * Set the 'groupingCode' element value. Type of segment grouping:  Mxx for Marriage (see codeset)  CNX for Connection
     * 
     * @param groupingCode
     */
    public void setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
    }

    /** 
     * Get the list of 'marriageDetail' element items. transmit the list of segments participating in one marriage or segments that are connected.
     * 
     * @return list
     */
    public List<ReferenceDetails45494CCUSPNRDataFeed132> getMarriageDetailList() {
        return marriageDetailList;
    }

    /** 
     * Set the list of 'marriageDetail' element items. transmit the list of segments participating in one marriage or segments that are connected.
     * 
     * @param list
     */
    public void setMarriageDetailList(
            List<ReferenceDetails45494CCUSPNRDataFeed132> list) {
        marriageDetailList = list;
    }
}
