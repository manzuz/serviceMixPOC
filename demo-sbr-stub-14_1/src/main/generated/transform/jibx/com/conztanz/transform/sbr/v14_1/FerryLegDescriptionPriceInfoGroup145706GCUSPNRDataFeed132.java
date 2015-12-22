
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryLegDescription_priceInfoGroup_145706_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_129133_S_CUS_PNRDataFeed_132" name="routePriceInformation"/>
 *     &lt;xs:element type="Attribute_129131_S_CUS_PNRDataFeed_132" name="passengerCategoryType"/>
 *     &lt;xs:element type="NumberOfUnits_129132_S_CUS_PNRDataFeed_132" name="numberOfPassengers"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryLegDescriptionPriceInfoGroup145706GCUSPNRDataFeed132
{
    private TariffInformation129133SCUSPNRDataFeed132 routePriceInformation;
    private Attribute129131SCUSPNRDataFeed132 passengerCategoryType;
    private NumberOfUnits129132SCUSPNRDataFeed132 numberOfPassengers;

    /** 
     * Get the 'routePriceInformation' element value. This segment conveys the route price information for the passenger it is linked to.
     * 
     * @return value
     */
    public TariffInformation129133SCUSPNRDataFeed132 getRoutePriceInformation() {
        return routePriceInformation;
    }

    /** 
     * Set the 'routePriceInformation' element value. This segment conveys the route price information for the passenger it is linked to.
     * 
     * @param routePriceInformation
     */
    public void setRoutePriceInformation(
            TariffInformation129133SCUSPNRDataFeed132 routePriceInformation) {
        this.routePriceInformation = routePriceInformation;
    }

    /** 
     * Get the 'passengerCategoryType' element value. This segment describes the passenger category type.
     * 
     * @return value
     */
    public Attribute129131SCUSPNRDataFeed132 getPassengerCategoryType() {
        return passengerCategoryType;
    }

    /** 
     * Set the 'passengerCategoryType' element value. This segment describes the passenger category type.
     * 
     * @param passengerCategoryType
     */
    public void setPassengerCategoryType(
            Attribute129131SCUSPNRDataFeed132 passengerCategoryType) {
        this.passengerCategoryType = passengerCategoryType;
    }

    /** 
     * Get the 'numberOfPassengers' element value. This segment is used to convey the number of passengers to which the price applies.
     * 
     * @return value
     */
    public NumberOfUnits129132SCUSPNRDataFeed132 getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /** 
     * Set the 'numberOfPassengers' element value. This segment is used to convey the number of passengers to which the price applies.
     * 
     * @param numberOfPassengers
     */
    public void setNumberOfPassengers(
            NumberOfUnits129132SCUSPNRDataFeed132 numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
