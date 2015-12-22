
package com.conztanz.transform.sbr.v14_1;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_129358_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceType"/>
 *     &lt;xs:element type="xs:string" name="uniqueReference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions129358SCUSPNRDataFeed132
{
    private String referenceType;
    private String uniqueReference;

    /** 
     * Get the 'referenceType' element value. Rail provider segment tattoo reference
     * 
     * @return value
     */
    public String getReferenceType() {
        return referenceType;
    }

    /** 
     * Set the 'referenceType' element value. Rail provider segment tattoo reference
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
