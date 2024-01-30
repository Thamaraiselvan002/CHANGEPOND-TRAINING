<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>home page</h1>
 <li><a href=" <%=request.getContextPath()  %>/Demo?page=login">Login</a></li>
<li> <a href="<%=request.getContextPath()  %>/Demo?page=about">About Us</a></li>
 <li><a href="<%=request.getContextPath()  %>/Demo?page=signup">SignUp </a></li>
</body>
</html>