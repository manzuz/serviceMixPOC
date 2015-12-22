
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address_129098_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AddressUsage_188108_C_CUS_PNRDataFeed_132" name="addressUsageDetails" minOccurs="0"/>
 *     &lt;xs:element type="AddressDetails_188106_C_CUS_PNRDataFeed_132" name="addressDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="city" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="zipCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="CountrySubEntityDetails_188109_C_CUS_PNRDataFeed_132" name="regionDetails" minOccurs="0"/>
 *     &lt;xs:element type="LocationIdentification_188107_C_CUS_PNRDataFeed_132" name="locationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Address129098SCUSPNRDataFeed132
{
    private AddressUsage188108CCUSPNRDataFeed132 addressUsageDetails;
    private AddressDetails188106CCUSPNRDataFeed132 addressDetails;
    private String city;
    private String zipCode;
    private String countryCode;
    private CountrySubEntityDetails188109CCUSPNRDataFeed132 regionDetails;
    private LocationIdentification188107CCUSPNRDataFeed132 locationDetails;

    /** 
     * Get the 'addressUsageDetails' element value.
     * 
     * @return value
     */
    public AddressUsage188108CCUSPNRDataFeed132 getAddressUsageDetails() {
        return addressUsageDetails;
    }

    /** 
     * Set the 'addressUsageDetails' element value.
     * 
     * @param addressUsageDetails
     */
    public void setAddressUsageDetails(
            AddressUsage188108CCUSPNRDataFeed132 addressUsageDetails) {
        this.addressUsageDetails = addressUsageDetails;
    }

    /** 
     * Get the 'addressDetails' element value.
     * 
     * @return value
     */
    public AddressDetails188106CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value.
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            AddressDetails188106CCUSPNRDataFeed132 addressDetails) {
        this.addressDetails = addressDetails;
    }

    /** 
     * Get the 'city' element value. City name.
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'city' element value. City name.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'zipCode' element value. postal identification code.
     * 
     * @return value
     */
    public String getZipCode() {
        return zipCode;
    }

    /** 
     * Set the 'zipCode' element value. postal identification code.
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
    public CountrySubEntityDetails188109CCUSPNRDataFeed132 getRegionDetails() {
        return regionDetails;
    }

    /** 
     * Set the 'regionDetails' element value. To convey a sub-entity within a country : region, states..
     * 
     * @param regionDetails
     */
    public void setRegionDetails(
            CountrySubEntityDetails188109CCUSPNRDataFeed132 regionDetails) {
        this.regionDetails = regionDetails;
    }

    /** 
     * Get the 'locationDetails' element value.
     * 
     * @return value
     */
    public LocationIdentification188107CCUSPNRDataFeed132 getLocationDetails() {
        return locationDetails;
    }

    /** 
     * Set the 'locationDetails' element value.
     * 
     * @param locationDetails
     */
    public void setLocationDetails(
            LocationIdentification188107CCUSPNRDataFeed132 locationDetails) {
        this.locationDetails = locationDetails;
    }
}
