
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_94069_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="uniqueReference" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="actionCategory" minOccurs="0"/>
 *     &lt;xs:element type="UniqueIdDescription_141680_C_CUS_PNRDataFeed_132" name="idSection" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions94069SCUSPNRDataFeed132
{
    private String referenceType;
    private String uniqueReference;
    private String actionCategory;
    private List<UniqueIdDescription141680CCUSPNRDataFeed132> idSectionList = new ArrayList<UniqueIdDescription141680CCUSPNRDataFeed132>();

    /** 
     * Get the 'referenceType' element value.
     * 
     * @return value
     */
    public String getReferenceType() {
        return referenceType;
    }

    /** 
     * Set the 'referenceType' element value.
     * 
     * @param referenceType
     */
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    /** 
     * Get the 'uniqueReference' element value.
     * 
     * @return value
     */
    public String getUniqueReference() {
        return uniqueReference;
    }

    /** 
     * Set the 'uniqueReference' element value.
     * 
     * @param uniqueReference
     */
    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }

    /** 
     * Get the 'actionCategory' element value.
     * 
     * @return value
     */
    public String getActionCategory() {
        return actionCategory;
    }

    /** 
     * Set the 'actionCategory' element value.
     * 
     * @param actionCategory
     */
    public void setActionCategory(String actionCategory) {
        this.actionCategory = actionCategory;
    }

    /** 
     * Get the list of 'idSection' element items.
     * 
     * @return list
     */
    public List<UniqueIdDescription141680CCUSPNRDataFeed132> getIdSectionList() {
        return idSectionList;
    }

    /** 
     * Set the list of 'idSection' element items.
     * 
     * @param list
     */
    public void setIdSectionList(
            List<UniqueIdDescription141680CCUSPNRDataFeed132> list) {
        idSectionList = list;
    }
}
