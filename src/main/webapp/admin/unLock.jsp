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

<%@ taglib uri="/WEB-INF/security.tld" prefix="security"%>
<%@ page errorPage="../errorpage.jsp"%>
<%@ page import="java.util.*"%>
<%@ page import="oscar.login.*"%>
<%@ page import="oscar.log.*"%>

<%@ page import="org.oscarehr.util.SpringUtils" %>
<%@ page import="org.oscarehr.common.model.Security" %>
<%@ page import="org.oscarehr.common.dao.SecurityDao" %>

<%
	SecurityDao securityDao = SpringUtils.getBean(SecurityDao.class);
	String roleName$ = (String)session.getAttribute("userrole") + "," + (String) session.getAttribute("user");
	String curUser_no = (String)session.getAttribute("user");

	boolean isSiteAccessPrivacy=false;
	boolean authed=true;
%>
<security:oscarSec roleName="<%=roleName$%>" objectName="_admin,_admin.userAdmin,_admin.unlockAccount" rights="r" reverse="<%=true%>"> 
	<%authed=false; %>
	<%response.sendRedirect("../securityError.jsp?type=_admin&type=_admin.userAdmin&type=_admin.unlockAccount");%>
</security:oscarSec>
<%
if(!authed) {
	return;
}
%>


<security:oscarSec objectName="_site_access_privacy" roleName="<%=roleName$%>" rights="r" reverse="false"> <%isSiteAccessPrivacy=true; %>
</security:oscarSec>


<%
  String ip = request.getRemoteAddr();
  String msg = "Unlock";
  LoginCheckLogin cl = new LoginCheckLogin();
  ArrayList<String> lockList = cl.findLockList();

  if (request.getParameter("submit") != null && request.getParameter("submit").equals("Unlock")) {
    // unlock
    if(request.getParameter("userName") != null && request.getParameter("userName").length()>0) {
      String userName = request.getParameter("userName");
      lockList.remove(userName);
      cl.unlock(userName);
	  LogAction.addLogEntry(curUser_no, null, LogConst.ACTION_UNLOCK, LogConst.CON_ADMIN, LogConst.STATUS_SUCCESS, null, ip, userName);
      msg = "The login account " + userName + " was unlocked.";
    }
  } 
  
  //multi-office limit
  if (isSiteAccessPrivacy && lockList.size() > 0) {

	  List<String> userList = new ArrayList<String>();
	  List<Security> securityList = securityDao.findByProviderSite(curUser_no);

	  for(Security security : securityList) {
		userList.add(security.getUserName());
	  }
	  
	  for(int i = 0; i< lockList.size(); i++) {
		  if (!userList.contains(lockList.get(i))) {
			  lockList.remove(lockList.get(i));
		  }
	  }
  }
  
%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html:html locale="true">
<head>
<script type="text/javascript" src="<%= request.getContextPath() %>/js/global.js"></script>
<title>Unlock</title>

</head>
<body bgcolor="ivory" onLoad="setfocus()" style="margin: 0px">
<table BORDER="0" CELLPADDING="0" CELLSPACING="0" WIDTH="100%">
	<tr>
		<td align="left">&nbsp;</td>
	</tr>
</table>

<center>
<table BORDER="1" CELLPADDING="0" CELLSPACING="0" WIDTH="80%">
	<tr BGCOLOR="#CCFFFF">
		<th><%=msg%></th>
	</tr>
</table>
</center>
<form method="post" name="baseurl" action="unLock.jsp">
<table width="100%" border="0" cellspacing="2" cellpadding="2">
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr bgcolor="#EEEEFF">
		<td align="right"><b>User Name / IP</b></td>
		<td><select name="userName">
			<% for(String lock : lockList) { %>
			<option value="<%=lock%>"><%=lock%></option>
			<% } %>
		</select> <input type="submit" name="submit" value="Unlock" /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
</table>
</form>

</body>
</html:html>
