
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information concerning a document.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocumentInformationDetails_128659_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DocumentDetails_187455_C_CUS_PNRDataFeed_132" name="documentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocumentInformationDetails128659SCUSPNRDataFeed132
{
    private DocumentDetails187455CCUSPNRDataFeed132 documentDetails;

    /** 
     * Get the 'documentDetails' element value. To convey the printing results.
     * 
     * @return value
     */
    public DocumentDetails187455CCUSPNRDataFeed132 getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'documentDetails' element value. To convey the printing results.
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(
            DocumentDetails187455CCUSPNRDataFeed132 documentDetails) {
        this.documentDetails = documentDetails;
    }
}
