
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address_87625_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AddressDetails_132948_C_CUS_PNRDataFeed_132" name="addressDetails"/>
 *     &lt;xs:element type="xs:string" name="city" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="zipCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="CountrySubEntityDetails_132951_C_CUS_PNRDataFeed_132" name="regionDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Address87625SCUSPNRDataFeed132
{
    private AddressDetails132948CCUSPNRDataFeed132 addressDetails;
    private String city;
    private String zipCode;
    private String countryCode;
    private CountrySubEntityDetails132951CCUSPNRDataFeed132 regionDetails;

    /** 
     * Get the 'addressDetails' element value. Location address
     * 
     * @return value
     */
    public AddressDetails132948CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value. Location address
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            AddressDetails132948CCUSPNRDataFeed132 addressDetails) {
        this.addressDetails = addressDetails;
    }

    /** 
     * Get the 'city' element value. City Name
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'city' element value. City Name
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'zipCode' element value. Postal Code
     * 
     * @return value
     */
    public String getZipCode() {
        return zipCode;
    }

    /** 
     * Set the 'zipCode' element value. Postal Code
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** 
     * Get the 'countryCode' element value. Country code
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. Country code
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'regionDetails' element value. To convey a sub-entity within a country : region, states..
     * 
     * @return value
     */
    public CountrySubEntityDetails132951CCUSPNRDataFeed132 getRegionDetails() {
        return regionDetails;
    }

    /** 
     * Set the 'regionDetails' element value. To convey a sub-entity within a country : region, states..
     * 
     * @param regionDetails
     */
    public void setRegionDetails(
            CountrySubEntityDetails132951CCUSPNRDataFeed132 regionDetails) {
        this.regionDetails = regionDetails;
    }
}
