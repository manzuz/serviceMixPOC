
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the Hotel Property information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelProperty_36732_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelUniqueId_62842_C_CUS_PNRDataFeed_132" name="hotelReference"/>
 *     &lt;xs:element type="xs:string" name="hotelName"/>
 *     &lt;xs:element type="xs:string" name="fireSafetyIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelProperty36732SCUSPNRDataFeed132
{
    private HotelUniqueId62842CCUSPNRDataFeed132 hotelReference;
    private String hotelName;
    private String fireSafetyIndicator;

    /** 
     * Get the 'hotelReference' element value. This composite is used to convey the hotel identifier.
     * 
     * @return value
     */
    public HotelUniqueId62842CCUSPNRDataFeed132 getHotelReference() {
        return hotelReference;
    }

    /** 
     * Set the 'hotelReference' element value. This composite is used to convey the hotel identifier.
     * 
     * @param hotelReference
     */
    public void setHotelReference(
            HotelUniqueId62842CCUSPNRDataFeed132 hotelReference) {
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
