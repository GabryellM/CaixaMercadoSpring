package market.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import market.model.ProdList;
import market.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class Note
 */
public class Note extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Product> note = new ArrayList<Product>();
	private static ProdList prodList = ProdList.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Note() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String clearStr = request.getParameter("clear");
	    if(clearStr!=null) {
		    prodList.clearList();
			request.getRequestDispatcher("Home.jsp").forward(request, response);
			request.setAttribute("clear", null);
	    }
		
	    if(clearStr==null) {
	    	
		    String first = "1";
		    request.setAttribute("f", first);
	    	
	    	String barCodeStr = request.getParameter("code");
		    int barCode = Integer.parseInt(barCodeStr);
		    
		    Product foundProd = null;
		    Product prod = prodList.getProductByBarCode(barCode);
		    
		    if(prod!=null) {
		    	foundProd = prod;
		    	note.add(foundProd);
		    }
		    
		    int quantity = Integer.parseInt(request.getParameter("quant"));
		    request.setAttribute("quant", quantity);
		    
		    if(request.getParameter("totalValue")!=null && request.getParameter("totalValue")!="") {
		    	  double totalValue = Double.valueOf(request.getParameter("totalValue"));
		  			request.setAttribute("totalValue", totalValue);
		    }
		    
		    prodList.addQuantity(quantity, barCode);
		    
		    request.setAttribute("note", note);
		    
		    request.getRequestDispatcher("TSystem.jsp").forward(request, response);
		    
	    }
	    
	}
	
}

