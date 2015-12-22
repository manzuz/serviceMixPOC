
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Conveys TP (Total Price) information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TotalPrice_106783_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyInformation_83028_S_CUS_PNRDataFeed_132" name="providerCode"/>
 *     &lt;xs:element type="ReferenceInformation_83029_S_CUS_PNRDataFeed_132" name="externalRef" minOccurs="0"/>
 *     &lt;xs:element type="Gsbk1a071group78_102102_G_CUS_PNRDataFeed_132" name="methodOfDelivery" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_83036_S_CUS_PNRDataFeed_132" name="mainPrice"/>
 *     &lt;xs:element type="TariffInformation_83032_S_CUS_PNRDataFeed_132" name="otherPrices" minOccurs="0" maxOccurs="12"/>
 *     &lt;xs:element type="TotalPrice_productDescription_106784_G_CUS_PNRDataFeed_132" name="productDescription" minOccurs="0"/>
 *     &lt;xs:element type="Taxes_83033_S_CUS_PNRDataFeed_132" name="additionnalChargeInformation" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="RateTypes_83030_S_CUS_PNRDataFeed_132" name="rateCodeInformation" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_83031_S_CUS_PNRDataFeed_132" name="optionalBooking" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TotalPrice106783GCUSPNRDataFeed132
{
    private CompanyInformation83028SCUSPNRDataFeed132 providerCode;
    private ReferenceInformation83029SCUSPNRDataFeed132 externalRef;
    private Gsbk1a071group78102102GCUSPNRDataFeed132 methodOfDelivery;
    private TariffInformation83036SCUSPNRDataFeed132 mainPrice;
    private List<TariffInformation83032SCUSPNRDataFeed132> otherPriceList = new ArrayList<TariffInformation83032SCUSPNRDataFeed132>();
    private TotalPriceProductDescription106784GCUSPNRDataFeed132 productDescription;
    private List<Taxes83033SCUSPNRDataFeed132> additionnalChargeInformationList = new ArrayList<Taxes83033SCUSPNRDataFeed132>();
    private RateTypes83030SCUSPNRDataFeed132 rateCodeInformation;
    private StructuredDateTimeInformation83031SCUSPNRDataFeed132 optionalBooking;

    /** 
     * Get the 'providerCode' element value. The provider code.
     * 
     * @return value
     */
    public CompanyInformation83028SCUSPNRDataFeed132 getProviderCode() {
        return providerCode;
    }

    /** 
     * Set the 'providerCode' element value. The provider code.
     * 
     * @param providerCode
     */
    public void setProviderCode(
            CompanyInformation83028SCUSPNRDataFeed132 providerCode) {
        this.providerCode = providerCode;
    }

    /** 
     * Get the 'externalRef' element value. External Reference of the pricing
     * 
     * @return value
     */
    public ReferenceInformation83029SCUSPNRDataFeed132 getExternalRef() {
        return externalRef;
    }

    /** 
     * Set the 'externalRef' element value. External Reference of the pricing
     * 
     * @param externalRef
     */
    public void setExternalRef(
            ReferenceInformation83029SCUSPNRDataFeed132 externalRef) {
        this.externalRef = externalRef;
    }

    /** 
     * Get the 'methodOfDelivery' element value. method of delivery, such as e-mail, pick at station, id card, etc.
     * 
     * @return value
     */
    public Gsbk1a071group78102102GCUSPNRDataFeed132 getMethodOfDelivery() {
        return methodOfDelivery;
    }

    /** 
     * Set the 'methodOfDelivery' element value. method of delivery, such as e-mail, pick at station, id card, etc.
     * 
     * @param methodOfDelivery
     */
    public void setMethodOfDelivery(
            Gsbk1a071group78102102GCUSPNRDataFeed132 methodOfDelivery) {
        this.methodOfDelivery = methodOfDelivery;
    }

    /** 
     * Get the 'mainPrice' element value. This segment is used to convey the main price information (e.g. the net total price for non-cancelled bookings, the cancellation fee for cancelled bookings).  The currency code stands not only for this segment, but for the whole group: all prices have the same currency.
     * 
     * @return value
     */
    public TariffInformation83036SCUSPNRDataFeed132 getMainPrice() {
        return mainPrice;
    }

    /** 
     * Set the 'mainPrice' element value. This segment is used to convey the main price information (e.g. the net total price for non-cancelled bookings, the cancellation fee for cancelled bookings).  The currency code stands not only for this segment, but for the whole group: all prices have the same currency.
     * 
     * @param mainPrice
     */
    public void setMainPrice(TariffInformation83036SCUSPNRDataFeed132 mainPrice) {
        this.mainPrice = mainPrice;
    }

    /** 
     * Get the list of 'otherPrices' element items. The remaining price items are described here. In ferry business, there may be a maximum of 12 prices (+ main price and taxes).  The currency code is not applicable because it is the same as in the mainPriceInformation segment.
     * 
     * @return list
     */
    public List<TariffInformation83032SCUSPNRDataFeed132> getOtherPriceList() {
        return otherPriceList;
    }

    /** 
     * Set the list of 'otherPrices' element items. The remaining price items are described here. In ferry business, there may be a maximum of 12 prices (+ main price and taxes).  The currency code is not applicable because it is the same as in the mainPriceInformation segment.
     * 
     * @param list
     */
    public void setOtherPriceList(
            List<TariffInformation83032SCUSPNRDataFeed132> list) {
        otherPriceList = list;
    }

    /** 
     * Get the 'productDescription' element value. product associated to the price item
     * 
     * @return value
     */
    public TotalPriceProductDescription106784GCUSPNRDataFeed132 getProductDescription() {
        return productDescription;
    }

    /** 
     * Set the 'productDescription' element value. product associated to the price item
     * 
     * @param productDescription
     */
    public void setProductDescription(
            TotalPriceProductDescription106784GCUSPNRDataFeed132 productDescription) {
        this.productDescription = productDescription;
    }

    /** 
     * Get the list of 'additionnalChargeInformation' element items. This segment conveys the tax amount information. The repetition factor equals the number of codesets for the qualifier, because each type of tax may occur once. The currency code is the same as in the mainPriceInformation segment.
     * 
     * @return list
     */
    public List<Taxes83033SCUSPNRDataFeed132> getAdditionnalChargeInformationList() {
        return additionnalChargeInformationList;
    }

    /** 
     * Set the list of 'additionnalChargeInformation' element items. This segment conveys the tax amount information. The repetition factor equals the number of codesets for the qualifier, because each type of tax may occur once. The currency code is the same as in the mainPriceInformation segment.
     * 
     * @param list
     */
    public void setAdditionnalChargeInformationList(
            List<Taxes83033SCUSPNRDataFeed132> list) {
        additionnalChargeInformationList = list;
    }

    /** 
     * Get the 'rateCodeInformation' element value. This segment is used to convey the booking fare information.
     * 
     * @return value
     */
    public RateTypes83030SCUSPNRDataFeed132 getRateCodeInformation() {
        return rateCodeInformation;
    }

    /** 
     * Set the 'rateCodeInformation' element value. This segment is used to convey the booking fare information.
     * 
     * @param rateCodeInformation
     */
    public void setRateCodeInformation(
            RateTypes83030SCUSPNRDataFeed132 rateCodeInformation) {
        this.rateCodeInformation = rateCodeInformation;
    }

    /** 
     * Get the 'optionalBooking' element value. This segment will transport the optional booking confirmation dead-line information. Note: if this segment transports a valid confirmation dead-line, then the booking is considered as optional.
     * 
     * @return value
     */
    public StructuredDateTimeInformation83031SCUSPNRDataFeed132 getOptionalBooking() {
        return optionalBooking;
    }

    /** 
     * Set the 'optionalBooking' element value. This segment will transport the optional booking confirmation dead-line information. Note: if this segment transports a valid confirmation dead-line, then the booking is considered as optional.
     * 
     * @param optionalBooking
     */
    public void setOptionalBooking(
            StructuredDateTimeInformation83031SCUSPNRDataFeed132 optionalBooking) {
        this.optionalBooking = optionalBooking;
    }
}
