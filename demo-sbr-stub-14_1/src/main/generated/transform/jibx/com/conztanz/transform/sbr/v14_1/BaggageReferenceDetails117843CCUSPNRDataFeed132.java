
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify additional information concerning baggage.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BaggageReferenceDetails_117843_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="indicator"/>
 *     &lt;xs:element type="xs:string" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BaggageReferenceDetails117843CCUSPNRDataFeed132
{
    private String indicator;
    private String number;

    /** 
     * Get the 'indicator' element value. To specify if the baggage group is a pool: YP means that the baggage Group is a pool.
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. To specify if the baggage group is a pool: YP means that the baggage Group is a pool.
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'number' element value. Pool reference of the Group of bags belonging to several customers.
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Pool reference of the Group of bags belonging to several customers.
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
