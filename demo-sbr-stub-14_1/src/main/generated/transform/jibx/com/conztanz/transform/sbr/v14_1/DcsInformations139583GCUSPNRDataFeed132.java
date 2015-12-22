
package com.conztanz.transform.sbr.v14_1;

/** 
 * DcsSystemInformation
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DcsInformations_139583_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyInformation_76096_S_CUS_PNRDataFeed_132" name="checkInCompany"/>
 *     &lt;xs:element type="DcsInformations_iatciInformation_139584_G_CUS_PNRDataFeed_132" name="iatciInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DcsInformations139583GCUSPNRDataFeed132
{
    private CompanyInformation76096SCUSPNRDataFeed132 checkInCompany;
    private DcsInformationsIatciInformation139584GCUSPNRDataFeed132 iatciInformation;

    /** 
     * Get the 'checkInCompany' element value. identifies the company that handles check-in operations
     * 
     * @return value
     */
    public CompanyInformation76096SCUSPNRDataFeed132 getCheckInCompany() {
        return checkInCompany;
    }

    /** 
     * Set the 'checkInCompany' element value. identifies the company that handles check-in operations
     * 
     * @param checkInCompany
     */
    public void setCheckInCompany(
            CompanyInformation76096SCUSPNRDataFeed132 checkInCompany) {
        this.checkInCompany = checkInCompany;
    }

    /** 
     * Get the 'iatciInformation' element value. contains IATCI information: - onward fligth data - company originator of the IATCI message - target DCS and target company
     * 
     * @return value
     */
    public DcsInformationsIatciInformation139584GCUSPNRDataFeed132 getIatciInformation() {
        return iatciInformation;
    }

    /** 
     * Set the 'iatciInformation' element value. contains IATCI information: - onward fligth data - company originator of the IATCI message - target DCS and target company
     * 
     * @param iatciInformation
     */
    public void setIatciInformation(
            DcsInformationsIatciInformation139584GCUSPNRDataFeed132 iatciInformation) {
        this.iatciInformation = iatciInformation;
    }
}
