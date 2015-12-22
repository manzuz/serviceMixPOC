
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_79011_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="criteriaSetType"/>
 *     &lt;xs:element type="AttributeInformation_121350_C_CUS_PNRDataFeed_132" name="criteriaDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute79011SCUSPNRDataFeed132
{
    private String criteriaSetType;
    private AttributeInformation121350CCUSPNRDataFeed132 criteriaDetails;

    /** 
     * Get the 'criteriaSetType' element value. Qualifier identifying the RFIC
     * 
     * @return value
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /** 
     * Set the 'criteriaSetType' element value. Qualifier identifying the RFIC
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
    public AttributeInformation121350CCUSPNRDataFeed132 getCriteriaDetails() {
        return criteriaDetails;
    }

    /** 
     * Set the 'criteriaDetails' element value. Details for the message criteria (name, value).
     * 
     * @param criteriaDetails
     */
    public void setCriteriaDetails(
            AttributeInformation121350CCUSPNRDataFeed132 criteriaDetails) {
        this.criteriaDetails = criteriaDetails;
    }
}
