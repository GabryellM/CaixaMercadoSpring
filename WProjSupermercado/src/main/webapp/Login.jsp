<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="login.css" rel="stylesheet">	
<head>
<meta charset="UTF-8">
<title>Acesso ao Sistema</title>
</head>
<body>
	
	<img src="img/krakenlogo.png" width="500px" height="500px">
	
	<form action="LoginCheck.jsp" method="post">
	
		<label>Usuário: </label>
		<input type="text" name="user"> <br>
		
		<label class="pass">Senha: </label>
		<input class="inpPass" type="password" name="pass"> <br>
		
		<input class="sub" type="submit" value="Acessar">
	
	</form>
	
</body>
</html>