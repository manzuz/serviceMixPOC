
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_132917_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="controlNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="controlType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="date" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="time" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation132917CCUSPNRDataFeed132
{
    private String companyId;
    private String controlNumber;
    private String controlType;
    private String date;
    private String time;

    /** 
     * Get the 'companyId' element value. - 1A or Other airline record locator information - Passive segment airline code
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. - 1A or Other airline record locator information - Passive segment airline code
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'controlNumber' element value. - 1A record locator or - OA record locator
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. - 1A record locator or - OA record locator
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    /** 
     * Get the 'controlType' element value. PNR split type.
     * 
     * @return value
     */
    public String getControlType() {
        return controlType;
    }

    /** 
     * Set the 'controlType' element value. PNR split type.
     * 
     * @param controlType
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /** 
     * Get the 'date' element value. 1. RR element: Date 2. SP element: Date 3. PNR header/RP line: Date of lastest End of transaction
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' element value. 1. RR element: Date 2. SP element: Date 3. PNR header/RP line: Date of lastest End of transaction
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Get the 'time' element value. 1. PNR header/RP line: time of lastest End of transaction
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'time' element value. 1. PNR header/RP line: time of lastest End of transaction
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
