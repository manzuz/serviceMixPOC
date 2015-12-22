
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupDelimiter_129774_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ecOrigin"/>
 *     &lt;xs:element type="ReferencingDetails_188870_C_CUS_PNRDataFeed_132" name="reference" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="productType"/>
 *     &lt;xs:element type="xs:decimal" name="lineNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupDelimiter129774SCUSPNRDataFeed132
{
    private String ecOrigin;
    private ReferencingDetails188870CCUSPNRDataFeed132 reference;
    private String productType;
    private BigDecimal lineNumber;

    /** 
     * Get the 'ecOrigin' element value. Specify if the EC is created manually or automatically generated from existing PNR elements (e.g. RM, SUR, MIS)
     * 
     * @return value
     */
    public String getEcOrigin() {
        return ecOrigin;
    }

    /** 
     * Set the 'ecOrigin' element value. Specify if the EC is created manually or automatically generated from existing PNR elements (e.g. RM, SUR, MIS)
     * 
     * @param ecOrigin
     */
    public void setEcOrigin(String ecOrigin) {
        this.ecOrigin = ecOrigin;
    }

    /** 
     * Get the 'reference' element value.
     * 
     * @return value
     */
    public ReferencingDetails188870CCUSPNRDataFeed132 getReference() {
        return reference;
    }

    /** 
     * Set the 'reference' element value.
     * 
     * @param reference
     */
    public void setReference(
            ReferencingDetails188870CCUSPNRDataFeed132 reference) {
        this.reference = reference;
    }

    /** 
     * Get the 'productType' element value. Specify the EC product type (Air, Train, Car, etc...)
     * 
     * @return value
     */
    public String getProductType() {
        return productType;
    }

    /** 
     * Set the 'productType' element value. Specify the EC product type (Air, Train, Car, etc...)
     * 
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /** 
     * Get the 'lineNumber' element value. PNR segment/element 'line' number attributed by the Server
     * 
     * @return value
     */
    public BigDecimal getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'lineNumber' element value. PNR segment/element 'line' number attributed by the Server
     * 
     * @param lineNumber
     */
    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }
}
