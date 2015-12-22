
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify the details of the documentation of the insuree.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PassengerDocumentDetails_10036_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="birthDate" minOccurs="0"/>
 *     &lt;xs:element type="DocumentDetails_18495_C_CUS_PNRDataFeed_132" name="documentDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PassengerDocumentDetails10036SCUSPNRDataFeed132
{
    private String birthDate;
    private DocumentDetails18495CCUSPNRDataFeed132 documentDetails;

    /** 
     * Get the 'birthDate' element value. Used to convey the age of the insuree
     * 
     * @return value
     */
    public String getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'birthDate' element value. Used to convey the age of the insuree
     * 
     * @param birthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'documentDetails' element value. Details on the document (visa, passport...)
     * 
     * @return value
     */
    public DocumentDetails18495CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. Details on the document (visa, passport...)
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            DocumentDetails18495CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }
}
