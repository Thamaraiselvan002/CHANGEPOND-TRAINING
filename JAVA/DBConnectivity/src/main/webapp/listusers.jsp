<%@page import="org.studyeasy.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
function confirmdelete(){
	if(confirm("Are you sure you want to delete")){
		return true;
	}
	else
		{
		return false;
		}
}
</script>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
	<h1>Users List</h1>
	<hr color="red" />
	<table border="1">
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>User Email</th>
			<th>Operation(s)</th>
		</tr>
		<%
	
		User user1 = (User)request.getAttribute("users");
		//out.print(user1.getEmail());
		//out.print(user1.getUsername());
		List<User> userlist = (List) request.getAttribute("listusers");
		for (User _user : userlist) {
			out.print("<tr>");
			out.print("<td>" + _user.getUser_id() + "</td>");
			out.print("<td>" + _user.getUsername() + "</td>");
			out.print("<td>" + _user.getEmail() + "</td>");
			out.print("<td><a href=" + request.getContextPath() + "/home?page=updateuser&user_id=" + _user.getUser_id()
			+ "&username="+_user.getUsername()+"&email="+_user.getEmail()+ " > Update </a>");
			out.print("|");
			out.print("<a onclick ='return confirmdelete()' href=" + request.getContextPath() + "/home?page=deleteuser&user_id=" + _user.getUser_id()
			 + "> Delete </a>");
			out.print("</td></tr>");
		}
		%>
	</table>
</body>
</html>