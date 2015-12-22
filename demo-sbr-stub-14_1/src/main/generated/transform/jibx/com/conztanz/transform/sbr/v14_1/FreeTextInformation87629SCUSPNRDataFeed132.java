
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * This segment is used to convey the free text
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextInformation_87629_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextInformation_132957_C_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *     &lt;xs:element type="xs:string" name="freeText" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextInformation87629SCUSPNRDataFeed132
{
    private FreeTextInformation132957CCUSPNRDataFeed132 freeTextDetails;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'freeTextDetails' element value. Free text type
     * 
     * @return value
     */
    public FreeTextInformation132957CCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. Free text type
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation132957CCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }

    /** 
     * Get the list of 'freeText' element items. 1 or 2 lines of free text
     * 
     * @return list
     */
    public List<String> getFreeTextList() {
        return freeTextList;
    }

    /** 
     * Set the list of 'freeText' element items. 1 or 2 lines of free text
     * 
     * @param list
     */
    public void setFreeTextList(List<String> list) {
        freeTextList = list;
    }
}
