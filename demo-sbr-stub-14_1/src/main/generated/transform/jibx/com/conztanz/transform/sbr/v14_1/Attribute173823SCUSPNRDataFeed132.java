
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_173823_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AttributeInformation_245010_C_CUS_PNRDataFeed_132" name="criteriaDetails" maxOccurs="20"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute173823SCUSPNRDataFeed132
{
    private List<AttributeInformation245010CCUSPNRDataFeed132> criteriaDetailList = new ArrayList<AttributeInformation245010CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'criteriaDetails' element items. Billing Attributes of the FA element.
     * 
     * @return list
     */
    public List<AttributeInformation245010CCUSPNRDataFeed132> getCriteriaDetailList() {
        return criteriaDetailList;
    }

    /** 
     * Set the list of 'criteriaDetails' element items. Billing Attributes of the FA element.
     * 
     * @param list
     */
    public void setCriteriaDetailList(
            List<AttributeInformation245010CCUSPNRDataFeed132> list) {
        criteriaDetailList = list;
    }
}
