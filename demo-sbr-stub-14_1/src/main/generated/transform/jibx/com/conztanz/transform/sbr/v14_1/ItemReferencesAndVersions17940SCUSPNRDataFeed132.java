
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_17940_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="UniqueIdDescription_31108_C_CUS_PNRDataFeed_132" name="idSection" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions17940SCUSPNRDataFeed132
{
    private List<UniqueIdDescription31108CCUSPNRDataFeed132> idSectionList = new ArrayList<UniqueIdDescription31108CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'idSection' element items. ID details
     * 
     * @return list
     */
    public List<UniqueIdDescription31108CCUSPNRDataFeed132> getIdSectionList() {
        return idSectionList;
    }

    /** 
     * Set the list of 'idSection' element items. ID details
     * 
     * @param list
     */
    public void setIdSectionList(
            List<UniqueIdDescription31108CCUSPNRDataFeed132> list) {
        idSectionList = list;
    }
}
