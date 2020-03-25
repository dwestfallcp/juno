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


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oscar.oscarMDS.pageUtil;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.oscarehr.demographic.dao.DemographicDao;
import org.oscarehr.demographic.model.Demographic;
import org.oscarehr.managers.SecurityInfoManager;
import org.oscarehr.util.LoggedInInfo;
import org.oscarehr.util.SpringUtils;
import oscar.oscarLab.ca.on.CommonLabResultData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author jackson
 */
public class SendMostResponProvAction extends Action
{
	private final SecurityInfoManager securityInfoManager = SpringUtils.getBean(SecurityInfoManager.class);
	private final DemographicDao demographicDao = (DemographicDao) SpringUtils.getBean("demographic.dao.DemographicDao");

	public ActionForward execute(ActionMapping mapping,
	                             ActionForm form,
	                             HttpServletRequest request,
	                             HttpServletResponse response)
			throws ServletException, IOException
	{

		String loggedInProviderNo = LoggedInInfo.getLoggedInInfoFromSession(request).getLoggedInProviderNo();
		Integer demographicId = Integer.parseInt(request.getParameter("demoId").trim());
		String docLabId = request.getParameter("docLabId");
		String docLabType = request.getParameter("docLabType");

		securityInfoManager.requireAllPrivilege(loggedInProviderNo, SecurityInfoManager.WRITE, demographicId, "_lab");
		securityInfoManager.requireAllPrivilege(loggedInProviderNo, SecurityInfoManager.READ, demographicId, "_demographic");

		Demographic demographic = demographicDao.find(demographicId);
		String mrpNo = StringUtils.trimToNull(demographic.getProviderNo());

		if(mrpNo != null)
		{
			ArrayList<String[]> listFlaggedLabs = new ArrayList<>(1);
			listFlaggedLabs.add(new String[]{docLabId, docLabType});
			CommonLabResultData.updateLabRouting(listFlaggedLabs, mrpNo);
		}
		return null;
	}
}
