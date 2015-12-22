
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the Amadeus PNR Record Locator Security Information for RR, SP elements and PNR Header or RP line
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationSecurityInformation_4193_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ResponsibilityInformation_6835_C_CUS_PNRDataFeed_132" name="responsibilityInformation" minOccurs="0"/>
 *     &lt;xs:element type="TicketInformation_5120_C_CUS_PNRDataFeed_132" name="queueingInformation" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cityCode" minOccurs="0"/>
 *     &lt;xs:element type="SecondRpLineInformation_7039_C_CUS_PNRDataFeed_132" name="secondRpInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationSecurityInformation4193SCUSPNRDataFeed132
{
    private ResponsibilityInformation6835CCUSPNRDataFeed132 responsibilityInformation;
    private TicketInformation5120CCUSPNRDataFeed132 queueingInformation;
    private String cityCode;
    private SecondRpLineInformation7039CCUSPNRDataFeed132 secondRpInformation;

    /** 
     * Get the 'responsibilityInformation' element value. Responsibility Information
     * 
     * @return value
     */
    public ResponsibilityInformation6835CCUSPNRDataFeed132 getResponsibilityInformation() {
        return responsibilityInformation;
    }

    /** 
     * Set the 'responsibilityInformation' element value. Responsibility Information
     * 
     * @param responsibilityInformation
     */
    public void setResponsibilityInformation(
            ResponsibilityInformation6835CCUSPNRDataFeed132 responsibilityInformation) {
        this.responsibilityInformation = responsibilityInformation;
    }

    /** 
     * Get the 'queueingInformation' element value. Ticket Information
     * 
     * @return value
     */
    public TicketInformation5120CCUSPNRDataFeed132 getQueueingInformation() {
        return queueingInformation;
    }

    /** 
     * Set the 'queueingInformation' element value. Ticket Information
     * 
     * @param queueingInformation
     */
    public void setQueueingInformation(
            TicketInformation5120CCUSPNRDataFeed132 queueingInformation) {
        this.queueingInformation = queueingInformation;
    }

    /** 
     * Get the 'cityCode' element value. 1. PNR Header: Pseudo City Code (not in the CRT display) AGY for Travel agency EHD for First level Help Desk DAP for Data processing center / Amadeus Help Desk Nice SEC for Security administrator WZ for AIS security administrator
     * 
     * @return value
     */
    public String getCityCode() {
        return cityCode;
    }

    /** 
     * Set the 'cityCode' element value. 1. PNR Header: Pseudo City Code (not in the CRT display) AGY for Travel agency EHD for First level Help Desk DAP for Data processing center / Amadeus Help Desk Nice SEC for Security administrator WZ for AIS security administrator
     * 
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /** 
     * Get the 'secondRpInformation' element value. Second RP line information
     * 
     * @return value
     */
    public SecondRpLineInformation7039CCUSPNRDataFeed132 getSecondRpInformation() {
        return secondRpInformation;
    }

    /** 
     * Set the 'secondRpInformation' element value. Second RP line information
     * 
     * @param secondRpInformation
     */
    public void setSecondRpInformation(
            SecondRpLineInformation7039CCUSPNRDataFeed132 secondRpInformation) {
        this.secondRpInformation = secondRpInformation;
    }
}
