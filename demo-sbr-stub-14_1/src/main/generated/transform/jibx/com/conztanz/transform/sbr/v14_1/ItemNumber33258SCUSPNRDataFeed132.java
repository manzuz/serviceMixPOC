
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an item number
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemNumber_33258_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemNumberIdentification_57833_C_CUS_PNRDataFeed_132" name="itemNumberDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemNumber33258SCUSPNRDataFeed132
{
    private ItemNumberIdentification57833CCUSPNRDataFeed132 itemNumberDetails;

    /** 
     * Get the 'itemNumberDetails' element value. leg number - idicate with leg is the first one, the second one, etc.
     * 
     * @return value
     */
    public ItemNumberIdentification57833CCUSPNRDataFeed132 getItemNumberDetails() {
        return itemNumberDetails;
    }

    /** 
     * Set the 'itemNumberDetails' element value. leg number - idicate with leg is the first one, the second one, etc.
     * 
     * @param itemNumberDetails
     */
    public void setItemNumberDetails(
            ItemNumberIdentification57833CCUSPNRDataFeed132 itemNumberDetails) {
        this.itemNumberDetails = itemNumberDetails;
    }
}
