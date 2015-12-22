
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify by code or name and location the system that originates or delivers the message for a third party.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetails_117866_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyId"/>
 *     &lt;xs:element type="xs:string" name="locationId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetails117866CCUSPNRDataFeed132
{
    private String companyId;
    private String locationId;

    /** 
     * Get the 'companyId' element value. The company that performed the sell
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. The company that performed the sell
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'locationId' element value. The place where the sell was done
     * 
     * @return value
     */
    public String getLocationId() {
        return locationId;
    }

    /** 
     * Set the 'locationId' element value. The place where the sell was done
     * 
     * @param locationId
     */
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
