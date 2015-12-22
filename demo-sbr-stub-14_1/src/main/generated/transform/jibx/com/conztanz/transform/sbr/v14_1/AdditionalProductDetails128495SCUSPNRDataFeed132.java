
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey additional information concerning an airline flight.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalProductDetails_128495_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AdditionalProductDetails_187256_C_CUS_PNRDataFeed_132" name="productDetails" minOccurs="0"/>
 *     &lt;xs:element type="StationInformation_187260_C_CUS_PNRDataFeed_132" name="departureStationInfo" minOccurs="0"/>
 *     &lt;xs:element type="StationInformation_187260_C_CUS_PNRDataFeed_132" name="arrivalStationInfo" minOccurs="0"/>
 *     &lt;xs:element type="MileageTimeDetails_187257_C_CUS_PNRDataFeed_132" name="mileageDetails" minOccurs="0"/>
 *     &lt;xs:element type="TravellerTimeDetails_187258_C_CUS_PNRDataFeed_132" name="travellerTimeDetails" minOccurs="0"/>
 *     &lt;xs:element type="ProductFacilities_187259_C_CUS_PNRDataFeed_132" name="equipmentInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalProductDetails128495SCUSPNRDataFeed132
{
    private AdditionalProductDetails187256CCUSPNRDataFeed132 productDetails;
    private StationInformation187260CCUSPNRDataFeed132 departureStationInfo;
    private StationInformation187260CCUSPNRDataFeed132 arrivalStationInfo;
    private MileageTimeDetails187257CCUSPNRDataFeed132 mileageDetails;
    private TravellerTimeDetails187258CCUSPNRDataFeed132 travellerTimeDetails;
    private ProductFacilities187259CCUSPNRDataFeed132 equipmentInformation;

    /** 
     * Get the 'productDetails' element value.
     * 
     * @return value
     */
    public AdditionalProductDetails187256CCUSPNRDataFeed132 getProductDetails() {
        return productDetails;
    }

    /** 
     * Set the 'productDetails' element value.
     * 
     * @param productDetails
     */
    public void setProductDetails(
            AdditionalProductDetails187256CCUSPNRDataFeed132 productDetails) {
        this.productDetails = productDetails;
    }

    /** 
     * Get the 'departureStationInfo' element value.
     * 
     * @return value
     */
    public StationInformation187260CCUSPNRDataFeed132 getDepartureStationInfo() {
        return departureStationInfo;
    }

    /** 
     * Set the 'departureStationInfo' element value.
     * 
     * @param departureStationInfo
     */
    public void setDepartureStationInfo(
            StationInformation187260CCUSPNRDataFeed132 departureStationInfo) {
        this.departureStationInfo = departureStationInfo;
    }

    /** 
     * Get the 'arrivalStationInfo' element value.
     * 
     * @return value
     */
    public StationInformation187260CCUSPNRDataFeed132 getArrivalStationInfo() {
        return arrivalStationInfo;
    }

    /** 
     * Set the 'arrivalStationInfo' element value.
     * 
     * @param arrivalStationInfo
     */
    public void setArrivalStationInfo(
            StationInformation187260CCUSPNRDataFeed132 arrivalStationInfo) {
        this.arrivalStationInfo = arrivalStationInfo;
    }

    /** 
     * Get the 'mileageDetails' element value.
     * 
     * @return value
     */
    public MileageTimeDetails187257CCUSPNRDataFeed132 getMileageDetails() {
        return mileageDetails;
    }

    /** 
     * Set the 'mileageDetails' element value.
     * 
     * @param mileageDetails
     */
    public void setMileageDetails(
            MileageTimeDetails187257CCUSPNRDataFeed132 mileageDetails) {
        this.mileageDetails = mileageDetails;
    }

    /** 
     * Get the 'travellerTimeDetails' element value.
     * 
     * @return value
     */
    public TravellerTimeDetails187258CCUSPNRDataFeed132 getTravellerTimeDetails() {
        return travellerTimeDetails;
    }

    /** 
     * Set the 'travellerTimeDetails' element value.
     * 
     * @param travellerTimeDetails
     */
    public void setTravellerTimeDetails(
            TravellerTimeDetails187258CCUSPNRDataFeed132 travellerTimeDetails) {
        this.travellerTimeDetails = travellerTimeDetails;
    }

    /** 
     * Get the 'equipmentInformation' element value. additional information on equipment
     * 
     * @return value
     */
    public ProductFacilities187259CCUSPNRDataFeed132 getEquipmentInformation() {
        return equipmentInformation;
    }

    /** 
     * Set the 'equipmentInformation' element value. additional information on equipment
     * 
     * @param equipmentInformation
     */
    public void setEquipmentInformation(
            ProductFacilities187259CCUSPNRDataFeed132 equipmentInformation) {
        this.equipmentInformation = equipmentInformation;
    }
}
