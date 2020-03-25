<%--

    Copyright (c) 2001-2002. Department of Family Medicine, McMaster University. All Rights Reserved.
    This software is published under the GPL GNU General Public License.
    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public License
    as published by the Free Software Foundation; either version 2
    of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.

    This software was written for the
    Department of Family Medicine
    McMaster University
    Hamilton
    Ontario, Canada

--%>

<%@ page import="org.oscarehr.util.SpringUtils" %>
<%@ page import="org.oscarehr.common.model.CtlBillingServicePremium" %>
<%@ page import="org.oscarehr.common.dao.CtlBillingServicePremiumDao" %>
<%@ page import="org.oscarehr.common.dao.BillingServiceDao" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%
	CtlBillingServicePremiumDao ctlBillingServicePremiumDao = SpringUtils.getBean(CtlBillingServicePremiumDao.class);
	BillingServiceDao billingServiceDao = SpringUtils.getBean(BillingServiceDao.class);
	String billingServiceCode;
	List<String> invalidCodes = new ArrayList<String>();

	for (int i = 1; i < 11; i++)
	{
		billingServiceCode = request.getParameter("service" + i);

		if (billingServiceCode != null && !billingServiceCode.isEmpty())
		{
			//Check if billing code exists before inserting
			if(!billingServiceDao.findByServiceCode(billingServiceCode).isEmpty())
			{
				CtlBillingServicePremium billingServicePremium = new CtlBillingServicePremium();
				billingServicePremium.setServiceTypeName("Office");
				billingServicePremium.setServiceCode(billingServiceCode);
				billingServicePremium.setStatus("A");
				billingServicePremium.setUpdateDate(new java.util.Date());
				ctlBillingServicePremiumDao.persist(billingServicePremium);
			}
			else
			{
				invalidCodes.add(billingServiceCode);
			}
		}
	}


	if (invalidCodes.isEmpty())
	{
		response.sendRedirect("manageBillingform.jsp?billingform=***");
	}
	else
	{
		response.sendRedirect("manageBillingform.jsp?billingform=***&invalidcodes=" + invalidCodes.toString());
	}
%>
