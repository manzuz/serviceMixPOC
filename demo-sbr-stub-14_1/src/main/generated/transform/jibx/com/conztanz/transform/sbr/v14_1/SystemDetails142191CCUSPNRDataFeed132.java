
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify by code or name and location the system that originates or delivers the message for a third party.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetails_142191_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetails142191CCUSPNRDataFeed132
{
    private String companyId;

    /** 
     * Get the 'companyId' element value. will convey the name of the company ex: OPODO
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. will convey the name of the company ex: OPODO
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
