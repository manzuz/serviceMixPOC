
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * This segment is used to convey the free text
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_30052_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_53138_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation30052SCUSPNRDataFeed132
{
    private FreeTextInformation53138CCUSPNRDataFeed132 freeTextDetails;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'freeTextDetails' element value. Free text details
     * 
     * @return value
     */
    public FreeTextInformation53138CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. Free text details
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation53138CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the list of 'freeText' element items. Free text and message sequence numbers of the remarks.
     * 
     * @return list
     */
    public List<String> getFreeTextList() {
        return freeTextList;
    }

    /** 
     * Set the list of 'freeText' element items. Free text and message sequence numbers of the remarks.
     * 
     * @param list
     */
    public void setFreeTextList(List<String> list) {
        freeTextList = list;
    }
}
