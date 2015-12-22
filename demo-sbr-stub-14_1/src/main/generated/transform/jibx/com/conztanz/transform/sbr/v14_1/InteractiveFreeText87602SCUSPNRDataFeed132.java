
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide free form or coded text information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InteractiveFreeText_87602_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextQualification_132910_C_CUS_PNRDataFeed_132" name="freetextDetail" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="text" minOccurs="0" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InteractiveFreeText87602SCUSPNRDataFeed132
{
    private FreeTextQualification132910CCUSPNRDataFeed132 freetextDetail;
    private List<String> textList = new ArrayList<String>();

    /** 
     * Get the 'freetextDetail' element value. Describes free text type
     * 
     * @return value
     */
    public FreeTextQualification132910CCUSPNRDataFeed132 getFreetextDetail() {
        return freetextDetail;
    }

    /** 
     * Set the 'freetextDetail' element value. Describes free text type
     * 
     * @param freetextDetail
     */
    public void setFreetextDetail(
            FreeTextQualification132910CCUSPNRDataFeed132 freetextDetail) {
        this.freetextDetail = freetextDetail;
    }

    /** 
     * Get the list of 'text' element items. One occurrence is supposed to represent a logical entity of free text (e.g. one line of text).
     * 
     * @return list
     */
    public List<String> getTextList() {
        return textList;
    }

    /** 
     * Set the list of 'text' element items. One occurrence is supposed to represent a logical entity of free text (e.g. one line of text).
     * 
     * @param list
     */
    public void setTextList(List<String> list) {
        textList = list;
    }
}
