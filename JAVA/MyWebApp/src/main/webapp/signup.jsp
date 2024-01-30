<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SignUp </h1>
<form action="submit.jsp" method="post">
full name: <input type="text" name="name"/> <br>
gender: <input type="radio" name="gender" value="male"> male
 <input type="radio" name="gender" value="female">female <br>
 
 language : <input type="checkbox" name="language" value="english"> english
  <input type="checkbox" name="language" value="tamil"> tamil
   <input type="checkbox" name="language" value="hindi"> hindi
    <input type="checkbox" name="language" value="french"> french <br><br>
    
   <input type="submit" name="submit">
</form>
</body>
</html>