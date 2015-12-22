
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the dates and times associated with a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDateTime_117824_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="depDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="depTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dateVariation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDateTime117824CCUSPNRDataFeed132
{
    private String depDate;
    private String depTime;
    private String arrDate;
    private String arrTime;
    private String dateVariation;

    /** 
     * Get the 'depDate' element value. Scheduled departure date
     * 
     * @return value
     */
    public String getDepDate() {
        return depDate;
    }

    /** 
     * Set the 'depDate' element value. Scheduled departure date
     * 
     * @param depDate
     */
    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    /** 
     * Get the 'depTime' element value. Scheduled departure time
     * 
     * @return value
     */
    public String getDepTime() {
        return depTime;
    }

    /** 
     * Set the 'depTime' element value. Scheduled departure time
     * 
     * @param depTime
     */
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    /** 
     * Get the 'arrDate' element value. Scheduled arrival date
     * 
     * @return value
     */
    public String getArrDate() {
        return arrDate;
    }

    /** 
     * Set the 'arrDate' element value. Scheduled arrival date
     * 
     * @param arrDate
     */
    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }

    /** 
     * Get the 'arrTime' element value. Scheduled arrival time
     * 
     * @return value
     */
    public String getArrTime() {
        return arrTime;
    }

    /** 
     * Set the 'arrTime' element value. Scheduled arrival time
     * 
     * @param arrTime
     */
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    /** 
     * Get the 'dateVariation' element value. Date variation
     * 
     * @return value
     */
    public String getDateVariation() {
        return dateVariation;
    }

    /** 
     * Set the 'dateVariation' element value. Date variation
     * 
     * @param dateVariation
     */
    public void setDateVariation(String dateVariation) {
        this.dateVariation = dateVariation;
    }
}
