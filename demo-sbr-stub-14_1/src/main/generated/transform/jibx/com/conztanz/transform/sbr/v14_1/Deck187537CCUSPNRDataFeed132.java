
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a deck
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Deck_187537_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="deckId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="deckCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Deck187537CCUSPNRDataFeed132
{
    private String deckId;
    private String deckCode;

    /** 
     * Get the 'deckId' element value.
     * 
     * @return value
     */
    public String getDeckId() {
        return deckId;
    }

    /** 
     * Set the 'deckId' element value.
     * 
     * @param deckId
     */
    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    /** 
     * Get the 'deckCode' element value.
     * 
     * @return value
     */
    public String getDeckCode() {
        return deckCode;
    }

    /** 
     * Set the 'deckCode' element value.
     * 
     * @param deckCode
     */
    public void setDeckCode(String deckCode) {
        this.deckCode = deckCode;
    }
}
