
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FerryLegDescription_animalInfoGroup_145709_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecificDataInformation_129135_S_CUS_PNRDataFeed_132" name="animalInformation"/>
 *     &lt;xs:element type="TariffInformation_129133_S_CUS_PNRDataFeed_132" name="animalRoutePrice" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FerryLegDescriptionAnimalInfoGroup145709GCUSPNRDataFeed132
{
    private SpecificDataInformation129135SCUSPNRDataFeed132 animalInformation;
    private TariffInformation129133SCUSPNRDataFeed132 animalRoutePrice;

    /** 
     * Get the 'animalInformation' element value. This segment conveys the type of animal.
     * 
     * @return value
     */
    public SpecificDataInformation129135SCUSPNRDataFeed132 getAnimalInformation() {
        return animalInformation;
    }

    /** 
     * Set the 'animalInformation' element value. This segment conveys the type of animal.
     * 
     * @param animalInformation
     */
    public void setAnimalInformation(
            SpecificDataInformation129135SCUSPNRDataFeed132 animalInformation) {
        this.animalInformation = animalInformation;
    }

    /** 
     * Get the 'animalRoutePrice' element value. This segment conveys the price per animal of the same type.
     * 
     * @return value
     */
    public TariffInformation129133SCUSPNRDataFeed132 getAnimalRoutePrice() {
        return animalRoutePrice;
    }

    /** 
     * Set the 'animalRoutePrice' element value. This segment conveys the price per animal of the same type.
     * 
     * @param animalRoutePrice
     */
    public void setAnimalRoutePrice(
            TariffInformation129133SCUSPNRDataFeed132 animalRoutePrice) {
        this.animalRoutePrice = animalRoutePrice;
    }
}
