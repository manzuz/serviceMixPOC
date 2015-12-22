
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a sequence and source for sequencing.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SequenceInformation_142106_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SequenceInformation142106CCUSPNRDataFeed132
{
    private String number;

    /** 
     * Get the 'number' element value. Sequence number of the Mean Of Payment in the FOP line. There can be up to 3 New MOP and 3 Old MOP in a FOP line.  Old Fops are considered as freeflow text.
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Sequence number of the Mean Of Payment in the FOP line. There can be up to 3 New MOP and 3 Old MOP in a FOP line.  Old Fops are considered as freeflow text.
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
