/**
 * Copyright (c) 2001-2002. Department of Family Medicine, McMaster University. All Rights Reserved.
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
 * This software was written for the
 * Department of Family Medicine
 * McMaster University
 * Hamilton
 * Ontario, Canada
 */

package org.oscarehr.common.dao;

import java.util.List;

import javax.persistence.Query;

import org.oscarehr.common.model.Appointment;
import org.oscarehr.common.model.WaitingList;
import org.springframework.stereotype.Repository;

@Repository
public class WaitingListDao extends AbstractDao<WaitingList> {

	public WaitingListDao() {
		super(WaitingList.class);
	}

	/**
	 * Finds all waiting lists for the specified demographic
	 * 
	 * @param demographicNo Demographic to find the lists for
	 * @return A list of all matching {@link org.oscarehr.common.model.WaitingList} objects.
	 */
	@SuppressWarnings("unchecked")
	public List<WaitingList> findByDemographic(Integer demographicNo) {
		Query query = entityManager.createQuery("SELECT w FROM WaitingList w WHERE w.demographic.DemographicNo = :demoNo AND w.isHistory != 'Y'");
		query.setParameter("demoNo", demographicNo);
		return query.getResultList();
	}

	/**
	 * Finds all waiting lists and demographics for the specified list id
	 * 
	 * @param listId List ID find by
	 * @return A list of WaitingList ordered by onListSince date
	 */
	@SuppressWarnings("unchecked")
    public List<WaitingList> findByWaitingListId(Integer listId) {
		Query query = entityManager.createQuery("SELECT w FROM WaitingList w WHERE w.waitingListName.id = :listId AND w.isHistory = 'N' ORDER BY w.onListSince");
		query.setParameter("listId", listId);
		return query.getResultList();
    }

	/**
	 * Finds appointments that take place after the demographic has been placed onto the waiting list. 
	 * 
	 * @param waitingList Waiting list entry
	 * @return All available appointments for the specified waiting list entry.
	 */
	@SuppressWarnings("unchecked")
    public List<Appointment> findAppointmentFor(WaitingList waitingList) {
		// this is a translation attempt of this query
		// sql = "select a.demographic_no, a.appointment_date, wl.onListSince from appointment a, waitingList wl where a.appointment_date >= wl.onListSince AND a.demographic_no=wl.demographic_no AND a.demographic_no=" + oscar.Misc.getString(rs, "demographic_no") + "";  
		Query query = entityManager.createQuery("FROM Appointment a WHERE a.appointmentDate >= :onListSince AND a.demographicNo = :demographicNo");
		query.setParameter("onListSince", waitingList.getOnListSince());
		query.setParameter("demographicNo", waitingList.getDemographicNo());
	    return query.getResultList();
    }

	/**
	 * Finds all waiting list entries for the specified waiting list and demographic IDs
	 * 
	 * @param waitingListId Waiting list id to be searched for
	 * @param demographicId Demographic id to be searched for
	 * @return All matching waiting list entries.
	 */
	@SuppressWarnings("unchecked")
    public List<WaitingList> findByWaitingListIdAndDemographicId(Integer waitingListId, Integer demographicId) {
		Query query = entityManager.createQuery("SELECT w FROM WaitingList w WHERE w.demographic.DemographicNo = :demoNo AND w.waitingListName.id = :listId AND w.isHistory = 'N'");
		query.setParameter("demoNo", demographicId);
		query.setParameter("listId", waitingListId);
	    return query.getResultList();
    }

	/**
	 * Gets max position form the specified waiting list 
	 * 
	 * @param listId Waiting list to find max position for
	 * @return The position for the specified list.
	 */
	public Long getMaxPosition(Integer listId) {
		Query query = entityManager.createQuery("SELECT max(w.position) FROM WaitingList w WHERE w.waitingListName.id = :listId AND w.isHistory = 'N'");
		query.setParameter("listId", listId);
		Long result = (Long) query.getSingleResult();
		if (result == null) {
			return 0L;
		}
		return result;
    }
	
	@SuppressWarnings("unchecked")
    public List<WaitingList> search_wlstatus(Integer demographicId) {
		Query query = entityManager.createQuery("SELECT w FROM WaitingList w WHERE w.demographic.DemographicNo = :demoNo AND w.isHistory = 'N' ORDER BY w.onListSince DESC");
		query.setParameter("demoNo", demographicId);
	    return query.getResultList();
    }
}
