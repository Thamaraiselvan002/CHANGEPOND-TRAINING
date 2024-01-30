<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<%
String username=null,SessionId=null;
Cookie[] cookie=request.getCookies();
if(cookie!=null){
	for(Cookie cookies:cookie)
	{
		if(cookies.getName().equals("usernaame"))
		
		{
			username=cookies.getName();
		}
		if(cookies.getName().equals("JSession")){
			SessionId= cookies.getValue();
		}
	}
}

if (SessionId==null || username==null){
	response.sendRedirect("login.jsp");
}
	%>
	
	welcome<%=username %> <br/>
	your session id is <%=SessionId %>
</body>
</html>