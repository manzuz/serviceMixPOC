
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide free text information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InteractiveFreeText_76074_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextQualification_117831_C_CUS_PNRDataFeed_132" name="freeTextQualification" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freeText" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InteractiveFreeText76074SCUSPNRDataFeed132
{
    private FreeTextQualification117831CCUSPNRDataFeed132 freeTextQualification;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'freeTextQualification' element value. Provides information on the text conveyed in the IFT: language, type...
     * 
     * @return value
     */
    public FreeTextQualification117831CCUSPNRDataFeed132 getFreeTextQualification() {
        return freeTextQualification;
    }

    /** 
     * Set the 'freeTextQualification' element value. Provides information on the text conveyed in the IFT: language, type...
     * 
     * @param freeTextQualification
     */
    public void setFreeTextQualification(
            FreeTextQualification117831CCUSPNRDataFeed132 freeTextQualification) {
        this.freeTextQualification = freeTextQualification;
    }

    /** 
     * Get the list of 'freeText' element items. The information itself
     * 
     * @return list
     */
    public List<String> getFreeTextList() {
        return freeTextList;
    }

    /** 
     * Set the list of 'freeText' element items. The information itself
     * 
     * @param list
     */
    public void setFreeTextList(List<String> list) {
        freeTextList = list;
    }
}
