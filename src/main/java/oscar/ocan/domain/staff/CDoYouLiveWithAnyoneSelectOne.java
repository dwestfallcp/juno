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
 *         &lt;element ref="{}CSelf"/>
 *         &lt;element ref="{}CSpouse_partner"/>
 *         &lt;element ref="{}CSpouse_partner_and_others"/>
 *         &lt;element ref="{}CChildren"/>
 *         &lt;element ref="{}CParents"/>
 *         &lt;element ref="{}CRelatives"/>
 *         &lt;element ref="{}CNon_relatives"/>
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
    "cSelf",
    "cSpousePartner",
    "cSpousePartnerAndOthers",
    "cChildren",
    "cParents",
    "cRelatives",
    "cNonRelatives",
    "cUnknown",
    "cClientDeclinedToAnswer"
})
@XmlRootElement(name = "CDo_you_live_with_anyone___select_one_")
public class CDoYouLiveWithAnyoneSelectOne {

    @XmlElement(name = "CSelf", required = true)
    protected String cSelf;
    @XmlElement(name = "CSpouse_partner", required = true)
    protected String cSpousePartner;
    @XmlElement(name = "CSpouse_partner_and_others", required = true)
    protected String cSpousePartnerAndOthers;
    @XmlElement(name = "CChildren", required = true)
    protected String cChildren;
    @XmlElement(name = "CParents", required = true)
    protected String cParents;
    @XmlElement(name = "CRelatives", required = true)
    protected String cRelatives;
    @XmlElement(name = "CNon_relatives", required = true)
    protected String cNonRelatives;
    @XmlElement(name = "CUnknown", required = true)
    protected String cUnknown;
    @XmlElement(name = "CClient_declined_to_answer", required = true)
    protected String cClientDeclinedToAnswer;

    /**
     * Gets the value of the cSelf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSelf() {
        return cSelf;
    }

    /**
     * Sets the value of the cSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSelf(String value) {
        this.cSelf = value;
    }

    /**
     * Gets the value of the cSpousePartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSpousePartner() {
        return cSpousePartner;
    }

    /**
     * Sets the value of the cSpousePartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSpousePartner(String value) {
        this.cSpousePartner = value;
    }

    /**
     * Gets the value of the cSpousePartnerAndOthers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSpousePartnerAndOthers() {
        return cSpousePartnerAndOthers;
    }

    /**
     * Sets the value of the cSpousePartnerAndOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSpousePartnerAndOthers(String value) {
        this.cSpousePartnerAndOthers = value;
    }

    /**
     * Gets the value of the cChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCChildren() {
        return cChildren;
    }

    /**
     * Sets the value of the cChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCChildren(String value) {
        this.cChildren = value;
    }

    /**
     * Gets the value of the cParents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCParents() {
        return cParents;
    }

    /**
     * Sets the value of the cParents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCParents(String value) {
        this.cParents = value;
    }

    /**
     * Gets the value of the cRelatives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRelatives() {
        return cRelatives;
    }

    /**
     * Sets the value of the cRelatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRelatives(String value) {
        this.cRelatives = value;
    }

    /**
     * Gets the value of the cNonRelatives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNonRelatives() {
        return cNonRelatives;
    }

    /**
     * Sets the value of the cNonRelatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNonRelatives(String value) {
        this.cNonRelatives = value;
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
