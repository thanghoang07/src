
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;

/**
 * Servlet implementation class reProduct
 */
@WebServlet("/reProduct")
public class reProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public reProduct() {
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

		response.getWriter().append("").append(request.getContextPath());
		//
		RequestDispatcher rd;
		//
		try {
			// lấy ra chỉ số index của sản phẩm
			int index = Integer.parseInt(request.getParameter("index"));
			// xóa trong bo nhớ
			DAO.getListProduct().remove(index);
			response.sendRedirect("/product/Product.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			rd = getServletContext().getRequestDispatcher("/notFound.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
