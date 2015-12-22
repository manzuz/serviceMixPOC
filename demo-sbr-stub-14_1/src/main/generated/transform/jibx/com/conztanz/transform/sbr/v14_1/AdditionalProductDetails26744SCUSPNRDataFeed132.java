
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey additional information concerning an airline flight
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalProductDetails_26744_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AdditionalProductDetails_48594_C_CUS_PNRDataFeed_132" name="productDetails" minOccurs="0"/>
 *     &lt;xs:element type="StationInformation_4040_C_CUS_PNRDataFeed_132" name="departureInformation" minOccurs="0"/>
 *     &lt;xs:element type="StationInformation_48257_C_CUS_PNRDataFeed_132" name="arrivalInformation" minOccurs="0"/>
 *     &lt;xs:element type="TravellerTimeDetails_2789_C_CUS_PNRDataFeed_132" name="timeDetail" minOccurs="0"/>
 *     &lt;xs:element type="ProductFacilities_48593_C_CUS_PNRDataFeed_132" name="facilities" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalProductDetails26744SCUSPNRDataFeed132
{
    private AdditionalProductDetails48594CCUSPNRDataFeed132 productDetails;
    private StationInformation4040CCUSPNRDataFeed132 departureInformation;
    private StationInformation48257CCUSPNRDataFeed132 arrivalInformation;
    private TravellerTimeDetails2789CCUSPNRDataFeed132 timeDetail;
    private List<ProductFacilities48593CCUSPNRDataFeed132> facilityList = new ArrayList<ProductFacilities48593CCUSPNRDataFeed132>();

    /** 
     * Get the 'productDetails' element value. Product details : Equipment, number of stops ...
     * 
     * @return value
     */
    public AdditionalProductDetails48594CCUSPNRDataFeed132 getProductDetails() {
        return productDetails;
    }

    /** 
     * Set the 'productDetails' element value. Product details : Equipment, number of stops ...
     * 
     * @param productDetails
     */
    public void setProductDetails(
            AdditionalProductDetails48594CCUSPNRDataFeed132 productDetails) {
        this.productDetails = productDetails;
    }

    /** 
     * Get the 'departureInformation' element value. 1. Air segment: Departure information
     * 
     * @return value
     */
    public StationInformation4040CCUSPNRDataFeed132 getDepartureInformation() {
        return departureInformation;
    }

    /** 
     * Set the 'departureInformation' element value. 1. Air segment: Departure information
     * 
     * @param departureInformation
     */
    public void setDepartureInformation(
            StationInformation4040CCUSPNRDataFeed132 departureInformation) {
        this.departureInformation = departureInformation;
    }

    /** 
     * Get the 'arrivalInformation' element value. 1. Air segment: Arrival information
     * 
     * @return value
     */
    public StationInformation48257CCUSPNRDataFeed132 getArrivalInformation() {
        return arrivalInformation;
    }

    /** 
     * Set the 'arrivalInformation' element value. 1. Air segment: Arrival information
     * 
     * @param arrivalInformation
     */
    public void setArrivalInformation(
            StationInformation48257CCUSPNRDataFeed132 arrivalInformation) {
        this.arrivalInformation = arrivalInformation;
    }

    /** 
     * Get the 'timeDetail' element value. Traveller time detail : First time, second time, check in time
     * 
     * @return value
     */
    public TravellerTimeDetails2789CCUSPNRDataFeed132 getTimeDetail() {
        return timeDetail;
    }

    /** 
     * Set the 'timeDetail' element value. Traveller time detail : First time, second time, check in time
     * 
     * @param timeDetail
     */
    public void setTimeDetail(
            TravellerTimeDetails2789CCUSPNRDataFeed132 timeDetail) {
        this.timeDetail = timeDetail;
    }

    /** 
     * Get the list of 'facilities' element items. Product facilities  (entertainment and meal)
     * 
     * @return list
     */
    public List<ProductFacilities48593CCUSPNRDataFeed132> getFacilityList() {
        return facilityList;
    }

    /** 
     * Set the list of 'facilities' element items. Product facilities  (entertainment and meal)
     * 
     * @param list
     */
    public void setFacilityList(
            List<ProductFacilities48593CCUSPNRDataFeed132> list) {
        facilityList = list;
    }
}
