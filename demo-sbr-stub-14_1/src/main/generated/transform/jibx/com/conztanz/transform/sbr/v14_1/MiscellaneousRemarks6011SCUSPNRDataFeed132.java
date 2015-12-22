
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify miscellaneous, confidential, quality control and invoice remarks.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemarks_6011_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MiscellaneousRemarks_10084_C_CUS_PNRDataFeed_132" name="remarks" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemarks6011SCUSPNRDataFeed132
{
    private MiscellaneousRemarks10084CCUSPNRDataFeed132 remarks;

    /** 
     * Get the 'remarks' element value.
     * 
     * @return value
     */
    public MiscellaneousRemarks10084CCUSPNRDataFeed132 getRemarks() {
        return remarks;
    }

    /** 
     * Set the 'remarks' element value.
     * 
     * @param remarks
     */
    public void setRemarks(MiscellaneousRemarks10084CCUSPNRDataFeed132 remarks) {
        this.remarks = remarks;
    }
}
