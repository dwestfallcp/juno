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
 *         &lt;element ref="{}CSingle"/>
 *         &lt;element ref="{}CMarried_or_in_common_law_relationship"/>
 *         &lt;element ref="{}CPartner_of_significant_other"/>
 *         &lt;element ref="{}CWiddowed"/>
 *         &lt;element ref="{}CSeparated"/>
 *         &lt;element ref="{}CDivorced"/>
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
    "cSingle",
    "cMarriedOrInCommonLawRelationship",
    "cPartnerOfSignificantOther",
    "cWiddowed",
    "cSeparated",
    "cDivorced",
    "cUnknown",
    "cClientDeclinedToAnswer"
})
@XmlRootElement(name = "CMarital_Status__Select_One_")
public class CMaritalStatusSelectOne {

    @XmlElement(name = "CSingle", required = true)
    protected String cSingle;
    @XmlElement(name = "CMarried_or_in_common_law_relationship", required = true)
    protected String cMarriedOrInCommonLawRelationship;
    @XmlElement(name = "CPartner_of_significant_other", required = true)
    protected String cPartnerOfSignificantOther;
    @XmlElement(name = "CWiddowed", required = true)
    protected String cWiddowed;
    @XmlElement(name = "CSeparated", required = true)
    protected String cSeparated;
    @XmlElement(name = "CDivorced", required = true)
    protected String cDivorced;
    @XmlElement(name = "CUnknown", required = true)
    protected String cUnknown;
    @XmlElement(name = "CClient_declined_to_answer", required = true)
    protected String cClientDeclinedToAnswer;

    /**
     * Gets the value of the cSingle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSingle() {
        return cSingle;
    }

    /**
     * Sets the value of the cSingle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSingle(String value) {
        this.cSingle = value;
    }

    /**
     * Gets the value of the cMarriedOrInCommonLawRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMarriedOrInCommonLawRelationship() {
        return cMarriedOrInCommonLawRelationship;
    }

    /**
     * Sets the value of the cMarriedOrInCommonLawRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMarriedOrInCommonLawRelationship(String value) {
        this.cMarriedOrInCommonLawRelationship = value;
    }

    /**
     * Gets the value of the cPartnerOfSignificantOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPartnerOfSignificantOther() {
        return cPartnerOfSignificantOther;
    }

    /**
     * Sets the value of the cPartnerOfSignificantOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPartnerOfSignificantOther(String value) {
        this.cPartnerOfSignificantOther = value;
    }

    /**
     * Gets the value of the cWiddowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCWiddowed() {
        return cWiddowed;
    }

    /**
     * Sets the value of the cWiddowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCWiddowed(String value) {
        this.cWiddowed = value;
    }

    /**
     * Gets the value of the cSeparated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSeparated() {
        return cSeparated;
    }

    /**
     * Sets the value of the cSeparated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSeparated(String value) {
        this.cSeparated = value;
    }

    /**
     * Gets the value of the cDivorced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDivorced() {
        return cDivorced;
    }

    /**
     * Sets the value of the cDivorced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDivorced(String value) {
        this.cDivorced = value;
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
