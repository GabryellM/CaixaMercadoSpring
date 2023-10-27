<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="login.css" rel="stylesheet">
<head>
<meta charset="UTF-8">
<title>Redirecionamento</title>
</head>
<body>

	<%
	
	String user = request.getParameter("user");
	String pass = request.getParameter("pass");
	
	if(user.equals("John") && pass.equals("1234")){
		
		out.println("<p class='check'>Login correto, clique abaixo para continuar!</p>");
		out.print("<form action='Home.jsp'><input type='submit' value='Acessar'></form>");
		
	}else {
		
		out.println("<p class='check'>Dados incorretos!</p>");
		out.print("<form action='Login.jsp'><input type='submit' value='Voltar'></form>");
		
	}
	
	%>

</body>
</html>