
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CarEasyContentInformation_147046_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="VehicleInformation_128755_S_CUS_PNRDataFeed_132" name="vehicleInformation"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_pickupDropoffLocations_147049_G_CUS_PNRDataFeed_1322" name="pickupDropoffLocations" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredPeriodInformation_128769_S_CUS_PNRDataFeed_132" name="pickupDropoffTimes"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_rateCodeGroup_147047_G_CUS_PNRDataFeed_1322" name="rateCodeGroup" minOccurs="0"/>
 *     &lt;xs:element type="ConsumerReferenceInformation_128775_S_CUS_PNRDataFeed_132" name="customerInfo" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_128793_S_CUS_PNRDataFeed_132" name="rateInfo" minOccurs="0" maxOccurs="10"/>
 *     &lt;xs:element type="NumberOfUnits_128776_S_CUS_PNRDataFeed_132" name="numberOfDrivers"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_rateDetails_147048_G_CUS_PNRDataFeed_1322" name="rateDetails" minOccurs="0"/>
 *     &lt;xs:element type="Attribute_128825_S_CUS_PNRDataFeed_132" name="otherInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CarEasyContentInformation147046GCUSPNRDataFeed1322
{
    private VehicleInformation128755SCUSPNRDataFeed132 vehicleInformation;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocations147049GCUSPNRDataFeed1322> pickupDropoffLocationList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocations147049GCUSPNRDataFeed1322>();
    private StructuredPeriodInformation128769SCUSPNRDataFeed132 pickupDropoffTimes;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsRateCodeGroup147047GCUSPNRDataFeed1322 rateCodeGroup;
    private ConsumerReferenceInformation128775SCUSPNRDataFeed132 customerInfo;
    private List<TariffInformation128793SCUSPNRDataFeed132> rateInfoList = new ArrayList<TariffInformation128793SCUSPNRDataFeed132>();
    private NumberOfUnits128776SCUSPNRDataFeed132 numberOfDrivers;
    private StructuredBookingRecordImageTypeOriginDestinationDetailsRateDetails147048GCUSPNRDataFeed1322 rateDetails;
    private Attribute128825SCUSPNRDataFeed132 otherInformation;

    /** 
     * Get the 'vehicleInformation' element value. Vehicle information - vehicle type (SIPP code), - vehicle special equipments - vehicle details    (Car make model,     Number of doors,...)
     * 
     * @return value
     */
    public VehicleInformation128755SCUSPNRDataFeed132 getVehicleInformation() {
        return vehicleInformation;
    }

    /** 
     * Set the 'vehicleInformation' element value. Vehicle information - vehicle type (SIPP code), - vehicle special equipments - vehicle details    (Car make model,     Number of doors,...)
     * 
     * @param vehicleInformation
     */
    public void setVehicleInformation(
            VehicleInformation128755SCUSPNRDataFeed132 vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    /** 
     * Get the list of 'pickupDropoffLocations' element items. Pick-up and Drop-off locations information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocations147049GCUSPNRDataFeed1322> getPickupDropoffLocationList() {
        return pickupDropoffLocationList;
    }

    /** 
     * Set the list of 'pickupDropoffLocations' element items. Pick-up and Drop-off locations information
     * 
     * @param list
     */
    public void setPickupDropoffLocationList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsPickupDropoffLocations147049GCUSPNRDataFeed1322> list) {
        pickupDropoffLocationList = list;
    }

    /** 
     * Get the 'pickupDropoffTimes' element value. This segment is used to convey the pick-up and drop-off dates and times of the rental.
     * 
     * @return value
     */
    public StructuredPeriodInformation128769SCUSPNRDataFeed132 getPickupDropoffTimes() {
        return pickupDropoffTimes;
    }

    /** 
     * Set the 'pickupDropoffTimes' element value. This segment is used to convey the pick-up and drop-off dates and times of the rental.
     * 
     * @param pickupDropoffTimes
     */
    public void setPickupDropoffTimes(
            StructuredPeriodInformation128769SCUSPNRDataFeed132 pickupDropoffTimes) {
        this.pickupDropoffTimes = pickupDropoffTimes;
    }

    /** 
     * Get the 'rateCodeGroup' element value. Rate Code Information Group
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsRateCodeGroup147047GCUSPNRDataFeed1322 getRateCodeGroup() {
        return rateCodeGroup;
    }

    /** 
     * Set the 'rateCodeGroup' element value. Rate Code Information Group
     * 
     * @param rateCodeGroup
     */
    public void setRateCodeGroup(
            StructuredBookingRecordImageTypeOriginDestinationDetailsRateCodeGroup147047GCUSPNRDataFeed1322 rateCodeGroup) {
        this.rateCodeGroup = rateCodeGroup;
    }

    /** 
     * Get the 'customerInfo' element value. Customer information: Id, CD and PC numbers.
     * 
     * @return value
     */
    public ConsumerReferenceInformation128775SCUSPNRDataFeed132 getCustomerInfo() {
        return customerInfo;
    }

    /** 
     * Set the 'customerInfo' element value. Customer information: Id, CD and PC numbers.
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(
            ConsumerReferenceInformation128775SCUSPNRDataFeed132 customerInfo) {
        this.customerInfo = customerInfo;
    }

    /** 
     * Get the list of 'rateInfo' element items. This segments is used to convey: 1)General Rate information (identifier, plan, category) and Unstructured RB/RQ/RG 2) Structured rate quoted (RQ) or guaranted (RG) 3) Structured base rate (RB) 4) Estimated total information 5) Drop amount data 6) Voucher coupon print references (VV) 7) Rate Override (RO) 8) Modification fee indicator 9) Cancellation fee indicator 10) prepayment
     * 
     * @return list
     */
    public List<TariffInformation128793SCUSPNRDataFeed132> getRateInfoList() {
        return rateInfoList;
    }

    /** 
     * Set the list of 'rateInfo' element items. This segments is used to convey: 1)General Rate information (identifier, plan, category) and Unstructured RB/RQ/RG 2) Structured rate quoted (RQ) or guaranted (RG) 3) Structured base rate (RB) 4) Estimated total information 5) Drop amount data 6) Voucher coupon print references (VV) 7) Rate Override (RO) 8) Modification fee indicator 9) Cancellation fee indicator 10) prepayment
     * 
     * @param list
     */
    public void setRateInfoList(
            List<TariffInformation128793SCUSPNRDataFeed132> list) {
        rateInfoList = list;
    }

    /** 
     * Get the 'numberOfDrivers' element value. Information on the number of drivers associated to the Car rental.
     * 
     * @return value
     */
    public NumberOfUnits128776SCUSPNRDataFeed132 getNumberOfDrivers() {
        return numberOfDrivers;
    }

    /** 
     * Set the 'numberOfDrivers' element value. Information on the number of drivers associated to the Car rental.
     * 
     * @param numberOfDrivers
     */
    public void setNumberOfDrivers(
            NumberOfUnits128776SCUSPNRDataFeed132 numberOfDrivers) {
        this.numberOfDrivers = numberOfDrivers;
    }

    /** 
     * Get the 'rateDetails' element value. Conveys all Rate details information.
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeOriginDestinationDetailsRateDetails147048GCUSPNRDataFeed1322 getRateDetails() {
        return rateDetails;
    }

    /** 
     * Set the 'rateDetails' element value. Conveys all Rate details information.
     * 
     * @param rateDetails
     */
    public void setRateDetails(
            StructuredBookingRecordImageTypeOriginDestinationDetailsRateDetails147048GCUSPNRDataFeed1322 rateDetails) {
        this.rateDetails = rateDetails;
    }

    /** 
     * Get the 'otherInformation' element value. Used to convey any key/value information that is not defined in other structured segments.
     * 
     * @return value
     */
    public Attribute128825SCUSPNRDataFeed132 getOtherInformation() {
        return otherInformation;
    }

    /** 
     * Set the 'otherInformation' element value. Used to convey any key/value information that is not defined in other structured segments.
     * 
     * @param otherInformation
     */
    public void setOtherInformation(
            Attribute128825SCUSPNRDataFeed132 otherInformation) {
        this.otherInformation = otherInformation;
    }
}
