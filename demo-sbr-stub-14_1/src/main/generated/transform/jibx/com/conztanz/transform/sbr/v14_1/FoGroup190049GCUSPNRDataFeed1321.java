
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FoGroup_190049_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FoOriginalIssue_165724_S_CUS_PNRDataFeed_132" name="layout"/>
 *     &lt;xs:element type="TravellerInformation_165520_S_CUS_PNRDataFeed_132" name="ptc" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_orgAnd4Exchange_190050_G_CUS_PNRDataFeed_1321" name="orgAnd4Exchange" minOccurs="0" maxOccurs="20"/>
 *     &lt;xs:element type="MonetaryInformation_165527_S_CUS_PNRDataFeed_132" name="monetary" minOccurs="0"/>
 *     &lt;xs:element type="TaxDetails_165722_S_CUS_PNRDataFeed_132" name="txd" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_gr2_190051_G_CUS_PNRDataFeed_1321" name="gr2" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="ReferenceInformation_165521_S_CUS_PNRDataFeed_132" name="prx" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FoGroup190049GCUSPNRDataFeed1321
{
    private FoOriginalIssue165724SCUSPNRDataFeed132 layout;
    private TravellerInformation165520SCUSPNRDataFeed132 ptc;
    private List<StructuredBookingRecordImageTypeDataElementsMasterOrgAnd4Exchange190050GCUSPNRDataFeed1321> orgAnd4ExchangeList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterOrgAnd4Exchange190050GCUSPNRDataFeed1321>();
    private MonetaryInformation165527SCUSPNRDataFeed132 monetary;
    private TaxDetails165722SCUSPNRDataFeed132 txd;
    private List<StructuredBookingRecordImageTypeDataElementsMasterGr2190051GCUSPNRDataFeed1321> gr2List = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterGr2190051GCUSPNRDataFeed1321>();
    private ReferenceInformation165521SCUSPNRDataFeed132 prx;

    /** 
     * Get the 'layout' element value. layout number 1-5
     * 
     * @return value
     */
    public FoOriginalIssue165724SCUSPNRDataFeed132 getLayout() {
        return layout;
    }

    /** 
     * Set the 'layout' element value. layout number 1-5
     * 
     * @param layout
     */
    public void setLayout(FoOriginalIssue165724SCUSPNRDataFeed132 layout) {
        this.layout = layout;
    }

    /** 
     * Get the 'ptc' element value. ptc
     * 
     * @return value
     */
    public TravellerInformation165520SCUSPNRDataFeed132 getPtc() {
        return ptc;
    }

    /** 
     * Set the 'ptc' element value. ptc
     * 
     * @param ptc
     */
    public void setPtc(TravellerInformation165520SCUSPNRDataFeed132 ptc) {
        this.ptc = ptc;
    }

    /** 
     * Get the list of 'orgAnd4Exchange' element items. 1 Group Oryginal + 4 Exchange Group = 5 Total
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterOrgAnd4Exchange190050GCUSPNRDataFeed1321> getOrgAnd4ExchangeList() {
        return orgAnd4ExchangeList;
    }

    /** 
     * Set the list of 'orgAnd4Exchange' element items. 1 Group Oryginal + 4 Exchange Group = 5 Total
     * 
     * @param list
     */
    public void setOrgAnd4ExchangeList(
            List<StructuredBookingRecordImageTypeDataElementsMasterOrgAnd4Exchange190050GCUSPNRDataFeed1321> list) {
        orgAnd4ExchangeList = list;
    }

    /** 
     * Get the 'monetary' element value. monetary
     * 
     * @return value
     */
    public MonetaryInformation165527SCUSPNRDataFeed132 getMonetary() {
        return monetary;
    }

    /** 
     * Set the 'monetary' element value. monetary
     * 
     * @param monetary
     */
    public void setMonetary(MonetaryInformation165527SCUSPNRDataFeed132 monetary) {
        this.monetary = monetary;
    }

    /** 
     * Get the 'txd' element value. txd
     * 
     * @return value
     */
    public TaxDetails165722SCUSPNRDataFeed132 getTxd() {
        return txd;
    }

    /** 
     * Set the 'txd' element value. txd
     * 
     * @param txd
     */
    public void setTxd(TaxDetails165722SCUSPNRDataFeed132 txd) {
        this.txd = txd;
    }

    /** 
     * Get the list of 'gr2' element items. free flow text
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterGr2190051GCUSPNRDataFeed1321> getGr2List() {
        return gr2List;
    }

    /** 
     * Set the list of 'gr2' element items. free flow text
     * 
     * @param list
     */
    public void setGr2List(
            List<StructuredBookingRecordImageTypeDataElementsMasterGr2190051GCUSPNRDataFeed1321> list) {
        gr2List = list;
    }

    /** 
     * Get the 'prx' element value. prx
     * 
     * @return value
     */
    public ReferenceInformation165521SCUSPNRDataFeed132 getPrx() {
        return prx;
    }

    /** 
     * Set the 'prx' element value. prx
     * 
     * @param prx
     */
    public void setPrx(ReferenceInformation165521SCUSPNRDataFeed132 prx) {
        this.prx = prx;
    }
}
