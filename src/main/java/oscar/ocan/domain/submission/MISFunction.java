/**
 *
 * Copyright (c) 2005-2012. Centre for Research on Inner City Health, St. Michael's Hospital, Toronto. All Rights Reserved.
 * This software is published under the GPL GNU General Public License.
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 * This software was written for
 * Centre for Research on Inner City Health, St. Michael's Hospital,
 * Toronto, Ontario, Canada
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.21 at 12:06:38 PM EDT 
//


package oscar.ocan.domain.submission;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="value">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="725 09 76"/>
 *             &lt;enumeration value="725 10 76 12"/>
 *             &lt;enumeration value="725 10 76 20"/>
 *             &lt;enumeration value="725 10 76 30"/>
 *             &lt;enumeration value="725 10 76 40"/>
 *             &lt;enumeration value="725 10 76 41"/>
 *             &lt;enumeration value="725 10 76 45"/>
 *             &lt;enumeration value="725 10 76 50"/>
 *             &lt;enumeration value="725 10 76 51"/>
 *             &lt;enumeration value="725 10 76 55"/>
 *             &lt;enumeration value="725 10 76 56"/>
 *             &lt;enumeration value="725 10 76 60"/>
 *             &lt;enumeration value="725 10 76 70"/>
 *             &lt;enumeration value="725 10 76 81"/>
 *             &lt;enumeration value="725 10 76 95"/>
 *             &lt;enumeration value="725 10 76 96"/>
 *             &lt;enumeration value="725 15 76"/>
 *             &lt;enumeration value="725 20 76"/>
 *             &lt;enumeration value="725 40 76 10"/>
 *             &lt;enumeration value="725 40 76 30"/>
 *             &lt;enumeration value="725 40 76 60"/>
 *             &lt;enumeration value="725 70 11"/>
 *             &lt;enumeration value="725 50 76 10"/>
 *             &lt;enumeration value="725 50 76 40"/>
 *             &lt;enumeration value="725 51 76 11"/>
 *             &lt;enumeration value="725 51 76 12"/>
 *             &lt;enumeration value="725 51 76 20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MISFunction")
public class MISFunction {

    @XmlAttribute
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
