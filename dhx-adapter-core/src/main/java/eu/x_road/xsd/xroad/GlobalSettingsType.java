//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package eu.x_road.xsd.xroad;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for GlobalSettingsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSettingsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberClass" type="{http://x-road.eu/xsd/xroad.xsd}MemberClassType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ocspFreshnessSeconds" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSettingsType", propOrder = {
    "memberClass",
    "ocspFreshnessSeconds"
})
public class GlobalSettingsType {

  protected List<MemberClassType> memberClass;
  @XmlElement(required = true)
  protected BigInteger ocspFreshnessSeconds;

  /**
   * Gets the value of the memberClass property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the memberClass property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getMemberClass().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MemberClassType }
   * 
   * 
   */
  public List<MemberClassType> getMemberClass() {
    if (memberClass == null) {
      memberClass = new ArrayList<MemberClassType>();
    }
    return this.memberClass;
  }

  /**
   * Gets the value of the ocspFreshnessSeconds property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getOcspFreshnessSeconds() {
    return ocspFreshnessSeconds;
  }

  /**
   * Sets the value of the ocspFreshnessSeconds property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setOcspFreshnessSeconds(BigInteger value) {
    this.ocspFreshnessSeconds = value;
  }

}
