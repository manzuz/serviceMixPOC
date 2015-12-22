
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForSbrIds_94968_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemReferencesAndVersions_75354_S_CUS_PNRDataFeed_132" name="idsValue"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForSbrIds94968GCUSPNRDataFeed1321
{
    private ItemReferencesAndVersions75354SCUSPNRDataFeed132 idsValue;

    /** 
     * Get the 'idsValue' element value. Value of the ID(s)
     * 
     * @return value
     */
    public ItemReferencesAndVersions75354SCUSPNRDataFeed132 getIdsValue() {
        return idsValue;
    }

    /** 
     * Set the 'idsValue' element value. Value of the ID(s)
     * 
     * @param idsValue
     */
    public void setIdsValue(
            ItemReferencesAndVersions75354SCUSPNRDataFeed132 idsValue) {
        this.idsValue = idsValue;
    }
}
