
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginDemo2
 */
@WebServlet("/loginDemo2")
public class loginDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public loginDemo2() {
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
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			String us = request.getParameter("uname");
			String pas = request.getParameter("pass");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=thanghoang;user=sa;password=thanghoang");
			Statement st = (Statement) con.createStatement();
			String sql = "select * from User where uname ='" + us + "' and pass ='" + pas + "'";
			ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);

			if (rs.next()) {
				HttpSession se = request.getSession();
				se.setAttribute("uname", us);
				response.sendRedirect("Success");
				response.sendRedirect("/demoSession/demo2.jsp");
			} else {
				out.println("loi <a href='/demoSession/demo1.jsp'>click</a>");

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(loginDemo2.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
