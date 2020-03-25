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

package org.oscarehr.PMmodule.model;

import java.io.Serializable;


public class ProgramClientStatus implements Serializable {
    public static String REF = "ProgramClientStatus";

    private int hashCode = Integer.MIN_VALUE;// primary key

    private Integer id;// fields
    private String name;
    private Integer programId;


    // constructors
    public ProgramClientStatus () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public ProgramClientStatus (Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize () {}

    /**
     * Return the unique identifier of this class
     * 
     *  generator-class="native"
     *  column="clientstatus_id"
     */
    public Integer getId () {
        return id;
    }

    /**
     * Set the unique identifier of this class
     * @param id the new ID
     */
    public void setId (Integer id) {
        this.id = id;
        this.hashCode = Integer.MIN_VALUE;
    }

    /**
     * Return the value associated with the column: name
     */
    public String getName () {
        return name;
    }

    /**
     * Set the value related to the column: name
     * @param name the name value
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     * Return the value associated with the column: program_id
     */
    public Integer getProgramId () {
        return programId;
    }

    /**
     * Set the value related to the column: program_id
     * @param programId the program_id value
     */
    public void setProgramId (Integer programId) {
        this.programId = programId;
    }

    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof ProgramClientStatus)) return false;
        else {
            ProgramClientStatus programClientStatus = (ProgramClientStatus) obj;
            if (null == this.getId() || null == programClientStatus.getId()) return false;
            else return (this.getId().equals(programClientStatus.getId()));
        }
    }

    public int hashCode () {
        if (Integer.MIN_VALUE == this.hashCode) {
            if (null == this.getId()) return super.hashCode();
            else {
                String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
                this.hashCode = hashStr.hashCode();
            }
        }
        return this.hashCode;
    }

    public String toString () {
        return super.toString();
    }
}
