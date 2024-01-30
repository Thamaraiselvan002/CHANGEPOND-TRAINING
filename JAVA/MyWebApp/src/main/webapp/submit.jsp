<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1 >
<Tr>
<th colspan="2"> Registration Details </th>
</Tr>
<Tr>
<td> Name: </td>
<td><%= request.getParameter("name") %> </td>
</Tr>
<Tr>
<td> Gender: </td>
<td><%= request.getParameter("gender") %> </td>
</Tr>
<Tr>
<td> Languages: </td>
<td><%

String[] languages = request.getParameterValues("language"); 

if(languages!=null){
	for(int i =0;i<languages.length;i++){
		
		out.print((i+1) + "." + languages[i]);
		out.print("<br/>");
	}
}

%> </td>
</Tr>
</table>
</body>
</html>