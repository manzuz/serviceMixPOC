
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Location_62876_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cityCode"/>
 *     &lt;xs:element type="xs:string" name="cityName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Location62876CCUSPNRDataFeed132
{
    private String cityCode;
    private String cityName;

    /** 
     * Get the 'cityCode' element value. AIR segment : off point ATX segment : off point Trn Amtrak sgt: off point city code Trn SNCF sgt: off point city code (RESARAIL code) CRU segment: sailing arrival port
     * 
     * @return value
     */
    public String getCityCode() {
        return cityCode;
    }

    /** 
     * Set the 'cityCode' element value. AIR segment : off point ATX segment : off point Trn Amtrak sgt: off point city code Trn SNCF sgt: off point city code (RESARAIL code) CRU segment: sailing arrival port
     * 
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /** 
     * Get the 'cityName' element value. TRN SNCF segment : off point city name.
     * 
     * @return value
     */
    public String getCityName() {
        return cityName;
    }

    /** 
     * Set the 'cityName' element value. TRN SNCF segment : off point city name.
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
