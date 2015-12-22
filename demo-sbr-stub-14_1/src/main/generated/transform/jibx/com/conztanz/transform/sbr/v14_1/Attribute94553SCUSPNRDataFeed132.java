
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_94553_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="criteriaSetType"/>
 *     &lt;xs:element type="AttributeInformation_142175_C_CUS_PNRDataFeed_132" name="criteriaDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute94553SCUSPNRDataFeed132
{
    private String criteriaSetType;
    private AttributeInformation142175CCUSPNRDataFeed132 criteriaDetails;

    /** 
     * Get the 'criteriaSetType' element value. Type of Data Exple :  SAL sale indicator EXT for extended payment PAY payment type
     * 
     * @return value
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /** 
     * Set the 'criteriaSetType' element value. Type of Data Exple :  SAL sale indicator EXT for extended payment PAY payment type
     * 
     * @param criteriaSetType
     */
    public void setCriteriaSetType(String criteriaSetType) {
        this.criteriaSetType = criteriaSetType;
    }

    /** 
     * Get the 'criteriaDetails' element value. Details for the message criteria (name, value).
     * 
     * @return value
     */
    public AttributeInformation142175CCUSPNRDataFeed132 getCriteriaDetails() {
        return criteriaDetails;
    }

    /** 
     * Set the 'criteriaDetails' element value. Details for the message criteria (name, value).
     * 
     * @param criteriaDetails
     */
    public void setCriteriaDetails(
            AttributeInformation142175CCUSPNRDataFeed132 criteriaDetails) {
        this.criteriaDetails = criteriaDetails;
    }
}
