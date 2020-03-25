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

package oscar.oscarWaitingList.bean;

import java.util.ArrayList;
import java.util.List;

import org.oscarehr.common.dao.WaitingListDao;
import org.oscarehr.common.model.WaitingList;
import org.oscarehr.common.model.WaitingListName;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import oscar.util.ConversionUtils;

@Service
public class WLPatientWaitingListBeanHandler {

	@Autowired
	private WaitingListDao waitingListDao;
	
	@Transactional
	public List<WLPatientWaitingListBean> getPatientWaitingList(Integer demographicNo) {
		
		List<WaitingList> waitingListEntries = waitingListDao.findByDemographic(demographicNo);
		List<WLPatientWaitingListBean> patientWaitingList = new ArrayList<WLPatientWaitingListBean>();

		for (WaitingList entry : waitingListEntries) {
			WaitingListName name = entry.getWaitingListName();
			
			WLPatientWaitingListBean wLBean = new WLPatientWaitingListBean(
					demographicNo.toString(), 
					name.getId().toString(), 
					name.getName(),
					String.valueOf(entry.getPosition()),
					entry.getNote(),
					ConversionUtils.toDateString(entry.getOnListSince()));
			patientWaitingList.add(wLBean);
		}
		return patientWaitingList;
	}
}
