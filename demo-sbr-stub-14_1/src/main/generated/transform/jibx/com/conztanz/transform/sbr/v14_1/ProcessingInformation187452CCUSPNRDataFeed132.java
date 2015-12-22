
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the action to be taken and the selection criteria.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProcessingInformation_187452_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="actionQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="referenceQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProcessingInformation187452CCUSPNRDataFeed132
{
    private String actionQualifier;
    private String referenceQualifier;

    /** 
     * Get the 'actionQualifier' element value. Identifies the element we are talking about
     * 
     * @return value
     */
    public String getActionQualifier() {
        return actionQualifier;
    }

    /** 
     * Set the 'actionQualifier' element value. Identifies the element we are talking about
     * 
     * @param actionQualifier
     */
    public void setActionQualifier(String actionQualifier) {
        this.actionQualifier = actionQualifier;
    }

    /** 
     * Get the 'referenceQualifier' element value. Used to qualifie the element with an indicator.
     * 
     * @return value
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /** 
     * Set the 'referenceQualifier' element value. Used to qualifie the element with an indicator.
     * 
     * @param referenceQualifier
     */
    public void setReferenceQualifier(String referenceQualifier) {
        this.referenceQualifier = referenceQualifier;
    }
}
