
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to convey the passenger references.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_79008_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_121347_C_CUS_PNRDataFeed_132" name="passengerReference"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation79008SCUSPNRDataFeed132
{
    private ReferencingDetails121347CCUSPNRDataFeed132 passengerReference;

    /** 
     * Get the 'passengerReference' element value. Used to convey the passenger tatoo or display number.
     * 
     * @return value
     */
    public ReferencingDetails121347CCUSPNRDataFeed132 getPassengerReference() {
        return passengerReference;
    }

    /** 
     * Set the 'passengerReference' element value. Used to convey the passenger tatoo or display number.
     * 
     * @param passengerReference
     */
    public void setPassengerReference(
            ReferencingDetails121347CCUSPNRDataFeed132 passengerReference) {
        this.passengerReference = passengerReference;
    }
}
