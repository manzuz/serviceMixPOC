
package com.conztanz.transform.sbr.v14_1;

/** 
 * To define the characteristics of a Package (a set of Travel Products sold together).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PackageDescription_83039_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="packageType"/>
 *     &lt;xs:element type="PackageIdentification_126852_C_CUS_PNRDataFeed_132" name="packageDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PackageDescription83039SCUSPNRDataFeed132
{
    private String packageType;
    private PackageIdentification126852CCUSPNRDataFeed132 packageDetails;

    /** 
     * Get the 'packageType' element value. Inclusive package type: I
     * 
     * @return value
     */
    public String getPackageType() {
        return packageType;
    }

    /** 
     * Set the 'packageType' element value. Inclusive package type: I
     * 
     * @param packageType
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /** 
     * Get the 'packageDetails' element value. List of inclusive package
     * 
     * @return value
     */
    public PackageIdentification126852CCUSPNRDataFeed132 getPackageDetails() {
        return packageDetails;
    }

    /** 
     * Set the 'packageDetails' element value. List of inclusive package
     * 
     * @param packageDetails
     */
    public void setPackageDetails(
            PackageIdentification126852CCUSPNRDataFeed132 packageDetails) {
        this.packageDetails = packageDetails;
    }
}
