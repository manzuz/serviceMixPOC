
package com.conztanz.transform.sbr.v14_1;

/** 
 * contains information about the total price plan
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InsuranceProviderAndProducts_128668_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="tripType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="tourOperator" minOccurs="0"/>
 *     &lt;xs:element type="Countrydescription_187466_C_CUS_PNRDataFeed_132" name="countryInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InsuranceProviderAndProducts128668SCUSPNRDataFeed132
{
    private String tripType;
    private String tourOperator;
    private Countrydescription187466CCUSPNRDataFeed132 countryInfo;

    /** 
     * Get the 'tripType' element value. Type of trip (package. leisure etc...)
     * 
     * @return value
     */
    public String getTripType() {
        return tripType;
    }

    /** 
     * Set the 'tripType' element value. Type of trip (package. leisure etc...)
     * 
     * @param tripType
     */
    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    /** 
     * Get the 'tourOperator' element value. Code of the operator who provides the TOUR.
     * 
     * @return value
     */
    public String getTourOperator() {
        return tourOperator;
    }

    /** 
     * Set the 'tourOperator' element value. Code of the operator who provides the TOUR.
     * 
     * @param tourOperator
     */
    public void setTourOperator(String tourOperator) {
        this.tourOperator = tourOperator;
    }

    /** 
     * Get the 'countryInfo' element value. To specify the countries involved in the Travel assistance element.
     * 
     * @return value
     */
    public Countrydescription187466CCUSPNRDataFeed132 getCountryInfo() {
        return countryInfo;
    }

    /** 
     * Set the 'countryInfo' element value. To specify the countries involved in the Travel assistance element.
     * 
     * @param countryInfo
     */
    public void setCountryInfo(
            Countrydescription187466CCUSPNRDataFeed132 countryInfo) {
        this.countryInfo = countryInfo;
    }
}
