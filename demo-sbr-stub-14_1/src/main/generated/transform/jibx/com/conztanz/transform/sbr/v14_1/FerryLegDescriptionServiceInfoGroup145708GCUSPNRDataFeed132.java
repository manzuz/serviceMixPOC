
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryLegDescription_serviceInfoGroup_145708_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Attribute_129131_S_CUS_PNRDataFeed_132" name="serviceInformation"/>
 *     &lt;xs:element type="NumberOfUnits_129132_S_CUS_PNRDataFeed_132" name="numberOfServices" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_129133_S_CUS_PNRDataFeed_132" name="serviceRoutePrice" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryLegDescriptionServiceInfoGroup145708GCUSPNRDataFeed132
{
    private Attribute129131SCUSPNRDataFeed132 serviceInformation;
    private NumberOfUnits129132SCUSPNRDataFeed132 numberOfServices;
    private TariffInformation129133SCUSPNRDataFeed132 serviceRoutePrice;

    /** 
     * Get the 'serviceInformation' element value. This segment describes the on-board service.
     * 
     * @return value
     */
    public Attribute129131SCUSPNRDataFeed132 getServiceInformation() {
        return serviceInformation;
    }

    /** 
     * Set the 'serviceInformation' element value. This segment describes the on-board service.
     * 
     * @param serviceInformation
     */
    public void setServiceInformation(
            Attribute129131SCUSPNRDataFeed132 serviceInformation) {
        this.serviceInformation = serviceInformation;
    }

    /** 
     * Get the 'numberOfServices' element value. This segment conveys the number of services of the attached service.
     * 
     * @return value
     */
    public NumberOfUnits129132SCUSPNRDataFeed132 getNumberOfServices() {
        return numberOfServices;
    }

    /** 
     * Set the 'numberOfServices' element value. This segment conveys the number of services of the attached service.
     * 
     * @param numberOfServices
     */
    public void setNumberOfServices(
            NumberOfUnits129132SCUSPNRDataFeed132 numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    /** 
     * Get the 'serviceRoutePrice' element value. This segment conveys the price per unit of the attached service.
     * 
     * @return value
     */
    public TariffInformation129133SCUSPNRDataFeed132 getServiceRoutePrice() {
        return serviceRoutePrice;
    }

    /** 
     * Set the 'serviceRoutePrice' element value. This segment conveys the price per unit of the attached service.
     * 
     * @param serviceRoutePrice
     */
    public void setServiceRoutePrice(
            TariffInformation129133SCUSPNRDataFeed132 serviceRoutePrice) {
        this.serviceRoutePrice = serviceRoutePrice;
    }
}
