//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package eu.x_road.xsd.xroad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about an OCSP provider.
 * 
 * 
 * <p>
 * Java class for OcspInfoType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OcspInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cert" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OcspInfoType", propOrder = {
    "url",
    "cert"
})
public class OcspInfoType {

  @XmlElement(required = true)
  protected String url;
  protected byte[] cert;

  /**
   * Gets the value of the url property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the value of the url property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setUrl(String value) {
    this.url = value;
  }

  /**
   * Gets the value of the cert property.
   * 
   * @return possible object is byte[]
   */
  public byte[] getCert() {
    return cert;
  }

  /**
   * Sets the value of the cert property.
   * 
   * @param value allowed object is byte[]
   */
  public void setCert(byte[] value) {
    this.cert = value;
  }

}
