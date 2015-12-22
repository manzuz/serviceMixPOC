
package com.conztanz.transform.sbr.v14_1;

/** 
 * specify credit card data for credit card authorization - USED IN CCVRQT
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreditCardData_94502_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CreditCardInformation_142116_C_CUS_PNRDataFeed_132" name="ccInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CreditCardData94502SCUSPNRDataFeed132
{
    private CreditCardInformation142116CCUSPNRDataFeed132 ccInfo;

    /** 
     * Get the 'ccInfo' element value. Credit Card information
     * 
     * @return value
     */
    public CreditCardInformation142116CCUSPNRDataFeed132 getCcInfo() {
        return ccInfo;
    }

    /** 
     * Set the 'ccInfo' element value. Credit Card information
     * 
     * @param ccInfo
     */
    public void setCcInfo(CreditCardInformation142116CCUSPNRDataFeed132 ccInfo) {
        this.ccInfo = ccInfo;
    }
}
