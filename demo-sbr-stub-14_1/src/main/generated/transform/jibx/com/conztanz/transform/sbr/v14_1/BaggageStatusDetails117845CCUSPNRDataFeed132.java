
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a printer I.D. and a cabin class.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BaggageStatusDetails_117845_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="status"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BaggageStatusDetails117845CCUSPNRDataFeed132
{
    private String status;

    /** 
     * Get the 'status' element value. This is used to indicate  - the bag source type, 'statusIndicator' containing: "BSA" for automatic "BSB" for BTM "BSI" for IATCI
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. This is used to indicate  - the bag source type, 'statusIndicator' containing: "BSA" for automatic "BSB" for BTM "BSI" for IATCI
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
