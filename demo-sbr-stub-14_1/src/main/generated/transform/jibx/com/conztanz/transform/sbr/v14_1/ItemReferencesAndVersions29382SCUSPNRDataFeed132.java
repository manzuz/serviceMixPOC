
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Exchange and link unique identifiers
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemReferencesAndVersions_29382_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="uniqueReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemReferencesAndVersions29382SCUSPNRDataFeed132
{
    private String referenceType;
    private BigDecimal uniqueReference;

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
     * Get the 'uniqueReference' element value. Tattoo number
     * 
     * @return value
     */
    public BigDecimal getUniqueReference() {
        return uniqueReference;
    }

    /** 
     * Set the 'uniqueReference' element value. Tattoo number
     * 
     * @param uniqueReference
     */
    public void setUniqueReference(BigDecimal uniqueReference) {
        this.uniqueReference = uniqueReference;
    }
}
