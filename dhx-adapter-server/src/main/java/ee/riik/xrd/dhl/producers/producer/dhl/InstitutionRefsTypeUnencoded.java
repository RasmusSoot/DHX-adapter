//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 09:18:04 PM EET 
//


package ee.riik.xrd.dhl.producers.producer.dhl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for institutionRefsTypeUnencoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="institutionRefsTypeUnencoded"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asutused"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://producers.dhl.xrd.riik.ee/producer/dhl}institutionRefsArrayType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "institutionRefsTypeUnencoded", propOrder = {
    "asutused"
})
public class InstitutionRefsTypeUnencoded {

    @XmlElement(required = true)
    protected InstitutionRefsTypeUnencoded.Asutused asutused;

    /**
     * Gets the value of the asutused property.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionRefsTypeUnencoded.Asutused }
     *     
     */
    public InstitutionRefsTypeUnencoded.Asutused getAsutused() {
        return asutused;
    }

    /**
     * Sets the value of the asutused property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionRefsTypeUnencoded.Asutused }
     *     
     */
    public void setAsutused(InstitutionRefsTypeUnencoded.Asutused value) {
        this.asutused = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://producers.dhl.xrd.riik.ee/producer/dhl}institutionRefsArrayType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Asutused
        extends InstitutionRefsArrayType
    {


    }

}
