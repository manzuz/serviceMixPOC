
package com.conztanz.transform.sbr.v14_1;

/** 
 * Payment record unique identifier
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_94556_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceType"/>
 *     &lt;xs:element type="xs:string" name="uniqueReference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions94556SCUSPNRDataFeed132
{
    private String referenceType;
    private String uniqueReference;

    /** 
     * Get the 'referenceType' element value. qualifies the type of the reference used. Here it will be: PRI Payment Record Id APP Application Correlator Id EXT Third party Record Id
     * 
     * @return value
     */
    public String getReferenceType() {
        return referenceType;
    }

    /** 
     * Set the 'referenceType' element value. qualifies the type of the reference used. Here it will be: PRI Payment Record Id APP Application Correlator Id EXT Third party Record Id
     * 
     * @param referenceType
     */
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    /** 
     * Get the 'uniqueReference' element value. The value of the payment record/correlator Id
     * 
     * @return value
     */
    public String getUniqueReference() {
        return uniqueReference;
    }

    /** 
     * Set the 'uniqueReference' element value. The value of the payment record/correlator Id
     * 
     * @param uniqueReference
     */
    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }
}
