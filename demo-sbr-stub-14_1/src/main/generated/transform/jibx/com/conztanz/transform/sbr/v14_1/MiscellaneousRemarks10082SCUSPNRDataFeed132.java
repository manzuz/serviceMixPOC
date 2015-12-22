
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify miscellaneous, confidential, quality control and invoice remarks, as well as departure comments, applicable to Acceptance, Boarding, Baggage....
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemarks_10082_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MiscellaneousRemark_861_C_CUS_PNRDataFeed_132" name="remarkDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemarks10082SCUSPNRDataFeed132
{
    private MiscellaneousRemark861CCUSPNRDataFeed132 remarkDetails;

    /** 
     * Get the 'remarkDetails' element value. miscellaneous remarks
     * 
     * @return value
     */
    public MiscellaneousRemark861CCUSPNRDataFeed132 getRemarkDetails() {
        return remarkDetails;
    }

    /** 
     * Set the 'remarkDetails' element value. miscellaneous remarks
     * 
     * @param remarkDetails
     */
    public void setRemarkDetails(
            MiscellaneousRemark861CCUSPNRDataFeed132 remarkDetails) {
        this.remarkDetails = remarkDetails;
    }
}
