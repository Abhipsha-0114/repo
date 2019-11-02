<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="com.miniproj2.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<User> list=(ArrayList)session.getAttribute("userList");

if(list.isEmpty())
{
	
%>
No records found
<% 
}
else
{
%>
<table border="1px">
	<tr>
		<th>CID</th>
		<th>CName</th>
		<th>Qualification</th>
		<th>State</th>
		<th>Party</th>
	</tr>
	
<%
	for(User u:list)
	{
%>
<tr>
		
		<td><%= u.getCid() %></td>
		<td><%= u.getCname() %></td>
		<td><%= u.getQualification() %></td>
		<td><%= u.getState() %></td>
		<td><%= u.getParty() %></td>
</tr>

<% 
	}
%>
	
</table>
<%
}
%>
</body>
</html>