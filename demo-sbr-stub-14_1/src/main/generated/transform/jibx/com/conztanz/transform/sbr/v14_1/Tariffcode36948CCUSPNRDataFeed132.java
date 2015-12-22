
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Tariffcode_36948_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="tariffCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="tariffCodeType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Tariffcode36948CCUSPNRDataFeed132
{
    private String tariffCode;
    private String tariffCodeType;

    /** 
     * Get the 'tariffCode' element value. To convey the Tariff code.
     * 
     * @return value
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /** 
     * Set the 'tariffCode' element value. To convey the Tariff code.
     * 
     * @param tariffCode
     */
    public void setTariffCode(String tariffCode) {
        this.tariffCode = tariffCode;
    }

    /** 
     * Get the 'tariffCodeType' element value. to convey a description of the type of tariff.
     * 
     * @return value
     */
    public String getTariffCodeType() {
        return tariffCodeType;
    }

    /** 
     * Set the 'tariffCodeType' element value. to convey a description of the type of tariff.
     * 
     * @param tariffCodeType
     */
    public void setTariffCodeType(String tariffCodeType) {
        this.tariffCodeType = tariffCodeType;
    }
}
