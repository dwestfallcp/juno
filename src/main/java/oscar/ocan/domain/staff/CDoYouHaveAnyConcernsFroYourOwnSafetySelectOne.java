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
// Generated on: 2009.05.24 at 10:52:14 PM EDT 
//


package oscar.ocan.domain.staff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}CYes"/>
 *         &lt;element ref="{}CNo"/>
 *         &lt;element ref="{}CUnknown"/>
 *         &lt;element ref="{}CClient_declined_to_answer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cYes",
    "cNo",
    "cUnknown",
    "cClientDeclinedToAnswer"
})
@XmlRootElement(name = "CDo_you_have_any_concerns_fro_your_own_safety___select_one_")
public class CDoYouHaveAnyConcernsFroYourOwnSafetySelectOne {

    @XmlElement(name = "CYes", required = true)
    protected String cYes;
    @XmlElement(name = "CNo", required = true)
    protected String cNo;
    @XmlElement(name = "CUnknown", required = true)
    protected String cUnknown;
    @XmlElement(name = "CClient_declined_to_answer", required = true)
    protected String cClientDeclinedToAnswer;

    /**
     * Gets the value of the cYes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCYes() {
        return cYes;
    }

    /**
     * Sets the value of the cYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCYes(String value) {
        this.cYes = value;
    }

    /**
     * Gets the value of the cNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNo() {
        return cNo;
    }

    /**
     * Sets the value of the cNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNo(String value) {
        this.cNo = value;
    }

    /**
     * Gets the value of the cUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUnknown() {
        return cUnknown;
    }

    /**
     * Sets the value of the cUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUnknown(String value) {
        this.cUnknown = value;
    }

    /**
     * Gets the value of the cClientDeclinedToAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCClientDeclinedToAnswer() {
        return cClientDeclinedToAnswer;
    }

    /**
     * Sets the value of the cClientDeclinedToAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCClientDeclinedToAnswer(String value) {
        this.cClientDeclinedToAnswer = value;
    }

}
