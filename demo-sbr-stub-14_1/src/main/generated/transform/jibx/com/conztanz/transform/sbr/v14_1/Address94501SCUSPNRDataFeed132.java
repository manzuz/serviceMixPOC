
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address_94501_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AddressDetails_142112_C_CUS_PNRDataFeed_132" name="addressDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="city" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="zipCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Address94501SCUSPNRDataFeed132
{
    private AddressDetails142112CCUSPNRDataFeed132 addressDetails;
    private String city;
    private String zipCode;
    private String countryCode;

    /** 
     * Get the 'addressDetails' element value. will convey the adress text
     * 
     * @return value
     */
    public AddressDetails142112CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value. will convey the adress text
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            AddressDetails142112CCUSPNRDataFeed132 addressDetails) {
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
     * Get the 'countryCode' element value. Country code. ISO 3166 code for the country
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. Country code. ISO 3166 code for the country
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
