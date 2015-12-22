
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UniqueIdDescription_117839_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceQualifier"/>
 *     &lt;xs:element type="xs:string" name="primeId"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UniqueIdDescription117839CCUSPNRDataFeed132
{
    private String referenceQualifier;
    private String primeId;

    /** 
     * Get the 'referenceQualifier' element value. ID qualifier
     * 
     * @return value
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /** 
     * Set the 'referenceQualifier' element value. ID qualifier
     * 
     * @param referenceQualifier
     */
    public void setReferenceQualifier(String referenceQualifier) {
        this.referenceQualifier = referenceQualifier;
    }

    /** 
     * Get the 'primeId' element value. ID (DID, IID, SID number or any uniquer identifier)
     * 
     * @return value
     */
    public String getPrimeId() {
        return primeId;
    }

    /** 
     * Set the 'primeId' element value. ID (DID, IID, SID number or any uniquer identifier)
     * 
     * @param primeId
     */
    public void setPrimeId(String primeId) {
        this.primeId = primeId;
    }
}
