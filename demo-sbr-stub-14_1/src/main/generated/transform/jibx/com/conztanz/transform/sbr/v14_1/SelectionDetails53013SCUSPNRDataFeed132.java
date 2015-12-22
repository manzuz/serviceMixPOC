
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details for making a selection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetails_53013_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SelectionDetailsInformation_86191_C_CUS_PNRDataFeed_132" name="selectionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetails53013SCUSPNRDataFeed132
{
    private SelectionDetailsInformation86191CCUSPNRDataFeed132 selectionDetails;

    /** 
     * Get the 'selectionDetails' element value. Fare Filing
     * 
     * @return value
     */
    public SelectionDetailsInformation86191CCUSPNRDataFeed132 getSelectionDetails() {
        return selectionDetails;
    }

    /** 
     * Set the 'selectionDetails' element value. Fare Filing
     * 
     * @param selectionDetails
     */
    public void setSelectionDetails(
            SelectionDetailsInformation86191CCUSPNRDataFeed132 selectionDetails) {
        this.selectionDetails = selectionDetails;
    }
}
