//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 02:44:33 PM IST 
//


package org.xbrl._2003.linkbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.xbrl._2003.xlink.ExtendedType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.xbrl.org/2003/XLink}extendedType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.xbrl.org/2003/XLink}title"/>
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}documentation"/>
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}loc"/>
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}definitionArc"/>
 *       &lt;/choice>
 *       &lt;anyAttribute processContents='lax' namespace='http://www.w3.org/XML/1998/namespace'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DefinitionLink
    extends ExtendedType
{


}
