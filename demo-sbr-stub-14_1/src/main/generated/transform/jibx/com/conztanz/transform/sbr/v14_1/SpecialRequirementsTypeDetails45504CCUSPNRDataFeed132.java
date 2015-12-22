
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsTypeDetails_45504_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="indicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="processingIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="boardpoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="offpoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freeText" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsTypeDetails45504CCUSPNRDataFeed132
{
    private String type;
    private String status;
    private BigDecimal quantity;
    private String companyId;
    private String indicator;
    private String processingIndicator;
    private String boardpoint;
    private String offpoint;
    private List<String> freeTextList = new ArrayList<String>();

    /** 
     * Get the 'type' element value. ATA/IATA defined Special Service Requirement code.  (refer to IATA AIRIMP documentation)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. ATA/IATA defined Special Service Requirement code.  (refer to IATA AIRIMP documentation)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'status' element value. Use defined code or an ATA/IATA defined action code (See AIRIMP 7.1.2/7.1.3/7.1.4/8.14.1 (as bilaterally agreed), SIPP 105.170.1.1).
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. Use defined code or an ATA/IATA defined action code (See AIRIMP 7.1.2/7.1.3/7.1.4/8.14.1 (as bilaterally agreed), SIPP 105.170.1.1).
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'quantity' element value. Number of services requested
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value. Number of services requested
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'companyId' element value. Airline code or YY
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. Airline code or YY
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /** 
     * Get the 'indicator' element value. Seat Special service request  or  Frequent Flyer SSR.
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. Seat Special service request  or  Frequent Flyer SSR.
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'processingIndicator' element value. 1. Seat SSR Processing indicator, coded  PS for Partial segment  indicator
     * 
     * @return value
     */
    public String getProcessingIndicator() {
        return processingIndicator;
    }

    /** 
     * Set the 'processingIndicator' element value. 1. Seat SSR Processing indicator, coded  PS for Partial segment  indicator
     * 
     * @param processingIndicator
     */
    public void setProcessingIndicator(String processingIndicator) {
        this.processingIndicator = processingIndicator;
    }

    /** 
     * Get the 'boardpoint' element value. Board point
     * 
     * @return value
     */
    public String getBoardpoint() {
        return boardpoint;
    }

    /** 
     * Set the 'boardpoint' element value. Board point
     * 
     * @param boardpoint
     */
    public void setBoardpoint(String boardpoint) {
        this.boardpoint = boardpoint;
    }

    /** 
     * Get the 'offpoint' element value. Off point
     * 
     * @return value
     */
    public String getOffpoint() {
        return offpoint;
    }

    /** 
     * Set the 'offpoint' element value. Off point
     * 
     * @param offpoint
     */
    public void setOffpoint(String offpoint) {
        this.offpoint = offpoint;
    }

    /** 
     * Get the list of 'freeText' element items. Free flow of the SSR that can be up to 127 chars long, therefore split on two 4440 (70 + 57)
     * 
     * @return list
     */
    public List<String> getFreeTextList() {
        return freeTextList;
    }

    /** 
     * Set the list of 'freeText' element items. Free flow of the SSR that can be up to 127 chars long, therefore split on two 4440 (70 + 57)
     * 
     * @param list
     */
    public void setFreeTextList(List<String> list) {
        freeTextList = list;
    }
}
