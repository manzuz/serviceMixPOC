
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the PNR segments/elements references and action to apply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ElementManagementSegment_106214_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_157783_C_CUS_PNRDataFeed_132" name="reference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ElementManagementSegment106214SCUSPNRDataFeed132
{
    private ReferencingDetails157783CCUSPNRDataFeed132 reference;

    /** 
     * Get the 'reference' element value. Segment identifier.
     * 
     * @return value
     */
    public ReferencingDetails157783CCUSPNRDataFeed132 getReference() {
        return reference;
    }

    /** 
     * Set the 'reference' element value. Segment identifier.
     * 
     * @param reference
     */
    public void setReference(
            ReferencingDetails157783CCUSPNRDataFeed132 reference) {
        this.reference = reference;
    }
}
