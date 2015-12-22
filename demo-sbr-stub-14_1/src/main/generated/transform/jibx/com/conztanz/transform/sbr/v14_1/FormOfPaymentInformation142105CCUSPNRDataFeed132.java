
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey informations related to the form of payment specific to reporting
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormOfPaymentInformation_142105_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="fopCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopMapTable" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopBillingCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopStatus" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopEdiCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopReportingCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopPrintedCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopElecTicketingCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormOfPaymentInformation142105CCUSPNRDataFeed132
{
    private String fopCode;
    private String fopMapTable;
    private String fopBillingCode;
    private String fopStatus;
    private String fopEdiCode;
    private String fopReportingCode;
    private String fopPrintedCode;
    private String fopElecTicketingCode;

    /** 
     * Get the 'fopCode' element value. Format key that identify the FOP within a FOP table. (CCVI, ...)
     * 
     * @return value
     */
    public String getFopCode() {
        return fopCode;
    }

    /** 
     * Set the 'fopCode' element value. Format key that identify the FOP within a FOP table. (CCVI, ...)
     * 
     * @param fopCode
     */
    public void setFopCode(String fopCode) {
        this.fopCode = fopCode;
    }

    /** 
     * Get the 'fopMapTable' element value. Name of the FOP map table used in order to validate the FP element.
     * 
     * @return value
     */
    public String getFopMapTable() {
        return fopMapTable;
    }

    /** 
     * Set the 'fopMapTable' element value. Name of the FOP map table used in order to validate the FP element.
     * 
     * @param fopMapTable
     */
    public void setFopMapTable(String fopMapTable) {
        this.fopMapTable = fopMapTable;
    }

    /** 
     * Get the 'fopBillingCode' element value. This corresponds to the fop billing code (CASH CA / Credit CC). This is only used in case of a MS reporting code. (it corresponds to XX of @FPMSXX tag of TPF tables)
     * 
     * @return value
     */
    public String getFopBillingCode() {
        return fopBillingCode;
    }

    /** 
     * Set the 'fopBillingCode' element value. This corresponds to the fop billing code (CASH CA / Credit CC). This is only used in case of a MS reporting code. (it corresponds to XX of @FPMSXX tag of TPF tables)
     * 
     * @param fopBillingCode
     */
    public void setFopBillingCode(String fopBillingCode) {
        this.fopBillingCode = fopBillingCode;
    }

    /** 
     * Get the 'fopStatus' element value. Fop is a old / new fop.
     * 
     * @return value
     */
    public String getFopStatus() {
        return fopStatus;
    }

    /** 
     * Set the 'fopStatus' element value. Fop is a old / new fop.
     * 
     * @param fopStatus
     */
    public void setFopStatus(String fopStatus) {
        this.fopStatus = fopStatus;
    }

    /** 
     * Get the 'fopEdiCode' element value. Corresponds to the EDIFACT code.  This enables to identify the type of FOP that will be added in case of a structured EDIFACT (i.e. via PNRADD) addition of the FOP. (it corresponds to the @EDI tag of TPF tables) Here is an example: Customer is eager to add a structured cash FOP using an EDIFACT message. The fopEdiCode will be filled with CA which means cash. Then in the FOP table in charge of validating free flow and generating FOP free flow, the system will try to look for the FOP map having CA as fop EDI code. If we are in an Air France (AF) ATO/CTO: the system will get FP CA.... If we are in an Iberia (IB) ATO/CTO: the system will get FP CASH,.... If we are in an United Airline (UA) ATO/CTO: the system will get FP S.... ...  (@EDI value)
     * 
     * @return value
     */
    public String getFopEdiCode() {
        return fopEdiCode;
    }

    /** 
     * Set the 'fopEdiCode' element value. Corresponds to the EDIFACT code.  This enables to identify the type of FOP that will be added in case of a structured EDIFACT (i.e. via PNRADD) addition of the FOP. (it corresponds to the @EDI tag of TPF tables) Here is an example: Customer is eager to add a structured cash FOP using an EDIFACT message. The fopEdiCode will be filled with CA which means cash. Then in the FOP table in charge of validating free flow and generating FOP free flow, the system will try to look for the FOP map having CA as fop EDI code. If we are in an Air France (AF) ATO/CTO: the system will get FP CA.... If we are in an Iberia (IB) ATO/CTO: the system will get FP CASH,.... If we are in an United Airline (UA) ATO/CTO: the system will get FP S.... ...  (@EDI value)
     * 
     * @param fopEdiCode
     */
    public void setFopEdiCode(String fopEdiCode) {
        this.fopEdiCode = fopEdiCode;
    }

    /** 
     * Get the 'fopReportingCode' element value. This corresponds to the fop code which is used on reporting side.  (XX value of @FPXXxx)
     * 
     * @return value
     */
    public String getFopReportingCode() {
        return fopReportingCode;
    }

    /** 
     * Set the 'fopReportingCode' element value. This corresponds to the fop code which is used on reporting side.  (XX value of @FPXXxx)
     * 
     * @param fopReportingCode
     */
    public void setFopReportingCode(String fopReportingCode) {
        this.fopReportingCode = fopReportingCode;
    }

    /** 
     * Get the 'fopPrintedCode' element value. This is the FOP printed code  (@PR value)
     * 
     * @return value
     */
    public String getFopPrintedCode() {
        return fopPrintedCode;
    }

    /** 
     * Set the 'fopPrintedCode' element value. This is the FOP printed code  (@PR value)
     * 
     * @param fopPrintedCode
     */
    public void setFopPrintedCode(String fopPrintedCode) {
        this.fopPrintedCode = fopPrintedCode;
    }

    /** 
     * Get the 'fopElecTicketingCode' element value. This is the FOP electronic ticketing code. This is used to classify any FOP from the FOP table and also to determine how the FOP should be transmitted to the airline concerned. Based on this, the absence of the switch would make the FOP disallowed for ETKT, for National System Ticketing Server Travel Agency locations and all Central Ticketing offices  (@ET value)
     * 
     * @return value
     */
    public String getFopElecTicketingCode() {
        return fopElecTicketingCode;
    }

    /** 
     * Set the 'fopElecTicketingCode' element value. This is the FOP electronic ticketing code. This is used to classify any FOP from the FOP table and also to determine how the FOP should be transmitted to the airline concerned. Based on this, the absence of the switch would make the FOP disallowed for ETKT, for National System Ticketing Server Travel Agency locations and all Central Ticketing offices  (@ET value)
     * 
     * @param fopElecTicketingCode
     */
    public void setFopElecTicketingCode(String fopElecTicketingCode) {
        this.fopElecTicketingCode = fopElecTicketingCode;
    }
}
