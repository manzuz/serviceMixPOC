
package com.conztanz.transform.sbr.v14_1;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_76083_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="UniqueIdDescription_117839_C_CUS_PNRDataFeed_132" name="idSection"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions76083SCUSPNRDataFeed132
{
    private UniqueIdDescription117839CCUSPNRDataFeed132 idSection;

    /** 
     * Get the 'idSection' element value. ID details
     * 
     * @return value
     */
    public UniqueIdDescription117839CCUSPNRDataFeed132 getIdSection() {
        return idSection;
    }

    /** 
     * Set the 'idSection' element value. ID details
     * 
     * @param idSection
     */
    public void setIdSection(
            UniqueIdDescription117839CCUSPNRDataFeed132 idSection) {
        this.idSection = idSection;
    }
}
