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
 *       &lt;attribute name="takenAsPrescribed">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value=""/>
 *             &lt;enumeration value="TRUE"/>
 *             &lt;enumeration value="FALSE"/>
 *             &lt;enumeration value="UNK"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isHelpProvided">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value=""/>
 *             &lt;enumeration value="TRUE"/>
 *             &lt;enumeration value="FALSE"/>
 *             &lt;enumeration value="UNK"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isHelpNeeded">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value=""/>
 *             &lt;enumeration value="TRUE"/>
 *             &lt;enumeration value="FALSE"/>
 *             &lt;enumeration value="UNK"/>
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
@XmlRootElement(name = "medicationDetail")
public class MedicationDetail {

    @XmlAttribute
    protected String takenAsPrescribed;
    @XmlAttribute
    protected String isHelpProvided;
    @XmlAttribute
    protected String isHelpNeeded;

    /**
     * Gets the value of the takenAsPrescribed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakenAsPrescribed() {
        return takenAsPrescribed;
    }

    /**
     * Sets the value of the takenAsPrescribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakenAsPrescribed(String value) {
        this.takenAsPrescribed = value;
    }

    /**
     * Gets the value of the isHelpProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHelpProvided() {
        return isHelpProvided;
    }

    /**
     * Sets the value of the isHelpProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHelpProvided(String value) {
        this.isHelpProvided = value;
    }

    /**
     * Gets the value of the isHelpNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHelpNeeded() {
        return isHelpNeeded;
    }

    /**
     * Sets the value of the isHelpNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHelpNeeded(String value) {
        this.isHelpNeeded = value;
    }

}
