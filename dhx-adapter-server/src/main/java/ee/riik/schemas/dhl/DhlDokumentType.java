//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 09:18:04 PM EET 
//


package ee.riik.schemas.dhl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ee.sk.digidoc.v1_3.SignedDocType;


/**
 * Andmevahetusdokumendi tüüp
 * 
 * <p>Java class for dhlDokumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dhlDokumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.riik.ee/schemas/dhl}transport" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.riik.ee/schemas/dhl}ajalugu" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.riik.ee/schemas/dhl}metaxml" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.sk.ee/DigiDoc/v1.3.0#}SignedDoc" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="ref" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="dhl_id" type="{http://www.riik.ee/schemas/dhl-meta-automatic}dhlDokIDType" /&gt;
 *                 &lt;attribute name="dhl_taisnimi" type="{http://www.riik.ee/schemas/dhl-meta-automatic}dhlDokTaisnimiType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dhlDokumentType", propOrder = {
    "transport",
    "ajalugu",
    "metaxml",
    "signedDoc",
    "ref"
})
public class DhlDokumentType {

    protected Transport transport;
    protected Ajalugu ajalugu;
    protected Metaxml metaxml;
    @XmlElement(name = "SignedDoc", namespace = "http://www.sk.ee/DigiDoc/v1.3.0#")
    protected SignedDocType signedDoc;
    @XmlElement(namespace = "")
    protected DhlDokumentType.Ref ref;

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTransport(Transport value) {
        this.transport = value;
    }

    /**
     * Gets the value of the ajalugu property.
     * 
     * @return
     *     possible object is
     *     {@link Ajalugu }
     *     
     */
    public Ajalugu getAjalugu() {
        return ajalugu;
    }

    /**
     * Sets the value of the ajalugu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ajalugu }
     *     
     */
    public void setAjalugu(Ajalugu value) {
        this.ajalugu = value;
    }

    /**
     * Gets the value of the metaxml property.
     * 
     * @return
     *     possible object is
     *     {@link Metaxml }
     *     
     */
    public Metaxml getMetaxml() {
        return metaxml;
    }

    /**
     * Sets the value of the metaxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metaxml }
     *     
     */
    public void setMetaxml(Metaxml value) {
        this.metaxml = value;
    }

    /**
     * Gets the value of the signedDoc property.
     * 
     * @return
     *     possible object is
     *     {@link SignedDocType }
     *     
     */
    public SignedDocType getSignedDoc() {
        return signedDoc;
    }

    /**
     * Sets the value of the signedDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedDocType }
     *     
     */
    public void setSignedDoc(SignedDocType value) {
        this.signedDoc = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link DhlDokumentType.Ref }
     *     
     */
    public DhlDokumentType.Ref getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link DhlDokumentType.Ref }
     *     
     */
    public void setRef(DhlDokumentType.Ref value) {
        this.ref = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="dhl_id" type="{http://www.riik.ee/schemas/dhl-meta-automatic}dhlDokIDType" /&gt;
     *       &lt;attribute name="dhl_taisnimi" type="{http://www.riik.ee/schemas/dhl-meta-automatic}dhlDokTaisnimiType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ref {

        @XmlAttribute(name = "dhl_id")
        protected String dhlId;
        @XmlAttribute(name = "dhl_taisnimi")
        protected String dhlTaisnimi;

        /**
         * Gets the value of the dhlId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhlId() {
            return dhlId;
        }

        /**
         * Sets the value of the dhlId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhlId(String value) {
            this.dhlId = value;
        }

        /**
         * Gets the value of the dhlTaisnimi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhlTaisnimi() {
            return dhlTaisnimi;
        }

        /**
         * Sets the value of the dhlTaisnimi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhlTaisnimi(String value) {
            this.dhlTaisnimi = value;
        }

    }

}
