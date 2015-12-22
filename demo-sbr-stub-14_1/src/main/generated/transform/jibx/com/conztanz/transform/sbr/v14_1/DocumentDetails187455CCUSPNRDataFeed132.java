
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of document by number, status and date.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocumentDetails_187455_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status"/>
 *     &lt;xs:element type="xs:string" name="date" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocumentDetails187455CCUSPNRDataFeed132
{
    private String number;
    private String status;
    private String date;

    /** 
     * Get the 'number' element value. To convey the document number
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. To convey the document number
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'status' element value. To convey if the document has been printed
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. To convey if the document has been printed
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'date' element value. To convey the date of the impression.
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' element value. To convey the date of the impression.
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
}
