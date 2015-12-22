
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_94576_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="criteriaSetType"/>
 *     &lt;xs:element type="AttributeInformation_142198_C_CUS_PNRDataFeed_132" name="criteriaDetails" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute94576SCUSPNRDataFeed132
{
    private String criteriaSetType;
    private List<AttributeInformation142198CCUSPNRDataFeed132> criteriaDetailList = new ArrayList<AttributeInformation142198CCUSPNRDataFeed132>();

    /** 
     * Get the 'criteriaSetType' element value. Type of information: - is this a switch? - is this a structured data?
     * 
     * @return value
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /** 
     * Set the 'criteriaSetType' element value. Type of information: - is this a switch? - is this a structured data?
     * 
     * @param criteriaSetType
     */
    public void setCriteriaSetType(String criteriaSetType) {
        this.criteriaSetType = criteriaSetType;
    }

    /** 
     * Get the list of 'criteriaDetails' element items. Details for the message criteria (name, value).
     * 
     * @return list
     */
    public List<AttributeInformation142198CCUSPNRDataFeed132> getCriteriaDetailList() {
        return criteriaDetailList;
    }

    /** 
     * Set the list of 'criteriaDetails' element items. Details for the message criteria (name, value).
     * 
     * @param list
     */
    public void setCriteriaDetailList(
            List<AttributeInformation142198CCUSPNRDataFeed132> list) {
        criteriaDetailList = list;
    }
}
