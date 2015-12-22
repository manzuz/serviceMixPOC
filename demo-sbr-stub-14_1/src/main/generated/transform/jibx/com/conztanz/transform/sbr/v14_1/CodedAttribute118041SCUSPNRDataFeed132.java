
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * Used to specify the re-applying status
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttribute_118041_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="attributeFunction"/>
 *     &lt;xs:element type="CodedAttributeInformation_173433_C_CUS_PNRDataFeed_132" name="attributeDetails" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttribute118041SCUSPNRDataFeed132
{
    private BigDecimal attributeFunction;
    private List<CodedAttributeInformation173433CCUSPNRDataFeed132> attributeDetailList = new ArrayList<CodedAttributeInformation173433CCUSPNRDataFeed132>();

    /** 
     * Get the 'attributeFunction' element value. Service tag for mapping identification
     * 
     * @return value
     */
    public BigDecimal getAttributeFunction() {
        return attributeFunction;
    }

    /** 
     * Set the 'attributeFunction' element value. Service tag for mapping identification
     * 
     * @param attributeFunction
     */
    public void setAttributeFunction(BigDecimal attributeFunction) {
        this.attributeFunction = attributeFunction;
    }

    /** 
     * Get the list of 'attributeDetails' element items. Service details
     * 
     * @return list
     */
    public List<CodedAttributeInformation173433CCUSPNRDataFeed132> getAttributeDetailList() {
        return attributeDetailList;
    }

    /** 
     * Set the list of 'attributeDetails' element items. Service details
     * 
     * @param list
     */
    public void setAttributeDetailList(
            List<CodedAttributeInformation173433CCUSPNRDataFeed132> list) {
        attributeDetailList = list;
    }
}
