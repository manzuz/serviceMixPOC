
package com.conztanz.transform.sbr.v14_1;

/** 
 * Conveys a potential error.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ErrorGroup_112586_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ApplicationErrorInformation_94519_S_CUS_PNRDataFeed_132" name="errorOrWarningCodeDetails"/>
 *     &lt;xs:element type="FreeTextInformation_94520_S_CUS_PNRDataFeed_132" name="errorWarningDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ErrorGroup112586GCUSPNRDataFeed132
{
    private ApplicationErrorInformation94519SCUSPNRDataFeed132 errorOrWarningCodeDetails;
    private FreeTextInformation94520SCUSPNRDataFeed132 errorWarningDescription;

    /** 
     * Get the 'errorOrWarningCodeDetails' element value. The details of error/warning code.
     * 
     * @return value
     */
    public ApplicationErrorInformation94519SCUSPNRDataFeed132 getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /** 
     * Set the 'errorOrWarningCodeDetails' element value. The details of error/warning code.
     * 
     * @param errorOrWarningCodeDetails
     */
    public void setErrorOrWarningCodeDetails(
            ApplicationErrorInformation94519SCUSPNRDataFeed132 errorOrWarningCodeDetails) {
        this.errorOrWarningCodeDetails = errorOrWarningCodeDetails;
    }

    /** 
     * Get the 'errorWarningDescription' element value. The desciption of warning or error.
     * 
     * @return value
     */
    public FreeTextInformation94520SCUSPNRDataFeed132 getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /** 
     * Set the 'errorWarningDescription' element value. The desciption of warning or error.
     * 
     * @param errorWarningDescription
     */
    public void setErrorWarningDescription(
            FreeTextInformation94520SCUSPNRDataFeed132 errorWarningDescription) {
        this.errorWarningDescription = errorWarningDescription;
    }
}
