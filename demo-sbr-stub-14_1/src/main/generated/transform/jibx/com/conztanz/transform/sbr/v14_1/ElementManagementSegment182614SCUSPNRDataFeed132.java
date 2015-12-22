
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the PNR segments/elements references and action to apply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ElementManagementSegment_182614_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_256573_C_CUS_PNRDataFeed_132" name="elementReference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ElementManagementSegment182614SCUSPNRDataFeed132
{
    private ReferencingDetails256573CCUSPNRDataFeed132 elementReference;

    /** 
     * Get the 'elementReference' element value. Reference details
     * 
     * @return value
     */
    public ReferencingDetails256573CCUSPNRDataFeed132 getElementReference() {
        return elementReference;
    }

    /** 
     * Set the 'elementReference' element value. Reference details
     * 
     * @param elementReference
     */
    public void setElementReference(
            ReferencingDetails256573CCUSPNRDataFeed132 elementReference) {
        this.elementReference = elementReference;
    }
}
