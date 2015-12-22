
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the PNR segments/elements references and action to apply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ElementManagementSegment_83037_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceDetails_126850_C_CUS_PNRDataFeed_132" name="reference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ElementManagementSegment83037SCUSPNRDataFeed132
{
    private ReferenceDetails126850CCUSPNRDataFeed132 reference;

    /** 
     * Get the 'reference' element value. Reference details
     * 
     * @return value
     */
    public ReferenceDetails126850CCUSPNRDataFeed132 getReference() {
        return reference;
    }

    /** 
     * Set the 'reference' element value. Reference details
     * 
     * @param reference
     */
    public void setReference(ReferenceDetails126850CCUSPNRDataFeed132 reference) {
        this.reference = reference;
    }
}
