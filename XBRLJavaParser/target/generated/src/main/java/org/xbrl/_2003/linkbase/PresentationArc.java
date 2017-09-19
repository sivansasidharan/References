//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 02:44:33 PM IST 
//


package org.xbrl._2003.linkbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.xbrl._2003.xlink.ArcType;


/**
 * 
 *         Extension of the extended link arc type for presentation arcs.
 *         Adds a preferredLabel attribute that documents the role attribute
 *         value of preferred labels (as they occur in label extended links).
 *         
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xbrl.org/2003/XLink}arcType">
 *       &lt;attribute name="preferredLabel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PresentationArc
    extends ArcType
{

    @XmlAttribute(name = "preferredLabel")
    protected String preferredLabel;

    /**
     * Gets the value of the preferredLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLabel() {
        return preferredLabel;
    }

    /**
     * Sets the value of the preferredLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLabel(String value) {
        this.preferredLabel = value;
    }

}
