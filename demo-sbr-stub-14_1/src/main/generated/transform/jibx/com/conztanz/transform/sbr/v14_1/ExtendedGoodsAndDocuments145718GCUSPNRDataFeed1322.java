
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedGoodsAndDocuments_145718_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredPeriodInformation_128780_S_CUS_PNRDataFeed_132" name="coverageDates"/>
 *     &lt;xs:element type="FreeTextInformation_128778_S_CUS_PNRDataFeed_132" name="docTitle"/>
 *     &lt;xs:element type="Address_129098_S_CUS_PNRDataFeed_132" name="addressInformation" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128779_S_CUS_PNRDataFeed_132" name="subscriptionDate" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_129102_S_CUS_PNRDataFeed_132" name="visaDetails" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedGoodsAndDocuments145718GCUSPNRDataFeed1322
{
    private StructuredPeriodInformation128780SCUSPNRDataFeed132 coverageDates;
    private FreeTextInformation128778SCUSPNRDataFeed132 docTitle;
    private Address129098SCUSPNRDataFeed132 addressInformation;
    private StructuredDateTimeInformation128779SCUSPNRDataFeed132 subscriptionDate;
    private List<FreeTextInformation129102SCUSPNRDataFeed132> visaDetailList = new ArrayList<FreeTextInformation129102SCUSPNRDataFeed132>();

    /** 
     * Get the 'coverageDates' element value.
     * 
     * @return value
     */
    public StructuredPeriodInformation128780SCUSPNRDataFeed132 getCoverageDates() {
        return coverageDates;
    }

    /** 
     * Set the 'coverageDates' element value.
     * 
     * @param coverageDates
     */
    public void setCoverageDates(
            StructuredPeriodInformation128780SCUSPNRDataFeed132 coverageDates) {
        this.coverageDates = coverageDates;
    }

    /** 
     * Get the 'docTitle' element value. Specify: - The visa title or - The document name or - The goodies type (cap, tee-shirt,...)
     * 
     * @return value
     */
    public FreeTextInformation128778SCUSPNRDataFeed132 getDocTitle() {
        return docTitle;
    }

    /** 
     * Set the 'docTitle' element value. Specify: - The visa title or - The document name or - The goodies type (cap, tee-shirt,...)
     * 
     * @param docTitle
     */
    public void setDocTitle(FreeTextInformation128778SCUSPNRDataFeed132 docTitle) {
        this.docTitle = docTitle;
    }

    /** 
     * Get the 'addressInformation' element value. Specify location details - the destination for a visa - the address for restaurant, food and miscellaneous product types
     * 
     * @return value
     */
    public Address129098SCUSPNRDataFeed132 getAddressInformation() {
        return addressInformation;
    }

    /** 
     * Set the 'addressInformation' element value. Specify location details - the destination for a visa - the address for restaurant, food and miscellaneous product types
     * 
     * @param addressInformation
     */
    public void setAddressInformation(
            Address129098SCUSPNRDataFeed132 addressInformation) {
        this.addressInformation = addressInformation;
    }

    /** 
     * Get the 'subscriptionDate' element value.
     * 
     * @return value
     */
    public StructuredDateTimeInformation128779SCUSPNRDataFeed132 getSubscriptionDate() {
        return subscriptionDate;
    }

    /** 
     * Set the 'subscriptionDate' element value.
     * 
     * @param subscriptionDate
     */
    public void setSubscriptionDate(
            StructuredDateTimeInformation128779SCUSPNRDataFeed132 subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    /** 
     * Get the list of 'visaDetails' element items. - Visa Type - Visa Purpose - Visa Process Type
     * 
     * @return list
     */
    public List<FreeTextInformation129102SCUSPNRDataFeed132> getVisaDetailList() {
        return visaDetailList;
    }

    /** 
     * Set the list of 'visaDetails' element items. - Visa Type - Visa Purpose - Visa Process Type
     * 
     * @param list
     */
    public void setVisaDetailList(
            List<FreeTextInformation129102SCUSPNRDataFeed132> list) {
        visaDetailList = list;
    }
}
