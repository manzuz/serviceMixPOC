
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify availability and additional services for a product class.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDetails_118108_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="designator"/>
 *     &lt;xs:element type="xs:string" name="availabilityStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDetails118108CCUSPNRDataFeed132
{
    private String designator;
    private String availabilityStatus;

    /** 
     * Get the 'designator' element value. Class combination
     * 
     * @return value
     */
    public String getDesignator() {
        return designator;
    }

    /** 
     * Set the 'designator' element value. Class combination
     * 
     * @param designator
     */
    public void setDesignator(String designator) {
        this.designator = designator;
    }

    /** 
     * Get the 'availabilityStatus' element value. indicate availability status . coded or numeric
     * 
     * @return value
     */
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    /** 
     * Set the 'availabilityStatus' element value. indicate availability status . coded or numeric
     * 
     * @param availabilityStatus
     */
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
