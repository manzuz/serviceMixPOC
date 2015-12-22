
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information concerning a document.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocumentInformationDetails_11509_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DocumentDetails_16906_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocumentInformationDetails11509SCUSPNRDataFeed132
{
    private DocumentDetails16906CCUSPNRDataFeed132 documentDetails;

    /** 
     * Get the 'documentDetails' element value. To convey the printing results.
     * 
     * @return value
     */
    public DocumentDetails16906CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. To convey the printing results.
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            DocumentDetails16906CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }
}
