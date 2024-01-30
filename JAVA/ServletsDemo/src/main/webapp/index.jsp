<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- static -->
<%@ include  file="file1.txt"%>
	<!-- dyanmic -->
	
	<jsp:attribute name="file2.txt"></jsp:attribute>
</body>
</html>