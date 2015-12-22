
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify contact communication numbers and names.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ContactInformation_36727_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ContactInformation_62836_C_CUS_PNRDataFeed_132" name="contactInformation" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ContactInformation36727SCUSPNRDataFeed132
{
    private List<ContactInformation62836CCUSPNRDataFeed132> contactInformationList = new ArrayList<ContactInformation62836CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'contactInformation' element items. This composite is used to convey the E-mail address or FAX number to be used when a written confirmation is needed.
     * 
     * @return list
     */
    public List<ContactInformation62836CCUSPNRDataFeed132> getContactInformationList() {
        return contactInformationList;
    }

    /** 
     * Set the list of 'contactInformation' element items. This composite is used to convey the E-mail address or FAX number to be used when a written confirmation is needed.
     * 
     * @param list
     */
    public void setContactInformationList(
            List<ContactInformation62836CCUSPNRDataFeed132> list) {
        contactInformationList = list;
    }
}
