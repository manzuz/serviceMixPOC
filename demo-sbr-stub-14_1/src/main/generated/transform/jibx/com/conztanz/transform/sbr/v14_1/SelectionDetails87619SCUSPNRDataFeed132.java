
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details for making a selection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetails_87619_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SelectionDetailsInformation_132939_C_CUS_PNRDataFeed_132" name="selectionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetails87619SCUSPNRDataFeed132
{
    private SelectionDetailsInformation132939CCUSPNRDataFeed132 selectionDetails;

    /** 
     * Get the 'selectionDetails' element value. Booking access type requested
     * 
     * @return value
     */
    public SelectionDetailsInformation132939CCUSPNRDataFeed132 getSelectionDetails() {
        return selectionDetails;
    }

    /** 
     * Set the 'selectionDetails' element value. Booking access type requested
     * 
     * @param selectionDetails
     */
    public void setSelectionDetails(
            SelectionDetailsInformation132939CCUSPNRDataFeed132 selectionDetails) {
        this.selectionDetails = selectionDetails;
    }
}
