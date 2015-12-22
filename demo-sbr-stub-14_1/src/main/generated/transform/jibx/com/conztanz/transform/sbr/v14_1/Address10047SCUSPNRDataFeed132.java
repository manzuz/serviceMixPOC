
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address_10047_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AddressDetails_17987_C_CUS_PNRDataFeed_132" name="addressDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="city" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="zipCode" minOccurs="0"/>
 *     &lt;xs:element type="CountrySubEntityDetails_17993_C_CUS_PNRDataFeed_132" name="regionDetails" minOccurs="0"/>
 *     &lt;xs:element type="LocationIdentification_17991_C_CUS_PNRDataFeed_132" name="locationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Address10047SCUSPNRDataFeed132
{
    private AddressDetails17987CCUSPNRDataFeed132 addressDetails;
    private String city;
    private String zipCode;
    private CountrySubEntityDetails17993CCUSPNRDataFeed132 regionDetails;
    private LocationIdentification17991CCUSPNRDataFeed132 locationDetails;

    /** 
     * Get the 'addressDetails' element value. to specify the information of the address
     * 
     * @return value
     */
    public AddressDetails17987CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value. to specify the information of the address
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            AddressDetails17987CCUSPNRDataFeed132 addressDetails) {
        this.addressDetails = addressDetails;
    }

    /** 
     * Get the 'city' element value. city name of the given address
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'city' element value. city name of the given address
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'zipCode' element value. zip code of the given address
     * 
     * @return value
     */
    public String getZipCode() {
        return zipCode;
    }

    /** 
     * Set the 'zipCode' element value. zip code of the given address
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** 
     * Get the 'regionDetails' element value. To convey a sub-entity within a country : region, states..
     * 
     * @return value
     */
    public CountrySubEntityDetails17993CCUSPNRDataFeed132 getRegionDetails() {
        return regionDetails;
    }

    /** 
     * Set the 'regionDetails' element value. To convey a sub-entity within a country : region, states..
     * 
     * @param regionDetails
     */
    public void setRegionDetails(
            CountrySubEntityDetails17993CCUSPNRDataFeed132 regionDetails) {
        this.regionDetails = regionDetails;
    }

    /** 
     * Get the 'locationDetails' element value. to specify the countryname
     * 
     * @return value
     */
    public LocationIdentification17991CCUSPNRDataFeed132 getLocationDetails() {
        return locationDetails;
    }

    /** 
     * Set the 'locationDetails' element value. to specify the countryname
     * 
     * @param locationDetails
     */
    public void setLocationDetails(
            LocationIdentification17991CCUSPNRDataFeed132 locationDetails) {
        this.locationDetails = locationDetails;
    }
}
