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
 *         &lt;element ref="{}C1__Does_the_person_have_problems_with_addictions___If_rated_0_or_9__go_to_the_next_domain_"/>
 *         &lt;element ref="{}C2__How_much_help_with_addictions_does_the_person_receive_from_friends_or_relatives_"/>
 *         &lt;element ref="{}C3a__How_much_help_with_addictions_does_the_person_receive_from_local_services_"/>
 *         &lt;element ref="{}C3b__How_muc_help_with_addictions_does_the_person_need_from_local_services_"/>
 *         &lt;element ref="{}CComments_"/>
 *         &lt;element ref="{}CActions_"/>
 *         &lt;element ref="{}CBy_whom_"/>
 *         &lt;element ref="{}CReview_date_"/>
 *         &lt;element ref="{}CType_of_addiction__check_all_that_apply_"/>
 *         &lt;element ref="{}CIndicate_the_stage_of_change_client_is_at__Optional__select_one_"/>
 *         &lt;element ref="{}CHow_has_the_addiction_had_an_impact_on_your_life_"/>
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
    "c1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain",
    "c2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives",
    "c3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices",
    "c3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices",
    "cComments",
    "cActions",
    "cByWhom",
    "cReviewDate",
    "cTypeOfAddictionCheckAllThatApply",
    "cIndicateTheStageOfChangeClientIsAtOptionalSelectOne",
    "cHowHasTheAddictionHadAnImpactOnYourLife"
})
@XmlRootElement(name = "C14__Other_addictions__Do_you_have_an_addiction__Is_your_addiction_a_problem_")
public class C14OtherAddictionsDoYouHaveAnAddictionIsYourAddictionAProblem {

    @XmlElement(name = "C1__Does_the_person_have_problems_with_addictions___If_rated_0_or_9__go_to_the_next_domain_", required = true)
    protected BigInteger c1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain;
    @XmlElement(name = "C2__How_much_help_with_addictions_does_the_person_receive_from_friends_or_relatives_", required = true)
    protected BigInteger c2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives;
    @XmlElement(name = "C3a__How_much_help_with_addictions_does_the_person_receive_from_local_services_", required = true)
    protected BigInteger c3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices;
    @XmlElement(name = "C3b__How_muc_help_with_addictions_does_the_person_need_from_local_services_", required = true)
    protected BigInteger c3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices;
    @XmlElement(name = "CComments_", required = true)
    protected CComments cComments;
    @XmlElement(name = "CActions_", required = true)
    protected String cActions;
    @XmlElement(name = "CBy_whom_", required = true)
    protected String cByWhom;
    @XmlElement(name = "CReview_date_", required = true)
    protected String cReviewDate;
    @XmlElement(name = "CType_of_addiction__check_all_that_apply_", required = true)
    protected CTypeOfAddictionCheckAllThatApply cTypeOfAddictionCheckAllThatApply;
    @XmlElement(name = "CIndicate_the_stage_of_change_client_is_at__Optional__select_one_", required = true)
    protected CIndicateTheStageOfChangeClientIsAtOptionalSelectOne cIndicateTheStageOfChangeClientIsAtOptionalSelectOne;
    @XmlElement(name = "CHow_has_the_addiction_had_an_impact_on_your_life_", required = true)
    protected CHowHasTheAddictionHadAnImpactOnYourLife cHowHasTheAddictionHadAnImpactOnYourLife;

    /**
     * Gets the value of the c1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain() {
        return c1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain;
    }

    /**
     * Sets the value of the c1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain(BigInteger value) {
        this.c1DoesThePersonHaveProblemsWithAddictionsIfRated0Or9GoToTheNextDomain = value;
    }

    /**
     * Gets the value of the c2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives() {
        return c2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives;
    }

    /**
     * Sets the value of the c2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives(BigInteger value) {
        this.c2HowMuchHelpWithAddictionsDoesThePersonReceiveFromFriendsOrRelatives = value;
    }

    /**
     * Gets the value of the c3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices() {
        return c3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices;
    }

    /**
     * Sets the value of the c3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices(BigInteger value) {
        this.c3AHowMuchHelpWithAddictionsDoesThePersonReceiveFromLocalServices = value;
    }

    /**
     * Gets the value of the c3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getC3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices() {
        return c3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices;
    }

    /**
     * Sets the value of the c3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setC3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices(BigInteger value) {
        this.c3BHowMucHelpWithAddictionsDoesThePersonNeedFromLocalServices = value;
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
     * Gets the value of the cTypeOfAddictionCheckAllThatApply property.
     * 
     * @return
     *     possible object is
     *     {@link CTypeOfAddictionCheckAllThatApply }
     *     
     */
    public CTypeOfAddictionCheckAllThatApply getCTypeOfAddictionCheckAllThatApply() {
        return cTypeOfAddictionCheckAllThatApply;
    }

    /**
     * Sets the value of the cTypeOfAddictionCheckAllThatApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTypeOfAddictionCheckAllThatApply }
     *     
     */
    public void setCTypeOfAddictionCheckAllThatApply(CTypeOfAddictionCheckAllThatApply value) {
        this.cTypeOfAddictionCheckAllThatApply = value;
    }

    /**
     * Gets the value of the cIndicateTheStageOfChangeClientIsAtOptionalSelectOne property.
     * 
     * @return
     *     possible object is
     *     {@link CIndicateTheStageOfChangeClientIsAtOptionalSelectOne }
     *     
     */
    public CIndicateTheStageOfChangeClientIsAtOptionalSelectOne getCIndicateTheStageOfChangeClientIsAtOptionalSelectOne() {
        return cIndicateTheStageOfChangeClientIsAtOptionalSelectOne;
    }

    /**
     * Sets the value of the cIndicateTheStageOfChangeClientIsAtOptionalSelectOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIndicateTheStageOfChangeClientIsAtOptionalSelectOne }
     *     
     */
    public void setCIndicateTheStageOfChangeClientIsAtOptionalSelectOne(CIndicateTheStageOfChangeClientIsAtOptionalSelectOne value) {
        this.cIndicateTheStageOfChangeClientIsAtOptionalSelectOne = value;
    }

    /**
     * Gets the value of the cHowHasTheAddictionHadAnImpactOnYourLife property.
     * 
     * @return
     *     possible object is
     *     {@link CHowHasTheAddictionHadAnImpactOnYourLife }
     *     
     */
    public CHowHasTheAddictionHadAnImpactOnYourLife getCHowHasTheAddictionHadAnImpactOnYourLife() {
        return cHowHasTheAddictionHadAnImpactOnYourLife;
    }

    /**
     * Sets the value of the cHowHasTheAddictionHadAnImpactOnYourLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHowHasTheAddictionHadAnImpactOnYourLife }
     *     
     */
    public void setCHowHasTheAddictionHadAnImpactOnYourLife(CHowHasTheAddictionHadAnImpactOnYourLife value) {
        this.cHowHasTheAddictionHadAnImpactOnYourLife = value;
    }

}
