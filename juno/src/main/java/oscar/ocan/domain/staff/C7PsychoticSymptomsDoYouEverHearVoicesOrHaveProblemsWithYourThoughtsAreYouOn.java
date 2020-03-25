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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}C1__Does_the_person_have_any_psychotic_symptoms_"/>
 *         &lt;element ref="{}C2__How_much_help_does_the_person_receive_from_friends_or_relatives_for_these_psychotic_symptoms"/>
 *         &lt;element ref="{}C3a__How_much_help_does_the_person_receive_from_local_services_for_these_psychotic_symptoms_"/>
 *         &lt;element ref="{}C3b__How_much_help_does_the_person_need_from_local_services_for_these_psychotic_symptoms_"/>
 *         &lt;element ref="{}CComments_"/>
 *         &lt;element ref="{}CActions_"/>
 *         &lt;element ref="{}CBy_whom_"/>
 *         &lt;element ref="{}CReview_date_"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}CCommunity_Treatment_Order"/>
 *           &lt;element ref="{}CPsychiatric_History"/>
 *         &lt;/choice>
 *         &lt;element ref="{}CSymptom_checklist"/>
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
    "c1DoesThePersonHaveAnyPsychoticSymptoms",
    "c2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms",
    "c3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms",
    "c3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms",
    "cComments",
    "cActions",
    "cByWhom",
    "cReviewDate",
    "cCommunityTreatmentOrderOrCPsychiatricHistory",
    "cSymptomChecklist"
})
@XmlRootElement(name = "C7__Psychotic_symptoms__Do_you_ever_hear_voices__or_have_problems_with_your_thoughts__Are_you_on")
public class C7PsychoticSymptomsDoYouEverHearVoicesOrHaveProblemsWithYourThoughtsAreYouOn {

    @XmlElement(name = "C1__Does_the_person_have_any_psychotic_symptoms_", required = true)
    protected BigInteger c1DoesThePersonHaveAnyPsychoticSymptoms;
    @XmlElement(name = "C2__How_much_help_does_the_person_receive_from_friends_or_relatives_for_these_psychotic_symptoms", required = true)
    protected BigInteger c2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms;
    @XmlElement(name = "C3a__How_much_help_does_the_person_receive_from_local_services_for_these_psychotic_symptoms_", required = true)
    protected BigInteger c3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms;
    @XmlElement(name = "C3b__How_much_help_does_the_person_need_from_local_services_for_these_psychotic_symptoms_", required = true)
    protected BigInteger c3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms;
    @XmlElement(name = "CComments_", required = true)
    protected CComments cComments;
    @XmlElement(name = "CActions_", required = true)
    protected String cActions;
    @XmlElement(name = "CBy_whom_", required = true)
    protected String cByWhom;
    @XmlElement(name = "CReview_date_", required = true)
    protected String cReviewDate;
    @XmlElements({
        @XmlElement(name = "CPsychiatric_History", type = CPsychiatricHistory.class),
        @XmlElement(name = "CCommunity_Treatment_Order", type = CCommunityTreatmentOrder.class)
    })
    protected List<Object> cCommunityTreatmentOrderOrCPsychiatricHistory;
    @XmlElement(name = "CSymptom_checklist", required = true)
    protected CSymptomChecklist cSymptomChecklist;

    /**
     * Gets the value of the c1DoesThePersonHaveAnyPsychoticSymptoms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC1DoesThePersonHaveAnyPsychoticSymptoms() {
        return c1DoesThePersonHaveAnyPsychoticSymptoms;
    }

    /**
     * Sets the value of the c1DoesThePersonHaveAnyPsychoticSymptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC1DoesThePersonHaveAnyPsychoticSymptoms(BigInteger value) {
        this.c1DoesThePersonHaveAnyPsychoticSymptoms = value;
    }

    /**
     * Gets the value of the c2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms() {
        return c2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms;
    }

    /**
     * Sets the value of the c2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms(BigInteger value) {
        this.c2HowMuchHelpDoesThePersonReceiveFromFriendsOrRelativesForThesePsychoticSymptoms = value;
    }

    /**
     * Gets the value of the c3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms() {
        return c3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms;
    }

    /**
     * Sets the value of the c3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms(BigInteger value) {
        this.c3AHowMuchHelpDoesThePersonReceiveFromLocalServicesForThesePsychoticSymptoms = value;
    }

    /**
     * Gets the value of the c3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms() {
        return c3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms;
    }

    /**
     * Sets the value of the c3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms(BigInteger value) {
        this.c3BHowMuchHelpDoesThePersonNeedFromLocalServicesForThesePsychoticSymptoms = value;
    }

    /**
     * Gets the value of the cComments property.
     * 
     * @return
     *     possible object is
     *     {@link CComments }
     *     
     */
    public CComments getCComments() {
        return cComments;
    }

    /**
     * Sets the value of the cComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CComments }
     *     
     */
    public void setCComments(CComments value) {
        this.cComments = value;
    }

    /**
     * Gets the value of the cActions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCActions() {
        return cActions;
    }

    /**
     * Sets the value of the cActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCActions(String value) {
        this.cActions = value;
    }

    /**
     * Gets the value of the cByWhom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCByWhom() {
        return cByWhom;
    }

    /**
     * Sets the value of the cByWhom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCByWhom(String value) {
        this.cByWhom = value;
    }

    /**
     * Gets the value of the cReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCReviewDate() {
        return cReviewDate;
    }

    /**
     * Sets the value of the cReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCReviewDate(String value) {
        this.cReviewDate = value;
    }

    /**
     * Gets the value of the cCommunityTreatmentOrderOrCPsychiatricHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCommunityTreatmentOrderOrCPsychiatricHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCommunityTreatmentOrderOrCPsychiatricHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPsychiatricHistory }
     * {@link CCommunityTreatmentOrder }
     * 
     * 
     */
    public List<Object> getCCommunityTreatmentOrderOrCPsychiatricHistory() {
        if (cCommunityTreatmentOrderOrCPsychiatricHistory == null) {
            cCommunityTreatmentOrderOrCPsychiatricHistory = new ArrayList<Object>();
        }
        return this.cCommunityTreatmentOrderOrCPsychiatricHistory;
    }

    /**
     * Gets the value of the cSymptomChecklist property.
     * 
     * @return
     *     possible object is
     *     {@link CSymptomChecklist }
     *     
     */
    public CSymptomChecklist getCSymptomChecklist() {
        return cSymptomChecklist;
    }

    /**
     * Sets the value of the cSymptomChecklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSymptomChecklist }
     *     
     */
    public void setCSymptomChecklist(CSymptomChecklist value) {
        this.cSymptomChecklist = value;
    }

}
