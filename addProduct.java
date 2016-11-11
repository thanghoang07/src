
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Check;
import model.Product;

/**
 * Servlet implementation class addProduct
 */
@WebServlet("/addProduct")
public class addProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//
		String idS = request.getParameter("id");
		String name = request.getParameter("name");
		String imgUrl = request.getParameter("imgUrl");
		String priceS = request.getParameter("price");
		String perSaleS = request.getParameter("perSale");
		boolean error = false;
		String err = "";
		//
		int id = Integer.parseInt(idS), price = Integer.parseInt(priceS);
		double perSale = Double.parseDouble(perSaleS);
		//
		HttpSession session;
		RequestDispatcher rd;
		//
		Product pr = new Product(name, imgUrl, id, price, perSale);
		//
		if (error) {
			session = request.getSession();
			session.setAttribute("pr", pr);
			rd = getServletContext().getRequestDispatcher("/product/addProduct.jsp");
			rd.forward(request, response);
		} else {
			session = request.getSession();
			session.setAttribute("pr", pr);
			rd = getServletContext().getRequestDispatcher("/product/Product.jsp");
			rd.forward(request, response);
		}

	}

}
