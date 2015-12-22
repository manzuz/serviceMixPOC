
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide specific reference identification
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_75336_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceDetails_116896_C_CUS_PNRDataFeed_132" name="reference" minOccurs="0" maxOccurs="198"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation75336SCUSPNRDataFeed132
{
    private List<ReferenceDetails116896CCUSPNRDataFeed132> referenceList = new ArrayList<ReferenceDetails116896CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'reference' element items. This composite is used to transmit association information
     * 
     * @return list
     */
    public List<ReferenceDetails116896CCUSPNRDataFeed132> getReferenceList() {
        return referenceList;
    }

    /** 
     * Set the list of 'reference' element items. This composite is used to transmit association information
     * 
     * @param list
     */
    public void setReferenceList(
            List<ReferenceDetails116896CCUSPNRDataFeed132> list) {
        referenceList = list;
    }
}
