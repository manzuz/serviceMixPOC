
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_76066_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="actionCategory" minOccurs="0"/>
 *     &lt;xs:element type="UniqueIdDescription_117818_C_CUS_PNRDataFeed_132" name="idSection" maxOccurs="6"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions76066SCUSPNRDataFeed132
{
    private String actionCategory;
    private List<UniqueIdDescription117818CCUSPNRDataFeed132> idSectionList = new ArrayList<UniqueIdDescription117818CCUSPNRDataFeed132>();

    /** 
     * Get the 'actionCategory' element value. Action code representing an the udapte done on the entity
     * 
     * @return value
     */
    public String getActionCategory() {
        return actionCategory;
    }

    /** 
     * Set the 'actionCategory' element value. Action code representing an the udapte done on the entity
     * 
     * @param actionCategory
     */
    public void setActionCategory(String actionCategory) {
        this.actionCategory = actionCategory;
    }

    /** 
     * Get the list of 'idSection' element items. ID details Only seats may need the 6 repetitions: - 1 for the unique id - up to 5 for the SID (one per legs)
     * 
     * @return list
     */
    public List<UniqueIdDescription117818CCUSPNRDataFeed132> getIdSectionList() {
        return idSectionList;
    }

    /** 
     * Set the list of 'idSection' element items. ID details Only seats may need the 6 repetitions: - 1 for the unique id - up to 5 for the SID (one per legs)
     * 
     * @param list
     */
    public void setIdSectionList(
            List<UniqueIdDescription117818CCUSPNRDataFeed132> list) {
        idSectionList = list;
    }
}
