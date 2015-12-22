
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide details relating to the sequence.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SequenceDetails_94494_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SequenceInformation_142106_C_CUS_PNRDataFeed_132" name="sequenceDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SequenceDetails94494SCUSPNRDataFeed132
{
    private SequenceInformation142106CCUSPNRDataFeed132 sequenceDetails;

    /** 
     * Get the 'sequenceDetails' element value. Sequence Information
     * 
     * @return value
     */
    public SequenceInformation142106CCUSPNRDataFeed132 getSequenceDetails() {
        return sequenceDetails;
    }

    /** 
     * Set the 'sequenceDetails' element value. Sequence Information
     * 
     * @param sequenceDetails
     */
    public void setSequenceDetails(
            SequenceInformation142106CCUSPNRDataFeed132 sequenceDetails) {
        this.sequenceDetails = sequenceDetails;
    }
}
