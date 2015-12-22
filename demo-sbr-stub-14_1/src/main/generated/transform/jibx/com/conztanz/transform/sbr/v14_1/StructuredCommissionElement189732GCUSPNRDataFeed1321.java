
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredCommissionElement_189732_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommissionInformation_157357_S_CUS_PNRDataFeed_132" name="commissionValue"/>
 *     &lt;xs:element type="EnhancedTravellerInformation_165081_S_CUS_PNRDataFeed_132" name="infantOrAdultAssociation" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_157342_S_CUS_PNRDataFeed_132" name="segmentAssociation" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_157341_S_CUS_PNRDataFeed_132" name="passengerAssociation" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_163905_S_CUS_PNRDataFeed_132" name="commissionControlCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredCommissionElement189732GCUSPNRDataFeed1321
{
    private CommissionInformation157357SCUSPNRDataFeed132 commissionValue;
    private EnhancedTravellerInformation165081SCUSPNRDataFeed132 infantOrAdultAssociation;
    private ReferenceInformation157342SCUSPNRDataFeed132 segmentAssociation;
    private ReferenceInformation157341SCUSPNRDataFeed132 passengerAssociation;
    private StatusDetails163905SCUSPNRDataFeed132 commissionControlCode;

    /** 
     * Get the 'commissionValue' element value. Convey commission value
     * 
     * @return value
     */
    public CommissionInformation157357SCUSPNRDataFeed132 getCommissionValue() {
        return commissionValue;
    }

    /** 
     * Set the 'commissionValue' element value. Convey commission value
     * 
     * @param commissionValue
     */
    public void setCommissionValue(
            CommissionInformation157357SCUSPNRDataFeed132 commissionValue) {
        this.commissionValue = commissionValue;
    }

    /** 
     * Get the 'infantOrAdultAssociation' element value. Contains a flag to advice whether commission element applies on adult only or on infant only
     * 
     * @return value
     */
    public EnhancedTravellerInformation165081SCUSPNRDataFeed132 getInfantOrAdultAssociation() {
        return infantOrAdultAssociation;
    }

    /** 
     * Set the 'infantOrAdultAssociation' element value. Contains a flag to advice whether commission element applies on adult only or on infant only
     * 
     * @param infantOrAdultAssociation
     */
    public void setInfantOrAdultAssociation(
            EnhancedTravellerInformation165081SCUSPNRDataFeed132 infantOrAdultAssociation) {
        this.infantOrAdultAssociation = infantOrAdultAssociation;
    }

    /** 
     * Get the 'segmentAssociation' element value. It contains the list of segments which are explicitely associated to commission element
     * 
     * @return value
     */
    public ReferenceInformation157342SCUSPNRDataFeed132 getSegmentAssociation() {
        return segmentAssociation;
    }

    /** 
     * Set the 'segmentAssociation' element value. It contains the list of segments which are explicitely associated to commission element
     * 
     * @param segmentAssociation
     */
    public void setSegmentAssociation(
            ReferenceInformation157342SCUSPNRDataFeed132 segmentAssociation) {
        this.segmentAssociation = segmentAssociation;
    }

    /** 
     * Get the 'passengerAssociation' element value. It contains the list of passengers which are explicitely associated to the commission element
     * 
     * @return value
     */
    public ReferenceInformation157341SCUSPNRDataFeed132 getPassengerAssociation() {
        return passengerAssociation;
    }

    /** 
     * Set the 'passengerAssociation' element value. It contains the list of passengers which are explicitely associated to the commission element
     * 
     * @param passengerAssociation
     */
    public void setPassengerAssociation(
            ReferenceInformation157341SCUSPNRDataFeed132 passengerAssociation) {
        this.passengerAssociation = passengerAssociation;
    }

    /** 
     * Get the 'commissionControlCode' element value. Contains optional Commission Control Code.
     * 
     * @return value
     */
    public StatusDetails163905SCUSPNRDataFeed132 getCommissionControlCode() {
        return commissionControlCode;
    }

    /** 
     * Set the 'commissionControlCode' element value. Contains optional Commission Control Code.
     * 
     * @param commissionControlCode
     */
    public void setCommissionControlCode(
            StatusDetails163905SCUSPNRDataFeed132 commissionControlCode) {
        this.commissionControlCode = commissionControlCode;
    }
}
