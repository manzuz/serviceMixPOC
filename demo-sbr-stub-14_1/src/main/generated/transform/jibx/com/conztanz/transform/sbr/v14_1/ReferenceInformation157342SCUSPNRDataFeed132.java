
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide specific Hotel reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_157342_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_223999_C_CUS_PNRDataFeed_132" name="referenceDetails" minOccurs="0" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation157342SCUSPNRDataFeed132
{
    private List<ReferencingDetails223999CCUSPNRDataFeed132> referenceDetailList = new ArrayList<ReferencingDetails223999CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'referenceDetails' element items. List of references to MCO, air segments, etc.
     * 
     * @return list
     */
    public List<ReferencingDetails223999CCUSPNRDataFeed132> getReferenceDetailList() {
        return referenceDetailList;
    }

    /** 
     * Set the list of 'referenceDetails' element items. List of references to MCO, air segments, etc.
     * 
     * @param list
     */
    public void setReferenceDetailList(
            List<ReferencingDetails223999CCUSPNRDataFeed132> list) {
        referenceDetailList = list;
    }
}
