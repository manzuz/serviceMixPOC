
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the Hotel Property information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelProperty_129121_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelUniqueId_188143_C_CUS_PNRDataFeed_132" name="hotelReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelProperty129121SCUSPNRDataFeed132
{
    private HotelUniqueId188143CCUSPNRDataFeed132 hotelReference;

    /** 
     * Get the 'hotelReference' element value. This composite is used to convey the hotel identifier.
     * 
     * @return value
     */
    public HotelUniqueId188143CCUSPNRDataFeed132 getHotelReference() {
        return hotelReference;
    }

    /** 
     * Set the 'hotelReference' element value. This composite is used to convey the hotel identifier.
     * 
     * @param hotelReference
     */
    public void setHotelReference(
            HotelUniqueId188143CCUSPNRDataFeed132 hotelReference) {
        this.hotelReference = hotelReference;
    }
}
