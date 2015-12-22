
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * This segment is used to convey the free text
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_6235_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_776_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation6235SCUSPNRDataFeed132
{
    private FreeTextInformation776CCUSPNRDataFeed132 freeTextDetails;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'freeTextDetails' element value. To convey the type of the freeflow text.
     * 
     * @return value
     */
    public FreeTextInformation776CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. To convey the type of the freeflow text.
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation776CCUSPNRDataFeed132 freeTextDetails) {
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
