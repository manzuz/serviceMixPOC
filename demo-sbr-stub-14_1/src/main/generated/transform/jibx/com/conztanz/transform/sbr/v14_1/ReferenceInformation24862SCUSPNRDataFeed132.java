
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide specific reference identification
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_24862_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceDetails_45508_C_CUS_PNRDataFeed_132" name="reference" minOccurs="0" maxOccurs="198"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation24862SCUSPNRDataFeed132
{
    private List<ReferenceDetails45508CCUSPNRDataFeed132> referenceList = new ArrayList<ReferenceDetails45508CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'reference' element items. This composite is used to transmit association information
     * 
     * @return list
     */
    public List<ReferenceDetails45508CCUSPNRDataFeed132> getReferenceList() {
        return referenceList;
    }

    /** 
     * Set the list of 'reference' element items. This composite is used to transmit association information
     * 
     * @param list
     */
    public void setReferenceList(
            List<ReferenceDetails45508CCUSPNRDataFeed132> list) {
        referenceList = list;
    }
}
