
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to convey the passenger references.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_129701_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_188873_C_CUS_PNRDataFeed_132" name="passengerReference" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation129701SCUSPNRDataFeed132
{
    private List<ReferencingDetails188873CCUSPNRDataFeed132> passengerReferenceList = new ArrayList<ReferencingDetails188873CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'passengerReference' element items. Used to convey the passenger tatoo or display number.
     * 
     * @return list
     */
    public List<ReferencingDetails188873CCUSPNRDataFeed132> getPassengerReferenceList() {
        return passengerReferenceList;
    }

    /** 
     * Set the list of 'passengerReference' element items. Used to convey the passenger tatoo or display number.
     * 
     * @param list
     */
    public void setPassengerReferenceList(
            List<ReferencingDetails188873CCUSPNRDataFeed132> list) {
        passengerReferenceList = list;
    }
}
