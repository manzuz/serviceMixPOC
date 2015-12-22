
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of attribute and the attribute
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AttributeInformation_188164_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AttributeInformation188164CCUSPNRDataFeed132
{
    private String attributeType;

    /** 
     * Get the 'attributeType' element value. The list of possible values is: ADT Adult CHD Child FDC Diplomatic corps FEU Disabled FFM Family FFR Free FIR Inter rail FJO Journalist FSL School pupil INF Infant MIL Military NAT Nato official REC Child resident
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. The list of possible values is: ADT Adult CHD Child FDC Diplomatic corps FEU Disabled FFM Family FFR Free FIR Inter rail FJO Journalist FSL School pupil INF Infant MIL Military NAT Nato official REC Child resident
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
}
