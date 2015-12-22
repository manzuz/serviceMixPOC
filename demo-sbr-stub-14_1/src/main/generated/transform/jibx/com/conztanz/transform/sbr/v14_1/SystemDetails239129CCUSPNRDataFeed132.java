
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify by code or name and location the system that originates or delivers the message for a third party.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetails_239129_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="locationId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="location" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetails239129CCUSPNRDataFeed132
{
    private String companyId;
    private String locationId;
    private String location;

    /** 
     * Get the 'companyId' element value. Application Owner: IATA code, LSS organization...
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. Application Owner: IATA code, LSS organization...
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'locationId' element value. to convey the application short name, for example KSK (kiosk), CMG (Customer Management GUI), ARDW etc.
     * 
     * @return value
     */
    public String getLocationId() {
        return locationId;
    }

    /** 
     * Set the 'locationId' element value. to convey the application short name, for example KSK (kiosk), CMG (Customer Management GUI), ARDW etc.
     * 
     * @param locationId
     */
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /** 
     * Get the 'location' element value. To convey the application type (customer GUI, Robot, Middleware...)
     * 
     * @return value
     */
    public String getLocation() {
        return location;
    }

    /** 
     * Set the 'location' element value. To convey the application type (customer GUI, Robot, Middleware...)
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
