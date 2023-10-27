<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="market.model.Product"%>
<%@page import="market.model.ProdList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<link href="note.css" rel="stylesheet">
<head>
<meta charset="UTF-8">
<title>Kraken SYS</title>
</head>
<body>

	<a href="Home.jsp"><img src="img/krakenlogo.png" width="100px" height="100px"></a>
	
	<div>
		
		<div>
			
			<%
				
				List<Product> note = (List<Product>) request.getAttribute("note");
			 	
				double total = 0;
				double value = 0;
				int quantity = 0;
				double val = 0;
				
				
				out.println("<h2>Nota Fiscal</h2>");
				
				if(request.getAttribute("quant")!=null){
					quantity = Integer.valueOf(request.getParameter("quant"));
				}
				
				if(request.getAttribute("f")=="1"){
					
					if (note != null && !note.isEmpty()) {
					    
						out.print("<div class='box'>");
						
					    for (Product product : note) {
					    	out.println("<p>" + product.getName() + " - Preço: " + product.getPrice() + " - Quantidade: " + product.getQuantity() + "</p>");
					    	value = quantity * product.getPrice();
					    }
					    
						double totalValue = 0;
						if(request.getAttribute("totalValue")!=null){
							totalValue = (double) request.getAttribute("totalValue");
						}
						totalValue += value;
						request.setAttribute("totalValue", totalValue);
					    out.println("<p class='tp'> Preço total - " + totalValue + "</p>");
					    
					    //fechando o box
					    out.print("</div>");
					    
					}else{
						out.print("Vazio...");
					}
				
				}
			%>
			
		</div>
		
		<div>
			<form action="Note" class="Note" method="post">
	
			<label class="lab">Código de barras: </label>
			<input type="text" name="code">
			<label>Quantidade: </label>
			<input type="text" name="quant">
			<input type="hidden" name="totalValue" value="${totalValue}">
			<input type="hidden" name="totalValue" value="${quantity}">
			<input class="btnSub" type="submit" value="Inserir">
			<input class="btnBuy" type="submit" name="clear" value="Finalizar">
		
			</form>
		</div>

	
	</div>
	
	<form action="Home.jsp">
		<input class="btnHome" type="submit" value="Home">
	</form>
	
</body>
</html>