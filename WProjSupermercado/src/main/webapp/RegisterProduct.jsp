<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="register.css" rel="stylesheet">
<head>
<meta charset="UTF-8">
<title>Cadastrar Produto</title>
</head>
<body>
	
	<img src="img/krakenlogo.png" width="500px" height="500px">

    <div class="reg">
        <form action="cadastrarProduto" method="post" class="register">
	
		    <label class="lab" for="prodCode">Código do produto: </label>
		    <input type="Text" name="code"> <br>
		
		    <label class="labN" for="name">Nome: </label>
		    <input type="Text" name="name"> <br>
		
		    <label class="labP" for="price">Preço: </label>
		    <input type="Text" name="price"> <br>
		
		    <label class="labB" for="barCode">Código de barras: </label>
		    <input type="Text" name="barCode"> <br>
		
		    <input class="btnA" type="submit" value="Cadastrar">

	    </form>
	
	    <form action="TSystem.jsp" method="post">
		
		    <input class="btnA" type="submit" value="Ir para o cupom">

	    </form>

    </div>
	
	<form action="Home.jsp">
		<input class="btnB" type="submit" value="Home">
	</form>
	
</body>
</html>