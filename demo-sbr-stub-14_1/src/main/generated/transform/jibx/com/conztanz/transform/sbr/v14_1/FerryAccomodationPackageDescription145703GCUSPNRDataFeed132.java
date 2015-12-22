
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryAccomodationPackageDescription_145703_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductInformation_129123_S_CUS_PNRDataFeed_132" name="packageCode"/>
 *     &lt;xs:element type="HotelProperty_129121_S_CUS_PNRDataFeed_132" name="hotelInformation" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_129124_S_CUS_PNRDataFeed_132" name="hotelCheckInInformation" minOccurs="0"/>
 *     &lt;xs:element type="PlaceLocationIdentification_129122_S_CUS_PNRDataFeed_132" name="areaCodeInfo" minOccurs="0"/>
 *     &lt;xs:element type="NumberOfUnits_129120_S_CUS_PNRDataFeed_132" name="numberOfNights" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_129125_S_CUS_PNRDataFeed_132" name="hotelItemPrice" minOccurs="0"/>
 *     &lt;xs:element type="FerryAccomodationPackageDescription_roomInfoGroup_145704_G_CUS_PNRDataFeed_132" name="roomInfoGroup" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryAccomodationPackageDescription145703GCUSPNRDataFeed132
{
    private ProductInformation129123SCUSPNRDataFeed132 packageCode;
    private HotelProperty129121SCUSPNRDataFeed132 hotelInformation;
    private StructuredDateTimeInformation129124SCUSPNRDataFeed132 hotelCheckInInformation;
    private PlaceLocationIdentification129122SCUSPNRDataFeed132 areaCodeInfo;
    private NumberOfUnits129120SCUSPNRDataFeed132 numberOfNights;
    private TariffInformation129125SCUSPNRDataFeed132 hotelItemPrice;
    private List<FerryAccomodationPackageDescriptionRoomInfoGroup145704GCUSPNRDataFeed132> roomInfoGroupList = new ArrayList<FerryAccomodationPackageDescriptionRoomInfoGroup145704GCUSPNRDataFeed132>();

    /** 
     * Get the 'packageCode' element value. This segment conveys the package code.
     * 
     * @return value
     */
    public ProductInformation129123SCUSPNRDataFeed132 getPackageCode() {
        return packageCode;
    }

    /** 
     * Set the 'packageCode' element value. This segment conveys the package code.
     * 
     * @param packageCode
     */
    public void setPackageCode(
            ProductInformation129123SCUSPNRDataFeed132 packageCode) {
        this.packageCode = packageCode;
    }

    /** 
     * Get the 'hotelInformation' element value. This segment conveys the hotel code the of the accomodation package to which it is attached.
     * 
     * @return value
     */
    public HotelProperty129121SCUSPNRDataFeed132 getHotelInformation() {
        return hotelInformation;
    }

    /** 
     * Set the 'hotelInformation' element value. This segment conveys the hotel code the of the accomodation package to which it is attached.
     * 
     * @param hotelInformation
     */
    public void setHotelInformation(
            HotelProperty129121SCUSPNRDataFeed132 hotelInformation) {
        this.hotelInformation = hotelInformation;
    }

    /** 
     * Get the 'hotelCheckInInformation' element value. This segment conveys the check-in date and time for the accomodation package to which it is attached.
     * 
     * @return value
     */
    public StructuredDateTimeInformation129124SCUSPNRDataFeed132 getHotelCheckInInformation() {
        return hotelCheckInInformation;
    }

    /** 
     * Set the 'hotelCheckInInformation' element value. This segment conveys the check-in date and time for the accomodation package to which it is attached.
     * 
     * @param hotelCheckInInformation
     */
    public void setHotelCheckInInformation(
            StructuredDateTimeInformation129124SCUSPNRDataFeed132 hotelCheckInInformation) {
        this.hotelCheckInInformation = hotelCheckInInformation;
    }

    /** 
     * Get the 'areaCodeInfo' element value. This segment is used to convey the hotel area code information.
     * 
     * @return value
     */
    public PlaceLocationIdentification129122SCUSPNRDataFeed132 getAreaCodeInfo() {
        return areaCodeInfo;
    }

    /** 
     * Set the 'areaCodeInfo' element value. This segment is used to convey the hotel area code information.
     * 
     * @param areaCodeInfo
     */
    public void setAreaCodeInfo(
            PlaceLocationIdentification129122SCUSPNRDataFeed132 areaCodeInfo) {
        this.areaCodeInfo = areaCodeInfo;
    }

    /** 
     * Get the 'numberOfNights' element value. This segment is used to give the number of nights spent in the accomodation package to which it is attached.
     * 
     * @return value
     */
    public NumberOfUnits129120SCUSPNRDataFeed132 getNumberOfNights() {
        return numberOfNights;
    }

    /** 
     * Set the 'numberOfNights' element value. This segment is used to give the number of nights spent in the accomodation package to which it is attached.
     * 
     * @param numberOfNights
     */
    public void setNumberOfNights(
            NumberOfUnits129120SCUSPNRDataFeed132 numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    /** 
     * Get the 'hotelItemPrice' element value. This segment is used to convey the price of the accomodation to which it is attached.
     * 
     * @return value
     */
    public TariffInformation129125SCUSPNRDataFeed132 getHotelItemPrice() {
        return hotelItemPrice;
    }

    /** 
     * Set the 'hotelItemPrice' element value. This segment is used to convey the price of the accomodation to which it is attached.
     * 
     * @param hotelItemPrice
     */
    public void setHotelItemPrice(
            TariffInformation129125SCUSPNRDataFeed132 hotelItemPrice) {
        this.hotelItemPrice = hotelItemPrice;
    }

    /** 
     * Get the list of 'roomInfoGroup' element items. This segment is used to give details about the rooms (if any) lined to the accomodation package.
     * 
     * @return list
     */
    public List<FerryAccomodationPackageDescriptionRoomInfoGroup145704GCUSPNRDataFeed132> getRoomInfoGroupList() {
        return roomInfoGroupList;
    }

    /** 
     * Set the list of 'roomInfoGroup' element items. This segment is used to give details about the rooms (if any) lined to the accomodation package.
     * 
     * @param list
     */
    public void setRoomInfoGroupList(
            List<FerryAccomodationPackageDescriptionRoomInfoGroup145704GCUSPNRDataFeed132> list) {
        roomInfoGroupList = list;
    }
}
