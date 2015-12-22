
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ObFeesGroup_98670_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecificDataInformation_79035_S_CUS_PNRDataFeed_132" name="carrierFee"/>
 *     &lt;xs:element type="CodedAttribute_79464_S_CUS_PNRDataFeed_132" name="feeDescription" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_79037_S_CUS_PNRDataFeed_132" name="feeAmount"/>
 *     &lt;xs:element type="TaxDetails_79038_S_CUS_PNRDataFeed_132" name="feeTax" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="VatPropertiesGroup_98384_G_CUS_PNRDataFeed_132" name="vatPropertiesGroup" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ObFeesGroup98670GCUSPNRDataFeed132
{
    private SpecificDataInformation79035SCUSPNRDataFeed132 carrierFee;
    private CodedAttribute79464SCUSPNRDataFeed132 feeDescription;
    private MonetaryInformation79037SCUSPNRDataFeed132 feeAmount;
    private List<TaxDetails79038SCUSPNRDataFeed132> feeTaxList = new ArrayList<TaxDetails79038SCUSPNRDataFeed132>();
    private VatPropertiesGroup98384GCUSPNRDataFeed132 vatPropertiesGroup;

    /** 
     * Get the 'carrierFee' element value. carrierFee
     * 
     * @return value
     */
    public SpecificDataInformation79035SCUSPNRDataFeed132 getCarrierFee() {
        return carrierFee;
    }

    /** 
     * Set the 'carrierFee' element value. carrierFee
     * 
     * @param carrierFee
     */
    public void setCarrierFee(
            SpecificDataInformation79035SCUSPNRDataFeed132 carrierFee) {
        this.carrierFee = carrierFee;
    }

    /** 
     * Get the 'feeDescription' element value. Fee commercial description.
     * 
     * @return value
     */
    public CodedAttribute79464SCUSPNRDataFeed132 getFeeDescription() {
        return feeDescription;
    }

    /** 
     * Set the 'feeDescription' element value. Fee commercial description.
     * 
     * @param feeDescription
     */
    public void setFeeDescription(
            CodedAttribute79464SCUSPNRDataFeed132 feeDescription) {
        this.feeDescription = feeDescription;
    }

    /** 
     * Get the 'feeAmount' element value. amount of the fee VAT excluded or VAT included if no FCVC present
     * 
     * @return value
     */
    public MonetaryInformation79037SCUSPNRDataFeed132 getFeeAmount() {
        return feeAmount;
    }

    /** 
     * Set the 'feeAmount' element value. amount of the fee VAT excluded or VAT included if no FCVC present
     * 
     * @param feeAmount
     */
    public void setFeeAmount(
            MonetaryInformation79037SCUSPNRDataFeed132 feeAmount) {
        this.feeAmount = feeAmount;
    }

    /** 
     * Get the list of 'feeTax' element items. fee Tax (VAT may be part of the taxes)
     * 
     * @return list
     */
    public List<TaxDetails79038SCUSPNRDataFeed132> getFeeTaxList() {
        return feeTaxList;
    }

    /** 
     * Set the list of 'feeTax' element items. fee Tax (VAT may be part of the taxes)
     * 
     * @param list
     */
    public void setFeeTaxList(List<TaxDetails79038SCUSPNRDataFeed132> list) {
        feeTaxList = list;
    }

    /** 
     * Get the 'vatPropertiesGroup' element value. vatPropertiesGroup
     * 
     * @return value
     */
    public VatPropertiesGroup98384GCUSPNRDataFeed132 getVatPropertiesGroup() {
        return vatPropertiesGroup;
    }

    /** 
     * Set the 'vatPropertiesGroup' element value. vatPropertiesGroup
     * 
     * @param vatPropertiesGroup
     */
    public void setVatPropertiesGroup(
            VatPropertiesGroup98384GCUSPNRDataFeed132 vatPropertiesGroup) {
        this.vatPropertiesGroup = vatPropertiesGroup;
    }
}
