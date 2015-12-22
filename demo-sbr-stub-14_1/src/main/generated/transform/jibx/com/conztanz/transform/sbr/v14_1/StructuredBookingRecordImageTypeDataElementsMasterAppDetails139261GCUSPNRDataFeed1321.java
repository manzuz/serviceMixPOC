
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_appDetails_139261_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CountryInformation_76527_S_CUS_PNRDataFeed_132" name="appCountry"/>
 *     &lt;xs:element type="StatusDetails_76518_S_CUS_PNRDataFeed_132" name="appProductStatus" maxOccurs="2"/>
 *     &lt;xs:element type="SpecificDataInformation_76528_S_CUS_PNRDataFeed_132" name="appDirectiveCode"/>
 *     &lt;xs:element type="FreeTextInformation_76104_S_CUS_PNRDataFeed_132" name="appDirectiveDescription"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterAppDetails139261GCUSPNRDataFeed1321
{
    private CountryInformation76527SCUSPNRDataFeed132 appCountry;
    private List<StatusDetails76518SCUSPNRDataFeed132> appProductStatuList = new ArrayList<StatusDetails76518SCUSPNRDataFeed132>();
    private SpecificDataInformation76528SCUSPNRDataFeed132 appDirectiveCode;
    private FreeTextInformation76104SCUSPNRDataFeed132 appDirectiveDescription;

    /** 
     * Get the 'appCountry' element value. APP Country
     * 
     * @return value
     */
    public CountryInformation76527SCUSPNRDataFeed132 getAppCountry() {
        return appCountry;
    }

    /** 
     * Set the 'appCountry' element value. APP Country
     * 
     * @param appCountry
     */
    public void setAppCountry(
            CountryInformation76527SCUSPNRDataFeed132 appCountry) {
        this.appCountry = appCountry;
    }

    /** 
     * Get the list of 'appProductStatus' element items. 1-Indicator to state if the customer is cleared to board by the participating country: C565/1245 - APC C565/1229 -  APC - ClearToBoard APX - Cancelled APN - NotFound APT - Timeout APE - ErrorCondition APD - Duplicate Name API - Insufficient Data APF - DoNotBoard  2- only set if the participating country corresponds to a transit country for the product. indicator - TRS : TransitIndicator True NRM : TransitIndicator False action - T DepartureTransit O ArrivalTransit I IntermediateTransit
     * 
     * @return list
     */
    public List<StatusDetails76518SCUSPNRDataFeed132> getAppProductStatuList() {
        return appProductStatuList;
    }

    /** 
     * Set the list of 'appProductStatus' element items. 1-Indicator to state if the customer is cleared to board by the participating country: C565/1245 - APC C565/1229 -  APC - ClearToBoard APX - Cancelled APN - NotFound APT - Timeout APE - ErrorCondition APD - Duplicate Name API - Insufficient Data APF - DoNotBoard  2- only set if the participating country corresponds to a transit country for the product. indicator - TRS : TransitIndicator True NRM : TransitIndicator False action - T DepartureTransit O ArrivalTransit I IntermediateTransit
     * 
     * @param list
     */
    public void setAppProductStatuList(
            List<StatusDetails76518SCUSPNRDataFeed132> list) {
        appProductStatuList = list;
    }

    /** 
     * Get the 'appDirectiveCode' element value. APP directive code: - 6060 contains the 4 digits directive code. (eg 8502...) - 9989 is set to AAC
     * 
     * @return value
     */
    public SpecificDataInformation76528SCUSPNRDataFeed132 getAppDirectiveCode() {
        return appDirectiveCode;
    }

    /** 
     * Set the 'appDirectiveCode' element value. APP directive code: - 6060 contains the 4 digits directive code. (eg 8502...) - 9989 is set to AAC
     * 
     * @param appDirectiveCode
     */
    public void setAppDirectiveCode(
            SpecificDataInformation76528SCUSPNRDataFeed132 appDirectiveCode) {
        this.appDirectiveCode = appDirectiveCode;
    }

    /** 
     * Get the 'appDirectiveDescription' element value. App Directive Description The source is App System. Freetext description of the APP directive code  textSubjectQualifier : 3 source : M encoding : 1
     * 
     * @return value
     */
    public FreeTextInformation76104SCUSPNRDataFeed132 getAppDirectiveDescription() {
        return appDirectiveDescription;
    }

    /** 
     * Set the 'appDirectiveDescription' element value. App Directive Description The source is App System. Freetext description of the APP directive code  textSubjectQualifier : 3 source : M encoding : 1
     * 
     * @param appDirectiveDescription
     */
    public void setAppDirectiveDescription(
            FreeTextInformation76104SCUSPNRDataFeed132 appDirectiveDescription) {
        this.appDirectiveDescription = appDirectiveDescription;
    }
}
