
package com.conztanz.transform.sbr.v14_1;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_27002_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceType"/>
 *     &lt;xs:element type="xs:string" name="uniqueReference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions27002SCUSPNRDataFeed132
{
    private String referenceType;
    private String uniqueReference;

    /** 
     * Get the 'referenceType' element value. qualifies the type of the reference used. Code set to define
     * 
     * @return value
     */
    public String getReferenceType() {
        return referenceType;
    }

    /** 
     * Set the 'referenceType' element value. qualifies the type of the reference used. Code set to define
     * 
     * @param referenceType
     */
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    /** 
     * Get the 'uniqueReference' element value. The value of the reference
     * 
     * @return value
     */
    public String getUniqueReference() {
        return uniqueReference;
    }

    /** 
     * Set the 'uniqueReference' element value. The value of the reference
     * 
     * @param uniqueReference
     */
    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }
}
