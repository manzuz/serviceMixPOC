
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an item number
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemNumber_76075_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemNumberIdentification_117832_C_CUS_PNRDataFeed_132" name="itemNumberDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemNumber76075SCUSPNRDataFeed132
{
    private ItemNumberIdentification117832CCUSPNRDataFeed132 itemNumberDetails;

    /** 
     * Get the 'itemNumberDetails' element value. Item Number Details
     * 
     * @return value
     */
    public ItemNumberIdentification117832CCUSPNRDataFeed132 getItemNumberDetails() {
        return itemNumberDetails;
    }

    /** 
     * Set the 'itemNumberDetails' element value. Item Number Details
     * 
     * @param itemNumberDetails
     */
    public void setItemNumberDetails(
            ItemNumberIdentification117832CCUSPNRDataFeed132 itemNumberDetails) {
        this.itemNumberDetails = itemNumberDetails;
    }
}
