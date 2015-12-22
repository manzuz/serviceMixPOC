
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the agreement details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AgreementIdentification_87593_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AgreementTypeIdentification_132901_C_CUS_PNRDataFeed_132" name="agreementDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AgreementIdentification87593SCUSPNRDataFeed132
{
    private AgreementTypeIdentification132901CCUSPNRDataFeed132 agreementDetails;

    /** 
     * Get the 'agreementDetails' element value. Agreement identification
     * 
     * @return value
     */
    public AgreementTypeIdentification132901CCUSPNRDataFeed132 getAgreementDetails() {
        return agreementDetails;
    }

    /** 
     * Set the 'agreementDetails' element value. Agreement identification
     * 
     * @param agreementDetails
     */
    public void setAgreementDetails(
            AgreementTypeIdentification132901CCUSPNRDataFeed132 agreementDetails) {
        this.agreementDetails = agreementDetails;
    }
}
