
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a frequency and the time window in which it applies.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Frequency_94555_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Frequency_142176_C_CUS_PNRDataFeed_132" name="extendedPaymentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Frequency94555SCUSPNRDataFeed132
{
    private Frequency142176CCUSPNRDataFeed132 extendedPaymentDetails;

    /** 
     * Get the 'extendedPaymentDetails' element value. extended payment characteristics
     * 
     * @return value
     */
    public Frequency142176CCUSPNRDataFeed132 getExtendedPaymentDetails() {
        return extendedPaymentDetails;
    }

    /** 
     * Set the 'extendedPaymentDetails' element value. extended payment characteristics
     * 
     * @param extendedPaymentDetails
     */
    public void setExtendedPaymentDetails(
            Frequency142176CCUSPNRDataFeed132 extendedPaymentDetails) {
        this.extendedPaymentDetails = extendedPaymentDetails;
    }
}
