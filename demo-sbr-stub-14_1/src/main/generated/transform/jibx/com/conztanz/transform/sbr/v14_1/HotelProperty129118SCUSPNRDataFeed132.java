
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the Hotel Property information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelProperty_129118_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelUniqueId_188138_C_CUS_PNRDataFeed_132" name="hotelReference" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="hotelName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fireSafetyIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelProperty129118SCUSPNRDataFeed132
{
    private HotelUniqueId188138CCUSPNRDataFeed132 hotelReference;
    private String hotelName;
    private String fireSafetyIndicator;

    /** 
     * Get the 'hotelReference' element value. Hotel identification
     * 
     * @return value
     */
    public HotelUniqueId188138CCUSPNRDataFeed132 getHotelReference() {
        return hotelReference;
    }

    /** 
     * Set the 'hotelReference' element value. Hotel identification
     * 
     * @param hotelReference
     */
    public void setHotelReference(
            HotelUniqueId188138CCUSPNRDataFeed132 hotelReference) {
        this.hotelReference = hotelReference;
    }

    /** 
     * Get the 'hotelName' element value. This composite is used to convey the hotel name
     * 
     * @return value
     */
    public String getHotelName() {
        return hotelName;
    }

    /** 
     * Set the 'hotelName' element value. This composite is used to convey the hotel name
     * 
     * @param hotelName
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /** 
     * Get the 'fireSafetyIndicator' element value. This data element is used to indicates if the hotel is compliant with the fire safety rules.
     * 
     * @return value
     */
    public String getFireSafetyIndicator() {
        return fireSafetyIndicator;
    }

    /** 
     * Set the 'fireSafetyIndicator' element value. This data element is used to indicates if the hotel is compliant with the fire safety rules.
     * 
     * @param fireSafetyIndicator
     */
    public void setFireSafetyIndicator(String fireSafetyIndicator) {
        this.fireSafetyIndicator = fireSafetyIndicator;
    }
}
