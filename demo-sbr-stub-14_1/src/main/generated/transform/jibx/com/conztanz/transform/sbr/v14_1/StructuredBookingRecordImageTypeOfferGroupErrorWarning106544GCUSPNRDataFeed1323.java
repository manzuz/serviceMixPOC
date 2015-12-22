
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_errorWarning_106544_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ApplicationErrorInformation_87616_S_CUS_PNRDataFeed_132" name="applicationError"/>
 *     &lt;xs:element type="FreeTextInformation_87612_S_CUS_PNRDataFeed_132" name="errorFreeText" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupErrorWarning106544GCUSPNRDataFeed1323
{
    private ApplicationErrorInformation87616SCUSPNRDataFeed132 applicationError;
    private FreeTextInformation87612SCUSPNRDataFeed132 errorFreeText;

    /** 
     * Get the 'applicationError' element value. Error/warning
     * 
     * @return value
     */
    public ApplicationErrorInformation87616SCUSPNRDataFeed132 getApplicationError() {
        return applicationError;
    }

    /** 
     * Set the 'applicationError' element value. Error/warning
     * 
     * @param applicationError
     */
    public void setApplicationError(
            ApplicationErrorInformation87616SCUSPNRDataFeed132 applicationError) {
        this.applicationError = applicationError;
    }

    /** 
     * Get the 'errorFreeText' element value. Error or Warning freetext
     * 
     * @return value
     */
    public FreeTextInformation87612SCUSPNRDataFeed132 getErrorFreeText() {
        return errorFreeText;
    }

    /** 
     * Set the 'errorFreeText' element value. Error or Warning freetext
     * 
     * @param errorFreeText
     */
    public void setErrorFreeText(
            FreeTextInformation87612SCUSPNRDataFeed132 errorFreeText) {
        this.errorFreeText = errorFreeText;
    }
}
