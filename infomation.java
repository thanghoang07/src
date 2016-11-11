
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import model.Check;

/**
 * Servlet implementation class infomation
 */
@WebServlet("/infomation")
public class infomation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public infomation() {
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
		boolean error = false;
		String err = "";
		//
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String passre = request.getParameter("passre");
		String mobile = request.getParameter("mobile");
		String phone = request.getParameter("phone");
		String country_name = request.getParameter("country_name");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		String district = request.getParameter("district");
		String date = request.getParameter("date");
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
		if (name == null || name.equals("")) {
			err = "Họ và tên không được để trống !";
			error = true;
			request.setAttribute("name_error", err);
		}
		if (mobile == null || mobile.equals("")) {
			err = "Số điện thoại không được để trống !";
			error = true;
			request.setAttribute("mobile_error", err);
		}
		if (pass == null || pass.equals("")) {
			err = "Mật khẩu không được để trống !";
			error = true;
			request.setAttribute("pass_error", err);
		}
		if (!pass.equals(passre) && error == true) {
			err = "Mật khẩu không trùng nhau !";
			error = true;
			request.setAttribute("pass_error", err);
		}
		if (!check.isNumeric(phone) || !check.isNumeric(mobile)
				|| (!check.isNumeric(phone) && !check.isNumeric(mobile))) {
			err = "Đây không phải là sô điện thoai";
			error = true;
			request.setAttribute("number_error", err);
		}
		//
		Account acc = new Account(email, pass, name, phone, mobile, country_name, city, address, district, date);
		//
		if (error) {
			session = request.getSession();
			session.setAttribute("account", acc);
			rd = getServletContext().getRequestDispatcher("/infomation.jsp");
			rd.forward(request, response);
		} else {
			session = request.getSession();
			session.setAttribute("account", acc);
			rd = getServletContext().getRequestDispatcher("/dangKTC.jsp");
			rd.forward(request, response);
		}

	}

}