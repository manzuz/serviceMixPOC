
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to convey the passenger references.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_157341_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_223998_C_CUS_PNRDataFeed_132" name="passengerReference" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation157341SCUSPNRDataFeed132
{
    private List<ReferencingDetails223998CCUSPNRDataFeed132> passengerReferenceList = new ArrayList<ReferencingDetails223998CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'passengerReference' element items. Used to convey the passenger tatoo or display number.
     * 
     * @return list
     */
    public List<ReferencingDetails223998CCUSPNRDataFeed132> getPassengerReferenceList() {
        return passengerReferenceList;
    }

    /** 
     * Set the list of 'passengerReference' element items. Used to convey the passenger tatoo or display number.
     * 
     * @param list
     */
    public void setPassengerReferenceList(
            List<ReferencingDetails223998CCUSPNRDataFeed132> list) {
        passengerReferenceList = list;
    }
}
