
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.Check;
import model.Customer;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
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
		Check check = new Check();
		HttpSession session;
		RequestDispatcher rd;
		//
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		//
		boolean error = false;
		String err = "";
		//
		Admin ad = new Admin(email, pass);
		Customer cu = new Customer(email, pass);
		//
		if (email == null || email.equals("")) {
			err = "Email không được để trống !";
			error = true;
			request.setAttribute("email_error", err);
		} else if (!check.isValidEmailAddress(email)) {
			err = "Đây không phải là email !";
			error = true;
			request.setAttribute("email_error", err);
		}
		//
		if (error) {
			// xuất lỗi khi các trường còn trống
			rd = getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		} else {
			if (email.equals("thanghoang07@outlook.com") && pass.equals("admin")) {
				// đăng nhập bằng tài khoản admin
				session = request.getSession();
				session.setAttribute("admin", ad);
				rd = getServletContext().getRequestDispatcher("/admin/adminLogin.jsp");
				rd.forward(request, response);
			} else {
				//
				session = request.getSession();
				session.setAttribute("customer", cu);
				rd = getServletContext().getRequestDispatcher("/product/Anime.jsp");
				rd.forward(request, response);
			}
		}
	}

}
