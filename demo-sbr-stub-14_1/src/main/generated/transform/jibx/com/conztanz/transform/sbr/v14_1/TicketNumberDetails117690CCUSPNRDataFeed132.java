
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a ticket number, type of ticket, and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketNumberDetails_117690_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dataIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketNumberDetails117690CCUSPNRDataFeed132
{
    private String number;
    private String type;
    private String dataIndicator;

    /** 
     * Get the 'number' element value. Ticket number
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Ticket number
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'type' element value. Ticket type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Ticket type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'dataIndicator' element value. E-TKT association indicator, mandatory if Ticket type is ETK
     * 
     * @return value
     */
    public String getDataIndicator() {
        return dataIndicator;
    }

    /** 
     * Set the 'dataIndicator' element value. E-TKT association indicator, mandatory if Ticket type is ETK
     * 
     * @param dataIndicator
     */
    public void setDataIndicator(String dataIndicator) {
        this.dataIndicator = dataIndicator;
    }
}
