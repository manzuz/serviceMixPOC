
package com.conztanz.transform.sbr.v14_1;

/** 
 * To indicate quantity and action required in relation to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityAndActionDetails_32609_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="QuantityAndActionDetails_56796_C_CUS_PNRDataFeed_132" name="accoStatus"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class QuantityAndActionDetails32609SCUSPNRDataFeed132
{
    private QuantityAndActionDetails56796CCUSPNRDataFeed132 accoStatus;

    /** 
     * Get the 'accoStatus' element value. accommodation status
     * 
     * @return value
     */
    public QuantityAndActionDetails56796CCUSPNRDataFeed132 getAccoStatus() {
        return accoStatus;
    }

    /** 
     * Set the 'accoStatus' element value. accommodation status
     * 
     * @param accoStatus
     */
    public void setAccoStatus(
            QuantityAndActionDetails56796CCUSPNRDataFeed132 accoStatus) {
        this.accoStatus = accoStatus;
    }
}
