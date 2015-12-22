
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide specific Hotel reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_129703_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_188874_C_CUS_PNRDataFeed_132" name="referenceDetails" minOccurs="0" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation129703SCUSPNRDataFeed132
{
    private List<ReferencingDetails188874CCUSPNRDataFeed132> referenceDetailList = new ArrayList<ReferencingDetails188874CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'referenceDetails' element items.
     * 
     * @return list
     */
    public List<ReferencingDetails188874CCUSPNRDataFeed132> getReferenceDetailList() {
        return referenceDetailList;
    }

    /** 
     * Set the list of 'referenceDetails' element items.
     * 
     * @param list
     */
    public void setReferenceDetailList(
            List<ReferencingDetails188874CCUSPNRDataFeed132> list) {
        referenceDetailList = list;
    }
}
