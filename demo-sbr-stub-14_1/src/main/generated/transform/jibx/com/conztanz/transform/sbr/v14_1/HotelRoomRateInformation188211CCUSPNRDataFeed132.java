
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelRoomRateInformation_188211_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="roomType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="ratePlanCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="rateCategoryCode" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="xs:string" name="rateQualifiedIndic" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelRoomRateInformation188211CCUSPNRDataFeed132
{
    private String roomType;
    private String ratePlanCode;
    private List<String> rateCategoryCodeList = new ArrayList<String>();
    private List<String> rateQualifiedIndicList = new ArrayList<String>();

    /** 
     * Get the 'roomType' element value. This data element is used to convey the room type
     * 
     * @return value
     */
    public String getRoomType() {
        return roomType;
    }

    /** 
     * Set the 'roomType' element value. This data element is used to convey the room type
     * 
     * @param roomType
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /** 
     * Get the 'ratePlanCode' element value. This data element is used to convey the hotel rate code
     * 
     * @return value
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /** 
     * Set the 'ratePlanCode' element value. This data element is used to convey the hotel rate code
     * 
     * @param ratePlanCode
     */
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    /** 
     * Get the list of 'rateCategoryCode' element items. This data element is used to convey the hotel rate category code
     * 
     * @return list
     */
    public List<String> getRateCategoryCodeList() {
        return rateCategoryCodeList;
    }

    /** 
     * Set the list of 'rateCategoryCode' element items. This data element is used to convey the hotel rate category code
     * 
     * @param list
     */
    public void setRateCategoryCodeList(List<String> list) {
        rateCategoryCodeList = list;
    }

    /** 
     * Get the list of 'rateQualifiedIndic' element items. This data element is used to indicate if the rate code is a qualified rate code or not.
     * 
     * @return list
     */
    public List<String> getRateQualifiedIndicList() {
        return rateQualifiedIndicList;
    }

    /** 
     * Set the list of 'rateQualifiedIndic' element items. This data element is used to indicate if the rate code is a qualified rate code or not.
     * 
     * @param list
     */
    public void setRateQualifiedIndicList(List<String> list) {
        rateQualifiedIndicList = list;
    }
}