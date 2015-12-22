
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the dates and times associated with a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDateOrTime_256708_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="depDate"/>
 *     &lt;xs:element type="xs:string" name="depTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="arrTime" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dayChangeIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDateOrTime256708CCUSPNRDataFeed132
{
    private String depDate;
    private String depTime;
    private String arrDate;
    private String arrTime;
    private String dayChangeIndicator;

    /** 
     * Get the 'depDate' element value. Format : DDMMYY  AIR segment : departure date ATX segment : requested date CAR segment : pick-up date CCR segment : pick-up date HHL segment : check-in date HTL segment : check-in date MIS segment : date for service requested SUR segment : date Trn Amtrak sgt: departure date Trn SNCF sgt: departure date TTO segment: departure date of the tour TUR segment: tour departure date INS element: departure date CRU segment: sailing departure date
     * 
     * @return value
     */
    public String getDepDate() {
        return depDate;
    }

    /** 
     * Set the 'depDate' element value. Format : DDMMYY  AIR segment : departure date ATX segment : requested date CAR segment : pick-up date CCR segment : pick-up date HHL segment : check-in date HTL segment : check-in date MIS segment : date for service requested SUR segment : date Trn Amtrak sgt: departure date Trn SNCF sgt: departure date TTO segment: departure date of the tour TUR segment: tour departure date INS element: departure date CRU segment: sailing departure date
     * 
     * @param depDate
     */
    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    /** 
     * Get the 'depTime' element value. AIR segment : departure time SUR segment : pick-up time Trn Amtrak sgt: departure time Trn SNCF sgt: departure time
     * 
     * @return value
     */
    public String getDepTime() {
        return depTime;
    }

    /** 
     * Set the 'depTime' element value. AIR segment : departure time SUR segment : pick-up time Trn Amtrak sgt: departure time Trn SNCF sgt: departure time
     * 
     * @param depTime
     */
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    /** 
     * Get the 'arrDate' element value. Format : DDMMYY  AIR segment : arrival date CAR segment : drop-off date CCR segment : return date HHL segment : check-out date HTL segment : check-out date TTO segment: return date of the tour INS element: return date
     * 
     * @return value
     */
    public String getArrDate() {
        return arrDate;
    }

    /** 
     * Set the 'arrDate' element value. Format : DDMMYY  AIR segment : arrival date CAR segment : drop-off date CCR segment : return date HHL segment : check-out date HTL segment : check-out date TTO segment: return date of the tour INS element: return date
     * 
     * @param arrDate
     */
    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }

    /** 
     * Get the 'arrTime' element value. AIR segment : arrival time Trn Amtrak sgt: arrival time Trn SNCF sgt: arrival time
     * 
     * @return value
     */
    public String getArrTime() {
        return arrTime;
    }

    /** 
     * Set the 'arrTime' element value. AIR segment : arrival time Trn Amtrak sgt: arrival time Trn SNCF sgt: arrival time
     * 
     * @param arrTime
     */
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    /** 
     * Get the 'dayChangeIndicator' element value. AIR segment: day change indicator (1,2,-1) TRN Amtrak sgt: day change indicator (1,2,-1) TRN SNCF sgt: day change indicator (1,2,-1)
     * 
     * @return value
     */
    public String getDayChangeIndicator() {
        return dayChangeIndicator;
    }

    /** 
     * Set the 'dayChangeIndicator' element value. AIR segment: day change indicator (1,2,-1) TRN Amtrak sgt: day change indicator (1,2,-1) TRN SNCF sgt: day change indicator (1,2,-1)
     * 
     * @param dayChangeIndicator
     */
    public void setDayChangeIndicator(String dayChangeIndicator) {
        this.dayChangeIndicator = dayChangeIndicator;
    }
}
