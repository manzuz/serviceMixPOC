
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an item number
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemNumber_83598_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemNumberIdentification_127573_C_CUS_PNRDataFeed_132" name="itemNumberDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemNumber83598SCUSPNRDataFeed132
{
    private ItemNumberIdentification127573CCUSPNRDataFeed132 itemNumberDetails;

    /** 
     * Get the 'itemNumberDetails' element value. leg number - idicate with leg is the first one, the second one, etc.
     * 
     * @return value
     */
    public ItemNumberIdentification127573CCUSPNRDataFeed132 getItemNumberDetails() {
        return itemNumberDetails;
    }

    /** 
     * Set the 'itemNumberDetails' element value. leg number - idicate with leg is the first one, the second one, etc.
     * 
     * @param itemNumberDetails
     */
    public void setItemNumberDetails(
            ItemNumberIdentification127573CCUSPNRDataFeed132 itemNumberDetails) {
        this.itemNumberDetails = itemNumberDetails;
    }
}
