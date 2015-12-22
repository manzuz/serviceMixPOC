
package com.conztanz.transform.sbr.v14_1;

/** 
 * To indicate quantity and action required in relation to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityAndActionDetails_129346_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="QuantityAndActionDetails_188420_C_CUS_PNRDataFeed_132" name="accoStatus"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class QuantityAndActionDetails129346SCUSPNRDataFeed132
{
    private QuantityAndActionDetails188420CCUSPNRDataFeed132 accoStatus;

    /** 
     * Get the 'accoStatus' element value. accommodation status
     * 
     * @return value
     */
    public QuantityAndActionDetails188420CCUSPNRDataFeed132 getAccoStatus() {
        return accoStatus;
    }

    /** 
     * Set the 'accoStatus' element value. accommodation status
     * 
     * @param accoStatus
     */
    public void setAccoStatus(
            QuantityAndActionDetails188420CCUSPNRDataFeed132 accoStatus) {
        this.accoStatus = accoStatus;
    }
}
