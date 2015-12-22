
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelUniqueId_62842_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="chainCode"/>
 *     &lt;xs:element type="xs:string" name="cityCode"/>
 *     &lt;xs:element type="xs:string" name="hotelCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelUniqueId62842CCUSPNRDataFeed132
{
    private String chainCode;
    private String cityCode;
    private String hotelCode;

    /** 
     * Get the 'chainCode' element value. To convey the chain code in the property ID
     * 
     * @return value
     */
    public String getChainCode() {
        return chainCode;
    }

    /** 
     * Set the 'chainCode' element value. To convey the chain code in the property ID
     * 
     * @param chainCode
     */
    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    /** 
     * Get the 'cityCode' element value. To convey the city code in the hotel Id
     * 
     * @return value
     */
    public String getCityCode() {
        return cityCode;
    }

    /** 
     * Set the 'cityCode' element value. To convey the city code in the hotel Id
     * 
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /** 
     * Get the 'hotelCode' element value. To convey the property code in the Hotel Id
     * 
     * @return value
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /** 
     * Set the 'hotelCode' element value. To convey the property code in the Hotel Id
     * 
     * @param hotelCode
     */
    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }
}
