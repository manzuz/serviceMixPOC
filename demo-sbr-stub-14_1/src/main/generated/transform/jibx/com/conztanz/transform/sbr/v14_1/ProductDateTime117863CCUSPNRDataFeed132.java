
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the dates and times associated with a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDateTime_117863_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="departureDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDateTime117863CCUSPNRDataFeed132
{
    private String departureDate;

    /** 
     * Get the 'departureDate' element value. scheduled departure date
     * 
     * @return value
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'departureDate' element value. scheduled departure date
     * 
     * @param departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
