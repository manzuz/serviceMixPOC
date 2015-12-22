
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Location_62875_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cityCode"/>
 *     &lt;xs:element type="xs:string" name="cityName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Location62875CCUSPNRDataFeed132
{
    private String cityCode;
    private String cityName;

    /** 
     * Get the 'cityCode' element value. AIR segment : boarding point ATX segment : boarding point CAR segment : pick-up point city CCR segment : pick-up point city HHL segment : city code HTL segment : check-in city MIS segment : city code SUR segment : city/airport code Trn Amtrak sgt: board point city code Trn SNCF sgt: board point city code (RESARAIL code) TTO segment: departure location TUR segment: tour start city CRU segment: sailing departure port
     * 
     * @return value
     */
    public String getCityCode() {
        return cityCode;
    }

    /** 
     * Set the 'cityCode' element value. AIR segment : boarding point ATX segment : boarding point CAR segment : pick-up point city CCR segment : pick-up point city HHL segment : city code HTL segment : check-in city MIS segment : city code SUR segment : city/airport code Trn Amtrak sgt: board point city code Trn SNCF sgt: board point city code (RESARAIL code) TTO segment: departure location TUR segment: tour start city CRU segment: sailing departure port
     * 
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /** 
     * Get the 'cityName' element value. TRN SNCF segment : board point city name.
     * 
     * @return value
     */
    public String getCityName() {
        return cityName;
    }

    /** 
     * Set the 'cityName' element value. TRN SNCF segment : board point city name.
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
