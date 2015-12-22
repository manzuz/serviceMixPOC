
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Conveys browser properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BrowserInformation_94525_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="deviceCategory"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BrowserInformation94525SCUSPNRDataFeed132
{
    private BigDecimal deviceCategory;

    /** 
     * Get the 'deviceCategory' element value. Indicates the type of cardholder device.
     * 
     * @return value
     */
    public BigDecimal getDeviceCategory() {
        return deviceCategory;
    }

    /** 
     * Set the 'deviceCategory' element value. Indicates the type of cardholder device.
     * 
     * @param deviceCategory
     */
    public void setDeviceCategory(BigDecimal deviceCategory) {
        this.deviceCategory = deviceCategory;
    }
}
