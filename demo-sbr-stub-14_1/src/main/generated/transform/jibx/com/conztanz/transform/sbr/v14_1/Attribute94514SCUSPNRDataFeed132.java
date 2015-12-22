
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to have tag value without code list for tag
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute_94514_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="criteriaSetType" minOccurs="0"/>
 *     &lt;xs:element type="AttributeInformation_142127_C_CUS_PNRDataFeed_132" name="criteriaDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute94514SCUSPNRDataFeed132
{
    private String criteriaSetType;
    private AttributeInformation142127CCUSPNRDataFeed132 criteriaDetails;

    /** 
     * Get the 'criteriaSetType' element value. Determines if the set of criteria corresponds to the message identification criteria or to normal criteria.
     * 
     * @return value
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /** 
     * Set the 'criteriaSetType' element value. Determines if the set of criteria corresponds to the message identification criteria or to normal criteria.
     * 
     * @param criteriaSetType
     */
    public void setCriteriaSetType(String criteriaSetType) {
        this.criteriaSetType = criteriaSetType;
    }

    /** 
     * Get the 'criteriaDetails' element value. List of attributes and status linked to credit card process. Most of them are link dependant.
     * 
     * @return value
     */
    public AttributeInformation142127CCUSPNRDataFeed132 getCriteriaDetails() {
        return criteriaDetails;
    }

    /** 
     * Set the 'criteriaDetails' element value. List of attributes and status linked to credit card process. Most of them are link dependant.
     * 
     * @param criteriaDetails
     */
    public void setCriteriaDetails(
            AttributeInformation142127CCUSPNRDataFeed132 criteriaDetails) {
        this.criteriaDetails = criteriaDetails;
    }
}
