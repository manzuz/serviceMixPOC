
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide specific reference identification for a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_70486_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_109766_C_CUS_PNRDataFeed_132" name="referenceDetails" maxOccurs="227"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation70486SCUSPNRDataFeed132
{
    private List<ReferencingDetails109766CCUSPNRDataFeed132> referenceDetailList = new ArrayList<ReferencingDetails109766CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'referenceDetails' element items. Reference Details
     * 
     * @return list
     */
    public List<ReferencingDetails109766CCUSPNRDataFeed132> getReferenceDetailList() {
        return referenceDetailList;
    }

    /** 
     * Set the list of 'referenceDetails' element items. Reference Details
     * 
     * @param list
     */
    public void setReferenceDetailList(
            List<ReferencingDetails109766CCUSPNRDataFeed132> list) {
        referenceDetailList = list;
    }
}
