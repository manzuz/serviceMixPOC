
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_87595_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="criteriaSetType"/>
 *     &lt;xs:element type="AttributeInformation_132904_C_CUS_PNRDataFeed_132" name="criteriaDetails" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute87595SCUSPNRDataFeed132
{
    private String criteriaSetType;
    private List<AttributeInformation132904CCUSPNRDataFeed132> criteriaDetailList = new ArrayList<AttributeInformation132904CCUSPNRDataFeed132>();

    /** 
     * Get the 'criteriaSetType' element value. Specify which attribute is described in E003. BAT for booking attribute
     * 
     * @return value
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /** 
     * Set the 'criteriaSetType' element value. Specify which attribute is described in E003. BAT for booking attribute
     * 
     * @param criteriaSetType
     */
    public void setCriteriaSetType(String criteriaSetType) {
        this.criteriaSetType = criteriaSetType;
    }

    /** 
     * Get the list of 'criteriaDetails' element items. Details for the attribute type. LEI:Y for leisure booking CLP:Y for clip booking
     * 
     * @return list
     */
    public List<AttributeInformation132904CCUSPNRDataFeed132> getCriteriaDetailList() {
        return criteriaDetailList;
    }

    /** 
     * Set the list of 'criteriaDetails' element items. Details for the attribute type. LEI:Y for leisure booking CLP:Y for clip booking
     * 
     * @param list
     */
    public void setCriteriaDetailList(
            List<AttributeInformation132904CCUSPNRDataFeed132> list) {
        criteriaDetailList = list;
    }
}
