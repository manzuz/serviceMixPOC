
package com.conztanz.transform.sbr.v14_1;

/** 
 * Conveys a potential error.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ErrorGroup_43903_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ApplicationErrorInformation_30051_S_CUS_PNRDataFeed_132" name="errorOrWarningCodeDetails"/>
 *     &lt;xs:element type="FreeTextInformation_30052_S_CUS_PNRDataFeed_132" name="errorWarningDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ErrorGroup43903GCUSPNRDataFeed132
{
    private ApplicationErrorInformation30051SCUSPNRDataFeed132 errorOrWarningCodeDetails;
    private FreeTextInformation30052SCUSPNRDataFeed132 errorWarningDescription;

    /** 
     * Get the 'errorOrWarningCodeDetails' element value. The details of error/warning code.
     * 
     * @return value
     */
    public ApplicationErrorInformation30051SCUSPNRDataFeed132 getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /** 
     * Set the 'errorOrWarningCodeDetails' element value. The details of error/warning code.
     * 
     * @param errorOrWarningCodeDetails
     */
    public void setErrorOrWarningCodeDetails(
            ApplicationErrorInformation30051SCUSPNRDataFeed132 errorOrWarningCodeDetails) {
        this.errorOrWarningCodeDetails = errorOrWarningCodeDetails;
    }

    /** 
     * Get the 'errorWarningDescription' element value. The desciption of warning or error.
     * 
     * @return value
     */
    public FreeTextInformation30052SCUSPNRDataFeed132 getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /** 
     * Set the 'errorWarningDescription' element value. The desciption of warning or error.
     * 
     * @param errorWarningDescription
     */
    public void setErrorWarningDescription(
            FreeTextInformation30052SCUSPNRDataFeed132 errorWarningDescription) {
        this.errorWarningDescription = errorWarningDescription;
    }
}
