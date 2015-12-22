
package com.conztanz.transform.sbr.v14_1;

/** 
 * Convey coded key and corresponding value
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttributeInformation_117830_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *     &lt;xs:element type="xs:string" name="attributeDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttributeInformation117830CCUSPNRDataFeed132
{
    private String attributeType;
    private String attributeDescription;

    /** 
     * Get the 'attributeType' element value. provides the attribute Type
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. provides the attribute Type
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /** 
     * Get the 'attributeDescription' element value. provides a description for the attribute: If 950K set to ARC, value can be: AS: Airline Staff, BA: Baggage not Accepted, CB: Customer failed to board, CR: Customer Request, CU: Customer Unwell, DB: Denied Boarding, FA: Flight Alternative Offered and accepted by the customer, FD: Flight Delayed, FO: Flight Oversold, FC: Flight Cancelled, MC: Missed Connection, MR: Medical Reasons, NO: NOSHOW (can only be used with Target Customer Acceptance Status set to 'Rejected'), OT: Other, RR: Regulatory Requirement not met, SR: Security Reasons, TC:  Travel in different cabin through another booking, TD: Travel Documentation Incomplete, TI: Travel Industry Staff, UC: User Error Correction. If 950K set to RRC, value can be: OC: Cabin/Flight oversold (current flight), OO: Cabin/Flight oversold (other flight), MC: Misidentification of customer at check-in, PM: Previously mishandled, SO: Special occasion, AC: Aircraft change, CF: Cabin configuration change, RQ: Request from a special requestor, CO: Compassionate, MI: Marketing Initiative e.g. please try Club Class for free, DC: Disruption on current flight, DO: Disruption on other flight, CC: Crew level change, TR: Technical reason, CS: Catering shortfall, CI: Check-in error, IA: Inadmissible, ST: Staff, SR: Service Recovery Entitlement, AB: Authorized by, US: Unsuitable.
     * 
     * @return value
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /** 
     * Set the 'attributeDescription' element value. provides a description for the attribute: If 950K set to ARC, value can be: AS: Airline Staff, BA: Baggage not Accepted, CB: Customer failed to board, CR: Customer Request, CU: Customer Unwell, DB: Denied Boarding, FA: Flight Alternative Offered and accepted by the customer, FD: Flight Delayed, FO: Flight Oversold, FC: Flight Cancelled, MC: Missed Connection, MR: Medical Reasons, NO: NOSHOW (can only be used with Target Customer Acceptance Status set to 'Rejected'), OT: Other, RR: Regulatory Requirement not met, SR: Security Reasons, TC:  Travel in different cabin through another booking, TD: Travel Documentation Incomplete, TI: Travel Industry Staff, UC: User Error Correction. If 950K set to RRC, value can be: OC: Cabin/Flight oversold (current flight), OO: Cabin/Flight oversold (other flight), MC: Misidentification of customer at check-in, PM: Previously mishandled, SO: Special occasion, AC: Aircraft change, CF: Cabin configuration change, RQ: Request from a special requestor, CO: Compassionate, MI: Marketing Initiative e.g. please try Club Class for free, DC: Disruption on current flight, DO: Disruption on other flight, CC: Crew level change, TR: Technical reason, CS: Catering shortfall, CI: Check-in error, IA: Inadmissible, ST: Staff, SR: Service Recovery Entitlement, AB: Authorized by, US: Unsuitable.
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
}
