
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address_129172_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AddressDetails_188217_C_CUS_PNRDataFeed_132" name="addressDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="city" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="zipCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="LocationIdentification_188218_C_CUS_PNRDataFeed_132" name="locationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Address129172SCUSPNRDataFeed132
{
    private AddressDetails188217CCUSPNRDataFeed132 addressDetails;
    private String city;
    private String zipCode;
    private String countryCode;
    private LocationIdentification188218CCUSPNRDataFeed132 locationDetails;

    /** 
     * Get the 'addressDetails' element value.
     * 
     * @return value
     */
    public AddressDetails188217CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value.
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            AddressDetails188217CCUSPNRDataFeed132 addressDetails) {
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
     * Get the 'locationDetails' element value.
     * 
     * @return value
     */
    public LocationIdentification188218CCUSPNRDataFeed132 getLocationDetails() {
        return locationDetails;
    }

    /** 
     * Set the 'locationDetails' element value.
     * 
     * @param locationDetails
     */
    public void setLocationDetails(
            LocationIdentification188218CCUSPNRDataFeed132 locationDetails) {
        this.locationDetails = locationDetails;
    }
}
