
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address_87614_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AddressUsage_132931_C_CUS_PNRDataFeed_132" name="addressUsageDetails"/>
 *     &lt;xs:element type="AddressDetails_132929_C_CUS_PNRDataFeed_132" name="addressDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="city" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="zipCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="CountrySubEntityDetails_132932_C_CUS_PNRDataFeed_132" name="regionDetails" minOccurs="0"/>
 *     &lt;xs:element type="LocationIdentification_132930_C_CUS_PNRDataFeed_132" name="locationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Address87614SCUSPNRDataFeed132
{
    private AddressUsage132931CCUSPNRDataFeed132 addressUsageDetails;
    private AddressDetails132929CCUSPNRDataFeed132 addressDetails;
    private String city;
    private String zipCode;
    private String countryCode;
    private CountrySubEntityDetails132932CCUSPNRDataFeed132 regionDetails;
    private LocationIdentification132930CCUSPNRDataFeed132 locationDetails;

    /** 
     * Get the 'addressUsageDetails' element value. Address Type
     * 
     * @return value
     */
    public AddressUsage132931CCUSPNRDataFeed132 getAddressUsageDetails() {
        return addressUsageDetails;
    }

    /** 
     * Set the 'addressUsageDetails' element value. Address Type
     * 
     * @param addressUsageDetails
     */
    public void setAddressUsageDetails(
            AddressUsage132931CCUSPNRDataFeed132 addressUsageDetails) {
        this.addressUsageDetails = addressUsageDetails;
    }

    /** 
     * Get the 'addressDetails' element value. Format 1 - Home Delivery/Collection
     * 
     * @return value
     */
    public AddressDetails132929CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value. Format 1 - Home Delivery/Collection
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            AddressDetails132929CCUSPNRDataFeed132 addressDetails) {
        this.addressDetails = addressDetails;
    }

    /** 
     * Get the 'city' element value. City name
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'city' element value. City name
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
    public CountrySubEntityDetails132932CCUSPNRDataFeed132 getRegionDetails() {
        return regionDetails;
    }

    /** 
     * Set the 'regionDetails' element value. To convey a sub-entity within a country : region, states..
     * 
     * @param regionDetails
     */
    public void setRegionDetails(
            CountrySubEntityDetails132932CCUSPNRDataFeed132 regionDetails) {
        this.regionDetails = regionDetails;
    }

    /** 
     * Get the 'locationDetails' element value. Format 2 - Site Delivery/Collection
     * 
     * @return value
     */
    public LocationIdentification132930CCUSPNRDataFeed132 getLocationDetails() {
        return locationDetails;
    }

    /** 
     * Set the 'locationDetails' element value. Format 2 - Site Delivery/Collection
     * 
     * @param locationDetails
     */
    public void setLocationDetails(
            LocationIdentification132930CCUSPNRDataFeed132 locationDetails) {
        this.locationDetails = locationDetails;
    }
}
