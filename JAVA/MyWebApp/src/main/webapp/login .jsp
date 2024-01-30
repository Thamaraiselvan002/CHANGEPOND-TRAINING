<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<form name="loginform" method="post" action="<%= request.getContextPath()%>/SiteController">
<div>
username: <input type="text" name="username"/>
password: <input type="password" name="password"/>
submit<input type="submit" name="login">
</div>

</form>

</body>
</html>