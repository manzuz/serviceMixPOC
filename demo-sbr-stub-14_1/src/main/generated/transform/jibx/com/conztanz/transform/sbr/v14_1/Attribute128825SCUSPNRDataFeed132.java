
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_128825_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AttributeInformation_187712_C_CUS_PNRDataFeed_132" name="criteriaDetails" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute128825SCUSPNRDataFeed132
{
    private List<AttributeInformation187712CCUSPNRDataFeed132> criteriaDetailList = new ArrayList<AttributeInformation187712CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'criteriaDetails' element items. Details for the message criteria (name, value).
     * 
     * @return list
     */
    public List<AttributeInformation187712CCUSPNRDataFeed132> getCriteriaDetailList() {
        return criteriaDetailList;
    }

    /** 
     * Set the list of 'criteriaDetails' element items. Details for the message criteria (name, value).
     * 
     * @param list
     */
    public void setCriteriaDetailList(
            List<AttributeInformation187712CCUSPNRDataFeed132> list) {
        criteriaDetailList = list;
    }
}
