
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify by code or name and location the system that originates or delivers the message for a third party.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetails_178903_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="locationId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetails178903CCUSPNRDataFeed132
{
    private String companyId;
    private String locationId;

    /** 
     * Get the 'companyId' element value.
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value.
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'locationId' element value.
     * 
     * @return value
     */
    public String getLocationId() {
        return locationId;
    }

    /** 
     * Set the 'locationId' element value.
     * 
     * @param locationId
     */
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
