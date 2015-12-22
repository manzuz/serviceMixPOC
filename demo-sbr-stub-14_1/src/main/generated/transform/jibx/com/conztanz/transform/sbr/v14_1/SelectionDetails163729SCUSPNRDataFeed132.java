
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the details for making a selection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetails_163729_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SelectionDetailsInformation_231875_C_CUS_PNRDataFeed_132" name="selectionDetails" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetails163729SCUSPNRDataFeed132
{
    private List<SelectionDetailsInformation231875CCUSPNRDataFeed132> selectionDetailList = new ArrayList<SelectionDetailsInformation231875CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'selectionDetails' element items. selectiondetails
     * 
     * @return list
     */
    public List<SelectionDetailsInformation231875CCUSPNRDataFeed132> getSelectionDetailList() {
        return selectionDetailList;
    }

    /** 
     * Set the list of 'selectionDetails' element items. selectiondetails
     * 
     * @param list
     */
    public void setSelectionDetailList(
            List<SelectionDetailsInformation231875CCUSPNRDataFeed132> list) {
        selectionDetailList = list;
    }
}
