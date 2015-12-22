
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_groupProposal_207371_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProposalCharacteristics_141369_S_CUS_PNRDataFeed_132" name="proposalCharacteristics"/>
 *     &lt;xs:element type="ElementManagementSegment_182614_S_CUS_PNRDataFeed_132" name="proposalTattoo" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_140141_S_CUS_PNRDataFeed_132" name="proposalDescription" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_141060_S_CUS_PNRDataFeed_132" name="proposalPrice"/>
 *     &lt;xs:element type="ReferenceInformation_141059_S_CUS_PNRDataFeed_132" name="referencedElements"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeGroupProposal207371GCUSPNRDataFeed132
{
    private ProposalCharacteristics141369SCUSPNRDataFeed132 proposalCharacteristics;
    private ElementManagementSegment182614SCUSPNRDataFeed132 proposalTattoo;
    private FreeTextInformation140141SCUSPNRDataFeed132 proposalDescription;
    private MonetaryInformation141060SCUSPNRDataFeed132 proposalPrice;
    private ReferenceInformation141059SCUSPNRDataFeed132 referencedElements;

    /** 
     * Get the 'proposalCharacteristics' element value. Marker of the Proposal group
     * 
     * @return value
     */
    public ProposalCharacteristics141369SCUSPNRDataFeed132 getProposalCharacteristics() {
        return proposalCharacteristics;
    }

    /** 
     * Set the 'proposalCharacteristics' element value. Marker of the Proposal group
     * 
     * @param proposalCharacteristics
     */
    public void setProposalCharacteristics(
            ProposalCharacteristics141369SCUSPNRDataFeed132 proposalCharacteristics) {
        this.proposalCharacteristics = proposalCharacteristics;
    }

    /** 
     * Get the 'proposalTattoo' element value. conveys the Tattoo of the proposal
     * 
     * @return value
     */
    public ElementManagementSegment182614SCUSPNRDataFeed132 getProposalTattoo() {
        return proposalTattoo;
    }

    /** 
     * Set the 'proposalTattoo' element value. conveys the Tattoo of the proposal
     * 
     * @param proposalTattoo
     */
    public void setProposalTattoo(
            ElementManagementSegment182614SCUSPNRDataFeed132 proposalTattoo) {
        this.proposalTattoo = proposalTattoo;
    }

    /** 
     * Get the 'proposalDescription' element value. Freetext as entered by the agent during proposal creation
     * 
     * @return value
     */
    public FreeTextInformation140141SCUSPNRDataFeed132 getProposalDescription() {
        return proposalDescription;
    }

    /** 
     * Set the 'proposalDescription' element value. Freetext as entered by the agent during proposal creation
     * 
     * @param proposalDescription
     */
    public void setProposalDescription(
            FreeTextInformation140141SCUSPNRDataFeed132 proposalDescription) {
        this.proposalDescription = proposalDescription;
    }

    /** 
     * Get the 'proposalPrice' element value. Indicate grand total of the proposal as well as included mark-up/mark-down
     * 
     * @return value
     */
    public MonetaryInformation141060SCUSPNRDataFeed132 getProposalPrice() {
        return proposalPrice;
    }

    /** 
     * Set the 'proposalPrice' element value. Indicate grand total of the proposal as well as included mark-up/mark-down
     * 
     * @param proposalPrice
     */
    public void setProposalPrice(
            MonetaryInformation141060SCUSPNRDataFeed132 proposalPrice) {
        this.proposalPrice = proposalPrice;
    }

    /** 
     * Get the 'referencedElements' element value. Selected Offers which are included within the proposal
     * 
     * @return value
     */
    public ReferenceInformation141059SCUSPNRDataFeed132 getReferencedElements() {
        return referencedElements;
    }

    /** 
     * Set the 'referencedElements' element value. Selected Offers which are included within the proposal
     * 
     * @param referencedElements
     */
    public void setReferencedElements(
            ReferenceInformation141059SCUSPNRDataFeed132 referencedElements) {
        this.referencedElements = referencedElements;
    }
}
