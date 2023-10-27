package market.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import market.model.ProdList;
import market.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class registerProductController
 */
public class registerProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ProdList prodList = ProdList.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerProductController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String prodCodeStr = request.getParameter("code");
        String name = request.getParameter("name");
        String priceStr = request.getParameter("price");
        String barCodeStr = request.getParameter("barCode");

        double price = Double.parseDouble(priceStr);
        int prodCode = Integer.parseInt(prodCodeStr);
        int barCode = Integer.parseInt(barCodeStr);

        Product newProd = new Product(prodCode, name, price, barCode);
        prodList.addProd(newProd);

        response.sendRedirect("RegisterProduct.jsp");
		
	}

}
