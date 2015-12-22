
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the details for making a selection
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetails_24911_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SelectionDetailsInformation_45577_C_CUS_PNRDataFeed_132" name="selection" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetails24911SCUSPNRDataFeed132
{
    private List<SelectionDetailsInformation45577CCUSPNRDataFeed132> selectionList = new ArrayList<SelectionDetailsInformation45577CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'selection' element items. Only the first occurrence of the composite is mandatory. Up to 10 occurrences of the composite.
     * 
     * @return list
     */
    public List<SelectionDetailsInformation45577CCUSPNRDataFeed132> getSelectionList() {
        return selectionList;
    }

    /** 
     * Set the list of 'selection' element items. Only the first occurrence of the composite is mandatory. Up to 10 occurrences of the composite.
     * 
     * @param list
     */
    public void setSelectionList(
            List<SelectionDetailsInformation45577CCUSPNRDataFeed132> list) {
        selectionList = list;
    }
}
