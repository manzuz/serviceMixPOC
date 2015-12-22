
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify commercial agreements between two  or more companies related to joint, shared, lease operations etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommercialAgreements_17659_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyRoleIdentification_31125_C_CUS_PNRDataFeed_132" name="codeshareDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommercialAgreements17659SCUSPNRDataFeed132
{
    private CompanyRoleIdentification31125CCUSPNRDataFeed132 codeshareDetails;

    /** 
     * Get the 'codeshareDetails' element value. Contains CodeShare associated flight data.
     * 
     * @return value
     */
    public CompanyRoleIdentification31125CCUSPNRDataFeed132 getCodeshareDetails() {
        return codeshareDetails;
    }

    /** 
     * Set the 'codeshareDetails' element value. Contains CodeShare associated flight data.
     * 
     * @param codeshareDetails
     */
    public void setCodeshareDetails(
            CompanyRoleIdentification31125CCUSPNRDataFeed132 codeshareDetails) {
        this.codeshareDetails = codeshareDetails;
    }
}
