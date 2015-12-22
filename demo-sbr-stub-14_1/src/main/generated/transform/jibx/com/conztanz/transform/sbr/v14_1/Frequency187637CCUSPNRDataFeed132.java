
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Give the days of the week involved for a period
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Frequency_187637_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:string" name="value" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Frequency187637CCUSPNRDataFeed132
{
    private String qualifier;
    private List<String> valueList = new ArrayList<String>();

    /** 
     * Get the 'qualifier' element value. Indicate if the sequence number represents days of the week or days of the month.
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Indicate if the sequence number represents days of the week or days of the month.
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the list of 'value' element items. Used to represent days of the week or days of the month. For week : 1 is monday and 7 is sunday. For month : 1 is the first day of the month.
     * 
     * @return list
     */
    public List<String> getValueList() {
        return valueList;
    }

    /** 
     * Set the list of 'value' element items. Used to represent days of the week or days of the month. For week : 1 is monday and 7 is sunday. For month : 1 is the first day of the month.
     * 
     * @param list
     */
    public void setValueList(List<String> list) {
        valueList = list;
    }
}
