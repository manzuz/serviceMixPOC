
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey a structured remark
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedRemark_129230_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MiscellaneousRemark_188290_C_CUS_PNRDataFeed_132" name="structuredRemark" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedRemark129230SCUSPNRDataFeed132
{
    private MiscellaneousRemark188290CCUSPNRDataFeed132 structuredRemark;

    /** 
     * Get the 'structuredRemark' element value. To convey a Structured Remark with Unicode content.
     * 
     * @return value
     */
    public MiscellaneousRemark188290CCUSPNRDataFeed132 getStructuredRemark() {
        return structuredRemark;
    }

    /** 
     * Set the 'structuredRemark' element value. To convey a Structured Remark with Unicode content.
     * 
     * @param structuredRemark
     */
    public void setStructuredRemark(
            MiscellaneousRemark188290CCUSPNRDataFeed132 structuredRemark) {
        this.structuredRemark = structuredRemark;
    }
}
