
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify special request or services information relating to a traveler
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDetails_26749_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsTypeDetails_45504_C_CUS_PNRDataFeed_132" name="ssr"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDetails26749SCUSPNRDataFeed132
{
    private SpecialRequirementsTypeDetails45504CCUSPNRDataFeed132 ssr;

    /** 
     * Get the 'ssr' element value. Special requirements type details
     * 
     * @return value
     */
    public SpecialRequirementsTypeDetails45504CCUSPNRDataFeed132 getSsr() {
        return ssr;
    }

    /** 
     * Set the 'ssr' element value. Special requirements type details
     * 
     * @param ssr
     */
    public void setSsr(SpecialRequirementsTypeDetails45504CCUSPNRDataFeed132 ssr) {
        this.ssr = ssr;
    }
}
