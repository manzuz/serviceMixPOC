
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductTypeDetails_62873_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="detail" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductTypeDetails62873CCUSPNRDataFeed132
{
    private String detail;

    /** 
     * Get the 'detail' element value. AIR segment : Electronic ticketing indicator : ET for Electronic ticket candidate SUR segment : transportation zone number Amtrack segment : Equipement code  SNCF segment : train type (3 chars code)
     * 
     * @return value
     */
    public String getDetail() {
        return detail;
    }

    /** 
     * Set the 'detail' element value. AIR segment : Electronic ticketing indicator : ET for Electronic ticket candidate SUR segment : transportation zone number Amtrack segment : Equipement code  SNCF segment : train type (3 chars code)
     * 
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}
