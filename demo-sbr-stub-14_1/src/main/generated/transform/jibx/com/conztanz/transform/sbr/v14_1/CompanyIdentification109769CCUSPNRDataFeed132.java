
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code or name to identify a company and any associated companies.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyIdentification_109769_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="mdCarrier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyIdentification109769CCUSPNRDataFeed132
{
    private String mdCarrier;

    /** 
     * Get the 'mdCarrier' element value. Airline Id.
     * 
     * @return value
     */
    public String getMdCarrier() {
        return mdCarrier;
    }

    /** 
     * Set the 'mdCarrier' element value. Airline Id.
     * 
     * @param mdCarrier
     */
    public void setMdCarrier(String mdCarrier) {
        this.mdCarrier = mdCarrier;
    }
}
