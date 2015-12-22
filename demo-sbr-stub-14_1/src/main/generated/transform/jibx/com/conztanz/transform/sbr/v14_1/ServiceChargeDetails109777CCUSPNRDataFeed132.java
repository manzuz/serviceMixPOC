
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey details related to the service charge
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ServiceChargeDetails_109777_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="mdType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ServiceChargeDetails109777CCUSPNRDataFeed132
{
    private String mdType;

    /** 
     * Get the 'mdType' element value. Md Type
     * 
     * @return value
     */
    public String getMdType() {
        return mdType;
    }

    /** 
     * Set the 'mdType' element value. Md Type
     * 
     * @param mdType
     */
    public void setMdType(String mdType) {
        this.mdType = mdType;
    }
}
