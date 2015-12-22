
package com.conztanz.transform.sbr.v14_1;

/** 
 * Issue information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IssueInformation_234429_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cityCode"/>
 *     &lt;xs:element type="xs:string" name="dateOfIssue"/>
 *     &lt;xs:element type="xs:string" name="iataNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IssueInformation234429CCUSPNRDataFeed132
{
    private String cityCode;
    private String dateOfIssue;
    private String iataNumber;

    /** 
     * Get the 'cityCode' element value. City code of the issue
     * 
     * @return value
     */
    public String getCityCode() {
        return cityCode;
    }

    /** 
     * Set the 'cityCode' element value. City code of the issue
     * 
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /** 
     * Get the 'dateOfIssue' element value. Date of the {original , new} issue
     * 
     * @return value
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /** 
     * Set the 'dateOfIssue' element value. Date of the {original , new} issue
     * 
     * @param dateOfIssue
     */
    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    /** 
     * Get the 'iataNumber' element value. IATA number
     * 
     * @return value
     */
    public String getIataNumber() {
        return iataNumber;
    }

    /** 
     * Set the 'iataNumber' element value. IATA number
     * 
     * @param iataNumber
     */
    public void setIataNumber(String iataNumber) {
        this.iataNumber = iataNumber;
    }
}
