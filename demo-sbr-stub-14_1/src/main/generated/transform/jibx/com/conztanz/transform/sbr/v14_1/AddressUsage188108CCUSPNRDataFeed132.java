
package com.conztanz.transform.sbr.v14_1;

/** 
 * To describe the usage of an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressUsage_188108_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="purpose" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AddressUsage188108CCUSPNRDataFeed132
{
    private String purpose;
    private String type;
    private String status;

    /** 
     * Get the 'purpose' element value.
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'purpose' element value.
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'status' element value.
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value.
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
